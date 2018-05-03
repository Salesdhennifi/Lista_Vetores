import javax.swing.JOptionPane;
public class Ex01{
    public static void main(String[] args){
        /*Crie um vetor para guardar 16 números inteiros.
        Preencha todas as posições com números e apresente a soma destes números.*/
        int[] numeros = new int[16];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;
        numeros[10] = 11;
        numeros[11] = 12;
        numeros[12] = 13;
        numeros[13] = 14;
        numeros[14] = 15;
        numeros[15] = 16;
        /*soma dos numeros*/
        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4] + numeros[5] + numeros[6] + 
                   numeros[7] + numeros[8] + numeros[9] + numeros[10] + numeros[11] + numeros[12] + numeros[13] +
                   numeros[14] + numeros[15];

        JOptionPane.showMessageDialog(null,"O resultado da soma dos numeros: " + soma);
         

    }
}