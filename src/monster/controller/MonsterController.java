package monster.controller;

import monster.model.MonsterMash;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{

	private Scanner monsterScanner;
	private MonsterMash userMonster;
	private MonsterMash roryMonster; //Declares a Monster called roryMonster.
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "Klaus ";
		int eyes = 2;
		int mouth = 5;
		double legs = 3.0;
		double hair = 3.5;
		boolean hasbellybutton = true;
		
		myDisplay = new MonsterDisplay();
		monsterScanner = new Scanner(System.in);
		roryMonster = new MonsterMash(name, eyes, mouth, legs, hair, hasbellybutton);
	}
	public void start()
	{	
		myDisplay.displayInfo(roryMonster.toString());
		createPopupMonster();
		myDisplay.displayInfo(" Here's the info for your monster : " + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for my monster, type one here please!");
		String newMonsterName = monsterScanner.next();

		System.out.println("Give me a new number of mouth pieces!!");
		int newMonsterMouth = monsterScanner.nextInt();
		
		System.out.println("Give me a cooler number of eyes!");
		int newMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("Give me a new number of legs!");
		double newMonsterLegs = monsterScanner.nextDouble();
		
		System.out.println("Give me a new number of hair strands!");
		double newMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("Do I have a belly button or not?");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		
		roryMonster.setMonsterHair(newMonsterHair);
		roryMonster.setMonsterLegs(newMonsterLegs);
		roryMonster.setMonsterEyes(newMonsterEyes);
		roryMonster.setMonsterMouth(newMonsterMouth);
		roryMonster.setMonsterName(newMonsterName);
		roryMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
	
	/**
	 * Creates a MonsterMash instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information
		System.out.println("What is your monster's name?");
		String userName = monsterScanner.nextLine();
		
		System.out.println("How many legs will it have? This is a decimal value!");
		double userLegs = monsterScanner.nextDouble();
		
		System.out.println("How much hair will it have? Also a decimal!");
		double userHair = monsterScanner.nextDouble();
		
		System.out.println("Does your monster have a belly button - true or false?");
		boolean userHasBellyButton = monsterScanner.nextBoolean();
		
		System.out.println("How many mouth pieces does your monster have?");
		int userMouths = monsterScanner.nextInt();
		
		System.out.println("How many eyes does you monster have?");
		int userEyes = monsterScanner.nextInt();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MonsterMash(userName,userEyes, userMouths, userLegs, userHair, userHasBellyButton);
	}
	
	
	private void createPopupMonster()
	{
		String name = myDisplay.getAnswer("Type in a name for your monster.");
		
		myDisplay.displayResponse("You typed in " + name);
		
		int mouth;
		String tempMouths = myDisplay.getAnswer("Type in an integer for the number of mouths he has");
		
		while(!isInteger(tempMouths))
		{
			tempMouths = myDisplay.getAnswer("Please type in a proper integer!");
		}
		
		
		
				
	}
}
