package com.jsp.spring.autowring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("heartObject")
	private Heart heart;
	
//	public Human() {
//	}
//	
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Constructor Called");
//	}
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter Method Called");
//	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name of The Animal is : "+heart.getNameOfAnimal()+" And No Of Hearts are present is : "+heart.getNoOfHeart());
		} else {
			System.out.println("Your dead ...!");
		}
	}
}
