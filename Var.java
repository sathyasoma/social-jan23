
class Var{
	int age1=56; //instance variale
	int age2=56; //instance variale
	static String schoolName="zphs"; //static variable 4bytes
	
	public static void main(String args[])
	  
	{	
		double salary=5600.78; //local
         
		 System.out.println("local varibale salary:"+salary);
        System.out.println("static varibale printing :"+Var.schoolName); //static variable accessing
		
		
		Var obj=new Var(); //bject createion
		
		System.out.println("instance variable :"+obj.age);
		
	}
}