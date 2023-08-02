package com.SoleVaultProject.SoleVaultGLA16;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/vault")
	public ModelAndView vault() {
		List<Products> list = service.getAllProducts();

		ModelAndView m = new ModelAndView();
		m.setViewName("vault");
		m.addObject("products", list);
		return m;
	}
	
	@GetMapping("/manage")
	public ModelAndView manage() {
		List<Products> list = service.getAllProducts();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("manage");
		mv.addObject("products", list);
		return mv;
	}

	@GetMapping("/trending")
	public ModelAndView trending() {
		List<Products> list = service.getMostPopular();
		ModelAndView m = new ModelAndView();
		m.setViewName("trending");
		m.addObject("products", list);
		return m;
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@GetMapping("/pin-entry")
	public String pinEntry() {
		return "pin-entry";
	}
	
	@GetMapping("/pin-entry-manage")
	public String pinEntryManage() {
		return "pin-entry-manage";
	}
	

	@PostMapping("/save")
	public String addProducts(@ModelAttribute Products p) {
		service.addProducts(p);
		return "redirect:/vault";
	}

	@RequestMapping("/delete/{id}")
	public String deleteProducts(@PathVariable("id") int id) {
		service.deleteByID(id);
		return "redirect:/manage";
	}

}
