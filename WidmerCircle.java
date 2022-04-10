public class WidmerCircle {
    float radius;
    float diameter;
    double area;

    public WidmerCircle(){
    radius = 1;
    diameter = 2 * radius;
    area = Math.PI * radius * radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }

    public float getRadius() {
        return radius;
    }
}

