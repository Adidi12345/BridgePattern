# Bridge Pattern - Shape Renderer

## Course

SE-2501 - Software Design Patterns

## Topic

Bridge Design Pattern

## Description

This project demonstrates the Bridge structural design pattern in Java.

The example uses two independent dimensions:

1. Shape abstraction:
   - Circle
   - Square

2. Renderer implementation:
   - VectorRenderer
   - RasterRenderer

The Shape hierarchy is connected to the Renderer hierarchy through composition.

This allows shapes and rendering implementations to vary independently.

## Project Structure

```text
src/
├── Shape.java
├── Circle.java
├── Square.java
├── Renderer.java
├── VectorRenderer.java
├── RasterRenderer.java
└── Main.java
```

## Bridge Roles

- Shape = Abstraction
- Circle, Square = Refined Abstraction
- Renderer = Implementor
- VectorRenderer, RasterRenderer = Concrete Implementors
- Main = Client

## How to Run

Use Java JDK 17.

In IntelliJ IDEA:

1. Open this project.
2. Set the Project SDK to JDK 17.
3. Open `Main.java`.
4. Run the `main()` method.

## Expected Output

```text
=== BRIDGE PATTERN: SHAPE - RENDERER ===

--- Using Vector Renderer ---
Drawing Circle using Vector Renderer.
Drawing Square using Vector Renderer.

--- Switching to Raster Renderer ---
Drawing Circle using Raster Renderer.
Drawing Square using Raster Renderer.

--- Same Shape, Different Implementations ---
Drawing Circle using Vector Renderer.
Drawing Circle using Raster Renderer.
```

## Clean Code Principles

1. Meaningful names are used for classes, methods and variables.
2. Each class has a focused responsibility.
3. Abstraction and implementation are separated.
4. Rendering logic is not duplicated in shape classes.
5. New renderers can be added without changing existing shapes.

## Technologies

- Java 17
- IntelliJ IDEA
- Git
- GitHub
