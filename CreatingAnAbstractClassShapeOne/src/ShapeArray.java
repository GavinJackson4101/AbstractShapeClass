public class ShapeArray {
    public static void main(String[]args) {
        Shape shapeArray[] = new Shape[3];
        shapeArray[0] = new Sphere(3); //radius as 3
        shapeArray[1] = new Cylinder(3, 4); // radius and height as 3 and 4
        shapeArray[2] = new Cone(3, 5); //radius and height as 3 and 5

        for (int i = 0; i < 3; i++) {
            System.out.println(shapeArray[i].toString());
        }

    }

    }

