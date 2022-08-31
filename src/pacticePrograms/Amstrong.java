package pacticePrograms;

public class Amstrong {
	
	public static void main(String[] args) {
		
		int num =153,cube,sum=0,rem;
		int t=num;
		while (num>0) {
			
			rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;
			
		}
		
		System.out.println(t);
		System.out.println(sum);
		if (t==sum) {
			
			System.out.println("amstrong");
		}else System.out.println("not a amstrong");
		
	}

}
