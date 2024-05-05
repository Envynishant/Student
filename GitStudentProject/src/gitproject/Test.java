package gitproject;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number of Students");
	int size =s.nextInt();
	Operation op=new Operation(size);
	System.out.println("Enter Student details:-");
	for(int i=0;i<size;i++) {
		Student s1=new Student();
		System.out.println("Enter " +(i+1)+"Student name");
		String name=s.next();
		System.out.println("Enter " +(i+1)+"Student roll");
		int roll=s.nextInt();
		s1.setRoll(roll);
		s1.setName(name);
		op.addStudent(s1);
	}
	String text=""; 
	Student std=null;
	do {
		System.out.println("Press 1 for find student by roll");
		System.out.println("Press 2 for find student by name");
		System.out.println("Press 3 for show all student");
		System.out.println("Press 4 for delete a student");
		System.out.println("Enter choice :-");
		
		int choice=s.nextInt();
	switch (choice) {
	case 1:
		System.out.println("Enter roll number to find");
		 std= op.findStudentByRoll(s.nextInt());
		if(std!=null) {
			System.out.println(std.getRoll()+"\t"+std.getName());
		}
		else {
			System.out.println("this roll number is not exist.");
		}
		break;
	case 2:
		System.out.println("Enter name to find");
		 std= op.findStudentByName(s.next());
		if(std!=null) {
			System.out.println(std.getRoll()+"\t"+std.getName());
		}
		else {
			System.out.println("this name is not exist.");
		}
		break;
	case 4:
		System.out.println("Enter roll to delete");
		if(op.delete(s.nextInt())) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("this roll is not available..");
		}
	case 3:
		default:System.out.println("Wrong choice..");
	}
	System.out.println("Do you want to continue? y/n");
	text=s.next();
	}while(text.equalsIgnoreCase("y"));
	
	System.out.println("Thanks for using Crud using array...");
}
}



