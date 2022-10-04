package ex01;

import ex01.aspects.LoggingAspect;
import ex01.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"ex01.services"})
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public LoggingAspect aspectLog() {
		return new LoggingAspect();
	}

	@Bean
	public SecurityAspect aspectSecure() {
		return new SecurityAspect();
	}
}
