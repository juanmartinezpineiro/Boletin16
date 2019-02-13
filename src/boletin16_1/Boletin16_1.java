package boletin16_1;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persoa per = new Persoa();
        Canario ca = new Canario();
        Galo ga = new Galo();
        per.cantar();
        ca.cantar();
        ga.cantar();
        IPodeCantar obx = new Persoa();
        System.out.println("***************");
        obx.cantar();
        Tenor te = new Tenor ();
        te.cantar();
        
        


    }

}
