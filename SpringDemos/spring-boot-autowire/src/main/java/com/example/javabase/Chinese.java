package com.example.javabase;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Chinese implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		List<String> chinese=Arrays.asList("BatSoup","cockroachMunchurian");
		return chinese;
	}

}
