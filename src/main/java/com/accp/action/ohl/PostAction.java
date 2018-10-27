package com.accp.action.ohl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c/ohl/posts")
public class PostAction {
	
	@GetMapping("/query")
	public void query() {
		
	}
}
