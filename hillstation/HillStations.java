package com.hillstation;

	public class HillStations{
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
		
		
	

