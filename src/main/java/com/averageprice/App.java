package com.averageprice;

import com.averageprice.controller.ShareControl;

public class App{

	public static void main( String[] args ){    	
    	// Share share = new Share();
		ShareControl shareControl = new ShareControl();
    	    	
		System.out.println(shareControl.multiplyQuantityByPrice(200, 14.0, 20.0));
    }
}
