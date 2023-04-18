package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;

public abstract class PlantBedUtility {
    public <T extends Plant>void repot(PlantBed<T> from, PlantBed<? super T> to, PlantColor color){
        SimpleList<T> toRemove = from.getPlantsByColor(color);
        for(T elem: toRemove){
            from.remove(elem);
            to.add(elem);
        }
    }
}
