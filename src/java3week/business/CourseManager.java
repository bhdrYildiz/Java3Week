package java3week.business;

import java.util.ArrayList;
import java.util.List;

import java3week.core.logging.Logger;
import java3week.dataAccess.CourseDao;
import java3week.entities.Course;


public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	List<String> courseName = new ArrayList<String>(); 
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		
		if(courseName.size() == 0) {
			courseName.add(course.getCourseName());
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
		else {
			for (String courses : courseName) {
				if(courses.contains(course.getCourseName())) {
					System.out.println("Bu kurs daha önceden eklenmiþ!");
					break;
				}else {
					courseName.add(course.getCourseName());
					courseDao.add(course);
					for (Logger logger : loggers) {
						logger.log(course.getCourseName());
					}
				}
			}
		}
		
		if(course.getPrice() < 0 ) {
			System.out.println("Kursun fiyatý 0 dan küçük olamaz!");
		}
		else {
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
		
		
	}

}
