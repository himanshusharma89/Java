import java.util.Scanner;

class UnaryOperation{
	public static void main(String[] args){
		int x,y;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		x=scan.nextInt();
		System.out.println("Incriment");
		System.out.println(x++ + ++x);
		System.out.println("Enter Number");
		y=scan.nextInt();
		System.out.println("Decriment");
		System.out.println(y-- + --y);
	}
}