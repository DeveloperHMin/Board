package com.pjt.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user")
public class BoardController {
	
	@Autowired
	private BoardService BoardService;
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String logout(Model model) {
		
		model.addAttribute("board", BoardService.selBoard());
		return "board";
	}
}
