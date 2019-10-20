/**
 * Classe qui modélise un des objets à mettre dans le sac
 * @version 2015-2016
 * @author Charge de TD
 */

public class Objet implements Comparable<Objet>{
  /**
  * numero de l'objet
  */
  private int num; 
  
  /**
  * poids de l'objet
  */
  private int poids;
  
  /**
  * utilite de l'objet
  */
  private int util; 

  /**
  * constructeur
     * @param num
     * @param poids
     * @param util
  */
  public Objet(int num,int poids, int util) {
	this.num=num;
        this.poids = poids;
	this.util = util;
  }

  /**
  * Renvoie la ratio qui permet de comparer deux objet entre eux
  * dans le sac a dos classique le ratio est 
  * util/poids
  * qui permet de qualifier l'utilite au kilo d'un objet 
  *
  * dans le sac a dos dual le ratio est
  * poids/utilite qui permet de donner le poids par unite d'utilite
  * d'un objet
  *
  * @return 
  */
  public double getRatio(){
         return (double) poids/util;                       
  }

  public int getNum(){
         return num;
  }
                
  public int getPoids(){
          return poids;
  }
  
  public int getUtil(){
          return util;
  }
 

  @Override
  public int compareTo(Objet t2) {
        if(this.getRatio() < t2.getRatio()){
             return 1;
        }
        else if(this.getRatio() == t2.getRatio()) {
             return 0;
        }
        else return -1;
  }

  @Override
  public String toString(){
    return "(Objet: "+num+", poids: "+poids+", utilite: "+util+")";
  }
}