package com.microsoft.Recurite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
@MapperScan("com.microsoft.Recurite.Mapper")
@EnableScheduling
public class RecuriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecuriteApplication.class, args);
	}
}