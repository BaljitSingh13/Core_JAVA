package o7_taining;

public class GlobalVariable {
int sum=89;
	public static void main(String[] args) {
		GlobalVariable obj=new GlobalVariable();     // here we create object
		obj.locals(44);                              // agr asi obj nu call na kriye then kli id print huni
		System.out.println("value of obj="+obj);
		
		GlobalVariable obj1= new GlobalVariable();
		//obj1.locals(32);
		System.out.println("value of obj1="+obj1);
	}
	void locals(int sum)
	{System.out.println("value of local a="+sum);
   	 System.out.println("value of  global a="+this.sum);
	 System.out.println("id of this="+this);                      //with use of this id will be generated for obj                    
		
	 }
	
}
