public class ArithematicRunner{
	public static void main(String args[])
	{
		int sum=Arithmetic.add(6,5);
		System.out.println("sum = "+sum);
		
		int diff =Arithmetic.subtract(6,5);
		System.out.println("difference = "+diff);
		
		int mul=Arithmetic.multiply(6,5);
		System.out.println("multiple = "+mul);
		
		double div=Arithmetic.divide(6,5);
		System.out.println("Division = "+div);
		
		int mod=Arithmetic.modulus(6,5);
		System.out.println("modulus = "+mod);
	}


}