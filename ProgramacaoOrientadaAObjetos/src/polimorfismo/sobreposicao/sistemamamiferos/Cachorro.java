package polimorfismo.sobreposicao.sistemamamiferos;

public class Cachorro extends Mamifero {
	
	public Cachorro(String nome) {
		
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " está latindo");
	}
}
