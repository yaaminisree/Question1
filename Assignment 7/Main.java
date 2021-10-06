class Main
{
	public static void main(String[] args)
	{	
		Department[] departmentList= {new Department(101,"sales"),new Department(102,"Production"),new Department(103,"Assembly")};
		Employee e = new Employee(01,"john","Permanent");
		Company c = new Company("Capgemini Technology",001,departmentList,e);
		System.out.println("Details:");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Company Id :"+c.getCompanyId());
		System.out.println("Company Name :"+c.getCompanyName());
		System.out.println("");
		System.out.println("Employee Name :"+e.getEmployeeName());
		System.out.println("Employee Id :"+e.getEmployeeId());
		System.out.println("Employee Type :"+e.getEmployeeType());
		for(Department d: c.getDepartment())
			System.out.println("Department Name :"+d.getDepartmentName()+"\t Department NO:"+d.getDepartmentNo());
		System.out.println("-----------------------------------------------------------");
	}
}