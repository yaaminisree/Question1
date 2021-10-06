class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	Salary salary;
	Employee()
	{
	}
	Employee(int employeeId,String employeeName,String employeeDepartment,Salary salary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.salary = salary;
	}
	public void setEmployeeId(int employeeId )
	{
		this.employeeId = employeeId;
		
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeDepartment(String employeeDepartment)
	{
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeDepartment()
	{
		return employeeDepartment;
	}
	public void setSalary(Salary salary)
	{
		this.salary = salary;
	}
	public Salary getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return employeeId+" "+employeeName +" "+employeeDepartment+" "+salary;
	}
}