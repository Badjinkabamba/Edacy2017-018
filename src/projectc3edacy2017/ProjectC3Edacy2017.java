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
public class ProjectC3Edacy2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Talent tal1= new Talent("Badjinka","Mouamadou Bamba",25,"Master2","informatique");
        TalentForeign tal2= new TalentForeign("Diop","Bara",20,"Licence1","Mathematique","Guinee");
        TalentForeign tal3= new TalentForeign("Coulibaly","Daouda",24,"Master1","informatique","Mali");
        Talent tal4= new Talent("Diop","Bara",22,"Master3","informatique");
        School ecole= new School();
        ecole.addTalent(tal1);
        ecole.addTalent(tal2);
        ecole.addTalent(tal3);
        ecole.addTalent(tal4);
        ecole.afficher();
    }
    
}
