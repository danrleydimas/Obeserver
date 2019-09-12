package src;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PontoInicial {

	public static void main(String[] args) {
		
        Editora edit = new Editora();      
        
                edit.addObserver(new Jose(edit));
		edit.addObserver(new Joao(edit));
		edit.addObserver(new Maria(edit));
                
        Calendar c = Calendar.getInstance();
                

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        c.add(Calendar.DAY_OF_WEEK, -4);



        System.out.println(sdf.format(c.getTime()));

        String dia = sdf.format(c.getTime());

        if(dia.equals("Sábado") || dia.equals("Domingo")) 
        {
            
        
        }
		

	}

}


