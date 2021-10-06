class Main
{
	public static void main(String[] args)
	{
		Employee e = new Employee(001,"janu","software Development",new Salary(5,15000,1800,3000,500));	
		System.out.println("Employee no:"+e.getEmployeeId());
		System.out.println("Employee Name:"+e.getEmployeeName());
		System.out.println("Department:"+e.getEmployeeDepartment());
		System.out.println("Monthly PF:"+e.getSalary().getPf());
		System.out.println("Basic Salary:"+e.getSalary().getBasicSalary());
		System.out.println("Monthly ESI:"+e.getSalary().getEsi());
		System.out.println("House Rent Allowance:"+e.getSalary().getHouseRentAllowance());
		System.out.println("Earned Points:"+e.getSalary().getPoints());
		System.out.println("Monthly Salary:"+e.getSalary().validateSalary());
	}
}