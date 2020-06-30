class Employee{
	String name;
	String address;
	String phone;
	double salary;
	public Employee(String name,String address,String phone,double salary) 
	{
	this.name=name;
	this.address=address;
	this.phone=phone;
	this.salary=salary;
	}
	public void printEmployeeDetails() {
		System.out.println("EMPLOYEE NAME IS " +name );
		System.out.println("EMPLOYEE ADDRESS IS " +address);
		System.out.println("EMPLOYEE PHONE  NO. is " +phone );
		System.out.println("EMPLOYEE SALARY IS" +salary);
	}
	
}
public class EmployeeArray {

	public static void main(String[] args) {
		Employee[] Employees=new Employee[6];
		Employees[0]=new Employee("ALEX WAFULA","KIBRA","254725104113",234554.78);
		Employees[1]=new Employee("HEZEKIAH RONO","WESTLAND","254708513944",234567.78);
		Employees[2]=new Employee("JOSEPH KIHARA","MUTHAIGA","25713881737",23456.78);
		Employees[3]=new Employee("CHRIS MUTUGI","LAVINGTON","254725104113",23457.78);
		Employees[4]=new Employee("JACINTA MUENI","MACHAKOS","2547679053",234568.78);
		Employees[5]=new Employee("JOHN TERRY","LONDON","2545725104113",234569.78);
		for(int x=0;x<Employees.length;x++)
			Employees[x].printEmployeeDetails();

	}

}
/* can create several classes but only one class can be
 *  declared public class which is the same as java file name*/
// this is used as a hidden object of the same class


