class Company
{
	private String companyName;
	private int companyId;
	Department[] department;
	Employee employee;
	public Company()
	{
	}
	public Company(String companyName,int companyId,Department[] department,Employee employee)
	{
		this.companyName=companyName;
		this.companyId=companyId;
		this.department=department;
		this.employee=employee;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public void setCompanyId(int companyId)
	{
		this.companyId=companyId;
	}
	public void setDepartment(Department[] department)
	{
		this.department=department;
	}
	public void setEmployee(Employee employee )
	{
		this.employee = employee;
	}
	public Employee getEmployee()
	{
		return employee;
	}
	public int getCompanyId()
	{
		return companyId;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public Department[] getDepartment()
	{
		return department;
	}
}