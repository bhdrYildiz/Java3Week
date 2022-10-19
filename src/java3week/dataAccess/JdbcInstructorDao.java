package java3week.dataAccess;

import java3week.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	public void add(Instructor ýnstructor) {
		System.out.println("Jdbc ile veritabanýna eklendi : "+ýnstructor);
	}
	

}
