package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {

//		Employee employee=new Employee();
//		employee.setFirstName("Pramod");
//		employee.setLastName("Mandlik");
//		employee.setEmailId("pramodmandlik28@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1=new Employee();
//		employee1.setFirstName("Karan");
//		employee1.setLastName("Unde");
//		employee1.setEmailId("karanunde2002@gmail.com");
//employeeRepository.save(employee1);
	}
}
