package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Lists {
    public static void main(String[] args)throws IOException {
        FileReader file = new FileReader("/home/devlab/Documents/Projects/git/src_java/collections/src/streams/inputs.txt");
        BufferedReader buf = new BufferedReader(file);
       /* String entrada = "";
        while(buf.ready()){
            entrada=entrada.concat(buf.readLine()+" ");
        }
        StringTokenizer st = new StringTokenizer(entrada);
        */
        List<String> nomes = new ArrayList<>();
        while(buf.ready()){
            nomes.add(buf.readLine());
        }
        System.out.println("Iniciod de posição: "+ nomes);
        Collections.sort(nomes);
        //modulo dos numeros?
        System.out.println("Troca de posição(Ordenados): "+ nomes);
        nomes.set(5,"-a");
        System.out.println("Seta (-a) na pos(5): "+ nomes);
        nomes.remove(5);
        System.out.println("Remove pos(5): "+ nomes);
        nomes.remove("-a");
        System.out.println("Remove elemento -a: "+ nomes);
        System.out.println("O tamanho da minha lista é de : "+nomes.size() +" elementos");

    }

}

