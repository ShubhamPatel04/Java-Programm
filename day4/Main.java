package com.day4;

class HillStations{
	public void location() {
		System.out.println("Hill Station Location:");
	}
	public void famousFor() {
		System.out.println("Famous location:");
	}
}
    
	class Manali extends HillStations{
		 @Override
		public void location() {
			System.out.println("Manali is  Located in himanchal pradesh:");
		}
		 @Override
		public void famousFor() {
			System.out.println("Manali is famaous for their seasons:");
		}
	}
	class Mussoorie extends HillStations{
		 @Override
		public void location() {
			System.out.println("Mussoorie is  Located in uttrakhand:");
		}
		 @Override
		public void famousFor() {
			System.out.println("Mussoorie is famaous for mansoon season:");
		}
		
	}
	class Gulmarg extends HillStations{
		 @Override
		public void location() {
			System.out.println("Gulmarg is  Located in  jammu&kashmir:");
		}
		 @Override
		public void famousFor() {
			System.out.println("Gulmarg is famaous for winter season:");
		}
		
		
	}
	
	public class Main{
	    public static void main(String[] args) {
	        HillStations h = new HillStations();
	        h.location();
	        h.famousFor();

	        Manali m = new Manali();
	        m.location();
	        m.famousFor();

	        Mussoorie mussoorie = new Mussoorie();
	        mussoorie.location();
	        mussoorie.famousFor();

	        Gulmarg gulmarg = new Gulmarg();
	        gulmarg.location();
	        gulmarg.famousFor();
	    }
	}
