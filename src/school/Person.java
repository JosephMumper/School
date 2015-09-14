/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;


public class Person {
    enum Gender {
        Male,Female
    }
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    private int height;
    
    public static Person addPerson(String _name, Gender _gender, int _weight, int _height)
    {
        Person temp = new Person(_name,_gender,_weight,_height);
        people.add(temp);
        return(temp);
    }
    
    Person()
    {
        name = "no name";
        gender = Gender.Female;
    }
    Person(String _name,Gender _gender, int _weight, int _height)
    {
        name=_name;
        gender=_gender;
        weight=_weight;
        height=_height;
    }
    
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }
    
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public int getWeight()
    {
        return(weight);
    }
    public void setHeight(int _height)
    {
        weight = _height;
    }
    public int getHeight()
    {
        return(height);
    }
    
    public static void printNames()
    {
        System.out.println("\n===Print Names=== ");
        for(Person temp : people)
        {
//            if(temp != null)
//            {
                System.out.println(temp.getName());
//            }
        }
    }
    public static void printNamesOfGender(Gender _gender)
    {
        System.out.println("\n===Print Names of Gender=== "+ _gender);
        for(Person temp : people)
        {
            if (temp.gender == _gender)
                System.out.println(temp.getName());
        }
    }
    
    public String toString()
    {
        return(name +", "+ gender +", "+ weight +"lbs, "+ height +"\" ");
    }
}
