package principal;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ErvasMedicinais {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		saudacao();
		 
		String instrucoes; 
		
		System.out.println();
		System.out.print("Você gostaria de receber instruções sobre como esse programa funciona? ");
		instrucoes = sc.nextLine();
		
		switch (instrucoes.toLowerCase()) {
	      case "sim": 
	    	  System.out.println();
	    	  funcionaAssim();
	    	  break;
	      case "nao" :
	    	  break;
		}
		System.out.println();
		System.out.println("Bom, agora vamos começar o programa! <3");
		
		System.out.println();
		sintomas();
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Todas as informações foram retiradas dos livros 'As plantas curam', de Alfons Balbach, 'As ");
		System.out.println("frutas na medicina natural', de A. Balbach e D. Boarim e 'As hortaliças na medicina natural'");
		System.out.println(", de A. Balbach e D. Boarim.");
		System.out.println("----------------------------------------------------------------------------------------------------");

		
		sc.close();
	}
	
	static void saudacao() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------- Bem vindos ao Guia de Cuidados Naturais! --------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	static void funcionaAssim() {
		System.out.println("Funciona assim: você diz o que está sentindo e nós te informamos remédios naturais, como chás, fru-\n"
				+ "tas e vegetais, que possam te ajudar no seu problema de saúde sem a necessidade de remédios químicos.");
	}
	
	static void sintomas() {
		Scanner sc = new Scanner(System.in);
		
		String sintoma; 
		
		System.out.println("Qual sintoma de má disposição da saúde física ou mental você está sentindo? ");
		sintoma = sc.nextLine();
		sintoma = sintoma.toLowerCase();
		remedios(sintoma);
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Se não houve resposta para o seu sintoma, aguarde até a próxima atualização do programa!");
		
		sc.close();
	}
	
	static void remedios(String sintoma) {  
		 
		 String nome;

		 fileArquivo();
		 
		 if (sintoma.startsWith("dor")) {
			if (sintoma.endsWith("cabeça")|| sintoma.endsWith("cabeca" )) { 
				nome = "dorDeCabeça.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			else if (sintoma.endsWith("garganta")) {
				nome = "dorDeGarganta.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
				} 
			}
			
			if (sintoma.endsWith("reumatica") || sintoma.endsWith("reumática")) {
				nome = "dorReumatica.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
		 }
			
			if (sintoma.startsWith("febre")) {
				nome = "febre.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("dermatite") || sintoma.startsWith("dermatose")) {
				nome = "dermatite.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("gripe")) {
				nome = "gripe.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("colica") || sintoma.startsWith("cólica")) {
				nome = "colica.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("hemorragia")) {
				nome = "hemorragia.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("nausea") || sintoma.startsWith("náusea") || sintoma.startsWith("enjoo") || sintoma.startsWith("enjôo")) {
				nome = "nausea.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("pneumonia")) {
				nome = "pneumonia.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			if (sintoma.startsWith("ansiedade")) {
				nome = "ansiedade.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("insonia") || sintoma.startsWith("insônia")) {
				nome = "insonia.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			
			
			if (sintoma.startsWith("vomito") || sintoma.startsWith("vômito")) {
				nome = "vomito.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			

			if (sintoma.startsWith("rouquidao") || sintoma.startsWith("rouquidão")) {
				nome = "rouquidao.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			if (sintoma.startsWith("gases") || sintoma.startsWith("flatulência") || sintoma.startsWith("flatulencia")) {
				nome = "gases.txt";
				try {
					FileReader arq = new FileReader(nome);
					BufferedReader lerArq = new BufferedReader(arq);
					 
					String linha = lerArq.readLine();
					while (linha != null) {
						System.out.printf("%s\n", linha);
						
						linha = lerArq.readLine();
					}
				    arq.close();
				} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
				}
			}
			
			
			 
		
	}
	
	static void fileArquivo() {
		try {
			  File myObj = new File("dorDeCabeça.txt");
		      FileWriter myWriter = new FileWriter("dorDeCabeça.txt");
		      myWriter.write("Para auxiliar na dor de cabeça, você poderá utilizar chá de alfazema ou colocar rodelas finas de batatas\n"
		      		+ " cruas sobre a fronte (devido à baixa temperatura desta).");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("dorDeGarganta.txt");
		      FileWriter myWriter = new FileWriter("dorDeGarganta.txt");
		      myWriter.write("Para auxiliar na dor de garganta, você poderá utilizar gargarejo de alfavaca ou comer/\n"
		      		+ " tomar o suco/ fazer gargarejo com o suco do abacaxi.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("dorReumatica.txt");
		      FileWriter myWriter = new FileWriter("dorReumatica.txt");
		      myWriter.write("Para auxiliar na dor de reumática, você poderá fazer refeições esporádicas e exclusivas de tangerina por \n"
		      		+ "alguns dias ou incluir rabanete cru copiosamente na alimentação ou tomar suco de rabanete (1 copo duplo por dia).");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		
		try {
			  File myObj = new File("febre.txt");
		      FileWriter myWriter = new FileWriter("febre.txt");
		      myWriter.write("Para auxiliar na febre, você poderá utilizar chá de camomila-romana ou suco de folhas de salsa.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("dermatite.txt");
		      FileWriter myWriter = new FileWriter("dermatite.txt");
		      myWriter.write("Para auxiliar na dermatite, você poderá utilizar infusão das folhas e cascas de sabugueiro ou tomar suco de agrião em \n"
		      		+ "jejum.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("gripe.txt");
		      FileWriter myWriter = new FileWriter("gripe.txt");
		      myWriter.write("Para auxiliar na gripe, você poderá tomar suco de limão ou suco de caju.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("colica.txt");
		      FileWriter myWriter = new FileWriter("colica.txt");
		      myWriter.write("Para auxiliar na cólica, você poderá tomar infusão de camomila-romana ou tomar água morna resultante\n"
		      		+ " do cozimento da alface.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("hemorragia.txt");
		      FileWriter myWriter = new FileWriter("hemorragia.txt");
		      myWriter.write("Para auxiliar na hemorragia, você poderá tomar chá de urtiga-branca ou cataplasmas locais com folhas de \n"
		      		+ "salsa trituradas.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("nausea.txt");
		      FileWriter myWriter = new FileWriter("nausea.txt");
		      myWriter.write("Para auxiliar nos enjôos ou náuseas, você poderá tomar infusões de camomila da alemanha ou \n"
		      		+ "tomar água de coco.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("pneumonia.txt");
		      FileWriter myWriter = new FileWriter("pneumonia.txt");
		      myWriter.write("Para auxiliar na pneumonia, você poderá tomar chá de eucalipto, pé-de-galinha e alfavacão.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("ansiedade.txt");
		      FileWriter myWriter = new FileWriter("ansiedade.txt");
		      myWriter.write("Para auxiliar na ansiedade, você poderá tomar açúcar bruto de beterraba diluído em água morna.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("insonia.txt");
		      FileWriter myWriter = new FileWriter("insonia.txt");
		      myWriter.write("Para auxiliar na insônia, você poderá tomar infusão de maracujá ou comer berinjela cozida picada.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("vomito.txt");
		      FileWriter myWriter = new FileWriter("vomito.txt");
		      myWriter.write("Para auxiliar em casos de vômito, você poderá tomar infusão de hortelã ou tomar suco de jenipapo cozido\n"
		      		+ " quando estiver morno, de hora em hora.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("rouquidao.txt");
		      FileWriter myWriter = new FileWriter("rouquidao.txt");
		      myWriter.write("Para auxiliar em casos de rouquidão, você poderá tomar suco de amora quente adoçado com mel ou tomar chá \n"
		      		+ "de folhas de abacateiro.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
		try {
			  File myObj = new File("gases.txt");
		      FileWriter myWriter = new FileWriter("gases.txt");
		      myWriter.write("Para auxiliar em casos de gases ou flatulência, você poderá tomar meio copo duplo do chá da casca de limão em infusão ou \n"
		      		+ "tomar suco de agrião diluído em água.");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Um erro ocorreu.");
		      e.printStackTrace();
		    }
		
	}
	
	
}


 