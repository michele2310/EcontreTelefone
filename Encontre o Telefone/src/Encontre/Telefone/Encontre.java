package Encontre.Telefone;

public class Encontre {

	public static int converteEmNumero(String letra){
		
				//Exceções
				if (letra == "1" )
		 			return 1;
				
				else if (letra == "0" )
		 			return 0;
				//
				
				//Letras com valor 2
				else if (letra == "A")
		 			return 2;
				
				else if (letra == "B")
		 			return 2;
				
				else if (letra == "C")
		 			return 2;
				//
				
				//Letras com valor 3
		 		else if (letra == "D")
		 			return 3;
				
		 		else if (letra == "E")
		 			return 3;
				
		 		else if (letra == "F")
		 			return 3;
				//
				
		 		//Letras com valor 4
		 		else if (letra == "G")
		 			return 4;
				
		 		else if (letra == "H")
		 			return 4;
				
		 		else if (letra == "I")
		 			return 4;
				//
		 		
				//Letras com valor 5
		 		else if (letra == "J")
		 			return 5;
				
		 		else if (letra == "K")
		 			return 5;
				
		 		else if (letra == "L")
		 			return 5;
				//
		 		
				//Letras com valor 6
		 		else if (letra == "M")
		 			return 6;
				
		 		else if (letra == "N")
		 			return 6;
				
		 		else if (letra == "O")
		 			return 6;
				//
		 		
				//Letras com valor 7
		 		else if (letra == "P")
		 			return 7;
				
		 		else if (letra == "Q")
		 			return 7;
				
		 		else if (letra == "R")
		 			return 7;
				
		 		else if (letra == "S")
		 			return 7;
				//
		 		
				//letras com valor 8
		 		else if (letra == "T")
		 			return 8;
				
		 		else if (letra == "U")
		 			return 8;
				
		 		else if (letra == "V")
		 			return 8;
		 		//
				
				//letras com valor 9
		 		else if (letra == "W")
		 			return 9;
				
		 		else if (letra == "X")
		 			return 9;
				
		 		else if (letra == "Y")
		 			return 9;
				
		 		else if (letra == "Z")
		 			return 9;
				//
				
				return 0;
	}
}
