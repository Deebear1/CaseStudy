package dev.casestudy.fishbar.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.casestudy.fishbar.entity.Water;
import dev.casestudy.fishbar.service.WaterService;

@Controller
public class WaterController {
	
	
	@Autowired
	WaterService wService;
	
	@GetMapping("/water/{id}")
	public String fishPage(Model model, @PathVariable Long id) {

		model.addAttribute("water", wService.getById(id));
		return "water";

	}

	@RequestMapping("/water")
	public ModelAndView fishlist() {
		List<Water> listwater = wService.listAll();
		ModelAndView mav = new ModelAndView("water");
		mav.addObject("listwater", listwater);
		return mav;
	}

	@RequestMapping("/add-water")
	public String waterListForm(Map<String, Object> model) {
		Water water = new Water();
		model.put("water", water);
		return "new water";
	

		
	}

}
