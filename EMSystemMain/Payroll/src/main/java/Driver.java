import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.AppConfig;
import com.revature.service.EmployeeServiceFinder;

public class Driver {
	
public static void main(String[] args) {
	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	
	System.out.println(appContext.getBean(EmployeeServiceFinder.class).getAllEmployees());
}

}
