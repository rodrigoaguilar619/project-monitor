package com.monitor.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ProjectMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMonitorApplication.class, args);
	}

}
