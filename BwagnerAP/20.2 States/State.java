public class State
{
	// instance variables
	private String name;      // The state's name
	private String bird;      // The state's bird
	private String flower;    // The state's flower
	private String song;      // The state's song
	private String motto;     // The state's motto
	private String tree;      // The state's tree
	// constructors
	public State()
	{
		name = ""; bird = ""; flower = ""; song = ""; motto = ""; tree = "";
	}
	public State(String name, String bird, String flower, String song, String motto, String tree)
	{
		this.name = name;
		this.bird = bird;
		this.flower = flower;
		this.song = song;
		this.motto = motto;
		this.tree = tree;
	}
	// toString method
	public String toString()
	{
	   return "State Name   : " + name + "\n" +
	          "State Bird   : " + bird + "\n" +
	          "State Flower : " + flower + "\n" +
	          "State Song   : " + song + "\n" +
	          "State Motto  : " + motto + "\n" +
	          "State Tree   : " + tree;
	}
}