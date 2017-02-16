package pixLab.classes;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Jacob Nelson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.zeroBlue();
	  koala.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorHorizontalBottomToTop();
	  koala.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixFish()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixFish();
	  water.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("koala.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testHoldMyBeerIGotThis()
  {
	  
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.mirrorVertical();
	  beach.mirrorHorizontalBottomToTop();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testMirrorSeagulls()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorSeagulls();
	  seagull.explore();
  }
  
  public static void preview()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
  }
  
  public static void testRandom()
  {
	  Picture trees = new Picture("cumberlandisland.jpg");
	  trees.explore();
	  trees.fullRandom();
	  trees.explore();
  }
  
  public static void testRandomBlue()
  {
	  Picture trees = new Picture("cumberlandisland.jpg");
	  trees.explore();
	  trees.fullRandomBlue();
	  trees.explore();
  }
  
  public static void testActuallyRandom()
  {
	  Picture trees = new Picture("arch.jpg");
	  trees.explore();
	  trees.actuallyFullRandom();
	  trees.explore();
	  trees.grayscale();
	  trees.explore();
  }
  
  public static void testColorEdgeDetection()
  {
	  Picture image = new Picture("arch.jpg");
	  image.explore();
	  image.colorEdgeDetection(25);
	  image.explore();
	  image.grayscale();
	  image.explore();
  }
  
  public static void testHearts(String doSave)
  {
	  Picture meme = new Picture("emperorCodeMeme.png");
	  BufferedImage newMeme = new BufferedImage(meme.getWidth(), meme.getHeight(), BufferedImage.TYPE_INT_ARGB);
	  Picture base = new Picture(newMeme);
	  meme.explore();
	  meme.addHearts(meme);
	  meme.explore();
	  meme.addMessage("doot doot", 1100, 800);
	  meme.explore();
//	  if(doSave.equalsIgnoreCase("yes") || doSave.equalsIgnoreCase("y"))
//	  {
	  meme.write("/Users/jnel4175/Pictures/Meme.png");
//	  }
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixFish();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorHorizontalBottomToTop();
//    testMirrorTemple();
    //testMirrorArms();
//    testMirrorSeagulls();
//    testMirrorDiagonal();
//    testCollage();
//    testCopy();
//    testEdgeDetection();
    //testEdgeDetection2();
//    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
//    testHoldMyBeerIGotThis();
//    preview();
//	  testRandom();
//	  testActuallyRandom();
	  testColorEdgeDetection();
//	  testHearts("yes");
  }
}