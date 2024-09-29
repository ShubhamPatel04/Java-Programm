package com.detailsemp;

		class User {
		   
		    private int id;
		    private String name;
		   
		    public User(int id, String name) {
		        this.id = id;
		        this.name = name;
		    }

		    public int getId() {
		        return id;
		    }
		  
		    public void setId(int id) {
		        this.id = id;
		    }
		    
		    public String getName() {
		        return name;
		    }
		    		  
		    public void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Employee extends User {
	
		    private double salary;
		    
		    public Employee(int id, String name, double salary) {
		        super(id, name); 
		        this.salary = salary;
		    }

		    public double getSalary() {
		        return salary;
		    }
		   
		    public void setSalary(double salary) {
		        this.salary = salary;
		    }
		
		    public double calculateAnnualSalary() {
		        return salary * 12;
		    }
		
		public void printInfo(int id,String name,double salary) {
			
		}
	}
	
		public class EmployeeDetails {
		    public static void main(String[] args) {
		    
		        Employee emp = new Employee(1, "shubham", 5000.0);
		    
		        double annualSalary = emp.calculateAnnualSalary();
		        
		        System.out.println("Employee ID: " + emp.getId());
		        System.out.println("Employee Name: " + emp.getName());
		        System.out.println("Monthly Salary: " + emp.getSalary());
		        System.out.println("Annual Salary: " + annualSalary);
		    }
		}