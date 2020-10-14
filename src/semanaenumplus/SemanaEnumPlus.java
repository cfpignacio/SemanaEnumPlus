/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanaenumplus;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class SemanaEnumPlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Solicitar que el usuario ingrese un dia y que le digamos si es laborable o no.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar un dia de la semana");
        
        String dia = scan.next();
        
        try{
        DiasSemana diaIngresado = DiasSemana.valueOf(dia.toUpperCase());
        System.out.println(diaIngresado.toString());
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
        
        
        
        
        

        
    }
    
}
