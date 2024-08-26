package Algorithm.Recursion.triangleNumber;

public class Triangle {
    private final int width;

    /**
     * Constructs a triangular shape
     * @param aWidth (the width and head of a triangle)
     */
    public Triangle(int aWidth) {
        this.width = aWidth;
    }

    /**
     * Computes the area of the triangle
     * @return the area
     */
    public int getArea() {
        if (this.width <= 0) {
            return -1;
        } else if (this.width == 1) {
            return 1;
        } else {
            Triangle smallerTriangle = new Triangle(width - 1);
            int smallerTriangleArea = smallerTriangle.getArea();
            return smallerTriangleArea + width;
        }
    }

    /**
     * []
     * [][]
     * [][][]
     * [][][][]
     * Consider each [] has area of 1.
     * With the width = 3, the area is 6. If width = 3 + 1 = 4, then the area is
     * (the area of a triangle with width = 3) + width = 4
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6);
        System.out.println("Area: " + triangle.getArea());
    }
}
