package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;

public class TakenScreenShots {

    private static final String screenshotDir = System.getProperty(("user.dir")+ File.separator+"NdosiReports"+File.separator+"ScreenShots");

    public static String TakeSnapShots(WebDriver driver, String screenshotName) throws IOException {

        TakenScreenShots takenScreenShots = (TakenScreenShots) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationDir = new File(screenshotDir);

        if (!destinationDir.exists() && !destinationDir.mkdirs()) {
            throw new IOException("Unable to create screenshot directory"+destinationDir.getAbsolutePath());
        }

        File destination = new File(destinationDir. screenshotName+"png");
        FileUtils.copyFile(src, destination);

        return destination.getAbsolutePath();
    }
}
