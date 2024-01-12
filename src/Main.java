public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.shapes(ShapesEnum.CIRCLE);
        Shape rectangle = ShapeFactory.shapes(ShapesEnum.RECTANGLE);

        circle.draw();
        rectangle.draw();
    }
}