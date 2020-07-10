package model;

import java.util.ArrayList;

public class Line extends FloorLayout{
    private int a;
    private int b;
    static int count = 0;
    private ArrayList<Coord> coordinates;

    public Line() {}

    public Line(ArrayList<Coord> coordinates) {

        this.coordinates = coordinates;
        if (count!=coordinates.size()-1) {
            this.b = coordinates.get(count + 1).getY() - coordinates.get(count).getY();
            this.a = coordinates.get(count + 1).getX() - coordinates.get(count).getX();
            count++;
        } else
        {
            this.b = coordinates.get(count).getY() - coordinates.get(0).getY();
            this.a = coordinates.get(count).getX() - coordinates.get(0).getX();
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a)
    {
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}
