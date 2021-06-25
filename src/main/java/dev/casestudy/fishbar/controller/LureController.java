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

import dev.casestudy.fishbar.entity.Lure;
import dev.casestudy.fishbar.service.LureService;

@Controller
public class LureController {
	
	
	@Autowired
	LureService lService;
	
	@GetMapping("/lure/{id}")
	public String fishPage(Model model, @PathVariable Long id) {

		model.addAttribute("lure", lService.getById(id));
		return "Lure";

	}

	@RequestMapping("/lure")
	public ModelAndView fishlist() {
		List<Lure> listLure = lService.listAll();
		ModelAndView mav = new ModelAndView("lure");
		mav.addObject("listLure", listLure);
		return mav;
	}

	@RequestMapping("/add-lure")
	public String lureListForm(Map<String, Object> model) {
		Lure lure = new Lure();
		model.put("lure", lure);
		return "new lure";
	

		
	}

}
