package com.zipcodewilmington.froilansfarm.animal.farmanimals;


import com.zipcodewilmington.froilansfarm.animal.farmanimals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.food.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;


public class TestChicken {

    private Edible edible;
    private Egg edibleEgg;

    @Test
    public void NullaryChickenConstructorTest(){
        // Given
        Boolean expectedFertilizedStatus = false;

        // When
        Chicken chicken = new Chicken();
        Boolean actualFertilizedStatus = chicken.isFertilized();

        // Then
        Assert.assertEquals(expectedFertilizedStatus, actualFertilizedStatus);
    }

    // TODO - Create tests for `makeNoise`
    @Test
    public void makeNoiseTest() {
        //Given
        Chicken chicken = AnimalFactory.createChicken();
        String expected = "Bawk bawk!";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoiseTest2() {
        //Given
        Chicken chicken = AnimalFactory.createChicken();
        String expected = "Rawr!";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertNotEquals(expected, actual);

    }
    @Test
    public void getIsFertilizedTest(){
        // Given
        Boolean expectedFertilizedStatus = true;

        // When
        Chicken chicken = new Chicken();
        Boolean actualFertilizedStatus = chicken.hasBeenFertilized();
        chicken.setIsFertilized(chicken.hasBeenFertilized());

        // Then
        Assert.assertEquals(expectedFertilizedStatus, actualFertilizedStatus);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void edibleEggTest(){
        //Given
        Chicken chicken = AnimalFactory.createChicken();
        chicken.hasBeenFertilized();
        chicken.setIsFertilized(chicken.hasBeenFertilized());
        Egg expected = edibleEgg;

        //When
        Egg actual = chicken.yield();

        //Then
        Assert.assertEquals(expected,actual);

    }

}
