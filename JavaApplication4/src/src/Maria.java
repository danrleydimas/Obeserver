package src;
public class Maria extends Pessoa{

    public Maria(Subject s) {
        super(s);
    }

    @Override
    public void reagir(Entregavel n) {
              System.out.println(""+n);
    }

    @Override
    public void update(Entregavel entregavel) {
        reagir(entregavel);
    }

}
