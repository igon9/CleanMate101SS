package com.example.clean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

	/*--- 完了後のリダイレクト先（Clean登録系） ---*/
	@GetMapping("/clean-complete")
	private String completeClean() {
		return "clean-complete";
	}

}
