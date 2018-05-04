import javax.swing.JOptionPane;
public class Ex05{
    public static void main(String[] args){
        /*Solicite para o usuário 5 pesos e apresente a SOMA TOTAL dos pesos e a MEDIA
        dos pesos.*/
        double[] pesos = new double[5];
        pesos[0] = Double.parseDouble(JOptionPane.showInputDialog(null,"Olá... Vou Solicitar 5 Pesos." + "\n \nDigite um peso: "));
        pesos[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro peso: "));
        pesos[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro peso: "));
        pesos[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro peso: "));
        pesos[4] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite ultimo peso: "));

        double soma_Total = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4];
        double media = soma_Total / 5;
        
    JOptionPane.showMessageDialog(null, "A Soma Total dos Pesos: " + soma_Total +
                                  "\n" + "A media dos Pesos: " + media);



    }
}