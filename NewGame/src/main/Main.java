package main;

import java.util.Random;

import classes.*;

public class Main {

	public static void main(String[] args) {
		
		
		Mith mith = new Mith();
		Historia historia = new Historia();
		Combate combate = new Combate();
			
		mith.atributosIniciais();
		historia.introducao();
		combate.setMith(mith);
		combate.primeiroCombate();
	}

}
