package java3week.dataAccess;

import java3week.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	public void add(Category category) {
		System.out.println("Hibernate ile veritabanýna eklendi : "+category);
		
	}

}
