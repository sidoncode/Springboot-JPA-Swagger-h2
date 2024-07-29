package com.qa.projectsonglibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ProjectSonglibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSonglibraryApplication.class, args);
	}

}
