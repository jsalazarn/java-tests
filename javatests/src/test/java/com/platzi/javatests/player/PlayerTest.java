package com.platzi.javatests.player;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {

	@Test
	public void looses_when_dice_number_is_too_low() {
		
		// Dice dice = new Dice(6);
		
		// Creando un dado simulado
		Dice dice = Mockito.mock(Dice.class);
		
		Mockito.when(dice.roll()).thenReturn(2);
		
		Player player = new Player(dice, 3);
		assertFalse(player.play());
		// assertEquals(false, player.play());
	}
	
	@Test
	public void wins_when_dice_number_is_too_low() {
		
		// Creando un dado simulado con un resultado fijo
		Dice dice = Mockito.mock(Dice.class);
		
		Mockito.when(dice.roll()).thenReturn(4);
		
		Player player = new Player(dice, 3);
		assertTrue(player.play());
	}

}
