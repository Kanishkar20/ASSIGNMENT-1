package assignment;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmployeeDetails emp  = new EmployeeDetails();

		
		emp.printEmployeeName("Kanishkar", 2022);
		
		emp.getEmployeeAddress("Chennai");
		
		
		emp.printEmployeeSalary(50000);
		
		
		emp.printEmployeeMobileNumber(99872323);
		
	}
	
	public static void printEmployeeName(String empName, int empId)
	{
		System.out.println(empName);
		
		System.out.println(empId);
	}
	
	public static void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
		
		
	}
	
	public static void printEmployeeSalary(double empSalary) 
	{
		System.out.println(empSalary);
	}
	
	public static void printEmployeeMobileNumber(long mobNum)
	{
		System.out.println(mobNum);
	}
	
	 

}
