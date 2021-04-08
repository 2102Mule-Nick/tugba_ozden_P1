import java.sql.Date;
import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.AppConfig;
import com.revature.dao.ArticleDao;
import com.revature.dao.ArticleDaoJDBC;
import com.revature.pojo.Article;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ArticleDao ar=appContext.getBean("articleDaoJDBC", ArticleDaoJDBC.class);
		//LocalDate date;	
		
		
		System.out.println(ar.getAllArticles());
		System.out.println(ar.getArticlesByTitle("Web Services"));
		ar.addArticle(new Article("REST",null,"REST is very usefull web service."));
		
	}

}
