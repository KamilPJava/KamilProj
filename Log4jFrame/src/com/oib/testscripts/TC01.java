package com.oib.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.oib.lib.CommonFunctions;

public class TC01 {
	//Test Steps
    //public static void main(String args[])throws Exception {
	@Test
	public void tc001() throws Exception{
		DOMConfigurator.configure("log4j.xml");
            CommonFunctions obj = new CommonFunctions();
            obj.openApplication();
            obj.login();
            obj.logout();
            obj.closeApplication();
           
    }
}
