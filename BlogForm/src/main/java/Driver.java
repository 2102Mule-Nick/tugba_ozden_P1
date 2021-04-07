import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.AppConfig;
import com.revature.dao.ArticleDao;
import com.revature.dao.ArticleDaoJDBC;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ArticleDao ar=appContext.getBean("articleDaoJDBC", ArticleDaoJDBC.class);
		
		
		System.out.println(ar.getAllArticles());
		System.out.println(ar.getArticlesByTitle("Web Services"));
		
	}

}
