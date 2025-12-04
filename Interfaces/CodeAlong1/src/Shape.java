public interface Shape {

    double getArea();

    double getPerimeter();

    double getPerimiter();

    String getName();

    double getAspectRatio(){
        return 1.0;
    }

    static double sumAreas(Shape[] shapes){
        double sum = 0;
        for (Shape s: shapes){
            sum += s.getArea();
        }
        return sum;
    }
}
