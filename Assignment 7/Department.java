class Department
{
	private int departmentNo;
	private String departmentName;
	public Department()
	{
	}
	public Department(int departmentNo,String departmentName)
	{
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
	}
	public void setDepartmentNo(int departmentNo)
	{
		this.departmentNo = departmentNo;
	}
	public int getDepartmentNo()
	{
		return departmentNo;
	}
	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}
	public String getDepartmentName()
	{
		return departmentName;
	}
}