package week3.assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID:"+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is:"+id);
		System.out.println("Student name is:"+name);
	}
	
	public void getStudentInfo(String email, long phNumber) {
		System.out.println("Student email:"+email);
		System.out.println("Student PhoneNumber:"+phNumber);
	}
	
	public static void main(String[] args) {
		
		Students std = new Students();
		std.getStudentInfo(9238623);
		std.getStudentInfo(9238623, "Sumithra");
		std.getStudentInfo("abc@test.com", 99677225372L);
		}

}
