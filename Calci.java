/*package o7_taining;

 //  ANSWER 4TH
public class Calci {

	public static void main(String[] args) {
		
	int r=addy(12,12);
	int p=subby(13,3);
	System.out.print("addy"+r);
	System.out.print("subby"+p);
	
	Calci obj= new Calci();
	obj.diviji();
	obj.mull();

	}

	static int addy(int a,int b);
	{return a+b;}
	static int subby(int c,int d);
	{return c-d;}
	
	void mull()
	{System.out.println("didviji");}
	void diviji()
	{System.out.println("mull");
	}
	
}
 */
 
      // ANSWER 2ND

/*  1.class name means the nmae given to the class
 * example: class WorkWith  class name always start with the captal
 * letter and every letter of new word is capital
 * 
 * 2.function name:In this we every letter except first word of the must be capital.
 * after that it ends with the braces()
 * fuctions always created outside the class.
 * example:myJava();
 * 
 * 3.variable:It also follow the same syntax like function but braces are not there at the end.
 * example:myWorld
 * 
 * 4.Static variable:The all words of this are capital and we can also use under score in this
 * because it never support space.
 * example:MY_WORD; here we can name it also as MYWORD
 * */

 
                    //ANSWER 3RD
/* 1)
 a) .java file-> the file that are used to save with the extention as .java is called as java files
 * they are just for saving purpose.To save out code.
 * 
 * b) .class file-> the files that are saved after the compilation is called as .class file
 * there file are saves when we open the cmd and run our code 
 *  
 * 2) java is not a complete oops programming language because it does not create the object for all data types
 *  example:int a=12;
 *  here no object is created for int
 *  but if we write the same as 
 *  Integer a=20;
 *  then object will be created for it.
 *  
 *3) nr-wa means no return with argument here no return value is to be displayed
 *but arguments are there 
 *example: 
 * 
 *{void sum(int a,int b)}
 *          
 */

                 /* ANSWER 5TH
  WRAPPER CLASS:The class whose object are created by java is called wrapper class
  EXAMPLE: int a=12; it not aa wrapper class because the object of int is not created by java 
  but if we write it as
  Integer a=12; then it is aa wrapper class because java automatically created object of this in backend
  */
                  

//                   ANSWER 1ST
package o7_taining;

public class Calci {

	public static void main(String[] baljitsingh) {
	 int a=age(21);
	 Calci bun=new Calci();
	 bun.hobby();
	{System.out.println("my age ="+a); 	}
	
//	Calci.bun=new Calci();
//	bun.hobby();
}

static int age(int b)
{   return b;} 
void hobby()
{System.out.println("my name is baljit singh");
}}
