
public class Workshop01 {

    public static void main(String[] args) {
        Space3D space3d = new Space3D();
        Point3D startPoint = new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(0, 0, 6);
        double distance = space3d.คำนวนระยะทางระหว่างจุด(startPoint, endPoint);
        System.out.println(distance);
    }

}
