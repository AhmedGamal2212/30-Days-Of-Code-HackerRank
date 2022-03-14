import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    
    
    // Write your constructor here
    Student(String firstName, String lastName, int idNumber, int[] testScores){            
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        int sum = 0, size = testScores.length;
        
        for(int i : testScores){
            sum += i;
        }
        sum /= size;
        
        int o = (int)('O') * (sum >= 90 && sum <= 100 ? 1 : 0),
        e = (int)('E') * (sum >= 80 && sum < 90 ? 1 : 0),
        a = (int)('A') * (sum >= 70 && sum < 80 ? 1 : 0),
        p = (int)('P') * (sum >= 55 && sum < 70 ? 1 : 0),
        d = (int)('D') * (sum >= 40 && sum < 55 ? 1 : 0),
        t = (int)('T') * (sum < 40 ? 1 : 0);
        
        return (char)(o ^ e ^ a ^ p ^ d ^ t);
    }
    // Write your method here
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}