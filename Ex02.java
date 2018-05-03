import javax.swing.JOptionPane;
public class Ex02{
    public static void main(String[] args){
        /*Crie um vetor para guardar 10 nomes e apresente os dez nomes.*/
        String[] nomes = new String[10];
        nomes[0] = "Ana";
        nomes[1] = "bia";
        nomes[2] = "cora";
        nomes[3] = "dadi";
        nomes[4] = "ella";
        nomes[5] = "faci";
        nomes[6] = "gil";
        nomes[7] = "hemi";
        nomes[8] = "iza";
        nomes[9] = "ju";
        /*Apresentar um numero*/
        JOptionPane.showMessageDialog(null,"Lista dos Nomes: " + "\n" + nomes[1] + "\n"+ nomes[2] +"\n"+ nomes[3] +
                                      "\n"+ nomes[4] +"\n"+ nomes[5] +"\n"+ nomes[6] +"\n"+ nomes[7] +"\n"+ 
                                       nomes[8] +"\n"+ nomes[9]);
        

    }
}