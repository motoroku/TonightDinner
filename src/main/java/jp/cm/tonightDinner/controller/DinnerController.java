package jp.cm.tonightDinner.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.cm.tonightDinner.entity.Dinner;
import jp.cm.tonightDinner.repository.DinnerRepository;
import jp.cm.tonightDinner.service.DinnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DinnerController {

	@Autowired
	private DinnerService dinnerService;
	
	@RequestMapping("/")
	public String top(Model model){
		
		Iterable<Dinner> dinnerList = dinnerService.getDinnerList();
		
		model.addAttribute("val","今日の天気は曇り気味");
		model.addAttribute("dinner", dinnerList);
		return "top";
	}
	
	
	@RequestMapping("/save")
	
	public String top(Model model,@RequestParam("name") String name){
		
		dinnerService.saveDinner(name);
		Iterable<Dinner> dinnerList = dinnerService.getDinnerList();
		
		model.addAttribute("val","今日の天気は曇り気味");
		model.addAttribute("dinner", dinnerList);
		
		return "top";
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		Iterable<Dinner> dinnerList = dinnerService.getDinnerList();
		model.addAttribute("dinner", dinnerList);
		return "list";
	}
	
}
