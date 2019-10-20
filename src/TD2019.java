


/**
 *
 * @author hanen-Hyon
 */
public class TD2019 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      int nbobjets=5;
      Instance I;
      Solution S;  
      Generator xtest= new Generator(nbobjets,10,7);

      System.out.println("debut");
      I=xtest.makeInstance();
      I.afficheInstance();
    
}
}
