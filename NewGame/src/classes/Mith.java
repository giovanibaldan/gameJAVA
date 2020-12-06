package classes;

import java.util.Random;
import java.util.Scanner;

public class Mith extends Personagem {

	public Mith() {
		super("Mith", 20, 2, 1);
	}
	
	int experiencia = 0;
	
	// Instanciando o input e random
	
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	// Combate de Mith
	
	public void ataquebasico() {
		System.out.println("Você da um soco no inimigo! | Dano = " + getAtaque());
		setDano(getAtaque());
	}
	
	public void controlarRespiracao() {
		System.out.println("Você lentamente controla sua respiração... | Vida = + 3 | Energia = - 1");
		setVida(getVida() + 6);
		setEnergia(getEnergia() - 3);
	}
	
	public void listarAtaques() {
		System.out.println("As suas opções de ataque são:");
		System.out.println("(1) Ataque básico | Dano = 1 | Custo de Energia = 0");
		System.out.println("(2) Controlar Respiração | Vida = + 6 | Custo de Energia = 3");
		System.out.println("\nQual é sua escolha?");
	}
	
	public void ataques(int opcaoATAQUE) {
		switch (opcaoATAQUE) {
		case 1:
			ataquebasico();
			break;
		case 2:
			controlarRespiracao();
			break;
		}
	}

	// Manipulação dos atributos

	public void aumentarAtributo(int opcao) {
		switch (opcao) {
		case 1:
			setVida(getVida() + 10);
			break;
		case 2:
			setAtaque(getAtaque() + 1);
			break;
		case 3:
			setEnergia(getEnergia() + 1);
			break;
		}
	}
	
	public void atributosIniciais() {
	
		System.out.println("Você possui inicialmente 5 pontos para distribuir entre os atributos do seu personagem. "
				+ "Escolha sabiamente para prosseguir na aventura:" + 
				"\n- Vida: É o que mantem o seu personagem vivo, quanto mais Vida você tiver, mais irá resistir a golpes inimigos." + 
				"\n- Ataque: É o que faz você derrotar seus inimigos, quanto mais Ataque você tiver, mais rapidamente conseguirá derrotar seus inimigos." + 
				"\n- Energia: É o que te permite fazer movimentos, quando mais Energia você tiver, mais golpes ou ações você poderá realizar.");
		System.out.println("\nPara cada ponto distribuido no atributo escolhido, você irá receber:" + 
				"\n(1) Vida = +10 pontos de Vida" + 
				"\n(2) Ataque = +1 ponto de Ataque" + 
				"\n(3) Energia = +1 ponto de Energia");
		
		for (int PontosIniciais = 3; PontosIniciais > 0; PontosIniciais --) {
			System.out.println("\nVocê ainda tem " + PontosIniciais + " pontos. Escolha o atributo em que o ponto será atribuido");
			int opcao = input.nextInt();
			aumentarAtributo(opcao);
		}
		
		System.out.println("\nParabéns! Todos os pontos foram distribuidos. Os atributos iniciais do seu personagem são:");
		listarAtributos();
	};
	
	public void aumentarDeNivel(int pontos) {
		if (pontos == 1) {
			System.out.println("Você possui 1 ponto disponível para distribuir entre seus atributos.");
			System.out.println("\nPara cada ponto distribuido no atributo escolhido, você irá receber:" + 
			"\n(1) Vida = +10 pontos de Vida" + 
			"\n(2) Ataque = +1 ponto de Ataque" + 
			"\n(3) Energia = +1 ponto de Energia");
			System.out.println("Escolha o atributo em que o ponto será atribuido.");
			int opcao = input.nextInt();
			aumentarAtributo(opcao);
		} else if (pontos > 1) {
			System.out.println("Você possui " + pontos + "pontos disponíveis para distribuir entre seus atributos.");
			System.out.println("\nPara cada ponto distribuido no atributo escolhido, você irá receber:" + 
			"\n(1) Vida = +10 pontos de Vida" + 
			"\n(2) Ataque = +1 ponto de Ataque" + 
			"\n(3) Energia = +1 ponto de Energia");
			while (pontos > 0) {
				System.out.println("\nVocê ainda tem " + pontos + " pontos. Escolha o atributo em que o ponto será atribuido");
				int opcao = input.nextInt();
				aumentarAtributo(opcao);
				pontos --;
			}
		}
	}
}
