package fh.java.geometry.model3d.curved;

import fh.java.geometry.model3d.GeometricShape3D;

/**
 * Created by micha on 14.11.2016.
 */
public class Cylinder extends GeometricShape3D{

    private double radiusR;
    private double highH;

    public Cylinder(int x, int y, int z, double radiusR, double highH) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radiusR = radiusR;
        this.highH = highH;
    }

    @Override
    public double calcVolume() {
        return Math.PI*(radiusR*radiusR)*highH;
    }

    @Override
    public double calcSurface() {
        return (2+Math.PI*(radiusR*radiusR))+(2*Math.PI*radiusR*highH);
    }

    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }

    public double getHighH() {
        return highH;
    }

    public void setHighH(double highH) {
        this.highH = highH;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("radiusR=").append(radiusR);
        sb.append(", highH=").append(highH);
        sb.append('}');
        return sb.toString();
    }


}
