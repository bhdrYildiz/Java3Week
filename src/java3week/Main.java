package java3week;

import java3week.business.CategoryManager;
import java3week.business.CourseManager;
import java3week.business.InstructorManager;
import java3week.core.logging.DatabaseLogger;
import java3week.core.logging.FileLogger;
import java3week.core.logging.Logger;
import java3week.dataAccess.HibernateCourseDao;
import java3week.dataAccess.InstructorDao;
import java3week.dataAccess.JdbcCategoryDao;
import java3week.dataAccess.JdbcInstructorDao;
import java3week.entities.Category;
import java3week.entities.Course;
import java3week.entities.Instructor;


public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		Instructor instructor = new Instructor("bahadir","yildiz");
		Instructor instructor2 = new Instructor("Eray","Demirtas");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		
		Course course = new Course("Java Progralama",2,3099.99);
		Course course2 = new Course("Web Programlama",2,2099.99);
		Course course3 = new Course("Web Programlama",4,1000);
		Course course4 = new Course("Android Programlama",5,0);
 		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		
		Category category = new Category();
		category.setCategoryName("yazýlým");
		
		Category category2 = new Category();
		category.setCategoryName("donaným");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		categoryManager.add(category2);
		
	}

}
