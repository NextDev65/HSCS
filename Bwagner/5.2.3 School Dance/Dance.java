public class Dance {

   // Constants
   public final int GoldPass = 1;
   public final int SilverPass = 2;
   public final int BronzePass = 3;
   public final int NoPass = 4;

   // Instance Variables

   private int attendance;
   private int ticketSales;

   // Constructors
   public Dance(){
	   init();

   }

   public void init() {
   	attendance = 0;
   	ticketSales = 0;
   }

   // Methods

   /** precondition:  value of code is in the range (1 to 4) inclusive.
    *  postcondition: updates the ticketSales by the price of the ticket
    *     specified by the parameter code. The attendance variable is
    *     incremented by one.
    *  @param code a value from (1 - 4) indicating the type of ticket
    */
   public void buyTicket(int code){

	   if(code == GoldPass) {
       	attendance++;
       }
       if(code == SilverPass) {
       	attendance++;
       	ticketSales += 2;
       }
       if(code == BronzePass) {
       	attendance++;
       	ticketSales += 4;
       }
       if(code == NoPass) {
       	attendance++;
       	ticketSales += 6;
       }

   }

   /** @return the value of attendance
    */
   public int getAttendance() {
      return attendance;
   }

   /** @return the amount of ticketSales
    */
   public double getTicketSales() {
      return ticketSales;
   }
}