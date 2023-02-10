public class Sphere extends Shape {
    public double Radius;
    public Sphere(double rad){
        Radius=rad;
    }

    @Override
    double surface_area() {
        double sa=4*3.14*Radius*Radius;//set formula for sa of sphere
        return sa;
    }

    public double volume(){
        double sa=4/3*3.14*Radius*Radius*Radius;//set formula for vol of sphere
        return sa;
    }
    public String toString(){
        return "Surface Area of Sphere : "+surface_area()+"\nVolume of Sphere: "+volume();// string implement
    }
}
