package monster.model;

public class MonsterMash
{

	private String monsterName;
	private int monsterEyes;
	private int monsterMouth;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	

	
	public MonsterMash(String monsterName, int monsterEyes, int monsterMouth,
			double monsterLegs, double monsterHair, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterMouth = monsterMouth;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterMouth()
	{
		return monsterMouth;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterMouth(int monsterMouth)
	{
		this.monsterMouth = monsterMouth;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	public String toString()
	{
		String monsterInfo = " My monster has " + monsterLegs + " legs and his name is " + monsterName + " and he has " +
	monsterEyes + " eyes and " + monsterHair + " strands of hair. Has a belly button : " + monsterBellyButton;
		return monsterInfo;
	}
}
