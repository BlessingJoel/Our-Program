package Ajith;

public class Return {
	int amount=100;
	  String name="aji";
	String aji() {
		System.out.println("get the amount= "+amount);
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return ret=new Return();
		String ajith=ret.aji();
		System.out.println("who is the get amount:"+ajith);
		

	}

}
