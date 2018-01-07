/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectc3edacy2017;

/**
 *
 * @author Bamba
 */
public class TalentForeign extends Talent {
    
    private String countryOfOrigin;

     public TalentForeign() {
         super();
        this.countryOfOrigin = "";
    }
    
    
    public TalentForeign( String name, String firstname, int age, String level, String specializationCourse, String countryOfOrigin) {
        super(name, firstname, age, level, specializationCourse);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
   
    public String toString() {
        
        return super.toString()+" Country Of Origin: "+this.getCountryOfOrigin();
    }
    
    public void print() {
        super.print();
        System.out.println("Country Of Origin: "+this.getCountryOfOrigin());
    }
    
    
    
    
    
}
