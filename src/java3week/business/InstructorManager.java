package java3week.business;

import java3week.core.logging.Logger;
import java3week.dataAccess.InstructorDao;
import java3week.entities.Instructor;

public class InstructorManager {
	private InstructorDao ýnstructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao ýnstructorDao,Logger[] loggers) {
		this.ýnstructorDao = ýnstructorDao;
		this.loggers = loggers;
		
	}
	
	public void add(Instructor ýnstructor) {	
		System.out.println("Eðitmen eklendi : " +ýnstructor.getFirstName()+" "+ýnstructor.getLastName());
		
		ýnstructorDao.add(ýnstructor);
		
		for(Logger logger : loggers) {
			logger.log(ýnstructor.getFirstName()+" "+ýnstructor.getLastName());
		}
	}
}
