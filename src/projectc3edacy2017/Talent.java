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
public class Talent {
    
    private String name;
    private String firstName;
    private int age;
    private String level;
    private String specializationCourse;

    public Talent() {
       this.name = "";
        this.firstName = "";
        this.age = 0;
        this.level = "";
        this.specializationCourse =""; 
    }

    public Talent(String name, String firstName, int age, String level, String specializationCourse) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.level = level;
        this.specializationCourse = specializationCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSpecializationCourse() {
        return specializationCourse;
    }

    public void setSpecializationCourse(String specializationCourse) {
        this.specializationCourse = specializationCourse;
    }
    
    @Override
    public String toString() {
        
        return "FirstName: "+this.firstName+"\n Name: "+this.name+"\n Age: "+this.age+"\n Level: "+this.level+"\n Specilization: "+this.specializationCourse;
    }
    public void print() {
        System.out.println("Prenom: "+this.firstName+"\n Nom: "+this.name+"\n Age: "+this.age+"\n Level: "+this.level+"\n Specilisation: "+this.specializationCourse);
    }
    
    
    
}
