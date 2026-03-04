import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 7);
        System.out.println("punkt p1: " + p1);
        Point p2 = new Point();
        System.out.println("punkt p2: " + p2);
        p2.setX(10);
        p2.setY(20);
        System.out.println("punkt p2 po zmianie: " + p2);
        System.out.println("p2.x = " + p2.getX());
        System.out.println("p2.y = " + p2.getY());
    }
}