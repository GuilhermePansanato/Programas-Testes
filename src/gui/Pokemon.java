package gui;


public class Pokemon {
 
  
  String nome;
  int Ata;
  int Vida;
  int Cura;
  
  
  public void DefinirPokemon( String Poke)
  
  {
	  nome = Poke;
	  if (nome.equals("pikachu"))
	  {
		  nome = "pikachu";
	      Ata = 50;
	      Vida = 100;
	      Cura = 10;
	  }   
	      
	     
	  if (nome.equals("char"))
	  {
		  nome = "char";
		  Ata = 40;
	      Vida = 100 ;
	      Cura = 15;
	  }   
	  if (nome.equals("bulba"))
	  {
		  nome = "bulba";
	      Ata = 30;
          Vida = 100;
          Cura = 30;
	  }   
  }
  
	   
	  
  
  
  
  
  
  
  
}
