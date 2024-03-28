package com.voya.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	
@Autowired
@Qualifier("guitar")
IInstrument instrument;


@Autowired
@Qualifier("voilin")
IInstrument voilin;


@Autowired
@Qualifier("keyboard")
IInstrument keyboard;

void playmusic(String choice,String song) {
	if(choice.equals("v"))
		voilin.play(song);
	if(choice.equals("g"))
		instrument.play(song);
	if(choice.equals("k"))
		keyboard.play(song);
}

}
