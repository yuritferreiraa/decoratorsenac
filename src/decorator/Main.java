package decorator;

/**
 *
 * @author Yuri Ferreira
 */
public class Main {
    
    public static void main(String[] args) {
        Sorvete sorvete = new SorveteNapolitano();
        retornaInformacoes(sorvete);
        sorvete = new Creme(sorvete);
        sorvete = new Chocolate(sorvete);
        sorvete = new Morango(sorvete);
        retornaInformacoes(sorvete);
    }
    
    public static void retornaInformacoes(Sorvete sorvete){
        System.out.println(sorvete.getNome() + " - " + sorvete.getQuantidadeBolas() + " preço " + sorvete.getPreco());
    }
    
}
