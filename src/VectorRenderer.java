// Concrete Implementor: provides vector rendering.
public class VectorRenderer implements Renderer {

    // Implements circle rendering for the vector renderer.
    @Override
    public void renderCircle() {
        // Prints a message to demonstrate vector rendering.
        System.out.println("Drawing Circle using Vector Renderer.");
    }

    // Implements square rendering for the vector renderer.
    @Override
    public void renderSquare() {
        // Prints a message to demonstrate vector rendering.
        System.out.println("Drawing Square using Vector Renderer.");
    }
}
