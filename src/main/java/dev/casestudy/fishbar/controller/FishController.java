package dev.casestudy.fishbar.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dev.casestudy.fishbar.entity.Fish;
import dev.casestudy.fishbar.entity.Lure;
import dev.casestudy.fishbar.service.FishService;
import dev.casestudy.fishbar.util.Constants;

@Controller
public class FishController {

	@Autowired

	FishService fService;
	
	@GetMapping("/")
	public String home() {
		return Constants.HOME;
	}

	/*
	 * @GetMapping("/test") public void test() { Fish fish = new Fish();
	 * fish.setName("testfish"); Lure lure = new Lure(); lure.setName("crankbait");
	 * Lure bait = new Lure(); bait.setName("corn"); fish.getLures().add(lure);
	 * fish.getLures().add(bait);
	 * 
	 * fService.save(fish);
	 
	}*/

	@GetMapping("/Registration")
	public String registration() {

		return "registration";
	}
             
	@GetMapping("/aboutus")
	public String about() {

		return Constants.ABOUT_US;
	}
	
	@GetMapping("/new")
	public String nufish(Model model) {
		/* model.addAttribute("Fish", new Fish()); */
		return "new-fish";
	}
	
	@GetMapping("/login")
	public String fishlogin() {

		return "login";
	}


	@GetMapping("/fish/{id}")
	public String fishPage(Model model, @PathVariable Long id) {

		model.addAttribute("fish", fService.get(id));
		return "fish";

	}

	@RequestMapping("/fish")
	public ModelAndView fishlist() {
		List<Fish> listFish = fService.listAll();
		ModelAndView mav = new ModelAndView("fish");
		mav.addObject("listFish", listFish);
		return mav;
	}

	@RequestMapping("/add-fish")
	public String fishListForm(Map<String, Object> model) {
		Fish fish = new Fish();
		model.put("fish", fish);
		return "add-fish";
	}

	@RequestMapping("/delete")
	public String deleteFishForm(@RequestParam long id) {
		fService.delete(id);
		return "redirect:/fish";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveFish(@ModelAttribute("fish")Fish fish) {
        fService.save(fish);
        return "redirect:/fish";
    }

	@RequestMapping("/edit")
	public ModelAndView editFishForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("editfish");
		Fish fish = fService.get(id);
		mav.addObject("fish", fish);
		return mav;
	}
	
    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateFish(@ModelAttribute("fish") Fish fish) {
		/* fService.update(fish); */
    	fService.save(fish);
        return "redirect:/fish";
    }
}
