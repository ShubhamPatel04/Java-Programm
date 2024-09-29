package com.exceptionHanding;
  
	class CountryInvalid extends Exception {
	    public CountryInvalid(String message) {
	        super(message);
	    }
	}

	class EmployeeNameInvalid extends Exception {
	    public EmployeeNameInvalid(String message) {
	        super(message);
	    }
	}

	class TaxException extends Exception {
	    public TaxException(String message) {
	        super(message);
	    }
	}

	public class TaxCalculateEx {
	    public double calculateTax(String empName, boolean isIndian, double empSal) 
	            throws CountryInvalid, EmployeeNameInvalid, TaxException {
	        if (!isIndian) {
	            throw new CountryInvalid("The employee should be an Indian citizen for calculating tax");
	        }
	        if (empName == null || empName.isEmpty()) {
	            throw new EmployeeNameInvalid("The employee name cannot be empty");
	        }
	        
	        double taxAmount;
	        if (empSal > 100000) {
	            taxAmount = empSal * 0.08;
	        } else if (empSal > 50000) {
	            taxAmount = empSal * 0.06;
	        } else if (empSal > 30000) {
	            taxAmount = empSal * 0.05;
	        } else if (empSal > 10000) {
	            taxAmount = empSal * 0.04;
	        } else {
	            throw new TaxException("The employee does not need to pay tax");
	        }
	        return taxAmount;
	    }

	    public static void main(String[] args) {
	    	TaxCalculateEx t = new TaxCalculateEx();
	        String[] names = {"Rahul", "Akash", "Shivam", "Shubham"};
	        double[] salaries = {340000, 100000, 55000, 300000};
	        boolean[] isIndians = {true, true, true, true};

	        for (int i = 0; i < names.length; i++) {
	            try {
	                double taxAmount = t.calculateTax(names[i], isIndians[i], salaries[i]);
	                System.out.println("Tax amount is " + taxAmount);
	            } catch (Exception e) {
	                e.printStackTrace();
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}