package ex02;

import ex02.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "ex02")
public class ProjectConfig {

	/* Bean случай */
//	@Bean
//	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//	public CommentService commentService() {
//		return new CommentService();
//	}
}
