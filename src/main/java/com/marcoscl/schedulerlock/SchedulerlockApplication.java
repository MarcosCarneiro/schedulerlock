package com.marcoscl.schedulerlock;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
@SpringBootApplication
public class SchedulerlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerlockApplication.class, args);
	}

}