package java3week.dataAccess;

import java3week.entities.Course;

public class HibernateCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi : "+course);

	}

}
