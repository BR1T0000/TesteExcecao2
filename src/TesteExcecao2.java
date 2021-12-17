import javax.swing.JOptionPane;
public class TesteExcecao2 {
    public static void main(String args[]) {
        String nomes[] = new String[2]; // tamanho = 2
        nomes[0] = "Ana";
        nomes[1] = "José";
        int indice;
        boolean continualoop = true;
        do {
            try {
                String entrada = JOptionPane.showInputDialog("Escreva o indice");
                indice = Integer.parseInt(entrada);
                System.out.println(nomes[indice]);
                continualoop= false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Escreva de novo !");
            }
        } while (continualoop);
    }
}
