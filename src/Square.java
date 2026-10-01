// Refined Abstraction: represents a square.
public class Square extends Shape {

    // Constructor receives a renderer and passes it to Shape.
    public Square(Renderer renderer) {
        // Calls the parent constructor.
        super(renderer);
    }

    // Draws the square using the selected renderer.
    @Override
    public void draw() {
        // Delegates the low-level rendering operation to Renderer.
        renderer.renderSquare();
    }
}
