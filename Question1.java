public class Student{
	private int studentID;
	private String name;
	private int attendance;
	
	public Student(int studentID,String name,int attendance){
		this.studentID = studentID;
		this.name = name;
		this.attendance= attendance;
	}
	public int getstudnetID(){
		return studentID;
		}
	public String getName() {
		return name;
	}
	public int getattendance(){
		return attendance;
	}
	public void setattendance(int attendance){
		this.attendance= attendance;
	}
	public void displayStudentDetails() {
        System.out.println("ID: " + studentID + ", Name: " + name + ", Days Attended: " + attendance);
    }
}
class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom() {
        students = new Student[10];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Classroom is full!");
        }
    }

    public void updateAttendance(int studentID, int newattendance) {
        for (int i = 0; i < studentCount; i++) {
            if (Student[i].getstudentID() == studentID) {
                Student[i].setattendance(newattendance);
                return;
            }
        }
        System.out.println("Student ID " + studentID+ " not found.");
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }

class Question1{
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        
        classroom.addStudent(new Student(101, "Kasun", 13));
        classroom.addStudent(new Student(102, "kamal", 15));
        classroom.addStudent(new Student(103, "Supun", 17));

        classroom.updateAttendance(102, 19);
        classroom.updateAttendance(119, 4); 

        classroom.displayAllStudents();
    }
}
}
