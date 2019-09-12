package src;
public class Jose extends Pessoa {

    public Jose(Subject s) {
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
