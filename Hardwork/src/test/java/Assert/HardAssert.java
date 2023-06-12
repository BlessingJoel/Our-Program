package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void first() {
		System.out.println("Lion");
		System.out.println("Tiger");
		System.out.println("Panther");
		Assert.assertEquals(false, false);
		System.out.println("Hardik");
		System.out.println("Pandya");
	}

}
