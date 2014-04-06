
package lubolos;
import java.util.Scanner;
public class lubolosPrograma {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float Preco;
		float Faturamento=0;
		float Fatura1=0;
		float Fatura2=0;
		float Fatura3=0;
		int Quantidade;
		int Quantidade1=0;
		int Quantidade2=0;
		int Quantidade3=0;
		int Opcao;
		boolean Menu= true ;
		
		//int Opcao1;
		//boolean Menu=true;
		
		   while (Menu) {
			   
			   System.out.println("\n      LuBolos & Doces    ");
			   System.out.println("1 - Bolos ");
			   System.out.println("2 - Doces");
			   System.out.println("3 - Salgados");
			   System.out.println("0 - Finaliza");
			   
			   System.out.println ("Digite a opcao Desejada  :");
			   
			   Opcao = input.nextInt();
			   
			   switch (Opcao){
			   
			   
			   case 1: System.out.println("\nVoce escolheu  - Bolos -");
			              System.out.println("Qual a quantidade? :");
			              Quantidade =  input.nextInt();
			              if (Quantidade > 0){
			            	  Preco = Quantidade * 25;
			            	  
			            System.out.println ("Voce pagará R$ " + Preco);
			            System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	Faturamento = Faturamento + Preco;
			            	Fatura1 = Fatura1 + Preco;
			            	Quantidade1 = Quantidade1 + Quantidade;
			            	
			              }//if
			              
			              else 
			            	   System.out.println (" Opcao Invalida. ");
			                              break;
			                 
			         
			          case 2 : 
			        	  
			        	  System.out.println ("Voce Escolheu  - Doces");
			              System.out.println ("Qual  a Quantidade?: ");
			              Quantidade = input.nextInt();
			              
			              if  (Quantidade  > 0){
			            	  
			            	  Preco = Quantidade * 350;
			           
			          System.out.println ("Voce pagara o  total de R$: " + Preco);
			          System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	  Faturamento = Faturamento + Preco;
			            	  Fatura2 = Fatura2 + Preco;
			            	  Quantidade2 = Quantidade2 + Quantidade;
			              }
			              else System.out.println("Opcao invalida.");
			              break;
			              
			              
                      case 3 : 
			        	  
			        	  System.out.println ("Voce Escolheu  -  Salgados");
			              System.out.println ("Qual  a Quantidade?: ");
			              Quantidade = input.nextInt();
			              
			              if  (Quantidade  > 0){
			            	  
			            	  Preco = Quantidade * 15;
			           
			          System.out.println ("Voce pagara o  total de R$: " + Preco);
			          System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	  Faturamento = Faturamento + Preco;
			            	  Fatura2 = Fatura3 + Preco;
			            	  Quantidade3 = Quantidade3 + Quantidade;
			              }
			              else System.out.println("Opcao invalida.");
			              break;
			              
			              default : System.out.println("Opcoes invalidas");
			              
			              System.out.println (" ");
			              System.out.println (" ");
			             
			   }//switch
			   
			   break;
		   }//for
			   
		   System.out.println (" ");
		   System.out.println (" ");
		   System.out.println("Venda Total de Bolos = " +Quantidade1);
		   System.out.println("Valor total do Faturamento de Bolos = " +Fatura1);
		   System.out.println (" ");
		   System.out.println (" ");
		   System.out.println("Venda Total de Doces = " +Quantidade2);
		   System.out.println("Valor total do Faturamento de Doces = " +Fatura2);
		   System.out.println (" ");
		   System.out.println (" ");
		   System.out.println("Venda Total de Salgados = " +Quantidade3);
		   System.out.println("Valor total do Faturamento de Salgados = " +Fatura3);
		   
	}
	
}
			   
			   
 	



