// Abstraction: represents a general shape.
public abstract class Shape {

    // Bridge: stores a reference to the Implementor.
    protected Renderer renderer;

    // Constructor receives the renderer through composition.
    public Shape(Renderer renderer) {
        // Saves the renderer so the shape can use it.
        this.renderer = renderer;
    }

    // Defines the operation that concrete shapes must implement.
    public abstract void draw();
}
