package com.mongo.mongodb;

import com.mongo.mongodb.dto.StudentRepository;
import com.mongo.mongodb.model.Address;
import com.mongo.mongodb.model.Gender;
import com.mongo.mongodb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.List;


@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Override

	public void run(String... args) throws Exception {
		/*
		Address address = new Address("Cameroon",1409,"Yaounde");

		Student student = new Student("Emma","Bio","krogan@hotmail.com",
				Gender.FEMALE,address,
				List.of("Physics","Manual labour","English","French"),
				BigDecimal.TEN,
				LocalDateTime.now()

				);
		studentRepository.insert(student);

*/
	}
}
