package Assert;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void m() {
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
	    org.testng.asserts.SoftAssert soft=new org.testng.asserts.SoftAssert();
	    soft.assertEquals(false, true);
	    System.out.println("Step4");
	    System.out.println("Step5");
	    soft.assertAll();
	}

}
