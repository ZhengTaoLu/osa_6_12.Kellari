import java.util.ArrayList;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tao-s
 */
public class Kellari {
    private HashMap<String, ArrayList<String>>yes;
    private ArrayList<String>ok;
    public Kellari(){
        this.yes = new HashMap<>();
        this.ok = new ArrayList<>();
    }
    public void lisaa(String komero, String tavara){
        if(!this.yes.containsKey(komero)){
            this.yes.put(komero, new ArrayList<String>());
        }
        this.yes.get(komero).add(tavara);
        this.ok.add(komero);
    }
    public ArrayList<String> sisalto(String komero){
        if(!this.yes.containsKey(komero) 
                || this.yes.get(komero).isEmpty()){
            this.yes.get(komero).clear();
            return this.yes.get(komero);
        }
        return this.yes.get(komero);
    }
    public void poista(String komero, String tavara){
        this.yes.remove(komero, tavara);
        if(this.yes.get(komero).isEmpty()){
            this.yes.remove(komero);
        }
    }
    public ArrayList<String> komerot(){
        for(String ok1: ok){
            if(this.yes.get(ok1).isEmpty()){
                ok.remove(ok1);
            }
        }
        return ok;
    }
}
