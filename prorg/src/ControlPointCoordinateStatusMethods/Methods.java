package ControlPointCoordinateStatusMethods;

import ControlPointCoordinateStatusPoint.*;

public class Methods {
    public static void  addX(Point point, int add){
        point.setCoordinateX(add + point.getCoordinateX());
    }
    public static void addY(Point point, int add){
        point.setCoordinateY(add + point.getCoordinateY());
    }
    public static void subY(Point point, int sub){
        point.setCoordinateY(point.getCoordinateY() - sub);
    }
    public static void subX(Point point, int sub){
        point.setCoordinateX(point.getCoordinateX() - sub);
    }
    public static void pointOut(Point pointOut){
        System.out.println("Coordinate X is: "+pointOut.getCoordinateX()+"\n"+"Coordinate Y is: "+pointOut.getCoordinateY());
    }

}