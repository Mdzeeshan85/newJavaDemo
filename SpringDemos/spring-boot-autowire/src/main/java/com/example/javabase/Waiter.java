package com.example.javabase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu indian;
	@Autowired
	
	IFoodMenu menues;
	
	@Autowired
	IFoodMenu menuItems;
	
	
	


	public IFoodMenu getMenuItems() {
		return menuItems;
	}





	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}





	public IFoodMenu getIndian() {
		return indian;
	}





	public void setIndian(IFoodMenu indian) {
		this.indian = indian;
	}





	public List<String> viewMenucard(String choice){
		List<String> food=new ArrayList<>();
		if(choice.equals("indian"))
			food=indian.showMenu();
		if(choice.equals("chinese"))
			food=menues.showMenu();
			if(choice.equals("japanese"))
				food=menuItems.showMenu();
	return food;		
	}
	

}
