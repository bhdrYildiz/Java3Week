package java3week.dataAccess;

import java3week.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	public void add(Instructor instructor) {
		
		System.out.println("Hibernate ile veritaban�na eklendi : "+instructor);
		
	}

}
