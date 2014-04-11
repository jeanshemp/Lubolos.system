/*
 * @author Jean Carlos 
 *  Sistema para Lubolos ME
 */
package lubolos;
import java.util.Scanner;
public class lubolosPrograma {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float Preco;
		float Faturamento=0;
		float Fatura1=0;           // Reformular todo programa, preços estão setados como padrão;
		float Fatura2=0;           // devo criar if's ou cases para cada produto;
		float Fatura3=0;           // sistema sem pressa  para ser criado.
		float Fatura4=0;
		int Quantidade;
		int Quantidade1=0;
		int Quantidade2=0;
		int Quantidade3=0;
		int Quantidade4=0;
		int Opcao=0;
		boolean Menu=true;
	    
	    
		
		   while (Menu == true) {
			   
			   System.out.println("\n      LuBolos & Doces    ");
			   System.out.println("1 - Bolos (Pedaços) ");
			   System.out.println("2 - Bolos Encomendados");
			   System.out.println("3 - Doces");
			   System.out.println("4 - Salgados");
			   System.out.println("0 - Finaliza");
			  
			   System.out.println ("Digite a opcao Desejada  :");
			   
			   Opcao = input.nextInt();
			   if (Opcao == 0)
				   System.out.println("Fim do Programa.");
			   
			  
		   } 
		   
				 
			   switch (Opcao){
			   
			   
			   case 1: System.out.println("\nVoce escolheu  - Bolos em Pedaços -");
			              System.out.println(" 1 - P' Bolo de Chocolate.");
			              System.out.println(" 2 - P' Bolo de Côco.");
			              System.out.println(" 3 - P' Bolo Gelado.");
			              System.out.println("Escolha sua Opção: ");
			              Opcao = input.nextInt();
			              
			              if (Opcao == 1)
			            	   System.out.println("Bolo de Chocolate escolhido. Ótima Escolha!");
			                     
			               if (Opcao == 2)
			            	   System.out.println("Bolo de Côco. Ótima Escolha!");
			               
			               if (Opcao == 3)
			            	   System.out.println("Bolo de Milho. Ótima Escolha!");
			              
			              System.out.println("Indique a Quantidade:");
			              Quantidade =  input.nextInt();
			              if (Quantidade > 0){
			            	  Preco = Quantidade * 1.20f;
			            	  
			            System.out.println ("Voce pagará R$ " + Preco);
			            System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	Faturamento = Faturamento + Preco;
			            	Fatura1 = Fatura1 + Preco;
			            	Quantidade1 = Quantidade1 + Quantidade;
			            	
			              }//if
			              
			              else 
			            	   System.out.println (" Opcao Invalida. ");
			                              break;
			                 
			                              
			   case 2: System.out.println("\nVoce escolheu  - Bolos Encomendados -");
	              System.out.println(" 1 - Bolo de Chocolate.");
	              System.out.println(" 2 - Bolo de Côco.");
	              System.out.println(" 3 - Bolo de Milho.");
	              System.out.println("Escolha sua Opção: ");
	              Opcao = input.nextInt();
	              
	              if (Opcao == 1)
	            	  System.out.println ("Bolo  de Chocolate");
	              
	              if (Opcao == 2)
	            	  System.out.println ("Bolo de Côco");
	            	  
	            	  if (Opcao == 3)
	            		  System.out.println ("Bolo de Milho");
	              
	              System.out.println("Indique a Quantidade:");
	              Quantidade =  input.nextInt();
	              if (Quantidade > 0){
	            	  Preco = Quantidade * 15.00f;
	            	  
	            System.out.println ("Voce pagará R$ " + Preco);
	            System.out.println ("Total  -  Quantidade : " + Quantidade);
	            	  
	            	Faturamento = Faturamento + Preco;
	            	Fatura2 = Fatura2 + Preco;
	            	Quantidade2 = Quantidade2 + Quantidade;
	            	
	              } //if
	              
	              else 
	            	   System.out.println (" Opcao Invalida. ");
	                              break;
			                              
			         
			          case 3 : 
			        	  
			        	  System.out.println ("Voce Escolheu  - Doces");
			        	  
			        	  System.out.println("1 - Balinhas de  .....R$ 0,10  Centavos.");
			        	  System.out.println("2 - Balinhas de  .....R$ 0,15  Centavos.");
			        	  System.out.println("3 - Pirulitos de .....R$ 0,15  Centavos.");
			        	  System.out.println("4 - Bala Arcor   .....R$ 0,15  Centavos.");
			        	  System.out.println("5 - Chiclete Poosh....R$ 0,15  Centavos.");
			        	  System.out.println("6 - TRIDENT      .....R$ 1,20  Um Real e Vinte Centavos.");
			        	  System.out.println("7 - HALLS        .....R$ 1,00  Um Real.");
			        	  System.out.println("8 - Azedinho     .....R$ 0,70  Centavos.");
			        	  System.out.println("Escolha sua Opção : ");
			        	  Opcao = input.nextInt();
			        	  
			        	  if (Opcao == 1)
			        		  System.out.println("1 - Balinhas de R$ 0,10 Centavos");
			        	  
			        	  if (Opcao == 2)
			        		  System.out.println("2 - Balinhas de R$ 0,15 Centavos");
			        	  
			        	  if (Opcao == 3)
			        		  System.out.println("3 - Pirulitos de R$ 0,15 Centavos");
			        	  
			        	  if (Opcao == 4)
			        		  System.out.println("4 - Bala Arcor");
			        	  
			        	  if (Opcao == 5)
			        		  System.out.println("5 - Chiclete Poosh");
			        	  
			        	  if (Opcao == 6)
			        		  System.out.println("6 - Chiclete TRIDENT");
			        	  
			        	  if (Opcao == 7)
			        		  System.out.println("7 - Bala HALLS");
			        	  
			        	  if (Opcao == 8)
			        		  System.out.println("8 - Bala 'Azedinho'");
			        	  
			        	
			              System.out.println("Indique a Quantidade:");
			              Quantidade = input.nextInt();
			              
			              if  (Quantidade  > 0){
			            	  
			            	  Preco = Quantidade * 1.20f;
			           
			          System.out.println ("Voce pagara o  total de R$: " + Preco);
			          System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	  Faturamento = Faturamento + Preco;
			            	  Fatura3 = Fatura3 + Preco;
			            	  Quantidade3 = Quantidade3 + Quantidade;
			              }
			              else System.out.println("Opcao invalida.");
			              break;
			              
			              
                      case 4 : 
			        	  
			        	  System.out.println ("Voce Escolheu  -  Salgados");
			        	  System.out.println(" 1 - Bolinho de Carne   .....R$ 0,60");
			              System.out.println(" 2 - Bolinho de Queijo  .....R$ 0,60");
			              System.out.println(" 3 - Coxinha            .....R$ 0,60");
			              System.out.println("Escolha sua Opção: ");
			              Opcao = input.nextInt();
			              
			              if (Opcao == 1)
			            	  System.out.println("Bolinho de Carne");
			              
			              if (Opcao == 2)
			            	  System.out.println("Bolinho de Queijo");
			              
			              if (Opcao == 3)
			            	  System.out.println("Coxinha");
			              
			              System.out.println("Indique a Quantidade:");
			              Quantidade = input.nextInt();
			              
			              if  (Quantidade  > 0){
			            	  
			            	  Preco = Quantidade * 0.60f;
			           
			          System.out.println ("Voce pagara o  total de R$: " + Preco);
			          System.out.println ("Total  -  Quantidade : " + Quantidade);
			            	  
			            	  Faturamento = Faturamento + Preco;
			            	  Fatura4 = Fatura4 + Preco;
			            	  Quantidade4 = Quantidade4 + Quantidade;
			            	  
			              }//if
			             
			              
			             
			              else System.out.println("Opcao invalida.");
			              break;
			              default : System.out.println("Opcoes invalidas");
			              
			              System.out.println (" ");
			              System.out.println (" ");
			             
			              }//switch
			   
	
			   
	
		   
			   
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


