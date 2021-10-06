import java.util.Scanner;
class Assignment2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter pmr:");
		int pmr = sc.nextInt();
		System.out.println("enter cmr:");
		int cmr = sc.nextInt();
		int billable_unit = pmr-cmr;
		System.out.println("choose category(1-domestic,2-commercial,3-industrial):");
		int category = sc.nextInt();
		switch(category)
		{
			case 1:
				if(billable_unit <=100)
				{
					System.out.println("AMOUNT TO BE PAID"+(billable_unit*1));
				}
				else if(billable_unit <=200)
				{
					int x=(billable_unit-100)*2;
					int y= x+(100*1);
					System.out.println("AMOUNT TO BE PAID"+y);
				}
				else
				{
					int x=100;
					int y=(101*2);
					int z=((((billable_unit-100)-101)*3)+y+x);
					System.out.println("AMOUNT TO BE PAID"+z);
				}
				break;
			case 2:
				if(billable_unit <=100)
				{
					System.out.println("AMOUNT TO BE PAID"+(billable_unit*2));
				}
				else if(billable_unit <=200)
				{
					int x=(billable_unit-100)*4;
					int y= x+(100*2);
					System.out.println("AMOUNT TO BE PAID"+y);
				}
				else
				{
					int x=100*2;
					int y=(101*4);
					int z=((((billable_unit-100)-101)*6)+x+y);
					System.out.println("AMOUNT TO BE PAID"+z);
				}
				break;
			case 3:
				if(billable_unit <=100)
				{
					System.out.println("AMOUNT TO BE PAID"+(billable_unit*3));
				}
				else if(billable_unit <=200)
				{
					int x=(billable_unit-100)*6;
					int y= x+(100*3);
					System.out.println("AMOUNT TO BE PAID"+y);
				}
				else
				{
					int x=100*3;
					int y=(101*6);
					int z=((((billable_unit-100)-101)*9)+x+y);
					System.out.println("AMOUNT TO BE PAID"+z);
				}
				break;
			default:
				System.out.println("Choose the correct option");
				break;
		}
	}
}