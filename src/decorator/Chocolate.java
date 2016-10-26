package decorator;

/**
 *
 * @author Yuri Ferreira
 */
public class Chocolate extends SorveteSabor{
    
    public Chocolate(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + this.getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 2.75 + this.getSorvete().getPreco();
    }
    
}
