package ControlPointCoordinateStatusMain;

public class Main {
    public static void main(String[] args) {
        ControlPointCoordinateStatusPoint.Point point1 =new ControlPointCoordinateStatusPoint.Point();
        point1.setCoordinateX(2);
        point1.setCoordinateY(4);

        System.out.println(point1.getCoordinateX()+" "+point1.getCoordinateY());
    }
}
