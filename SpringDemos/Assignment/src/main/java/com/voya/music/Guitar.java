package com.voya.music;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("guitar")
public class Guitar implements IInstrument {

	@Override
	public void play(String song) {
		System.out.println(song);
		
	}
	

}