package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.PathIterator;

public class PilotTest {


    @Test
    public void pilotTest() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Person);
        Assert.assertTrue(pilot  instanceof Pilot);
    }

    @Test
    public void getAircraftTest() {
        Pilot pilot = new Pilot();

        Aircraft cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);

        pilot.fly(cropDuster);
        Aircraft expect = cropDuster;
        Aircraft actual = pilot.getAircraft();
        Assert.assertEquals(expect, actual);
    }
}
