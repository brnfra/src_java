import java.io.*;
import java.util.*;


public class Market {
    /**
     * Crie um programa onde você receberá valores inteiros não negativos como entrada.
     *
     * Ordene estes valores de acordo com o seguinte critério:
     *
     *     Primeiro os Pares
     *     Depois os Ímpares
     *
     * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
     *  Entrada
     * A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
     * Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão,
     * cada uma delas, um valor inteiro não negativo.
     *
     * Saida
     * Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
     */
    public static void main(String[] args)throws IOException {

         int line = 0 ;
        List<String> listas = new ArrayList<>();
        Set<String> itens = new HashSet<>();

        String saida = "";
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
        BufferedReader br = new BufferedReader(new FileReader("/home/devlab/documents/projects/git/"+
        "src_java/desafios_dio/dio/brnfra/sort/inputs.txt"));
        //le stream de entrada

        while(br.ready()){

            listas.add(br.readLine());
            line++;
        }
        StringTokenizer it ;

        for(int i = 1 ;i < line; i++){
            it = new StringTokenizer(listas.get(i));
            while(it.hasMoreTokens()){
                itens.add(it.nextToken());
            }
            TreeSet sortedItens = new TreeSet<String>(itens);
            saida = sortedItens.toString().replaceAll("[^a-z]"," ");
            System.out.println(saida);
            itens.clear();

        }
        
       br.close();

    }

}