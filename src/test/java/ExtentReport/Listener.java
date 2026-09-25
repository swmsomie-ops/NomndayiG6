package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class Listener implements ITestNGListener {

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
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Case: "+ result.getMethod().getMethodName()+"Has Passed");
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
