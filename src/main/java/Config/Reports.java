package Config;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import data.VerificationData;

public class Reports{

	public static ExtentReports report = null;
	public static ExtentTest extentTest;
	public static String report_name = VerificationData.ReportData.reportName+BasePageActions.report_date+".html";
	

	public static ExtentReports getReports(String baseDirPath) {
		if (report == null) {
			
			report = new ExtentReports(baseDirPath
					+ report_name);
			report.addSystemInfo("Selenium Version",
					VerificationData.ReportData.seleniumVersion);
		}
		return report;
	}
}

