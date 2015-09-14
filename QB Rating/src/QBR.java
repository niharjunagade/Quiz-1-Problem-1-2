import java.util.Scanner;
public class QBR {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of completions");
		int comp = scan.nextInt();
		System.out.print("Enter number of passing yards");
		int yards = scan.nextInt();
		System.out.print("Enter number of passing attempts");
		int attempts = scan.nextInt();
		System.out.print("Enter number of interceptions");
		int inter = scan.nextInt();
		System.out.print("Enter number of touchdown passes");
		int tdp = scan.nextInt();
		
		double a = ((comp/attempts) - .3) * 5;
		double b = ((yards/attempts) - 3) * .25;
		double c = (tdp/attempts) * 20;
		double d = 2.375 - ((inter/attempts) * 25);
		double passerRating = ((a + b + c + d) / 6) * 100;
		
		System.out.printf("Quarterback Rating: %2.1f", passerRating);
	}

}
