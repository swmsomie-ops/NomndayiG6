package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener {

    private static ExtentReports extent;
    private static ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {extentTest = extent.createTest(result.getMethod().getMethodName());}

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test Case: "  + result.getMethod().getMethodName() + "Has failed");
        extentTest.log(Status.FAIL,result.getThrowable().getMessage());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Case:" + result.getMethod().getMethodName() + "Has Passed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, "Test Case:" + result.getMethod().getMethodName() + "Has been Skipped");
    }

    @Override
    public void onFinish(ITestContext result) {extent.flush();}

    @Override
    public void onStart(ITestContext result) {extent = extentReportManager.extentReports();}
}
