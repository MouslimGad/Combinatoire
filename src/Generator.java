/**
 * Classe qui permet de generer une instance
 * @version 2016-2017
 * @author Charge de TD 
 */


public class Generator {
   /**
   * ordre de grandeur de poids de l'instance à creer
   */
   public int op;
   /**
   *  ordre de grandeur des utilites de l'instance à creer
   */
   public int ou;
   /**
   * nombre d'objets de l'instance à creer
   */
   public int t;
   
/**
 * Constructeur
 * @param t
 * @param op
 * @param ou 
 */
public Generator(int t,int op, int ou){
   this.op = op;
   this.t=t;
   this.ou = ou;
}


/**
* methode qui cree une instance en fonction des attributs
* @return une instance
*/

public Instance makeInstance(){
   Instance pb; 
   int poids; 
   int util; 
   ListeObjets x;

   x=new ListeObjets();
   for(int i = 0; i<t; i++) {
       poids=(int)(Math.random()*this.op)+1;
       util=(int)(Math.random()*this.ou)+1;
       x.ajoute(new Objet(i+1,poids, util));
   }
   poids=(int)(Math.random()*x.getPoidsTotal());
  
   pb=new Instance(t,x,poids);
   return pb;
}


}
