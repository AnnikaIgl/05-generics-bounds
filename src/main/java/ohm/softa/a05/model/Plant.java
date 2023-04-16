package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant>{
     public Plant(double h, String f, String n){
            this.height = h;
            this.family = f;
            this.name = n;
     }
     protected double height;
     protected String family;
     protected String name;

     public double getHeight(){return this.height;}
     public String getFamily(){return this.family;}
     public String getName(){return this.name;}
     public abstract PlantColor getColor();

     public abstract int compareTo(Plant o);

     @Override
     public String toString(){
         return "Name: "+this.name+" ,Family: "+ this.family+" ,Height: " +this.height;
     }

     @Override
     public int hashCode(){
         return Objects.hashCode(this);
     }

    // TODO: 16.04.2023 implement equals method 
 }
