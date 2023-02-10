public class Cone extends Shape {
    public double Radius,height;
    public Cone(double rad,double h){
        Radius=rad;
        height=h;
    }
    public double volume(){
        double vol=(3.14*Radius*Radius*height)/3;//cone vol formula
        return vol;
    }
    public double surface_area(){
        double sa=3.14*Radius*(Radius+Math.sqrt(height*height)+(Radius*Radius));// cone sa formula
        return sa;
    }
    public String toString(){
        return "Surface Area of Cone : "+surface_area()+"\nVolume of Cone :"+volume();// string implement
    }
}
