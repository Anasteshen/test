package model;

import java.util.ArrayList;

public class FloorLayout {
    private ArrayList<Coord> coords;
    private ArrayList<Line> lines;

    public FloorLayout() { }
    public FloorLayout( ArrayList<Coord> coords,ArrayList<Line> lines) {
        this.coords = coords;
        this.lines = lines;
    }
    public boolean goClockwise () {
        boolean clockwise = false;
        for( int i = 0; i< coords.size()-2; i++ ) {
            coords.get(i);
            if (coords.get(i+1).getX() > coords.get(i).getX()) {
                if (coords.get(i+2).getY() < coords.get(i+1).getY()) {
                    clockwise = true;
                } else
                    clockwise = false;
            } else if (coords.get(i+1).getY() > coords.get(i).getY()) {
                if(coords.get(i+2).getX() > coords.get(i+1).getX()) {
                    clockwise = true;
                }else
                    clockwise = false;
            } else if (coords.get(i+1).getY() < coords.get(i).getY()) {
                if(coords.get(i+2).getX() < coords.get(i+1).getX()) {
                    clockwise = true;
                } else
                    clockwise = false;
            }
        }
        return clockwise;
    }
    public boolean rightAngles() {
        int count=0;
        for (int i = 0; i < lines.size()-1; i++ ) {

            int a = lines.get(i).getA();
            int b = lines.get(i).getB();
            int c = lines.get(i+1).getB();
            if ((a*b + b*c) == 0 ) {
                continue;
            }
            else
                count++;
        }
        if(count==0) {
            return true;
        } else
            return false;
    }
    public boolean square() {
        double sideAB = Math.sqrt(Math.pow(lines.get(0).getA(),2) + Math.pow(lines.get(0).getB(),2));
        double sideBC = Math.sqrt(Math.pow(lines.get(1).getA(),2) + Math.pow(lines.get(1).getB(),2));
        if (sideAB == sideBC) {
            return true;
        }else
            return false;
    }
}
