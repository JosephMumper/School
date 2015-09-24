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
        
        Person joe = Person.addPerson("Joe",Person.Gender.Male,113);
        
        Student jill = Student.addStudent("Jill",Person.Gender.Female,126,11);
        Student billyJoe = Student.addStudent("BillyJoe",Person.Gender.Male,152,11);
        
        Student bobby = Student.addStudent("Bobby",Person.Gender.Male,152,11);
        Student Mark = Student.addStudent("Mark",Person.Gender.Male,130,11);
        Student Alan = Student.addStudent("Alan",Person.Gender.Female,214,3);
        
        Person.printNames();
//        Person.printNamesOfGender(Person.Gender.Female);
        
        joe.setBirthdate(8, 10, 1998);
        billyJoe.setBirthdate(12, 6, 1999);
        
        System.out.println(joe);
        
        Course geom = Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo = Course.addCourse("Photography", Course.Type.Elective, 3);
        
        Course.printNames();

        geom.addStudent(bobby);
        
//        Student bobby = new Student("Bobby",Person.Gender.Male,168,11);
        System.out.println(bobby.getName());
        Person.printNames();
        Student.printNames();
        System.out.println(Alan);
    }
}
