package decorator;

/**
 *
 * @author Yuri Ferreira
 */
public class Morango extends SorveteSabor{
    
    public Morango(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + this.getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 2.50 + this.getSorvete().getPreco();
    }
    
}

