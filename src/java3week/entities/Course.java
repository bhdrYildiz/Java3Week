package java3week.entities;

public class Course {
	
	private String courseName;
	private int courseId;
	private double price;
	
	public Course() {
		
	}
	public Course(String courseName,int courseId,double price) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
