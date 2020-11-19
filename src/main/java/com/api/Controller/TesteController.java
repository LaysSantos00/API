package com.api.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
