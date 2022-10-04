package ex00;

//import ex00.service.CommentService;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ex00")
public class ProjectConfig {
//	@Bean
//	public CommentService commentService() {
//		return new CommentService();
//	}
}
