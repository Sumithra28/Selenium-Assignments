package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName(String name) {
		System.out.println("Student name is:"+name);
	}
	
	public void studentDept() {
		System.out.println("Sumithra comes under EEE department");
	}
	
	public void studentId(int id) {
		System.out.println("My ID is:"+id);
			}

	public static void main(String[] args) {
		
		Student std = new Student();
		std.collegeName("College Name is Meenakshi Soundararajan Engg College");
		std.collegeCode(309);
		std.collegeRank(1);
		std.deptName();
		std.studentName("Sumithra");
		std.studentDept();
		std.studentId(1234567890);
	
		
		
	}

}
