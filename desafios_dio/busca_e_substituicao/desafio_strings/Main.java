import java.io.*;

public class Main {

    //static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedReader in;

    {
        try {
            in = new BufferedReader(new FileReader("desafios_dio/busca_e_substituicao/"+
                    "desafio_strings/inputs.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static PrintWriter out = new PrintWriter(System.out);



    public static void main(String[] args) throws IOException,FileNotFoundException {
        String min, max, word1,word2  ; //declare suas variaveis aqui
        while ((   word1 = in.readLine()) != null) { // complete seu código
            word2 = in.readLine();
//            if (  ) {
//
//            } else {
//
//            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= ; ) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}