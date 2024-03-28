package com.voya.music;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("keyboard")
public class Keyboard implements IInstrument {

	@Override
	public void play(String song) {
		System.out.println(song);
		
	}
	

}
