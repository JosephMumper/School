/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 263004698
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Person joe = Person.addPerson("Joe",Person.Gender.Male,113,65);
        Person jill = Person.addPerson("Jill",Person.Gender.Female,126,46);
        Person billyJoe = Person.addPerson("BillyJoe",Person.Gender.Male,152,72);
        
        int val =billyJoe.getWeight();
        
        Person.printNames();
        Person.printNamesOfGender(Person.Gender.Female);
        System.out.println(billyJoe);
        
    }
}
