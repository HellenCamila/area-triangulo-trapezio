import java.util.Scanner;

//instrução1 inserir base maior; 
//instrução2 printar a base maior
//instrução3 inserir a base menor
//instrução4 printar a base menor
//instrução5 inserir a altura
//instrução6 somar e divir as bases por 2 
//instrução7 guardar o resultado da divição
//instrução7  multiplicar o resultado da divição pela altura 

class Area {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		Double baseMaior;
			
			Double baseMenor;
			
			Double altura;
			
			Double somar;
			
			Double dividir;
			
			Double multiplicar;
			
			
			
			System.out.printf("qual e o valor da base maior:");
			baseMaior = teclado.nextDouble();
			
			System.out.printf("qual e o valor da base menor:");
			baseMenor = teclado.nextDouble();
			
			somar = baseMaior + baseMenor;
			
			dividir = somar / 2 ;
			
			System.out.printf("qual e o valor da altura:");
			altura = teclado.nextDouble();
			
			
		
		multiplicar = dividir * altura;
		
		
		
		System.out.printf( "o resultado e:%f\n" ,multiplicar );
    

    		System.exit(0);
		
	}

}
