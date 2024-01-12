public class ShapeFactory {
    public static Shape shapes(ShapesEnum shapesEnum){
        return switch (shapesEnum.getShapeName()) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            default -> null;

        };
    }
}
