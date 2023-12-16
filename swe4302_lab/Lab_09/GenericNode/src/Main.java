public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape("Circle_Shape", "Red");
        Shape_2D shape2 = new Shape_2D("Square_2D", "Blue", 10);
        Shape_3D shape3 = new Shape_3D("Cube_3D", "Green", 10);
        Circle shape4 = new Circle("Circle_Circle", "Red", 10, 5);
        Cube shape5 = new Cube("Cube_Cube", "Green", 10, 5);

//        Shape_2D ci = new Shape_3D() Invalid

        Node<Shape> node1 = new Node<>(shape1);
        Node<Shape_2D> node2 = new Node<>(shape2);
        Node<Shape_3D> node3 = new Node<>(shape3);
        Node<Circle> node4 = new Node<>(shape4);
        Node<Cube> node5 = new Node<>(shape5);

        Canvas canvas = new Canvas();
        canvas.addShape(node1);
        canvas.addShapeE(node2);
        canvas.addShapeE(node4);
        canvas.addShapeS(node3);
        canvas.addShapeC(node4);
        canvas.addShapeCu(node5);
    }
}