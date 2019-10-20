import java.util.*;

/**
 * classe qui permet de gerer un ensemble d'objets sous forme de liste
 * @version 2016-2017
 * @author Charge de TD
 */

public class ListeObjets {

/**
* un seul attribut ArrayList contenant les objets
*/
private ArrayList<Objet> lst;

/**
* Constructeur sans attributs
*/
public ListeObjets()
{
   lst=new ArrayList<Objet>();
}

/**
* Constructeur avec attribut
*@param v un ArrayList d'objets
*/
public ListeObjets(ArrayList<Objet> v){
    lst=new ArrayList<Objet>(v);
}

/**
 * Methode pour recuperer la liste
 * @return 
 */
public ArrayList<Objet> getListe(){
    return lst;
}

/**
* trie selon le ratio utilise dans objet
*/
public void trie(){
    Collections.sort(lst);
}
/**
 * Renvoie la taille
 * @return taille de la liste
 */
public int taille(){
    return lst.size();
}

public void ajoute(Objet x){
      lst.add(x);}

public void retireObjet(int i){
   lst.remove(i);
}

public void retireObjet(Objet x){
    lst.remove(x);
}

public Objet get(int i)
{ 
   return(lst.get(i));
}

public int getPoidsTotal(){
    int pds=0;
    for(int i=0; i<lst.size();i++) pds+=lst.get(i).getPoids();
    return pds;
}

public int getUtilTotale(){
    int u=0;
    for(int i=0; i<lst.size();i++) u+=lst.get(i).getUtil();
    return u;
}

public ListeObjets duplique(){
    ArrayList<Objet> v= new ArrayList<>(lst);
    ListeObjets l=new ListeObjets(v);
    return l;
}

/**
 * ajoute l a la fin
 * @param l 
 */
public void append(ListeObjets l){
   lst.addAll(l.getListe());
}

public int index(Objet o){
  // index si l'objet est dans la liste, -1 sinon'
  if  (lst.contains(o) ) {
      return lst.indexOf(o);
  }
  else { 
      return(-1);
  }
}

@Override
public String toString(){
    String s="";
    for (int i=0 ;i<lst.size();i++)
        s=s+lst.get(i).toString() +"; ";
   return s+"\n";
}

public String affichelNum(){
    String s="";
    for (int i=0 ;i<lst.size();i++)
        s=s+" "+lst.get(i).getNum();
   return s+"\n";
}

public String affichelPoids(){
    String s="";
    for (int i=0 ;i<lst.size();i++)
        s=s+" "+lst.get(i).getPoids();
   return s+"\n";
}

public String affichelUtil(){
    String s="";
    for (int i=0 ;i<lst.size();i++)
        s=s+" "+lst.get(i).getUtil();
   return s+"\n";
    
}

    public String afficheWiSurPi(){
        String s="";
        for (int i=0 ;i<lst.size();i++)
            s=s+" "+lst.get(i).getPoids()/lst.get(i).getUtil();
        return s+"\n";

    }
}
