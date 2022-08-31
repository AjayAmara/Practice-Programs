package pacticePrograms;

public class OrderInZomato {
	
	private static String restaurantName = "novotal";
	private static int noOfDishesOrder = 4;
	private static int price = 7000;
	private int orderId =1;
	private String discountAmount ="20Rs";
	
	public static void orderDetails() {
		OrderInZomato inZomato=new OrderInZomato();
		System.out.println( "in Static method order details::- "+ restaurantName+ " "+noOfDishesOrder+" "+price +" "+inZomato.discountAmount +" "
		+ inZomato.orderId);
	} 
	
	public void deliveryPerson(String address,int waitCharg) {
		
		System.out.println("address :"+ address);
		System.out.println("waitCharg :"+ waitCharg);
		
		orderDetails();
	}
	public void zomatoPrinter() {
		
		 int foodRating = 2;
		 int deliveryRating = 2;
		 int hygenicRating = 2;
		 System.out.println("foodRating :"+foodRating+" deliveryRating: "+deliveryRating);
		
	}
	
	
	public static void main(String[] args) {
		orderDetails();	
		
		
	}
	
}
