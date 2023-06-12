package Ajith;

public class Method {
	int a=10,b=20,c;
	int add() {
		 c=a+b;
		return(c);
	}
	
		
		 public void multi() {
			 int a=20,b=20,d;
		 d=a*b;
		System.out.println(d);
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Method obj=new Method();
      int  c= obj.add();
      System.out.println(c);
      Method obj1=new Method();
      obj1.multi();
     
     
      
       
	}
}

