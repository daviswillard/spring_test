package ex01;

//import ex01.service.CommentService;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ex01.service")
public class ProjectConfig {
//	@Bean
//	public CommentService commentService() {
//		return new CommentService();
//	}
}
