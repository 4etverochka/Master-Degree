package app.core.listeners;

import app.core.utils.CalendarUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultsListener implements ITestListener {
    private static final Logger LOGGER = LogManager.getLogger("TestResultsListener:");
    private CalendarUtils calendarUtils = new CalendarUtils();
    private String testExecutionTime;

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.info(getSimpleClassName(result.getTestClass().getName()) + " was started.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        testExecutionTime = calendarUtils.convertMilliSecondsToFormattedDate(result.getEndMillis()
                - result.getStartMillis());

        LOGGER.info(getSimpleClassName(result.getTestClass().getName()) + " was finished with success.");
        LOGGER.info("Test execution duration: " + testExecutionTime);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testExecutionTime = calendarUtils.convertMilliSecondsToFormattedDate(result.getEndMillis()
                - result.getStartMillis());

        LOGGER.error(getSimpleClassName(result.getTestClass().getName())
                + " was failed on the "
                + result.getMethod().getMethodName()
                + " test method.");
        LOGGER.error("Test execution duration: " + testExecutionTime);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.warn(getSimpleClassName(result.getTestClass().getName()) + " was skipped");
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

    private String getSimpleClassName(String classNameWithPackage) {
        return classNameWithPackage.substring(classNameWithPackage.lastIndexOf('.') + 1);
    }
}
