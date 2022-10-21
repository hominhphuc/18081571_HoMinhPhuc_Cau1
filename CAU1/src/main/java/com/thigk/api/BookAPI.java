package com.thigk.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thigk.entity.Book;
import com.thigk.repo.BookService;

@RestController
@RequestMapping("/api")
public class BookAPI {
	@Autowired
	private BookService bookRepo;
	
	
	@GetMapping("/books")
	public List<Book> getAll() {
		return bookRepo.findAll();
	}
	
	@PostMapping("/books")
	public Book add(@RequestBody Book book) {
		return bookRepo.save( book);
	}
}
