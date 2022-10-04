package ex00;

import ex00.aspects.LoggingAspect;
import ex00.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ex00.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public LoggingAspect aspect() {
		return new LoggingAspect();
	}

	@Bean
	public CommentService commentService() {
		return new CommentService();
	}
}
