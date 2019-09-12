package src;
public class Joao extends Pessoa {

    public Joao(Subject s) {
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
