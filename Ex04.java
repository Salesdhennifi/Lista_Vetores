import javax.swing.JOptionPane;
public class Ex04{
    public static void main(String[] args){
        /*Crie um vetor para armazenar as notas de uma disciplina. A disciplina deve
        conter 4 notas.
        Solicite para o usuário o nome e as quatro notas, armazenando as notas em um
        vetor, realize a média destas notas e apresente.*/
       
        int[] notas = new int[4];

        notas[0] = Integer.parseInt(JOptionPane.showInputDialog(null,"...Atualização De Notas..." + "\n \nDigite a Primeira Nota: "));
        notas[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira Segunda nota: ")); 
        notas[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira terceira nota: "));
        notas[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira Quarta nota: ")); 
            
         double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;  

        JOptionPane.showMessageDialog(null, "A media das notas inseridas: " + media);
        

        
    }
}