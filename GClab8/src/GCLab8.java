import java.util.Scanner;
import java.util.Arrays;

public class GCLab8 {


	public static void main (String args[]) {
		Scanner scnr = new Scanner(System.in);
		String[] stuName = new String[7];//user input, finds student name
		//String[] nthPerson;	//user input, finds Nth person
		String[] favFood = new String [7]; //user input, finds favorite food
		String[] homeTown = new String [7];//user input, finds home town.
		char quitcmd;
		
		
		//array table of student names
		stuName[0] = Bill;
		stuName[1] = Neil;
		stuName[2] = Carl;
		stuName[3] = Stephen;
		stuName[4] = Phillip;
		stuName[5] = Brian;;
		stuName[6] = Bruce;
		//array table of their home towns
		homeTown[0] = Washington;
		homeTown[1] = Manhattan;
		homeTown[2] = Brooklyn;
		homeTown[3] = Oxford;
		homeTown[4] = Chicago;
		homeTown[5] = Cleveland;
		homeTown[6] = Royal-Oak; 
		//array table of their favorite foods
		favFood[0] = Tacos;
		favFood[1] = Shawarma;
		favFood[2] = Fondue;
		favFood[3] = Pizza;
		favFood[4] = Beef-Stroganoff;
		favFood[5] = Cheese-Burgers;
		favFood[6] = Yogurt;
			
		//prompt the user with a welcome 	
		System.out.println("Welcome to our Java class.");
		while (quitcmd = "yes") {
		
		for (int i=0; i < stuName.length ; i++) {
		//for loop will keep the program going. 		
		//next we prompt them to see which student they'd like to know more about.
		System.out.println("Which student would you like to learn more about? (enter a number 1-7): ");
		int nthPerson = scnr.nextInt() -1;
		//we tell them who they have selected and if they'd like to know more. 
		System.out.println("Student " + nthPerson + " is" + stuName + ". What would you like to know about" + stuName + "?");
		System.out.println("(enter either 'hometown' or 'favorite food'):");
		
		scnr.nextLine();
		String userInput = scnr.nextLine();
		//if they selected hometown this is the prompt that spits out about that person.
		if(userInput.equalsIgnoreCase("homeTown")) {
			System.out.println(stuName[nthPerson] + "is from " + homeTown + ".");
			System.out.println("Would you like to know more? (enter 'yes' or 'no'):");
			//if they didn't put in a correct choice then this prompt pops up.
	}else 
		System.out.println("That data does not exist. Please try again.(enter either 'hometown' or 'favorite food'):");
	
		//if they selected favorite food then this prompt pops up.
		if(userInput.equalsIgnoreCase("favorite food")) {
			System.out.println(stuName[nthPerson] + "favorite food is " + favFood + ".");
			System.out.println("Would you like to know more? (enter 'yes' or 'no'):");
		}
	
		System.out.println("Would you like to know about more students? ('yes or no')");
	}
	}
}

