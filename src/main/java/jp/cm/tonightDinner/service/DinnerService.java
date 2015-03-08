package jp.cm.tonightDinner.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import jp.cm.tonightDinner.entity.Dinner;
import jp.cm.tonightDinner.repository.DinnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DinnerService {
	
	
	@Autowired
	DinnerRepository dinnerRepository;
	
	@Value("${name:World}")
	private String name;

	
	public String getTestMessage(){
		return "TestMessage:"+this.name;
	}
	
	public Iterable<Dinner> getDinnerList(){
		return dinnerRepository.findAll();
	}
	
	public void saveDinner(String name){
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd(E)");
		String date = format.format(today);
		
		Dinner dinner = new Dinner(name, date);
		dinnerRepository.saveAndFlush(dinner);
	}
}
