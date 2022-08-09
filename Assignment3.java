package o7_taining;
/*
public class Assignment3 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
				{System.out.print("");}
		
		{for(int k=0;k<4;k++)
		}
			{System.out.print("1");}
			System.out.println();
}
}}

*/
                         // 1ST ANSWER
/*
ENCAPSULATION-> it is the process of arranging the data in the single unit where classes and method are
                exist together in a same program.
             */   
                class Assignment3{
                public static void main(String [] args)
                {  
                public void setvalue()
                { value=x;}
                
                
                void getvalue()
                { System.out.println();}
                }
                
                
                class Beta{
                Assignment3 r= new Assignment3();
                x=a.setvalue(100);
                { System.out.println("value of a="+a.getvalue()); }
                }
                
                    
                }



                       //2ND ANSWER

/* POLYMORPHISM-> poly means many and morphism means form.It is the state when single program contains 
                 same method by having arguments in it or without argument .
                 
                 
                 class Family
                 { void father()
                 {System.out.println("head");}
                	
                 
                 void children()
                 {System.out.println("with the use super");}
                 }
                 
                public class Assignment3 extends Family{
                	
                	public static void main(String []args) {
                		
                		Assignment3 obj=new Assignment3();
                				obj.children();
                				obj.father();
                				obj.children("virk");
                				
                	}
                	void children()
                	{super.children();
                	{System.out.println("child");}
                	}
                	void children( String surname)
                	{System.out.println("child"+surname);}
                		
                }
                  
 //HERE IN THE ABOVE PROGRAM WE WRITE CHILDREN FUNCTION TWO TIMES BY DIFFERENT CONDITION
 //    i.e BY CALLING DIRECTLY AND THEN BY PASSING ARGUMENTS
 //     THEREFORE POLYMORPHISM CONDITION SATISFIED                                 
                               
                            
                */

                        // 3RD ANSWER

/*
1) ACCESS SPECIFIER-> There are 4 types of access specifier i.e private,default,protected,public.
                    they all are use to access the class member according to the condition
                    
       private-> this specifier normally use to make our method private so that no one 
                 can access.it is only accessable with in that class.
                 
       default-> this specifier is only accessable with in the same class and same package.
       
       protected-> In this it can be access by the class and the sub class of the another class.
       
        public-> this specifier can be access any where in the program without any intruption.
                 inside outside the package both.
                 
                 
2) PACKAGES-> It is just like a notebook that contains all the important files or user program in a
            single unit.package are normally used when we are working on a project.
            package can be called with the help of import keyword
            
            example-> import packagename.classname  when we want to call some particular class in other program. 
   
3) FINAL KEYWORD->We use of final keyword mainly to set the particular value to be same throughout the program
      
       example-> we want to set any integer value then we have to write it as
       public final int a=10; 
               
                    
                    
 */

                                        //4TH ANSWER
/*
 class Rectangle {

	 static void area() {
		 System.out.println("area=");
	 }
	  static int length=12;
 
	  void circumference() 
	  {System.out.println("circumference=");}
	  
	  int breadth=2;
		  	
	}
 class Shape extends Rectangle{
	 public static void main(String []args)
	 {
		 Shape obj=new Shape();
		 obj.circumference();
		 
		 Rectangle.area();
	 }
	
 }
 
 */