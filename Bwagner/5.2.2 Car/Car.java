public class Car
{
    // Constants
    public final double capacity = 22;   // number of gallons the gas
                                         // tank can hold when full
    // Instance Variables
    private double startMiles = 0;
    private double endMiles = 0;
    private double gallons = 0;

    // Constructors
    public Car(double x, double y, double z) {
    	this.startMiles = x;
    	this.endMiles = y;
    	this.gallons = z;
    }

    // Methods

    /** precondition:  gallons > 0
     *  postcondition: calculates and returns the cars MPG (miles per gallon)
     *     for the current odometer readings.
     *  @return the car's MPG
     */
    public double calculateMPG()
    {

    	double x = 0;
    	double y = 0;

        x = endMiles - startMiles;
        y = x / gallons;

        return y;
    }

    /** precondition:  none
     *  postcondition: calculates and returns the number of miles the car
     *     can travel before its gas tank is empty.
     *  @return number of miles car can travel before tank is empty
     */
    public double milesToEmpty()
    {
    	double x = 0;
    	double y = 0;
    	double xx = 0;
    	double z = capacity - gallons;

        x = endMiles - startMiles;
        y = x / gallons;

        xx = z * y;

        return xx;
    }
}
