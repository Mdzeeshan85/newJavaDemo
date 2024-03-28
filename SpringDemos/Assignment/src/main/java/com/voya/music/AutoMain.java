package com.voya.music;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.music");
	Performer performer=(Performer)context.getBean("performer");
	
	performer.playmusic("g", "dabangg");
	performer.playmusic("v", "violin song");
	performer.playmusic("k", "arrahman");
}
}
