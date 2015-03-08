package jp.cm.tonightDinner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dinner {
	@Id
	@GeneratedValue
	Integer id;
	String name;
	String date;

	public Dinner() {
		super();
	}

	public Dinner(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String toString() {
		return "name:" + name + ", date:" + date;
	}

}
