import java.util.Scanner;//Ativa o scanner
//Feito por: Douglas A. Monteiro & Karoline Lyra
public class Cerveja {
	
	public static void main(String[] args){
		
		int x = 99;//Quantidade de cerveja
		int y = 0;//Op��es
		
		Scanner leitor = new Scanner(System.in); //Scanner declarado
		
		while (x > 1){
			System.out.println("Temos " + x + " Cerveja(s) na freezer, quer tomar uma? ");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			y = leitor.nextInt();//Recebe o valor atribuido como op��o
			
			if (y == 1){
				x = x - 1;
				System.out.println("Sobraram " + x + " Cerveja(s)");
			
			} else{
				System.out.println("Tem certeza?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				y = leitor.nextInt();
				while (y == 1){
					System.out.println("Tem certeza?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					y = leitor.nextInt();
				}
				
			}
			
			if (x == 1){
				System.out.println("S� tem uma patr�o! Quer comprar mais?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				y = leitor.nextInt();
				
				if (y == 1){
					System.out.println("Quantas cervejas deseja comprar??");
					y = leitor.nextInt();
					x = x + y;
				} else{
					System.out.println("Compra mais uma pow, deixa de ser p�o duro! Vai comprar?");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					y = leitor.nextInt();
					if (y == 2){
						System.out.println("Poxa vei, fa�o litr�o a R$2,00! Quer?");
						System.out.println("1 - Sim");
						System.out.println("2 - N�o");
						y = leitor.nextInt();
						while (y == 2){
							System.out.println("Quer?");
							System.out.println("1 - Sim");
							System.out.println("2 - N�o");
							y = leitor.nextInt();
							if (y == 1){
								System.out.println("Quantas cervejas deseja comprar??");
								y = leitor.nextInt();
								x = x + y;
							}
						}
					}
				}
			}
		}
	}
}