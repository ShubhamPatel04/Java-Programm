package com.generics;

class Employee<E,V,N>{
	E id;
	V name;
	N salary;
	
	Employee(E id,V name,N salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	E getid() {
		return id;	
	}
	V getName() {
		return name;
	}
	N getSalary() {
		return salary;
	}
	public void printInfo() {
		System.out.println("Your id is:"+id);
		System.out.println("Your name is:"+name);
		System.out.println("Your monthly salary is:"+salary);
	}
}

public class GenericsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee<Integer,String,Double> e=new Employee<>(101,"Shubham",50000.00);
//		//Without using printInfo method
//		System.out.println(e.getid());
//		System.out.println(e.getName());
//		System.out.println(e.getSalary());
		e.printInfo();
		System.out.println();
        
		Employee<Integer,String,Double> e1=new Employee<>(102,"Rahul",40000.00);
//		//Without using printInfo method
//		System.out.println(e1.getid());
//		System.out.println(e1.getName());
//		System.out.println(e1.getSalary());
//		System.out.println();
		e1.printInfo();
		System.out.println();
		
		Employee<Integer,String,Double> e2=new Employee<>(103,"Vishal",45000.00);
		e2.printInfo();
	}
	

}
