package classes;

import java.util.Scanner;

public class Combate {
	
	Mith mith;
	Goblin goblin = new Goblin();
	Scanner input = new Scanner(System.in);
	
	public void setMith(Mith mith) {
		this.mith = mith;
	}
	
	public void conclusaoCombate() {
		if (mith.estaVivo()) {
			System.out.println("Parabéns! Você derrotou o inimigo!");
		} else {
			System.out.println("Você morreu.");
		}
	}
	
	public void primeiroCombate() {
		int energiaReal = mith.getEnergia();
		while (mith.estaVivo() && goblin.estaVivo()) {
			System.out.println("");
			System.out.println("- - - - I N I C I O - D A - R O D A D A - - - -");
			System.out.println("");
			goblin.listarAtributosMonstro();
			mith.listarAtributos();
			mith.listarAtaques();
			int opcaoATAQUE = input.nextInt(3);
			System.out.println("");
			goblin.atacar();
			mith.ataques(opcaoATAQUE);
			System.out.println("");
			goblin.receberDano(mith.getDano());
			mith.receberDano(goblin.getDano());
			System.out.println("");
			mith.setEnergia(mith.getEnergia() + 1);
			System.out.println("- - - - F I M - D A - R O D A D A - - - -");
		}
		System.out.println("");
		conclusaoCombate();
		mith.setEnergia(energiaReal);
		System.out.println("");
		mith.listarAtributos();
	}
	
}
