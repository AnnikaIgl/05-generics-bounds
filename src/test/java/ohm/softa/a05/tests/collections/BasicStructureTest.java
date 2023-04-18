package ohm.softa.a05.tests.collections;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.*;
import ohm.softa.a05.tests.models.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;

public class BasicStructureTest {

    @Test
    void GreenFlower(){
        Flower f = new Flower(10.0, "Orchideen", "garuda garada", PlantColor.GREEN);
        assertTrue(f.getColor()==null);
    }
    @Test
    void TestCompare(){
        Flower f1 = new Flower(10.0, "Orchideen", "garuda garada", PlantColor.BLUE);
        Flower f2 = new Flower(7.0, "O","n", PlantColor.RED);

        assertTrue(f1.compareTo(f2) >0);
    }

    @Test
    void TestEquals(){
        Flower f1 = new Flower(1,"a","b", PlantColor.BLUE);
        Flower f2 = new Flower(1,"a","b", PlantColor.BLUE);
        Shrub s1 = new Shrub(1,"a","b");

        assertTrue(f1.equals(f2));
        assertTrue(!f1.equals(s1));
    }

    @Test
    void TestPlantBed(){
        PlantBed<Flower> bed = new PlantBed<>();
        bed.add(new Flower(4, "flower1", "f", PlantColor.ORANGE));
        bed.add(new Flower(6,"flower2", "f",PlantColor.YELLOW));
        bed.add(new Flower(5, "flower3", "f", PlantColor.ORANGE));

        SimpleList<Flower> f = bed.getPlantsByColor(PlantColor.ORANGE);
        assertTrue(f.size() == 2);
    }

    @Test
    void TestRepot(){
        PlantBed<Flower> flowerbed = new PlantBed<>();
        flowerbed.add(new Flower(4, "flower1", "f", PlantColor.ORANGE));
        flowerbed.add(new Flower(6,"flower2", "f",PlantColor.YELLOW));
        flowerbed.add(new Flower(5, "flower3", "f", PlantColor.ORANGE));

        PlantBed<Shrub> shrubBed = new PlantBed<>();
        shrubBed.add(new Shrub(3,"shrub1", "shrubs"));

        PlantBed<Plant> p = new PlantBed<>();
        flowerbed.repot(flowerbed, p, PlantColor.ORANGE);

        assertTrue(flowerbed.size() == 1);
        assertTrue(p.size() == 2);
    }


}
