// Refined Abstraction: represents a circle.
public class Circle extends Shape {

    // Constructor receives a renderer and passes it to Shape.
    public Circle(Renderer renderer) {
        // Calls the parent constructor.
        super(renderer);
    }

    // Draws the circle using the selected renderer.
    @Override
    public void draw() {
        // Delegates the low-level rendering operation to Renderer.
        renderer.renderCircle();
    }
}
