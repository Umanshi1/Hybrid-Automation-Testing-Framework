package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter {
    static String configPath = System.getProperty("user.dir") + "/config/config.properties";
    static Base base = new Base();
    static FileInputStream file;
    static Properties props;
    public static ExtentReports reports;
    static String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    static String finalName;
    static String finalPath;

    /*
     * Method Name: getReporterPath()
     * Author: Umanshi Sarkar
     * Description: Retrieves the reporter path from the configuration file
     * Return Type: String
     * Parameters: None
     */
    public static String getReporterPath() {
        props = new Properties();
        try {
            file = new FileInputStream(configPath);
            props.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty("reporterPath");
    }

    static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    /*
     * Method Name: createReport()
     * Author: Umanshi Sarkar
     * Description: Creates an ExtentReport with the given report name
     * Return Type: ExtentReports
     * Parameters: String reportName
     */
    public static ExtentReports createReport(String reportName) {
        String path = getReporterPath();
        String name = reportName  + ".html";
        String finalPath = path + name;
        ExtentSparkReporter reporter = new ExtentSparkReporter(finalPath);
        reports = new ExtentReports();
        reports.attachReporter(reporter);
        return reports;
    }

    /*
     * Method Name: captureScreenshot()
     * Author: Umanshi Sarkar
     * Description: Captures a screenshot and saves it with the given filename
     * Return Type: String
     * Parameters: String filename
     */
    private static String captureScreenshot(String filename) {
        String name = filename + ".png";
        String destPath = "./" + name;
        TakesScreenshot ts = (TakesScreenshot) Base.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir") + "/reports");
        File target = new File(destination, name);
        try {
            FileUtils.copyFile(source, target);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return destPath;
    }

    /*
     * Method Name: attachScreenshotToReport()
     * Author: Umanshi Sarkar
     * Description: Attaches a screenshot to the report for a passing test case
     * Return Type: void
     * Parameters: ExtentTest test, String name, String description
     */
    public static void attachScreenshotToReport(ExtentTest test, String name, String description) {
        try {
            test.log(Status.PASS, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(name)).build());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /*
     * Method Name: attachFailedScreenshotToReport()
     * Author: Umanshi Sarkar
     * Description: Attaches a screenshot to the report for a failing test case
     * Return Type: void
     * Parameters: ExtentTest test, String name, String description
     */
    public static void attachFailedScreenshotToReport(ExtentTest test, String name, String description) {
        try {
            test.log(Status.FAIL, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(name)).build());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /*
     * Method Name: sendReportEmail()
     * Author: Umanshi Sarkar
     * Description: Sends an email with the report as an attachment
     * Return Type: void
     * Parameters: String recipient, String body
     */
    public static void sendReportEmail(String recipient, String body) {
        props = new Properties();
        try {
            file = new FileInputStream(configPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String subject = props.getProperty("subject");
        String senderEmail = "umanshisarkar@gmail.com";
        String senderPassword = "aoue yhjt duce khvo";
        String htmlReportPath = System.getProperty("user.dir") + "/reports/TARGET_Report.html"; // Path to your HTML report

        // SMTP Server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Create a session with the authenticated email account
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create an email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);

            // Create a MimeBodyPart for the message body
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText(body);

            // Read the HTML report file and create a MimeBodyPart for the attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            File htmlFile = new File(htmlReportPath);
            attachmentPart.attachFile(htmlFile);

            // Create a Multipart to combine the message body and the attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);
            multipart.addBodyPart(attachmentPart);

            // Set the Multipart as the content of the email message
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully with attachment!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
