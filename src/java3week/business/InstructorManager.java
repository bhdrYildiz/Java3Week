package java3week.business;

import java3week.core.logging.Logger;
import java3week.dataAccess.InstructorDao;
import java3week.entities.Instructor;

public class InstructorManager {
	private InstructorDao �nstructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao �nstructorDao,Logger[] loggers) {
		this.�nstructorDao = �nstructorDao;
		this.loggers = loggers;
		
	}
	
	public void add(Instructor �nstructor) {	
		System.out.println("E�itmen eklendi : " +�nstructor.getFirstName()+" "+�nstructor.getLastName());
		
		�nstructorDao.add(�nstructor);
		
		for(Logger logger : loggers) {
			logger.log(�nstructor.getFirstName()+" "+�nstructor.getLastName());
		}
	}
}
