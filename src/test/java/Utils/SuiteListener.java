package Utils;

import Pages.PageBase;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import static Utils.SendMailSSLWithAttachment.sendPDFReportByGMail;

public class SuiteListener implements ISuiteListener {
    public void onStart(ISuite suite) {
    }

    public void onFinish(ISuite suite) {
//        sendPDFReportByGMail("mail.test.env@gmail.com", "xwbpeiycbnaqyflt", "aselim@axisapp.com","Testing Result Report" + BasePage.getCurrentDate(), "");
    }
}
