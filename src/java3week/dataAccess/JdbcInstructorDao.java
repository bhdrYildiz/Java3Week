package java3week.dataAccess;

import java3week.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	public void add(Instructor �nstructor) {
		System.out.println("Jdbc ile veritaban�na eklendi : "+�nstructor);
	}
	

}
