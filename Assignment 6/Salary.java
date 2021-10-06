class Salary
{
	private int basicSalary;
	private int pf;
	private int points;
	private int houseRentAllowance;
	private int esi;
	Salary()
	{
	}
	Salary(int points,int basicSalary,int pf,int houseRentAllowance,int esi)
	{
		this.points=points;
		this.basicSalary=basicSalary;
		this.pf=pf;
		this.houseRentAllowance=houseRentAllowance;
		this.esi=esi;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
	public int validateSalary()
	{
		return ((points*500)+basicSalary+houseRentAllowance)-pf-esi;
	}	
	public int getPoints()
	{
		 return points;
	}
	public void setBasicSalary()
	{
		this.basicSalary = basicSalary;
	}
	public int getBasicSalary()
	{
		return basicSalary;
	}
	public void setPf(int pf)
	{
		this.pf=pf;
	}
	public int getPf()
	{
		return pf;
	}
	public void setHouseRentAllowance(int houseRentAllowance)
	{
		this.houseRentAllowance = houseRentAllowance;
	}
	public int getHouseRentAllowance()
	{
		return houseRentAllowance;
	}
	public void setEsi(int esi)
	{
		this.esi=esi;
	}
	public int getEsi()
	{
		return esi;
	}
}