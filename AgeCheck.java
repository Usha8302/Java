public class AgeCheck{
	public static void main(String args[])
	{
	int age=18;
	int Usha=22;
	String name="Usha";
	String name1="Kumari";
	long ph=6360154161L;
	long ph1=2548741254L;
	String mail="usha13@gmail.com";
	String mail1="Kumari12@gmail.com";
	
	
	if(age>Usha){
	System.out.println("Not Eligible to vote");
	}
	else{
	System.out.println("Eligible to vote");
	}
	
	if(name==name1 && ph==ph1 && mail==mail1)
	{
		System.out.println("Data Matched");
	}
	else{
		System.out.println("Data not Matched");
	}
	}
	
	
	
	
}