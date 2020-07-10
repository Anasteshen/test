package service;

import model.Coord;
import model.FloorLayout;

import java.util.ArrayList;

public class Service {

    public Service() {
    }

    public String start(ArrayList<Coord> coords) {
        FormFloor formFloor = new FormFloor();
        FloorLayout floor = formFloor.createFloor(coords);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("result : " + printCoord(coords));

        if (floor.rightAngles() && floor.goClockwise()) {
            stringBuilder.append("legal");
            if (floor.square())
                stringBuilder.append(", " + "it`s square ");
        } else
            stringBuilder.append("Illegal, try again");

        return String.valueOf(stringBuilder);
    }


    public StringBuilder printCoord(ArrayList<Coord> coords) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < coords.size(); i++) {
            stringBuilder = stringBuilder.append("(" + coords.get(i).getX() + "," +
                    coords.get(i).getY() + ")");
        }
        stringBuilder = stringBuilder.append("->");
        return stringBuilder;
    }

}
