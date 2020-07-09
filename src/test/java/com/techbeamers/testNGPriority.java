package com.techbeamers;

//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGPriority {

//	public static void main(String[] args) {
	    /**
	     * Following method takes one parameter as input. Value of the 
	     * said parameter is defined at suite level.
	     */
	    //@Parameters({ "suite-param" })
	    @Test (priority = 3)
	    public void prameterTestOne() {
	        System.out.println("Test one suite param is: " );
	    }
	 
	    /**
	     * Following method takes one parameter as input. Value of the
	     * said parameter is defined at test level.
	     */
	    //@Parameters({ "test-two-param" })
	    @Test (priority = 0)
	    public void prameterTestTwo() {
	        System.out.println("Test two param is: " );
	    }
	 
	    /**
	     * Following method takes two parameters as input. Value of the 
	     * test parameter is defined at test level. The suite level 
	     * parameter is overridden at the test level.
	     */
	   // @Parameters({ "suite-param", "test-three-param" })
	    @Test (priority = 1)
	    public void prameterTestThree() {
	        System.out.println("Test three suite param is: " );
	        System.out.println("Test three param is: ") ;
	    }
	}

//}
