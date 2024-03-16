package in.acts.cdac;

public class Project {

	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]) ;
		float n2 = Float.parseFloat(args[1]) ;
		double n3 = Double.parseDouble(args[2]);
		double result = n1 + n2 + n3;
		System.out.println("result is: "+ result);
		
		
	}
	public static void main1(String[] args) {
		int n1 = Integer.parseInt(args[0]) ;
		int n2 = Integer.parseInt(args[1]) ;
		int result = n1 + n2;
		System.out.println("result is: "+ result);
	}

}
