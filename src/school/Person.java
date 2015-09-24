/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import java.util.Calendar;


public class Person {
    enum Gender {
        Male,Female
    }
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person[numPeople];
    protected static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }
    public static void addPerson(Person _person)
    {
        people.add(_person);
    }
    Person()
    {
        name = "no name";
        gender = Gender.Female;
        weight=100;
    }
    Person(String _name,Gender _gender, int _weight)
    {
        name=_name;
        gender=_gender;
        weight=_weight;
    }
    public void setBirthdate(int _day,int _month,int _year)
    {
        birthDay=_day;
        birthMonth=_month;
        birthYear=_year;
    }
    public int getAge()
    {
        Calendar now =Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        
        if(birthMonth>month || birthMonth==month)
        {
            return(year-=birthYear+1);
        }
        else
            return(year-=birthYear);        
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
        return(name +", "+ gender +", "+ weight +"lbs, " +" age: "+getAge());
    }
}
