package ControlPointCoordinateStatusMain;

import ControlPointCoordinateStatusPoint.Point;



public class Main {
    public static void main(String[] args) {
        Point point2 =new Point(2,5);
        ControlPointCoordinateStatusMethods.Methods.pointOut(point2);
        ControlPointCoordinateStatusMethods.Methods.addX(point2, 2 );
        ControlPointCoordinateStatusMethods.Methods.subY(point2, 4);
        ControlPointCoordinateStatusMethods.Methods.pointOut(point2);
    }
}
