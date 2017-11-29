public class Line
{
    double slope;
    int x,y;
    public Line(double angle, int x, int y)
    {
        slope = AngleToSlope(angle);
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public double getCurrentY(double xVal)
    {
        return slope*(xVal - x) + y;
    }
    public double getSlope()
    {
        return slope;
    }
    public static double AngleToSlope(double angle)
    {
        return Math.tan(angle); //rise over run duhh
    }
}