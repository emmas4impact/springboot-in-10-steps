package com.empact.spring.basis.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l, "Spring Boot 5.0", "John Brooks"),
				new Book(2l, "Spring MVC", "John Holt"),
				new Book(3l, "Spring Batch", "Toyinbo Holt"),
				new Book(4l, "SAP HANA", "Faith Umukoro"),
				new Book(5l, "RestFul API", "Emmanuel Adedeji"));
	}

}
