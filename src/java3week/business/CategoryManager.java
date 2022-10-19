package java3week.business;

import java.util.ArrayList;
import java.util.List;

import java3week.core.logging.Logger;
import java3week.dataAccess.CategoryDao;
import java3week.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	List<String> categoryName = new ArrayList<String>(); 
	
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		
		if(categoryName.size() == 0) {
			categoryName.add(category.getCategoryName());
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}
		else {
			for (String categories : categoryName) {
				if(categories.contains(category.getCategoryName())) {
					System.out.println("Bu categori önceden yüklenmiþ");
					break;
				}else {
					categoryName.add(category.getCategoryName());
					categoryDao.add(category);
					for (Logger logger : loggers) {
						logger.log(category.getCategoryName());
					}
				}
			}
		}
		
		
		
	}
	
	

	

}
