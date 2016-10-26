package decorator;

/**
 *
 * @author Yuri Ferreira
 */
public class Creme extends SorveteSabor{
    
    public Creme(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + this.getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 2.25 + this.getSorvete().getPreco();
    }
    
}
