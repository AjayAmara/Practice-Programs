package pacticePrograms;

public class Mobile {

	static String name;
	
	public static class RedMe {
		public static String model;
		public String version;

		public void m1() {

			System.out.println(model + "," + this.version);
		}

	}

	public static class RealMe {
		public static String model;
		public String version;

		public void m1() {

			System.out.println(model + "," + this.version);
		}

	}

	public static class Samsung {

		public static String model="samsung model";
		public String version="samsun version";

		public   void m1() {
		

			System.out.println(model + "," + this.version);
		}

	}
	
	public static void main(String[] args) {
		Samsung samsung=new Samsung();
		
		samsung.m1();
		
	}

}
