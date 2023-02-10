public class Cylinder extends Shape {
    public double Radius,height;
    public Cylinder(double rad,double h){
        Radius=rad;
        height=h;
    }

    @Override
    double surface_area() {
        double sa=(2*3.14*Radius*height)+(2*3.14*Radius*Radius);// cylinder sa formula
        return sa;
    }

    public double volume(){
        double vol=3.14*Radius*Radius*height;//cylinder vol formula
        return vol;
    }
    public  String toString(){
        return "Surface Area of Cylinder : "+surface_area()+"\nVolume of Cylinder: "+volume();// string implement
    }
}
