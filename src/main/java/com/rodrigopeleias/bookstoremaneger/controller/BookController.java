package com.rodrigopeleias.bookstoremaneger.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bookstore")
public class BookController {

	@GetMapping("/list")
	public ArrayList<String> list() {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("teste");
		
		return list;
	}
}
