package fh.java.geometry.model3d.curved;

import fh.java.geometry.model3d.GeometricShape3D;

/**
 * Created by micha on 14.11.2016.
 */
public class Globe extends GeometricShape3D {

    private double radiusR;

    public Globe(int x, int y, int z, double radiusR) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radiusR = radiusR;
    }

    @Override
    public double calcVolume() {
        return (4/3)*Math.PI*(radiusR*radiusR*radiusR);
    }

    @Override
    public double calcSurface() {
        return 4*Math.PI*(radiusR*radiusR);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Globe{");
        sb.append("radiusR=").append(radiusR);
        sb.append('}');
        return sb.toString();
    }

    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Globe globe = (Globe) o;

        return Double.compare(globe.radiusR, radiusR) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radiusR);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
