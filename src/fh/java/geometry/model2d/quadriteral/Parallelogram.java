package fh.java.geometry.model2d.quadriteral;

/**
 * Created by micha on 14.11.2016.
 */
public class Parallelogram extends QuadrangularShape{
    private double sideA;
    private double sideB;
    private double angleAlpha;

    public Parallelogram(double sideA, double sideB, double angleAlpha){
        this.sideA=sideA;
        this.sideB=sideB;
        this.angleAlpha=angleAlpha;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getAngle() {
        return angleAlpha;
    }

    public void setAngle(double angleAlpha) {
        this.angleAlpha = angleAlpha;
    }


    @Override
    public double calcArea() {
        return sideA*(sideB*Math.cos(Math.toRadians(angleAlpha)));
    }

    @Override
    public double calcPerimeter() {
        return 2*sideA+2*sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parallelogram that = (Parallelogram) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        if (Double.compare(that.sideB, sideB) != 0) return false;
        return Double.compare(that.angleAlpha, angleAlpha) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(angleAlpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parallelogram{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", angleAlpha=").append(angleAlpha);
        sb.append('}');
        return sb.toString();
    }
}
