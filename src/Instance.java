import java.util.List;

/**
 * classe qui modélise une instance d'un problème de sac à dos
 * @version 2015-2016
 * @author Charge de TD
 */
public class Instance {
    public int nbObjets;
    public ListeObjets lesObjets;
    public int Poidsmax;
    
    public Instance(int nb, ListeObjets obj, int pmax){
        /**
        * Nombre d'objets  a mettre dans le sac
        */ 
        this.nbObjets=nb;
        /**
        * utilite min
        */ 
        this.Poidsmax=pmax;
        /**
        * Ensemble d'objets a mettre dans le sac
        */ 
        this.lesObjets=obj;
        this.lesObjets.trie();
    }


    public int minorer(){
        ListeObjets sac = new ListeObjets();
        int poids = 0;
        int utilite = 0;
        for(Objet o : lesObjets.getListe()){
            if(poids<Poidsmax){
                poids = poids + o.getPoids();
                sac.ajoute(o);
                //utilite = utilite + o.getUtil();
            }
        }
        return poids;
    }
    
    public void afficheInstance(){
       System.out.println("Nombre Objets : " + nbObjets+" Poids maximum " +Poidsmax+"\n");
       System.out.println("Numero   " + lesObjets.affichelNum());
       System.out.println("Poids    "+ lesObjets.affichelPoids());
       System.out.println("Utilites " + lesObjets.affichelUtil());
       System.out.println("Pi/Wi " + lesObjets.afficheWiSurPi());
       System.out.println("Minorer " + minorer());
    }

    @Override
    public String toString(){
       String s="Instance de Taille: "+ nbObjets + " avec Poids Max: "+ Poidsmax +"\n";
       for(int i=0; i < nbObjets;i++){ 
          s= s+ lesObjets.get(i).toString()+"\n";
       }
       return s;
    }
}
