package polimorfismo.coercao.sistemaimovel;

public class ImovelTeste {
	
	public static void main(String[] args) {
		
		//ImovelNovo novo = new ImovelNovo("Vicente Machado", 5000000, 40000);
		//novo.imprimirDados();
		
		//conversao implicita de filho para pai (upcasting) - filho nao perde seus atributos e metodos
		//Imovel imovel = novo;
		//imovel.imprimirDados();
		
		//conversao explicita de pai para filho (downcasting) - apenas de mesmo tipo
		
		/* if(imovel instanceof ImovelNovo) {
			
			ImovelNovo imovel2 = (ImovelNovo) imovel;
			
		} else if(imovel instanceof ImovelUsado){
			
			ImovelUsado imovel2 = (ImovelUsado) imovel;
		} */
		
		//imovel2.imprimirDados();
		
		Imovel imovel = null;
		
		String opcao = "Imovel Usado";
		
		switch (opcao) {
			
			case "Imovel Novo":
				imovel = new ImovelNovo("Vicente Machado", 5000000, 40000);
				break;
				
			case "Imovel Usado":
				imovel = new ImovelUsado("Visconde Mauá", 8000000, 3000);
				break;
			
			default:
				break;
		}
		
		imovel.imprimirDados();
	}
}
