/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectc3edacy2017;

import java.util.ArrayList;

/**
 *
 * @author Bamba
 */
public class School {
    
    private ArrayList<Talent> ArrayOfTalents;
    public static int numberOfTalents=0;
    
    public School() {
        this.ArrayOfTalents = new ArrayList<Talent>();
       
    }
    
    public School(ArrayList<Talent> ArrayOfTalents) {
        this.ArrayOfTalents = ArrayOfTalents;
        this.numberOfTalents+= this.ArrayOfTalents.size();
    }
    
    public void addTalent(Talent e) {
        
        this.ArrayOfTalents.add(e);
        this.numberOfTalents++;
    }
    
    public void afficher() {
       
        System.out.println("this School count "+this.ArrayOfTalents.size()+" Talents");
        for(Talent tal:this.ArrayOfTalents) {
            tal.print();
            System.out.println();
            System.out.println("************************");
           
        }
}

   
    
    
    
    
}
