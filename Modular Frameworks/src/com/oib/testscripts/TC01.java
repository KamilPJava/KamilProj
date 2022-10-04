package com.oib.testscripts;

import com.oib.lib.GeneralFunction;

public class TC01 {
	//Test Steps
    public static void main(String args[])throws Exception {
            GeneralFunction obj = new GeneralFunction();
            obj.openApplication();
            obj.login();
            obj.logout();
            obj.closeApplication();
           
    }
}
