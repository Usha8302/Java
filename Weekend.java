public class Weekend{
	public static final double gst=0.18;
	public static void getGst(int price)
	{
		System.out.println("Get GST Method");
		System.out.println("Price = "+price);
		double TotalPrice= price+(price*gst);
		System.out.println("TotalPrice = "+TotalPrice);
	
	
	}

}