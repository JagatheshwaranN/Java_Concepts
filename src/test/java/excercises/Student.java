package excercises;

public class Student {
	
	private static int jcount;
	private int jrollno;
	private String jStudentName;
	private String jStudentGrade;
	
	
	public Student(String jStudentName, String jStudentGrade){
		this();
		this.jStudentName = jStudentName;
		this.jStudentGrade = jStudentGrade;
	}
	
	public Student() {
		jrollno = ++jcount;
	}
	
	public int getJrollno() {
		return jrollno;
	}
	public void setJrollno(int jrollno) {
		this.jrollno = jrollno;
	}
	public String getjStudentName() {
		return jStudentName;
	}
	public void setjStudentName(String jStudentName) {
		this.jStudentName = jStudentName;
	}
	public String getjStudentGrade() {
		return jStudentGrade;
	}
	public void setjStudentGrade(String jStudentGrade) {
		this.jStudentGrade = jStudentGrade;
	}
	
	

}
