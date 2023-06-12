package Scroll;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) {


		ExtentSparkReporter report=new ExtentSparkReporter("./TestReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);

		ExtentTest test = extent.createTest("HP008 - Enquirypage");
		test.assignAuthor("Hardik");
		test.assignCategory("Pandya");
		test.pass("Enter the name");
		test.pass("Enter the moblie no");
		test.pass("Click submit button enquiry to send");
		
		
		ExtentTest test1 = extent.createTest("HP008 - Homethreaterpage");
		test1.assignAuthor("Captain");
		test1.assignCategory("Cricketer");
		test1.pass("Stage is broken that all randy to match");
		test1.fail("Randy are dead",MediaEntityBuilder
				.createScreenCaptureFromPath("White box.jpg").build());
		extent.flush();
		
  }

}

