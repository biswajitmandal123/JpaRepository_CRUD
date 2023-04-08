package com.biswajit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.biswajit.entity.Employee;
import com.biswajit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository repo = context.getBean(EmployeeRepository.class);

	Employee e1 = new Employee(3,"Smiran",20000.00,"manager");
	Employee e2 = new Employee(4,"jagadish",10000.00,"Hr");
	Employee e3 = new Employee(5,"raju",5000.00,"owner");
	Employee e4 = new Employee(6,"mandal",20000.00,"Sales");
	Employee e5 = new Employee(7,"jayprakash",40000.00,"Marketing");
	Employee e6 = new Employee(8,"sajan",80000.00,"Deller");
	
	repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
	System.out.println("record inserted ...........");
		
		
	}
}
