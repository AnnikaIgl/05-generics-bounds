package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> extends PlantBedUtility{
    SimpleList<T> plants  = new SimpleListImpl<T>();

    public int size(){
        return plants.size();
    }
    public void add(T plant){
        plants.add(plant);
    }
    public SimpleList<T> getPlantsByColor(PlantColor color){
        return plants.filter(item -> item.getColor() == color);
    }

    public <Z extends T>void remove(T object){
            plants.remove(object);
    }



}
