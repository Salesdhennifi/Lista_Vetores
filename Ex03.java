import javax.swing.JOptionPane;
public class Ex03{
    public static void main(String[] args){
        /*Crie dois vetores para guardar o nome e preço de 7 produtos e apresente o
        nome e preço dos ​sete produtos.*/

        String[] nomes = new String[7];
        int[] numeros = new int[7];

        nomes[0] = "all";
        nomes[1] = "boo";
        nomes[2] = "cool";
        nomes[3] = "duh";
        nomes[4] = "Eesc";
        nomes[5] = "fyg";
        nomes[6] = "grud";
        //vetor Numeros:
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        //Imprimir na tela:
        JOptionPane.showMessageDialog(null,"Produtos listados: " +"\n" + numeros[0] + "-" + nomes[0]
                                       +"\n" + numeros[1] + "-" + nomes[1] +"\n" + numeros[2] + "-" + nomes[2]
                                       +"\n" + numeros[3] + "-" + nomes[3]+"\n" + numeros[4] + "-" + nomes[4]
                                       +"\n" + numeros[5] + "-" + nomes[5]+"\n" + numeros[6] + "-" + nomes[6]);
        
        
        

    }
}