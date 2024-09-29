package com.pattern;

	import java.util.Scanner;
	public class  Pattern1Reverse {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of the row");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				for (int j=2*(n-i); j>=0; j--)         
				{  
				     
				System.out.print(" ");   
				}   
				
				for (int k=n; k>0; k-- )   
				{   
				     
				System.out.print("* ");   //
		/*		//Output
           * * * * * 
         * * * * * 
       * * * * * 
     * * * * * 
   * * * * * 

			  */
				}  
				System.out.println();
			}
			
			sc.close();

		}

	}


