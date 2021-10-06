import java.util.Scanner;
class Assignment1
{
	public static void main(String[] args)
	{
		int x,x1,x2,x3,y1,y2,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the monthly salary Amount");
		int monthly_salary = sc.nextInt();
		int annual_salary = monthly_salary * 12;
		if(annual_salary < 250000)
		{
			System.out.println("NO Tax");
		}
		else if(annual_salary < 500000)
		{
			x=(annual_salary - 250000);
			x1=x/10;
			System.out.println("Tax Amount:"+x1);
		}
		else if(annual_salary < 1000000)
		{
			x =(annual_salary - 250000);
			x1 = x-250000;
			x2 = x1/5;
			y1 = 250000/10;
			z = x2 +y1;
			System.out.println("Tax Amount:"+z);
		}
		else
		{
			x= annual_salary- 2500000;
			x1=x-250000;
			y1=250000/10;
			x2=x1-500000;
			y2=500000/5;
			x3=(x2*3)/10;
			z=(y1+y2+x3);
			System.out.println("Tax Amount:"+z);				
		}
	}
}