package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		 
		student.setName(scanner.nextLine());
		student.setGrade_01(scanner.nextDouble());
		student.setGrade_02(scanner.nextDouble());
		student.setGrade_03(scanner.nextDouble());
	
		student.checkStatus();
		
		scanner.close();
	}

}
