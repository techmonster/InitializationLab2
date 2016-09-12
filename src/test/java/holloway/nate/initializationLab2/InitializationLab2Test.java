package holloway.nate.initializationLab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanielholloway on 9/11/16.
 * Initialization and method testing.
 */
public class InitializationLab2Test {


    @Test
    public void addTest(){
        ColorfulThing newThing3 = new ColorfulThing(ColorfulThing.Color.RED);
        ThingContainer newContainer = new ThingContainer(5);
        boolean isAdded = newContainer.add(newThing3);
        Assert.assertTrue(isAdded);
    }

    @Test
    public void getRandomColorTest(){
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.RED);

        ColorfulThing.Color actual = colorfulThing1.getRandomColor();
        ColorfulThing.Color expected = colorfulThing2.getRandomColor();
        Assert.assertSame("The thing will be random",expected,actual);
    }

    @Test
    public void popTest(){
        ThingContainer newContainer = new ThingContainer(5);
        newContainer.addRandomThings();
        ColorfulThing returnedThing = newContainer.pop();
        Assert.assertNotNull(returnedThing);

    }


    @Test
    public void removeColorTest(){
        ThingContainer newContainer = new ThingContainer(5);
        ColorfulThing newThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        newContainer.add(newThing);
        ColorfulThing expectedThing = newThing;
        ColorfulThing returnedThing = newContainer.remove(ColorfulThing.Color.BLUE);
        Assert.assertEquals(expectedThing,returnedThing);
    }

    @Test
    public void removeThingTest2(){
        ThingContainer newContainer = new ThingContainer(5);
        ColorfulThing newThing = new ColorfulThing(ColorfulThing.Color.GREEN);
        newContainer.add(newThing);
        ColorfulThing expectedThing = newThing;
        ColorfulThing returnedThing = newContainer.remove(newThing);
        Assert.assertEquals(expectedThing,returnedThing);
    }

    @Test
    public void removeAndShiftArrayTest(){
        ThingContainer newContainer = new ThingContainer(5);
        ColorfulThing newThing = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing newThing2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing newThing3 = new ColorfulThing(ColorfulThing.Color.RED);

        newContainer.add(newThing);
        newContainer.add(newThing2);
        newContainer.add(newThing3);
        newContainer.remove(newThing);

        ColorfulThing expectedThing = newThing2;
        ColorfulThing returnedThing = newContainer.getThings()[0];
        Assert.assertEquals(expectedThing,returnedThing);
    }


}
