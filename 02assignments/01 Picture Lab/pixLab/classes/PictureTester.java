/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester {
    /** Method to test zeroBlue */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void testKeepOnlyBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    public static void testNegate() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    public static void testGrayscale() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    public static void testFixUnderwater() {
        Picture water = new Picture("water.jpg");
        water.explore();
        water.negate();
        water.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical() {
        Picture motorc = new Picture("redMotorcycle.jpg");
        motorc.explore();
        motorc.mirrorVerticalRightToLeft();
        motorc.explore();
    }

    public static void testMirrorHorizontal() {
        Picture motorc = new Picture("redMotorcycle.jpg");
        motorc.explore();
        motorc.mirrorHorizontal();
        motorc.explore();
    }

    public static void testmirrorHorizontalBotToTop() {
        Picture motorc = new Picture("redMotorcycle.jpg");
        motorc.explore();
        motorc.mirrorHorizontalBotToTop();
        motorc.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testMirrorArms() {
        Picture snowm = new Picture("snowman.jpg");
        snowm.explore();
        snowm.mirrorArms();
        snowm.explore();
    }

    public static void testMirrorGull() {
        Picture gull = new Picture("seagull.jpg");
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        testGrayscale();
        testFixUnderwater();
        testMirrorVertical();
        testMirrorHorizontal();
        testmirrorHorizontalBotToTop();
        testMirrorTemple();
        testMirrorArms();
        testMirrorGull();
        testCollage();
        //testCopy();
        testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}