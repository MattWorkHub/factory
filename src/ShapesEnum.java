public enum ShapesEnum {
    CIRCLE("Circle"),
    RECTANGLE("Rectangle");

    private String shapeName;

    ShapesEnum(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
}
