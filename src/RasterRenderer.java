// Concrete Implementor: provides raster rendering.
public class RasterRenderer implements Renderer {

    // Implements circle rendering for the raster renderer.
    @Override
    public void renderCircle() {
        // Prints a message to demonstrate raster rendering.
        System.out.println("Drawing Circle using Raster Renderer.");
    }

    // Implements square rendering for the raster renderer.
    @Override
    public void renderSquare() {
        // Prints a message to demonstrate raster rendering.
        System.out.println("Drawing Square using Raster Renderer.");
    }
}
