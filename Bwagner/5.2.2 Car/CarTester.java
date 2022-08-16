public class CarTester
{

    public static void main(String[] args)
    {
        Car car1 = new Car(1000.0, 1450.0, 20.0);  // instantiate Car object

        System.out.println("  Car 1");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n",  car1.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car1.milesToEmpty());

        Car car2 = new Car(15000.0, 15200.0, 12.0);

        System.out.println();
        System.out.println("  Car 2");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n", car2.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car2.milesToEmpty());

        Car car3 = new Car(80000.0, 80727.0, 21.0);

        System.out.println();
        System.out.println("  Car 3");
        System.out.println("=========");
        System.out.printf("MPG = %.1f \n", car3.calculateMPG());
        System.out.printf("Miles to empty = %.1f \n", car3.milesToEmpty());
   }
}
