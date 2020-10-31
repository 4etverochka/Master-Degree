package app.core.listeners;

import app.core.utils.CalendarUtils;
import lombok.extern.log4j.Log4j2;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

@Log4j2
public class TestResultsListener implements ITestListener {
    private CalendarUtils calendarUtils = new CalendarUtils();
    private String testExecutionTime;

    @Override
    public void onTestStart(ITestResult result) {
        log.info(result.getTestClass().getName() + " was started.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        testExecutionTime = calendarUtils.convertMilliSecondsToFormattedDate(result.getEndMillis()
                - result.getStartMillis());

        log.info(result.getTestClass() + "was finished with success.");
        log.info("Test execution duration: " + testExecutionTime);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testExecutionTime = calendarUtils.convertMilliSecondsToFormattedDate(result.getEndMillis()
                - result.getStartMillis());

        log.info(result.getTestClass().getName()
                + " was failed on the "
                + result.getMethod().getMethodName()
                + " test method.");
        log.info("Test execution duration: " + testExecutionTime);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.info(result.getTestClass() + " test was skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
