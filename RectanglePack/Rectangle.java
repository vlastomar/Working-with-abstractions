package RectanglePack;

public class Rectangle {
    private Point bottomLeft, topRight;

    public Rectangle(Point bottomLeft, Point topRight){
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return this.bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return this.topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public static boolean contains(Point coordinatesOnePoint, Rectangle coordinatesRectangle){
        boolean checkPositionPoint = true;

        if (coordinatesOnePoint.getCoordinateX() < coordinatesRectangle.bottomLeft.getCoordinateX() ||
        coordinatesOnePoint.getCoordinateX() > coordinatesRectangle.topRight.getCoordinateX() ||
        coordinatesOnePoint.getCoordinateY() < coordinatesRectangle.bottomLeft.getCoordinateY() ||
        coordinatesOnePoint.getCoordinateY() > coordinatesRectangle.topRight.getCoordinateY()){
            checkPositionPoint = false;
        }


        return checkPositionPoint;
    }

}

