package utils;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
    

     static String path = System.getProperty("user.dir") + "/screenshots/";
     static String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
     static String finalName;
     static String finalPath;
     static TakesScreenshot screenshot;
     static File source;
     static File destination;

    public static void takeAScreenshot(String name)  {
        finalName = name + "_" + timestamp + ".png";
        
        finalPath = path + finalName;

        screenshot = (TakesScreenshot) Base.driver;
        source = screenshot.getScreenshotAs(OutputType.FILE);
        destination = new File(finalPath);

        
        
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}