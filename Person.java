/* This is a class to be used with the runnerPerson.java program.  It defines the attributes of the object "Person". */

public class Person{
	private String nameLast;
	private String nameFirst;
	private int age;
	private String ssn;
	
public Person(String F, String L, int A, String S){
	 nameLast = L;
	 nameFirst = F;
	 age = A;
	 ssn = S;}
 
 public String toString(){
        System.out.println("SSN: " + ssn);
        System.out.println("\t Name: " + nameFirst + " " + nameLast);
        System.out.println("\t Age: " + age);
        return (" ");
}
 
}
 
