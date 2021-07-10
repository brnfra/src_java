import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ExercicioNotas {
	
    public static void main(String[] args) throws IOException {
    /*
     InputStreamReader entrada = new InputStreamReader(System.in);
     BufferedReader buf = new BufferedReader(entrada);
		int aux = Integer.parseInt(buf.readLine());
	*/
		int aux = 576;
		int notas = 0;
		final int C  = 100;
		final int L  = 50;
		final int XX = 20;
		final int X  = 10;
		final int V  = 5;
		final int II = 2;
		final int I  = 1;
     /*
     List<Integer> numbers = new ArrayList<>();
     
        while(buf.ready()){
            numbers.add(Integer.parseInt(buf.readLine()));
        }
       */
		System.out.println(aux);
    	for (int i = 0 ; i < aux ; i++) {
    	 // aux = numbers.get(i);
    	  
    		if (aux >= C){
    		  notas = (int)aux/C;
				System.out.println(notas+" nota(s) de R$ 100,00");
				aux = aux - notas*C;
    		} else{
				System.out.println("0 nota(s) de R$ 100,00");
			}
    		if (aux >= L){
				notas = (int)aux/L;
				System.out.println(notas+" nota(s) de R$ 50,00");
				aux = aux - notas*L;

    		}else{
				System.out.println("0 nota(s) de R$ 50,00");
			}
			if (aux >= XX){
				notas = (int)aux/XX;
				System.out.println(notas+" nota(s) de R$ 20,00");
				aux = aux - notas*XX;

			}else{
				System.out.println("0 nota(s) de R$ 20,00");
			}
			if (aux >= X){
				notas = (int)aux/X;
				System.out.println(notas+" nota(s) de R$ 10,00");
				aux = aux - notas*X;

			}else{
				System.out.println("0 nota(s) de R$ 10,00");
			}
			if (aux >= V){
				notas = (int)aux/V;
				System.out.println(notas+" nota(s) de R$ 5,00");
				aux = aux - notas*V;

			}else{
				System.out.println("0 nota(s) de R$ 5,00");
			}

			if (aux >= II){
				notas = (int)aux/II;
				System.out.println(notas+" nota(s) de R$ 2,00");
				aux = aux - notas*II;

			}else{
				System.out.println("0 nota(s) de R$ 2,00");
			}
			if (aux >= I){
				notas = (int)aux/I;
				System.out.println(notas+" nota(s) de R$ 1,00");
				aux = aux - notas*I;

			}else{
				System.out.println("0 nota(s) de R$ 1,00");
			}
    		
    	}


    	
    }
	
}
