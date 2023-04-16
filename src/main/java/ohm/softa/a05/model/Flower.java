package ohm.softa.a05.model;

public class Flower extends Plant{
    PlantColor color;
    public Flower(double h, String f, String n, PlantColor c) {
        super(h, f, n);
        if (!c.equals(PlantColor.GREEN)) {
            this.color = c;
        } else {
            this.color = null;
        }
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }


    @Override
    public int compareTo(Plant o) {
        return (int)(this.height-o.height);
    }
}
