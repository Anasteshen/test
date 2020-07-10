package service;

import model.Coord;
import model.FloorLayout;
import model.Line;

import java.util.ArrayList;

public class FormFloor {
    private ArrayList<Line> lines;

    public FormFloor() {
        lines = new ArrayList<Line>();
    }

    public FormFloor(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public FloorLayout createFloor(ArrayList<Coord> coordinates) {
        FloorLayout floor = new FloorLayout(coordinates, createLines(coordinates));
        return floor;
    }

    public ArrayList<Line> createLines(ArrayList<Coord> coordinates) {
        for (int i = 0; i < coordinates.size() - 1; i++) {
            lines.add(new Line(coordinates));
        }
        return lines;
    }
}
