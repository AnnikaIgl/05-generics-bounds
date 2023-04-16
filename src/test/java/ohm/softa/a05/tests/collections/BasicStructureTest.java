package ohm.softa.a05.tests.collections;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.tests.models.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
}
