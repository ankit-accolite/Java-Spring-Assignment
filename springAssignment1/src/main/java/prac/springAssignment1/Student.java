package prac.springAssignment1;
import java.util.*;
public class Student {
	private int StudentId;
	private String StudentName;
	private Map<String,Integer> marks ;
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, Map<String,Integer> marks) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		this.marks = marks;
	}

	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "\nStudent [StudentId=" + StudentId + ", StudentName=" + StudentName + ", marks=" + marks + "]";
	}

	public Map<String,Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String,Integer> marks) {
		this.marks = marks;
	}

	
	}
