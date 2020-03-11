import java.util.*;
import java.util.Scanner;

public class SMScost1
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		int count;
		double cost;
		
		System.out.print("Input No of Messages: ");
		count = console.nextInt();
		cost = 10 + 0.22 * count;
		if (cost>50) {
			cost = cost*0.95;
			System.out.println("You received a 5% discount.");
			}
		System.out.println("Total cost is "+cost);
	}
}