package com.apps;

import com.apps.entity.Employee;
import com.apps.entity.Location;
import com.apps.repository.EmployeeRepository;
import com.apps.repository.LocationRepository;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApplication {
    
        @Autowired
        private EmployeeRepository employeeRepository; 
        
        @Autowired
        private LocationRepository locationRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner initData(){
            return arg ->{
                Location location = new Location();
                location.setCity("Bali");
                locationRepository.save(location);
                
                
                Location location1 = new Location();
                location1.setCity("Yogyakarta");
                locationRepository.save(location1);
                
                
                Employee employee = new Employee();
                employee.setFirstName("Leonardus");
                employee.setSubDivision("Java Bootcamp");
		employee.setLastName("Dani");
                employee.setStatus("Permanent");
		employee.setGender("Male");
                DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date suspendDate = new Date(df.parse("11-12-1992").getTime());
		employee.setSuspendDate(suspendDate);
                employee.setDob(suspendDate);
                employee.setHiredDate(suspendDate);
                employee.setNationality("Indonesian");
                employee.setGrade("SE-JP");
                employee.setMaritalStatus("Single");
                employee.setDivision("Swd-Red");
                employee.setPhone("+628995145266");
                employee.setEmail("leonardus.dani@mitrais.com");
                employee.setLocation(location);
                employeeRepository.save(employee);
		
                Employee employee1 = new Employee();
                employee1.setFirstName("Ardi");
                employee1.setSubDivision("Java Bootcamp");
		employee1.setLastName("Pratama");
                employee1.setStatus("Permanent");
		employee1.setGender("Male");
		Date suspendDate1 = new Date(df.parse("26-03-1993").getTime());
		employee1.setSuspendDate(suspendDate1);
                employee1.setDob(suspendDate1);
                employee1.setHiredDate(suspendDate1);
                employee1.setNationality("Indonesian");
                employee1.setGrade("SE-JP");
                employee1.setMaritalStatus("Single");
                employee1.setDivision("Swd-Red");
                employee1.setPhone("+628995145266");
                employee1.setEmail("ardi.pratama@mitrais.com");
                employee1.setLocation(location);
                employeeRepository.save(employee1);
                
                Employee employee2 = new Employee();
                employee2.setFirstName("Emma");
                employee2.setSubDivision("Java Bootcamp");
		employee2.setLastName("Christine");
                employee2.setStatus("Permanent");
		employee2.setGender("Female");
		Date suspendDate2 = new Date(df.parse("02-10-1994").getTime());
		employee2.setSuspendDate(suspendDate2);
                employee2.setDob(suspendDate2);
                employee2.setHiredDate(suspendDate2);
                employee2.setNationality("Indonesian");
                employee2.setGrade("SE-JP");
                employee2.setMaritalStatus("Single");
                employee2.setDivision("Swd-Red");
                employee2.setPhone("+628995145266");
                employee2.setEmail("emma.christine@mitrais.com");
                employee2.setLocation(location);
                employeeRepository.save(employee2);
            };
        }
}
