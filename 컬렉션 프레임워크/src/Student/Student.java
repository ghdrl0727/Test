package Student;

import collection.Member;

public class Student {

	String studentId;
	String studentName;

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String toString() {
		return studentName + ": " + studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int hashCode() {
		return 0;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentId == student.getStudentId())
				return true;
			else
				return false;
		}
		return false;
	}
}
