public class Canvas {

    public void addShapeE(Node<? extends Shape_2D> shape){ // Upper bound
        System.out.println("Adding shape: " + shape.getData().getName());
    }

    public void addShapeS(Node<? super Shape_3D> shape){ // Lower bound
        System.out.println("Adding shape: " + shape.getData().getName());
    }

    public void addShape(Node<? extends Shape> shape){
        System.out.println("Adding shape: " + shape.getData().getName());
    }

    public void addShapeC(Node<? super Circle> shape){
        System.out.println("Adding shape: " + shape.getData().getName());
    }

    public void addShapeCu(Node<? super Cube> shape){
        System.out.println("Adding shape: " + shape.getData().getName());
    }
}
