package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample1 extends Sample2 {
	
//	@Test(dataProvider = "aji")
//	public void Booktickets(String src,String des) {
//		System.out.println("Book tickets from"+src+"to"+des);
//	}
	@Test
	@DataProvider(name = "aji")
	public Object[][] datap() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="Chennai";
		obj[0][1]="merina";
		
		obj[1][0]="Tirunelveli";
		obj[1][1]="alva";
		
		obj[2][0]="Tuty";
		obj[2][1]="salt";
		
		return obj;
	}
	
	@DataProvider(name="login",indices = {2},parallel = true)
	public Object[][] m2() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="admin";
		obj[0][1]="admin";
		
		obj[1][0]="Admin";
		obj[1][1]="Admin";
	
		obj[2][0]="aDmin";
		obj[2][1]="aDmin";
		return obj;
	}

}
