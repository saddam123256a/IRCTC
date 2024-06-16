package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//This is swagger implementatuion
@Configuration
@EnableSwagger2
//This class is a swagger cong class which is  used to generate documentation in our project for rest api	 
public class SwaggerConfig {

	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2) 
				.select()
				.apis(RequestHandlerSelectors.basePackage("in.ashokit.rest"))
	            .paths(PathSelectors.any())
	            .build();
	}
}
