package com.example.javabase;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Indian implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		List<String>indian=Arrays.asList("idli","vada");
		return indian;
	}

	
	}


