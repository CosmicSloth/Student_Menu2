import java.util.*;
import java.io.*;

public class StudentMenu {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		File file = new File("students.txt");
		Scanner fileIn = new Scanner(file);
		
		int choice = 0;
		boolean found;
		
		while(fileIn.hasNext()) {
			String firstName = fileIn.nextLine();
			String lastName = fileIn.nextLine();
			int id = fileIn.nextInt();
			double gpa = fileIn.nextDouble();
			fileIn.nextLine();
			students.add(new Student(firstName, lastName, id, gpa));
		}
		
		fileIn.close();
		
		
		
		do {
			System.out.println("\nStudent menu");
			System.out.println("1 - Add new student");
			System.out.println("2 - Display all students");
			System.out.println("3 - Search for student (by ID)");
			System.out.println("4 - Search for student (by last name)");
			System.out.println("5 - Modify a student's GPA");
			System.out.println("6 - Remove student (by ID)");
			System.out.println("7 - Exit");
			
			
			System.out.println("Enter choice: ");
			choice = in.nextInt();
			
			
			// Choice 1
			
			if(choice == 1) {
				found = false;
				System.out.println("Enter the following info: \n");
				System.out.println("ID: ");
				int id = in.nextInt();
		
				// Check if ID already exists
				for(int i=0; i<students.size(); i++) {
					if(id == students.get(i).getId()){
						System.out.println("ERROR: ID already exists.");
						found = true;
					}
					
			
				}
				
				System.out.println("First name: ");
				String fName = in.next();
				
				System.out.println("Last name: ");
				String lName = in.next();
				
				System.out.println("GPA: ");
				double gpa = in.nextDouble();
			
				students.add(new Student(fName, lName, id, gpa));
				
				PrintWriter add = new PrintWriter("students.txt");
				for(Student i : students) {
					add.println(i);
				}
				
	
			}
			
			 
			// Choice 2
			
			else if(choice == 2) {
				
				for(Student s : students) {
					s.display();
				}
				
				for(int i=0; i<students.size(); i++) {
					students.get(i).display();
				}
			}
			
			
			// Choice 3	
			
			else if(choice == 3) {
				System.out.println("Enter id to search: ");
				int searchId = in.nextInt();
				found = false;
				for(int i=0; i<students.size(); i++) {
					if(students.get(i).getId() == searchId) {
						System.out.println("Student found: \n");
						students.get(i).display();
						found = true;
					}
				}
				if(!found) {
					System.out.println("Student not found. \n");
				}
			}
			
			
			// Choice 4
			
			else if(choice == 4) {
				System.out.println("Enter last name to search: \n");
				String searchLastName = in.nextLine();
				found = false;
				for (int i=0; i<students.size(); i++) {
					if (students.get(i).getLastName().equals(searchLastName)) {
						System.out.println("Student found: \n");
						students.get(i).display(i);
						found = true;
					}
				}
				
				if(!found) {
					System.out.println("Student not found. \n");
				}
			}
			
			
			// Choice 5
			
			else if(choice == 5) {
				System.out.println("Enter student ID to be modified: \n");
				int searchId = in.nextInt();
				found = false;
				for(int i=0; i<students.size(); i++) {
					if(students.get(i).getId() == searchId) {
						System.out.println("Current stats: \n");
						System.out.println("ID: " + students.get(i).getId() + "\n");
						System.out.println("Name: " + students.get(i).getFirstName() + " " + students.get(i).getLastName() + "\n");
						System.out.println("Current GPA: " + students.get(i).getGpa()+ "\n");
						
						System.out.println("Enter new GPA: \n ");
						double newGpa = in.nextDouble();
						students.get(i).setGpa(newGpa);
						System.out.println("Edited GPA: " + newGpa + "\n");
						found = true;
					}
				}
				
				if(!found) {
					System.out.println("ID not found. \n");
				}
			}
			
			else if(choice == 6) {
				System.out.println(" Enter student ID to be removed: \n");
				int searchId = in.nextInt();
				found = false;
				for(int i=0; i<students.size(); i++) {
					if(students.get(i).getId() == searchId)
						students.remove(i);
					System.out.println("Student ID " + searchId + " has been removed. \n");
					found = true;
				}
			
				
				if(!found) {
					System.out.println("Student not found. \n");
			}
		}
		
		
			if(choice == 7) {
				System.out.println("Saving data. Exiting menu. ");
				//**
				
			}
			
			
		} while (choice != 7);

	}
}
		
			
	


