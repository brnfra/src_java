
import java.io.*;
import java.util.*;


public class DesafioC {
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
         final int N = 61;
         final String[] branco = new String[3];
         final String[] vermelho = new String[3];
          branco[0] = "branco P";
          branco[1] = "branco M";
          branco[2] = "branco G";
          vermelho[0]= "vermelho P";
          vermelho[1] = "vermelho M";
          vermelho[2] = "vermelho G";

        List<String> input = new ArrayList<>();
        List<String> lista_branco_tam = new ArrayList<>();
        List<String> lista_branco_nome = new ArrayList<>();
        List<String> lista_vermelho_nome = new ArrayList<>();
        List<String> lista_vermelho_tam = new ArrayList<>();
       
        Set<String> itens = new HashSet<>();

        //lista linkada com cada chave apontando para uma lista
        Map<String,Set<String>> relacao = new HashMap<String,Set<String>>(N);
        relacao.put(branco[0], new LinkedHashSet<>(N));
        relacao.put(branco[1], new LinkedHashSet<>(N));
        relacao.put(branco[2], new LinkedHashSet<>(N));
        relacao.put(vermelho[0], new LinkedHashSet<>(N));
        relacao.put(vermelho[1], new LinkedHashSet<>(N));
        relacao.put(vermelho[2], new LinkedHashSet<>(N));
        
        int qnt =0;
        String saida = "";
        //TIPOS DE ENTRADAS
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
        BufferedReader br = new BufferedReader(new FileReader("~/documents/projects/git/"+
        "src_java/desafios_dio/dio/brnfra/sort/inputs_c.txt"));
       //le stream de entrada

        while(br.ready()){

            input.add(br.readLine());
            qnt=Integer.parseInt(input.get(0));
            for (int i = 0; i < vermelho.length; i++) {
                if(input.get(line).equals(branco[i])){
                    //ADD na chave branco[i]
                    relacao.get(branco[i]).add(input.get(line-1));
                 
                }
                if(input.get(line).equals(vermelho[i])){
                    //ADD na chave vermelho[i]
                       relacao.get(vermelho[i]).add(input.get(line-1));   
                }
                if(input.get(line).equals("0"))  break;
                
            }
            if(input.get(line).equals("0"))  break;
            line++;
            
        }
        
       // System.out.println(Collections.sort(relacao.get(branco[0])));
      
        StringTokenizer it ;
        
        for(int i = 1 ;i < line; i++){
            it = new StringTokenizer(input.get(i));
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
