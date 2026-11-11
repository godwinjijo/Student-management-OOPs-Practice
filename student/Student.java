package student;


class Student1{
	
	private String name;
	private int rollNumber;
	private double marks;
	
	
	//DEFAULT CONSTRUCTOR
	public Student1() {
		
	}
	//PARAMETRIZED CONSTRUCTOR
	public Student1(String name,int rollNumber, double marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		setMarks(marks);
	}
	//CONSTRUCTOR THAT ACCEPT ONLY NAME AND  ROLLNUMBER
	public Student1(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	
	
	//CREATING GETTER 
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	
	
	//CREATING SETTERS
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public void setMarks(double marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks=marks;
		}else {
			System.out.println("Invalid marks");
		}
	}
	
	
	//TO DISPLAY THE DETAILS OF STUDENTS
	public void displayDetails(){
		System.out.println("Name "+name+", Roll Number "+rollNumber+", Marks "+marks);
	}
}

public class Student {

	public static void main(String[] args) {
		Student1 s1 = new Student1("sonu",101,59);
		Student1 s2 = new Student1("ponu",102,85);
		Student1 s3 = new Student1("monu",103,43);
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		
		System.out.println(s1.getName());
		System.out.println(s2.getRollNumber());
		System.out.println(s3.getMarks());
		
		s1.setName("vipin");
		s2.setRollNumber(105);
		s3.setMarks(72);
		
		System.out.println(s1.getName());
		System.out.println(s2.getRollNumber());
		System.out.println(s3.getMarks());

	}

}
