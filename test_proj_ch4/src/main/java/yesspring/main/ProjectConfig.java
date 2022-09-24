package yesspring.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"yesspring.proxies",
                "yesspring.services",
                "yesspring.repositories"}
)
public class ProjectConfig {
}
