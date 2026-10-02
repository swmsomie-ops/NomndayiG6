package ExtentReport;

import Utils.TakenScreenShots;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Driver;

import static Utils.BrowserFactory.driver;


public class Listener implements ITestListener {

    private static ExtentReports extent;
    private static ExtentTest extentTest;
    public @interface Override {
    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test Case: "+ result.getMethod().getMethodName()+"Has Failed");
        extentTest.log(Status.FAIL, result.getThrowable().getMessage());

        try {
            String screenshotName = result.getMethod().getMethodName()+"png";
            TakenScreenShots.TakeSnapShots(driver,result.getMethod().getMethodName());
            extentTest.addScreenCaptureFromPath(Paths.get
                    ("ScreenShots",screenshotName).toString().replace("\\","/"),result.getMethod().getMethodName());
        }catch (IOException e){
            throw new IllegalStateException("Failed to take screenshot for test case:"+result.getMethod().getMethodName(), e);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Passed: "+ result.getMethod().getMethodName()+"Has Passed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, "Test Case: "+ result.getMethod().getMethodName()+"Has been Skipped");
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }

    @Override
    public void onStart(ITestContext result) {
        extent = ExtentReportManager.extentReports();
    }
}
