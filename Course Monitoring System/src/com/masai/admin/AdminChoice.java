package com.masai.admin;

import java.util.Scanner;

import com.masai.custom.ConsoleColors;

public class AdminChoice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println(ConsoleColors.CYAN+"1. Courses");
			System.out.println("2. Batch");
			System.out.println("3. Faculty");
			System.out.println("4. Course Plan");
			System.out.println("5. View Day wise Planner");
			System.out.println("6. Generate Report");
			System.out.println("7. Back");
			System.out.println("8. Close the App"+ConsoleColors.RESET);
			System.out.println();
			
			int ch = sc.nextInt();
		
			if(ch == 1) {
				

			}else if(ch == 2) {
				

			}else if(ch == 3) {
				
				FacultyChoice.facultyOptions();
	
			}else if(ch == 4) {
				

			}else if(ch == 5) {
				

			}else if(ch == 6) {
				

			}else if(ch== 8) {
				
				System.out.println(ConsoleColors.BANANA_YELLOW+"See You Soon..."+ConsoleColors.RESET);
				System.exit(0);
				
			}else if(ch == 7) {
				
				break;
			}
			else {
				
				System.out.println(ConsoleColors.RED+"Wrong Input Try Again"+ConsoleColors.RESET);
			}
			
		}
		
		sc.close();
		
	}
	
}
