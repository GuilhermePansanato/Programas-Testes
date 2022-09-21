package gui;
import java.util.Scanner;
public class Batalha {

	public static void main(String[] args) {
		
		//boas vindas
		System.out.println("Bem vindo a batalha pokemon, escolha seu pokemon:");
		
		
				String x;
				//cria um objeto para receber valor do usuario
				Scanner input = new Scanner (System.in);
				
				System.out.println("Escolha um pokemon: 1- pikachu 2- char 3- bulba ");
				
				Linha linha= new Linha();
				linha.ColocarLinha();
				//recebe o nome do pokemon
				x = input.nextLine();
		// cria o pokemon
		Pokemon pokemon1 = new Pokemon();
		//coloca as caracteristicas do pokemon
		pokemon1.DefinirPokemon(x);
		// fala o pokemon escolhido e sua caracteristicas
		System.out.println( "Seu pokemon é:");
		System.out.println( pokemon1.nome);
		System.out.println("ATA = " + pokemon1.Ata);
		System.out.println("VIDA = " + pokemon1.Vida);
		System.out.println("CURA =" + pokemon1.Cura);
		linha.ColocarLinha();
		
		PokemonDesafiante Desafiante1 = new PokemonDesafiante();
		Desafiante1.DefinirPokemonDesafiante("Miau");
		System.out.println( "Seu desafio será contra:");
		System.out.println( Desafiante1.nome);
		System.out.println("ATA = " + Desafiante1.Ata);
		System.out.println("VIDA = " + Desafiante1.Vida);
		linha.ColocarLinha();
		
		
		System.out.println("Vamos para a batalha:");
		linha.ColocarLinha();
		
		while (pokemon1.Vida > 0 && Desafiante1.Vida > 0) 
		{
			String escolha = "";
			System.out.println("Sua vez!!!");
			System.out.println("Faça uma ação: Atacar (a), Curar (b)");
			linha.ColocarLinha();
			
			escolha = input.nextLine();
			if (escolha.equals("a"))
			{
				Desafiante1.Vida = Desafiante1.Vida - pokemon1.Ata;
				System.out.println(pokemon1.nome +" atacou!!!");
				linha.ColocarLinha();
				pokemon1.Vida = pokemon1.Vida - Desafiante1.Ata;
				System.out.println( Desafiante1.nome +" atacou!!!");
				System.out.println(" Pokemon: "+ pokemon1.nome + "                  Pokemon: " + Desafiante1.nome);
				System.out.println(" Vida   : "+ pokemon1.Vida + "                  Vida:    " + Desafiante1.Vida);
				linha.ColocarLinha();
			}
			else
			if (escolha.equals("b"))
			{
				pokemon1.Vida = pokemon1.Vida + pokemon1.Cura;;
				System.out.println(pokemon1.nome +" Curou!!!");
				linha.ColocarLinha();
				pokemon1.Vida = pokemon1.Vida - Desafiante1.Ata;
				System.out.println( Desafiante1.nome +" atacou!!!");
				System.out.println(" Pokemon: "+ pokemon1.nome + "                  Pokemon: " + Desafiante1.nome);
				System.out.println(" Vida   : "+ pokemon1.Vida + "                  Vida:    " + Desafiante1.Vida);
				linha.ColocarLinha();
			}
			else 
			{
				System.out.println(" Opção errada, perdeu seu turno!");
				linha.ColocarLinha();
				pokemon1.Vida = pokemon1.Vida - Desafiante1.Ata;
				System.out.println( Desafiante1.nome +" atacou!!!");
				System.out.println(" Pokemon: "+ pokemon1.nome + "                  Pokemon: " + Desafiante1.nome);
				System.out.println(" Vida   : "+ pokemon1.Vida + "                  Vida:    " + Desafiante1.Vida);
				linha.ColocarLinha();
			}
		}
		
		
		if (pokemon1.Vida > 0 )
		{
			System.out.println(pokemon1.nome + " VENCEU!!!!");
		}
		else 
		{
			System.out.println(Desafiante1.nome + " VENCEU!!!!");
		}
		}
		
	  }
	    
	
	    
	
	
	

