package pacticePrograms;



public class FoodOrder {
	
	
	
public static void main(String[] args) {
	FoodOrder foodOrder =new FoodOrder(); 
	foodOrder.zomato_partner();

	}

//static variables

	static String Restarent_name = "krintunga";
	static int no_of_dishes_order = 3, price = 2500;
	
	// non static variables
	
	String order_id = "cd5v";
	int discount_amt = 20;

	public static void order_details() {
		
		System.out.println("\nin order_details");
		System.out.println("Restarent_name: "+Restarent_name);
		System.out.println("no_of_dishes_order :"+no_of_dishes_order);
		System.out.println("price: "+price);

		FoodOrder f1 = new FoodOrder();
		System.out.println( "discount_amt: "+f1.discount_amt);
		System.out.println("no_of_dishes_order: "+f1.no_of_dishes_order);

	}
	public void delivery_person(String address,int wait_charges) {
		System.out.println("\nin delivery_person");
		System.out.println("Address :"+address);
		System.out.println("Wait_charges: "+wait_charges);
		
		//FoodorderApp f2=new FoodorderApp();
		order_details();
	
		
		}

	public void zomato_partner() {
		int food_rating=3,delivery_rating=5,hygenic_rating=5;
		
		System.out.println("\nin ZomatoPartner");
		System.out.println("food_rating: "+food_rating);
		System.out.println("delivery_rating: "+delivery_rating);
		System.out.println("hygenic_rating: "+hygenic_rating);
		
		delivery_person("hyd",10);
		
	}
		
		
		
		
		
		
		
		
	}


