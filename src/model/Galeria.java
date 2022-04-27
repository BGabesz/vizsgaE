
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Galeria implements Iterable<KiallitasiTargy>{
    ArrayList<KiallitasiTargy> targyak;

    public Galeria() {
        this.targyak = new ArrayList<>();
    }
    
    public void felvesz(KiallitasiTargy e){
        
        if(e.getDate().after(new Date()) ){
            try {
                throw new Exception("Jövőbeli dátumot adunk meg");
            } catch (Exception ex) {
                Logger.getLogger(Galeria.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{
            this.targyak.add(e);
        }
        
    }

    public ArrayList<KiallitasiTargy> getTargyak() {
        return targyak;
    }
    
    

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return this.targyak.iterator();
    }
    
}
