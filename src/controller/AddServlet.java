package controller;

import model.Coord;
import service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddServlet extends HttpServlet {
private ArrayList<Coord> coords;
//private FormFloor formFloor = new FormFloor();
private Service service = new Service();
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException {
        coords = new ArrayList<Coord>();

        //int x1= Integer.parseInt(req.getParameter("x1"));
        //int y1 = Integer.parseInt(req.getParameter("y1"));
        /*int x2= Integer.parseInt(req.getParameter("x2"));
        int y2 = Integer.parseInt(req.getParameter("y2"));
        int x3= Integer.parseInt(req.getParameter("x3"));
        int y3 = Integer.parseInt(req.getParameter("y3"));
        int x4= Integer.parseInt(req.getParameter("x4"));
        int y4 = Integer.parseInt(req.getParameter("y4"));*/
        Coord coord = new Coord(Integer.parseInt(req.getParameter("x1")),Integer.parseInt(req.getParameter("y1")));
        Coord coord1= new Coord(Integer.parseInt(req.getParameter("x2")),Integer.parseInt(req.getParameter("y2")));
        Coord coord2 = new Coord(Integer.parseInt(req.getParameter("x3")),Integer.parseInt(req.getParameter("y3")));
        Coord coord3 = new Coord(Integer.parseInt(req.getParameter("x4")),Integer.parseInt(req.getParameter("y4")));
        coords.add(coord);
        coords.add(coord1);
        coords.add(coord2);
        coords.add(coord3);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.append(service.start(coords));
        out.close();


       // formFloor.createFloor(coords);
      /*  PrintWriter out = res.getWriter();
        out.println(coords.get(0).getA());
        out.println(coords.get(0).getB());
*/
    }

    public ArrayList<Coord> getCoords() {
        return coords;
    }
}
