package javaclass;

public class Student {
	 String name = "Amit";
	    int rollNumber = 23;
	    double marks = 87.5;

	    public String calculateGrade() {
	        if (marks >= 90) return "A";
	        else if (marks >= 80) return "B";
	        else if (marks >= 70) return "C";
	        else if (marks >= 60) return "D";
	        else return "F";
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade());
	    }

	    public static void main(String[] args) {
	        Student student = new Student();
	        student.displayDetails();
	    }
	}
