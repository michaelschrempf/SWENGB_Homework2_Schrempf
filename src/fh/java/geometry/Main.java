package fh.java.geometry;

import fh.java.geometry.model2d.GeometricShape2D;
import fh.java.geometry.model2d.quadriteral.Parallelogram;
import fh.java.geometry.model2d.quadriteral.Square;
import fh.java.geometry.model2d.trilateral.Triangle;
import fh.java.geometry.model3d.GeometricShape3D;
import fh.java.geometry.model3d.curved.Cone;
import fh.java.geometry.model3d.curved.Cylinder;
import fh.java.geometry.model3d.curved.Globe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 14.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Main main2 = new Main();

        main.doIt2D();
        main2.doIt3D();

    }

    private void doIt3D() {

        List<GeometricShape3D> shapeList = new ArrayList<>(); //List|GeometricShape> --> in der Liste darf nur Objecte von GeomtricShape
        fillList3D(shapeList);
        printList3D(shapeList);

        List<Globe> globeList = new ArrayList<>();

        for (GeometricShape3D geometricShape : shapeList) {
            if (geometricShape instanceof Globe){
                globeList.add((Globe) geometricShape);
            }
        }
        System.out.println("-----------------------------------------------------");
        for (Globe globe : globeList) {
            System.out.println(globe);
        }

    }

    private void printList3D(List<GeometricShape3D> shapeList) {

        System.out.println(".........for........");
        for (int pos = 0; pos < shapeList.size(); pos++) {//fori
            System.out.println(shapeList.get(pos));
        }
        System.out.println(".........foreach........");
        for (GeometricShape3D geometricShape3D : shapeList) { //iter
            System.out.println(geometricShape3D); //sout
        }
        System.out.println(".........stream 1........"); //high performance version of foreach
        shapeList.stream()
                .forEach(shape-> System.out.println(shape));

        System.out.println(".........stream 2........");
        shapeList.stream()
                .forEach(System.out::println);

    }

    private void fillList3D(List<GeometricShape3D> shapeList) {

        shapeList.add(new Globe(1,2,3,3.0));
        shapeList.add(new Globe(4,5,3,8.0));
        shapeList.add(new Globe(1,2,3,6.0));
        shapeList.add(new Globe(9,2,3,10.0));
        shapeList.add(new Globe(8,5,3,1.0));
        shapeList.add(new Globe(77,12,3,9.0));
        shapeList.add(new Globe(1,5,3,6.0));

        shapeList.add(new Cylinder(2,4,3,4.5,5.4));

        shapeList.add(new Cone(3,4,3,3.3,4.4,4.5));

    }

    private void doIt2D(){

        List<GeometricShape2D> shapeList = new ArrayList<>(); //List|GeometricShape> --> in der Liste darf nur Objecte von GeomtricShape
        fillList2D(shapeList);
        printList2D(shapeList);

        List<Parallelogram> parallelogramList = new ArrayList<>();

        for (GeometricShape2D geometricShape : shapeList) {
            if (geometricShape instanceof Parallelogram){
                parallelogramList.add((Parallelogram) geometricShape);
            }
        }
        System.out.println("-----------------------------------------------------");
        for (Parallelogram parallelogram : parallelogramList) {
            System.out.println(parallelogram);
        }
    }


    public void fillList2D(List<GeometricShape2D> shapeList) {

        shapeList.add(new Parallelogram(1,2,3.0));
        shapeList.add(new Parallelogram(4,5,8.0));
        shapeList.add(new Parallelogram(1,2,6.0));
        shapeList.add(new Parallelogram(9,2,10.0));
        shapeList.add(new Parallelogram(8,5,1.0));
        shapeList.add(new Parallelogram(77,12,9.0));
        shapeList.add(new Parallelogram(1,5,6.0));

        shapeList.add(new Triangle(2,4,4.5,5.4));

        shapeList.add(new Triangle(3,4,3.3,4.4));

        shapeList.add(new Square(3,4,3.6));

    }


    public void printList2D(List<GeometricShape2D> shapeList) {

        System.out.println(".........for........");
        for (int pos = 0; pos < shapeList.size(); pos++) {//fori
            System.out.println(shapeList.get(pos));
        }
        System.out.println(".........foreach........");
        for (GeometricShape2D geometricShape2D : shapeList) { //iter
            System.out.println(geometricShape2D); //sout
        }
        System.out.println(".........stream 1........"); //high performance version of foreach
        shapeList.stream()
                .forEach(shape-> System.out.println(shape));

        System.out.println(".........stream 2........");
        shapeList.stream()
                .forEach(System.out::println);





    }




}

