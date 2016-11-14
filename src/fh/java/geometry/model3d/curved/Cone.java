package fh.java.geometry.model3d.curved;

/**
 * Created by micha on 14.11.2016.
 */
public class Cone extends RoundShape {




    private double highH;
    private double radiusR;
    private double sideS;

    public Cone(int x, int y, int z, double highH, double radiusR, double sideS) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.highH = highH;
        this.radiusR = radiusR;
        this.sideS = sideS;
    }

    @Override
    public double calcVolume() {
        return (1/3)*highH*(radiusR*radiusR)*Math.PI;
    }

    @Override
    public double calcSurface() {
        return radiusR*Math.PI+(radiusR+sideS);
    }

    public double getHighH() {
        return highH;
    }

    public void setHighH(double highH) {
        this.highH = highH;
    }

    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }

    public double getSideS() {
        return sideS;
    }

    public void setSideS(double sideS) {
        this.sideS = sideS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.highH, highH) != 0) return false;
        if (Double.compare(cone.radiusR, radiusR) != 0) return false;
        return Double.compare(cone.sideS, sideS) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(highH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radiusR);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideS);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("highH=").append(highH);
        sb.append(", radiusR=").append(radiusR);
        sb.append(", sideS=").append(sideS);
        sb.append('}');
        return sb.toString();
    }
}
