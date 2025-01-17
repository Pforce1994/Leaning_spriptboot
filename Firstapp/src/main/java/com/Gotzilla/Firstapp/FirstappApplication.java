package com.Gotzilla.Firstapp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Gotzilla.Firstapp.entity.Person;
import com.Gotzilla.Firstapp.repository.PersonDAO;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}
	@Bean
	public CommandLineRunner dCommandLineRunner(PersonDAO dao) {
		return runner -> {
			// saveData(dao);
			// deleteData(dao);
			getAllData(dao);
			updateData(dao);

		};
	}

	
	public void saveData(PersonDAO dao) {
		// Person obj1 = new Person("ลูกน้ำ", "แสนสวย");
		// dao.save(obj1);
	}
	public void deleteData(PersonDAO dao){
		int id=3;
		dao.delete(id);	
	}
	public void getData(PersonDAO dao){
		int id=1;
		Person person= dao.get(id);
		System.out.println(person);
	}
	public void getAllData(PersonDAO dao){
		List<Person> data = dao.getAll();
		for (Person person : data) {
			System.out.println(person);
		}	
	}
	public void updateData(PersonDAO dao){
		int id=4;
		Person myPerson = dao.get(id);
		myPerson.setFname("โจโจ้");
		myPerson.setLname("เรียนดี");
		dao.update(myPerson);
		System.out.println("Update Complete");
	}
}
