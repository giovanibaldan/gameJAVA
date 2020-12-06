package classes;

import java.util.Random;

public class Goblin extends Personagem {

	public Goblin() {
		super("Goblin", 15, 2, 0);
		
	}
	
	public void atacar() {
		Random random = new Random();
		int tipodoataque = random.nextInt(5);
		switch (tipodoataque) {
		case 0:
			System.out.println("O Goblin da uma facada de raspão em você! | Dano = 2");
			setDano(getAtaque());
			break;
		case 1:
			System.out.println("O Goblin da uma facada de raspão em você! | Dano = 2");
			setDano(getAtaque());
			break;
		case 2:
			System.out.println("O Goblin da uma facada de raspão em você! | Dano = 2");
			setDano(getAtaque());
			break;
		case 3:
			System.out.println("O Goblin da uma facada de raspão em você! | Dano = 2");
			setDano(getAtaque());
			break;
		case 4:
			System.out.println("[DANO CRÍTICO] O Goblin conseguiu acertar você em cheio! | Dano = 4");
			setDano(getAtaque() * 2);
			break;
		}
	}

}
