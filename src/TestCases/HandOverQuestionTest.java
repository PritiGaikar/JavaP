package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Technical.FormTypeLibrary;
import Technical.HandOverQuestion;


public class HandOverQuestionTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	HandOverQuestion r=new HandOverQuestion();

	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("HandOverQuestionTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Crew HandOver Question"); 
		   }
	@Test(priority=2)
	  public void search() throws Exception {
		  test=report.startTest("search & edit question");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search & edit question"); 
		   }
	  
  @AfterMethod 
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	    } else if (result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	    } else {
	        test.log(LogStatus.PASS, "Test passed");
	    }
	    report.endTest(test);
	    report.flush();
}
@BeforeSuite 
public void beforeSu() {
	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html");		
}

}
