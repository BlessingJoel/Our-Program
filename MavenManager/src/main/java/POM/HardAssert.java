package POM;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  
	
	@Test
	public void createcustomer() {
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals(true, true);
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void m1() {
		
		String expName="aji";
		String actName="aji";
		
		Assert.assertEquals(expName, actName);
	}
	
}
