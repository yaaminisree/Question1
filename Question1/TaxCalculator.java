package Question1;

public class TaxCalculator {
    public static double taxableAmount(double monthlySalary)
    {
              //should return annual taxable amount
    	double x,x1,x2,x3,y1,y2,z;
		double annual_salary = monthlySalary * 12;
		if(annual_salary < 250000)
		{
		 	return 0;
		}
		else if(annual_salary < 500000)
		{
			x=(annual_salary - 250000);
			x1=x/10;
			return x1;
		}
		else if(annual_salary < 1000000)
		{
			x =(annual_salary - 250000);
			x1 = x-250000;
			x2 = x1/5;
			y1 = 250000/10;
			z = x2 +y1;
			return z;
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
			return z;			
		}
    }

}
