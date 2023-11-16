package com.project.travel.main;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {
	
	@GetMapping(path={"/", "/main"})
	public String viewMain() {
		return "Main";
	}
	
	@GetMapping (path={"/login"})
	public List<String> hello() {
		return Arrays.asList("");
	}
}
