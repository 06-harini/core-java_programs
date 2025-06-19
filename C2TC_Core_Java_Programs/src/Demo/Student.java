package Demo;

public class Student {
	private int Sid;
	private String Sname;
	private String  Scourse;
	public Student(int sid, String sname, String scourse) {
		super();
		Sid = sid;
		Sname = sname;
		Scourse = scourse;
	}
	public Student() {
		
		System.out.println("Default Constructor");
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getScourse() {
		return Scourse;
	}
	public void setScourse(String scourse) {
		Scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Scourse=" + Scourse + ", getSid()=" + getSid()
				+ ", getSname()=" + getSname() + ", getScourse()=" + getScourse() + "]";
	}
	
	
	
	

}
