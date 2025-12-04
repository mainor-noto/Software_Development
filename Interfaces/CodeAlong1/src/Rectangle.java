public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * width * 2 * height;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }

    @Override
    public double getWidth(){
        return width;
    }
    @Override
    public double getHeight() {
        return height;

    }

    @Override
    public double getAspectRatio(){
        return width/height;
    }

    @Override
    public String toString(){
        return "%s: Area: %.2f, Perimeter: %.2f, AR: %.2f"
                .formatted(getName(), getArea(), getPerimeter(), getAspectRatio());
    }
}
