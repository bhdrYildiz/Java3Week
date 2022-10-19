package java3week.dataAccess;

import java3week.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanýna eklendi : " +category);
	}
	
}