package com.vaccine;

	abstract class Vaccinee {
	    int age;
	    String nationality;

	    public Vaccinee(int age, String nationality) {
	        this.age = age;
	        this.nationality = nationality;
	    }

	    public void firstDose() {
	        if (nationality.equals("Indian") && age >= 18) {
	            System.out.println("First dose administered successfully.");
	            System.out.println("You need to pay Rs. 250.");
	        } else {
	            System.out.println("You are not eligible for the first dose.");
	        }
	    }

	    public void secondDose() {
	        // Check if the first dose has been administered (implement this logic)
	        // If first dose is administered, proceed with the second dose
	        // Otherwise, display a message indicating that the user is not eligible
	    }

	    public abstract void boosterDose();
	}

	class VaccinationSuccessful extends Vaccinee {
	    public VaccinationSuccessful(int age, String nationality) {
	        super(age, nationality);
	    }

	    @Override
	    public void boosterDose() {
	        System.out.println("Booster dose administered successfully.");
	    }
	}

	public class VaccineInfo {
	    public static void main(String[] args) {
	        Vaccinee vaccine = new VaccinationSuccessful(20, "Indian");

	        vaccine.firstDose();
	        // Implement logic to check if first dose is administered before calling secondDose()
	        vaccine.secondDose();
	        vaccine.boosterDose();
	    }
	}