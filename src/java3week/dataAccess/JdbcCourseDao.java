package java3week.dataAccess;

import java3week.entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanýna :" +course);
	}

}
