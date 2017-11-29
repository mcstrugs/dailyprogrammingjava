public class Point
{
    public double x,y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public boolean isAbove(Line line)
    {
        return y > line.getSlope()*(x - line.getX()) + line.getY();
    }
    
    public String toString()
    {
        return "("+x+","+y+")"; // (x,y);
    }
}