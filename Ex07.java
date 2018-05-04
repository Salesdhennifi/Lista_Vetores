import javax.swing.JOptionPane;
public class Ex07{
    public static void main(String[] args){
        /*Solicite a altura de 4 animais, apresente ao final a altura do animal com a
        menor altura.*/
        double[] altura = new double[4];
        double menorTamanho = Integer.MIN_VALUE;
           altura[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do animal: "));
           altura[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do animal: "));
           altura[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do animal: "));
           altura[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do animal: "));
           
        if(altura[0] > menorTamanho){
            menorTamanho = altura[0];
        }
        if(altura[1] > menorTamanho){
            menorTamanho = altura[1];
        }
        if(altura[2] > menorTamanho){
            menorTamanho = altura[2];
        }
        if(altura[3] > menorTamanho){
            menorTamanho = altura[3];

        }
    JOptionPane.showMessageDialog(null, "O animal mais alto é: " + menorTamanho); 


    }
}