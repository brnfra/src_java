package streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Positivos {
    public static void main(String[] args)throws IOException {
        
        int cont = 0 ;
        double num ;
        String entrada = "",aux;

        BufferedReader br = new BufferedReader(new FileReader("~/Documents/Projects/git/src_java/collections/src/streams/inputs.txt"));
        while(br.ready()){
            entrada=entrada.concat(br.readLine()+" ");
        }

        StringTokenizer st = new StringTokenizer(entrada);
        // Lê a linha de entrada                 String//
     
        while(st.hasMoreTokens()){
            // num = in.nextDouble();
           aux = st.nextToken();
            if(aux.matches("[-.0-9]*")){
                num = Double.parseDouble(aux);
            } else {
                continue;
            }

            if(num>0){
                cont++;
            }


        }

        System.out.println(cont +  " valores positivos");
    }

}
