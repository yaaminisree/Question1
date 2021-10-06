class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeType;
	Employee()
	{
	}
	Employee(int employeeId,String employeeName,String employeeType)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
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
	public void setEmployeeType(String employeeType)
	{
		this.employeeType = employeeType;
	}
	public String getEmployeeType()
	{
		return employeeType;
	}
	public String toString()
	{
		return employeeId+" "+employeeName +" "+employeeType;
	}
}