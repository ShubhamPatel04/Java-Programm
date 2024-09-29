package com.company;

class Employee{
	int emp_Id;
	String name;
	String empDep;
	Double salary;
	
	//using constructor
	Employee(int emp_id,String name,String empDep,Double salary){
	this.emp_Id=emp_Id;
	this.name=name;
	this.empDep=empDep;
	this.salary=salary;	
	}
	
	public void display() {
		System.out.println("Employee ID ="+emp_Id);
		System.out.println("Employee Name ="+name);
		System.out.println("Employee Department ="+empDep);
		System.out.println("Employee ID ="+salary);
	}
}
public class ArrayObject {

	public static void main(String[] args) {
		Employee[] arr;
		arr=new Employee[3];
		arr[0]=new Employee(101,"Rajiv","Developer",45000.0);
		arr[1]=new Employee(102,"Rahul","Manager",100000.0);
		arr[2]=new Employee(103,"Rakesh","Team Manager",60000.0);
		System.out.println("Details of first Employee:");
		}

}
