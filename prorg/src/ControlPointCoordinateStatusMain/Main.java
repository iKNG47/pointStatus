package ControlPointCoordinateStatusMain;

import ControlPointCoordinateStatusPoint.*;

import static ControlPointCoordinateStatusMethods.Methods.*;


public class Main {
    public static void main(String[] args) {
        Point point2 =new Point(2,5);
        pointOut(point2);
        addX(point2, 2 );
        subY(point2, 4);
        pointOut(point2);
    }
}
