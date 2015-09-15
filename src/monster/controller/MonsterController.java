package monster.controller;

import monster.model.MonsterMash;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{

	private Scanner monsterScanner;
	private MonsterMash roryMonster;
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
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + roryMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one here please!");
		String newMonsterName = monsterScanner.next();
		roryMonster.setMonsterName(newMonsterName);
		System.out.println("Give me a new number of mouth pieces!!");
		int newMonsterMouth = monsterScanner.nextInt();
		roryMonster.setMonsterMouth(newMonsterMouth);
		System.out.println("Give me a cooler number of eyes!");
		int newMonsterEyes = monsterScanner.nextInt();
		roryMonster.setMonsterEyes(newMonsterEyes);
		System.out.println("Give me a new number of legs!");
		double newMonsterLegs = monsterScanner.nextDouble();
		roryMonster.setMonsterLegs(newMonsterLegs);
		System.out.println("Give me a new numbe of hair strands!");
		double newMonsterHair = monsterScanner.nextDouble();
		roryMonster.setMonsterHair(newMonsterHair);
		System.out.println("Do I have a belly button or not?");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		roryMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
}
