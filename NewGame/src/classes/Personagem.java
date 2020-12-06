package classes;

public class Personagem {
	
	private String nome;
	private Integer vida;
	private Integer ataque;
	private Integer energia;
	private Integer dano = 0;
	
	public Personagem(String nome, Integer vida, Integer ataque, Integer energia) {
		setNome(nome);
		setVida(vida);
		setAtaque(ataque);
		setEnergia(energia);
	}
	
	public boolean estaVivo() {
		return vida > 0;
	}
	
	public void receberDano(Integer dano) {
		setVida(getVida() - dano);
	}
	
	public void listarAtributos() {
		System.out.println("Suas informações:");
		System.out.println("Vida: " + getVida());
		System.out.println("Ataque: " + getAtaque());
		System.out.println("Energia: " + getEnergia());
		System.out.println("");
	}
	
	public void listarAtributosMonstro() {
		System.out.println("Informações do inimigo:");
		System.out.println("Nome: " + getNome());
		System.out.println("Vida: " + getVida());
		System.out.println("Ataque: " + getAtaque());
		System.out.println("");
	}
	
	public void novoMonstro() {
		System.out.println("Aparição de um novo monstro!");
		System.out.println("Nome: " + getNome());
		System.out.println("Vida: " + getVida());
		System.out.println("Ataque: " + getAtaque());
		System.out.println("Energia: " + getEnergia());
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getVida() {
		return vida;
	}
	
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
	public Integer getAtaque() {
		return ataque;
	}
	
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	
	public Integer getEnergia() {
		return energia;
	}
	
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	public Integer getDano() {
		return dano;
	}
	
	public void setDano(Integer dano) {
		this.dano = dano;
	}
}

