public class Shapes {
    public static void main(String[] args) {

        double rectangleWidth;
        double rectangleHeight;
        double rectanglePerimeter;
        double rectangleArea;

        rectangleWidth = 5.5;
        rectangleHeight = 8.5;
        rectanglePerimeter = (rectangleWidth + rectangleHeight) * 2;
        rectangleArea = rectangleHeight * rectangleWidth;
        String messageOne = "Rectangle Width: ";
        String messageTwo = "Rectangle Height: ";
        String messageThree = "Rectangle Perimeter: ";
        String messageFour = "Rectangle Area: ";

        System.out.println(messageOne + rectangleWidth);
        System.out.println(messageTwo + rectangleHeight);
        System.out.println(messageThree + rectanglePerimeter);
        System.out.println(messageFour + rectangleArea);
        System.out.println();

        double radius;
        double pi;
        double circumference;
        double circleArea;

        radius = 3;
        pi = 3.14;
        circumference = radius * 2 * pi;
        circleArea = radius * radius * 2;
        String messageFive = "Radius ";
        String messageSix = "Circumference: ";
        String messageSeven = "Circle Area: ";
        System.out.println(messageFive + radius);
        System.out.println(messageSix + circumference);
        System.out.println(messageSeven + circleArea);

    }
}
