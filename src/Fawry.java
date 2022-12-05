import java.util.Scanner;

public class Fawry {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter 1) Overall Discount\n"
                + "2) Specific Discount\n");
		x = input.nextInt();
		if(x == 1)
		{
			Discount discount = new Overall_discount();
			discount.Add_Discount();
		}
		else if(x == 2)
		{
			Discount discount = new Specific_discount();
			discount.Add_Discount();
		}
		
	}

}
