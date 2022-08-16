import java.util.Scanner;
import java.util.Random;
// This is my digiPet class which I can use to make as many digiPets as I wish.
class digiPet {
	// Instance variables (also called attributes) are kept internal.
	// This is called encapsulation.
	private String name;
	private int health;
	private boolean alive;
	// Constructor
	digiPet(String name) {
		this.name=name; // Use "this" to distinguish between inst var and parameter
		health=1;
		alive=true;
		System.out.println(name+" says...Waaahhh!");
	}
	// Here are the digiPet's methods (behaviors)
	void pet() {
	if(alive) {
	System.out.println(name+" says...Purrrr!");
	health+=1;
	} else System.out.println("[DEAD]");
	}
	void feed(int amount) {
		if(alive) {
			System.out.println(name+" says...Yummmm!");
			health+=amount;
		} else System.out.println("[DEAD]");
	}
	void sleep() {
		if(alive) {
			System.out.println(name+" says...Zzzzzz!");
		health-=1;
		} else System.out.println("[DEAD]");
	}
	void ask() {
		if(alive && health>1) {
			System.out.println(name+" says...My health is "+health);
			health-=2;
		} else
		if(!alive)
			System.out.println("[DEAD]");
		else {
			System.out.println(name+" says...My health is "+health+"! I die!");
			alive=false;
		}
	}
	void greet() {
		if(alive) {
			System.out.println(name+" says...Hello, I am "+name+"! I love you!");
			health-=2;
		} else System.out.println("[DEAD]");
	}
	void random() {
		System.out.println("Toadstool Pie!");
		Random r=new Random();
		int random=r.nextInt(7);
		switch(random){
			case 0:
				sleep();
				break;
			case 1:
				greet();
				break;
			case 2:
				ask();
				break;
			case 3:
				pet();
				break;
			case 4:
				feed(2);
				break;
			case 5:
				random();
				break;
			default: // Once in a while, just say it!
				System.out.println("YUCK!");
		}
	}
	// The remaining methods are known as access methods since they provide access
	// to the class's private data. This is another practice of encapsulation.
	String name() {
	return this.name;
	}
	int health() {
	return this.health;
	}
	boolean alive() {
	return this.alive;
	}
	}
	class DigitalPets {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	boolean done=false; //How can we be done when we haven't started yet?
	char command;
	String str;
	System.out.println("WELCOME TO THE MAGICAL WORLD OF DIGITAL PETS 2.0!");
	System.out.println(">>What's your pet's name?");
	str=s.nextLine();
	digiPet dpet = new digiPet(str);
	while (!done) {
	System.out.println("What do you want to do?");
	System.out.println("<f>eed <s>leep <p>et <g>reet <a>sk <t>ell <r>andom
	<q>uit");
	str=s.nextLine();
	command=str.charAt(0);
	// This is a switch statement. It is described in CCSU Chapter 43.
	switch(command) {
	case 'f': //FEED
	int amountOfFood=2;
	dpet.feed(amountOfFood);
	break;
	case 's': //SLEEP
	dpet.sleep();
	break;
	case 'p': //PET
	dpet.pet();
	break;
	case 'g': //GREET
	dpet.greet();
	break;
	case 'a': //ASK
	dpet.ask();
	break;
	case 't': //TELL
	System.out.println("...I have written a little poem just for
	you.:");
	System.out.println("This is the story of "+dpet.name()+" the
	digital pet.");
	System.out.println("With health equal to "+dpet.health()+", he's
	the best pet yet.");
	System.out.println("He is alive, it is "+dpet.alive()+", on that
	you can bet.");
	System.out.println("Egg Yolks!");
	break;
	case 'r': //RANDOM
	dpet.random();
	break;
	case 'q': //QUIT
	done=true;
	break;
	default:
	System.out.println("Huh?");
	}
	}
	System.out.println();
	System.out.println("Mama says...No more digiPet for you!");
}
}