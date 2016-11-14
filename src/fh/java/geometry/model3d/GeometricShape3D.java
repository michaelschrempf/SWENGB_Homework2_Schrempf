package fh.java.geometry.model3d;

/**
 * Created by micha on 14.11.2016.
 */
public abstract class GeometricShape3D {

    protected int x;
    protected int y;
    protected int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public abstract double calcVolume();

    public abstract double calcSurface();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeometricShape3D that = (GeometricShape3D) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }




}





