package student;

public  class Info {
	public void getStudentInfo(int id,int deptcode) {
		// TODO Auto-generated method stub
	
		System.out.println("The id of the student is 09");
	System.out.println("the dept id is 8115");

	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("The id of the student is 09");
		System.out.println("The name of the student is anandh ajay");

	}
	public void getStudentInfo(String email ,int phoneNumber) {
		// TODO Auto-generated method stub
System.out.println("the email id of the student is anandajay09@gmail.com");
System.out.println("The phone number of the steudent is 8778342187");
	}
	public static void main(String[] args) {
		Info infy=new Info();
		infy.getStudentInfo(0, 0);
		infy.getStudentInfo(0, null);infy.getStudentInfo(null, 0);
		
	}
	

}
