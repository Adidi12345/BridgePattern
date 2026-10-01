// Client: demonstrates the Bridge Pattern.
public class Main {

    // Program entry point.
    public static void main(String[] args) {

        // Prints the title of the demonstration.
        System.out.println("=== BRIDGE PATTERN: SHAPE - RENDERER ===");

        // Creates the first concrete implementor.
        Renderer vectorRenderer = new VectorRenderer();

        // Creates a Circle connected to the VectorRenderer.
        Shape vectorCircle = new Circle(vectorRenderer);

        // Creates a Square connected to the VectorRenderer.
        Shape vectorSquare = new Square(vectorRenderer);

        // Prints a section title.
        System.out.println("\n--- Using Vector Renderer ---");

        // Draws the circle with the vector renderer.
        vectorCircle.draw();

        // Draws the square with the vector renderer.
        vectorSquare.draw();

        // Creates the second concrete implementor.
        Renderer rasterRenderer = new RasterRenderer();

        // Creates a Circle connected to the RasterRenderer.
        Shape rasterCircle = new Circle(rasterRenderer);

        // Creates a Square connected to the RasterRenderer.
        Shape rasterSquare = new Square(rasterRenderer);

        // Prints a section title.
        System.out.println("\n--- Switching to Raster Renderer ---");

        // Draws the circle with the raster renderer.
        rasterCircle.draw();

        // Draws the square with the raster renderer.
        rasterSquare.draw();

        // Demonstrates that the same shape type can work with another renderer.
        System.out.println("\n--- Same Shape, Different Implementations ---");

        // Creates a Circle using VectorRenderer.
        Shape circleWithVector = new Circle(vectorRenderer);

        // Creates another Circle using RasterRenderer.
        Shape circleWithRaster = new Circle(rasterRenderer);

        // Draws the first circle using vector rendering.
        circleWithVector.draw();

        // Draws the second circle using raster rendering.
        circleWithRaster.draw();
    }
}
