public class SortFriends
{
	//instance variables
	private	Friend[] friends;
	
	public SortFriends(Friend[]	friends)
	{
		this.friends = friends;
	}
	
	public void	printFriends()
	{
		for(Friend friend :	friends)	 //	enhanced for loop
		{
			System.out.println(friend);	 //	calls Friend class toString	method
		}
		System.out.println();
	}
	public void sortFriends()
	{
		for (int j = 0; j < friends.length - 1;	j++) {
			int min = j;
			for (int k = j + 1; k < friends.length; k++)
				if (friends[k].compareTo(friends[min]) < 0)
					min = k;
			String temp = friends[j].getLastName();
			friends[j].setLastName(friends[min].getLastName());
			friends[min].setLastName(temp);
			temp = friends[j].getFirstName();
			friends[j].setFirstName(friends[min].getFirstName());
			friends[min].setFirstName(temp);
		}
	}
	public static void main(String[] args) 
	{
		Friend[] friendList	= new Friend[11];
		
		friendList[0] =	new	Friend("John", "Wayne",	"390-1234",	"March 12");
		friendList[1] =	new	Friend("Jimmy",	"Stewart", "390-5678", "January	10");
		friendList[2] =	new	Friend("James",	"Cagney", "390-9999", "June	10");
		friendList[3] =	new	Friend("Michael", "Douglas", "390-0000", "October 26");
		friendList[4] =	new	Friend("Kirk", "Douglas", "390-1111", "March 17");
		friendList[5] =	new	Friend("Henry",	"Fonda", "390-2222", "June 24");
		friendList[6] =	new	Friend("Bing", "Crosby", "390-3333", "August 12");
		friendList[7] =	new	Friend("Bob", "Hope", "390-4444", "December	20");
		friendList[8] =	new	Friend("Humphrey", "Bogart", "390-5555", "November 14");
		friendList[9] =	new	Friend("Charlton", "Heston", "390-6666", "September	22");
		friendList[10] = new Friend("Steve", "Crosby", "390-7777", "July 04");
		
		
		SortFriends	app	= new SortFriends(friendList);		
		app.printFriends();
		app.sortFriends();
		app.printFriends();
	}
}