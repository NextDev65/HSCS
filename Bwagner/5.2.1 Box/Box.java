public class Box
{
   // Instance Variables

	private int side;

   // Constructors

	public Box (int x) {
		this.side = x;
	}

   // Methods

   /** precondition: none
    *  postcondition: calculates and returns the area of
    *     the box (A = 6 * side * side)
    *  @return the area of the box
    */
   public int calculateArea()
   {
        return ((6 * side) * side);
   }

   /** precondition: none
    *  postcondition: calculates and returns the volume of
    *     the box (V = side * side * side)
    *  @return the volume of the box
    */
   public int calculateVolume()
   {
       return(side * side * side);
   }
}