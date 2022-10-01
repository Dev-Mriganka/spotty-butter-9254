package com.masai.batch;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.custom.ConsoleColors;
import com.masai.dao.BatchDao;
import com.masai.dao.BatchDaoImpl;
import com.masai.exceptions.BatchException;
import com.masai.exceptions.InputException;

public class SearchBatchByName {

	public static void searchBatchByName() throws InputException{
		
		
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println(ConsoleColors.CYAN+"Enter Name of Batch"+ConsoleColors.RESET);
			String bname = sc.next();
			
			BatchDao dao = new BatchDaoImpl();
			
			try {
				List<Batch> batches = dao.searchBatchByName(bname);
				
				batches.forEach( b -> {
					System.out.println();
					System.out.println(ConsoleColors.ORANGE+"---------------------------------------------------------------------------------");
			        System.out.printf("%6s %8s %6s %10s %10s %10s", "BATCH ID |", "COURSE ID |", "FACULTY ID |", "No. Of Students |", "Starting Date |", "Duration |");
			        System.out.println();
			        System.out.println("---------------------------------------------------------------------------------");
					System.out.printf("%5s %9s %12s %16s %20s %15s", b.getFacultyId(), b.getCourseId(), b.getFacultyId(), b.getNoOfStudents(), b.getBatchstartDate(), b.getDuration()+ConsoleColors.RESET);
					
				});
				System.out.println();
				
			} catch (BatchException e) {
	
				System.out.println();
				System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
				System.out.println();
			}
		}catch(Exception e) {
			throw new InputException(ConsoleColors.RED+"Please Enter Right Input"+ConsoleColors.RESET);
			
		}

	}

}
