package com.oib.testscripts;

import com.oib.lib.GeneralFunction;

public class TC02 {
	//Test Steps
    public static void main(String args[])throws Exception {
            GeneralFunction obj = new GeneralFunction();
            obj.openApplication();
            obj.login();
            obj.ADD();
            obj.logout();
            obj.closeApplication();
           
    }
}
