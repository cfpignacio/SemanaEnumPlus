/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanaenumplus;

/**
 *
 * @author Notebook
 */
public enum DiasSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);
    
    private boolean laborable;
    
    private DiasSemana(boolean laborable){
        this.laborable = laborable;
    }
    // no es obligatorio el uso del override
    @Override
    public String toString() {
        if(laborable){
            return "El dia " + this.name() + " es laborable";
        }else{
            return "El dia " + this.name() +" no es laborable";
        }
    }
    
    public String getDIA() {
    
    if(laborable){
            return "El dia " + this.name() + " es laborable";
        }else{
            return "El dia " + this.name() +" no es laborable";
        }
    }
    
  
    
    
    
}
