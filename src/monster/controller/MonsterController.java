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
	}
}
