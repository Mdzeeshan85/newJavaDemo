package com.voya.music;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("voilin")
public class Voilin implements IInstrument {

	@Override
	public void play(String song) {
		System.out.println(song);
		
	}
	

}
