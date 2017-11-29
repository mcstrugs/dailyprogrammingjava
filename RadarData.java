public class RadarData
{
    private int x1, y1, x2, y2;
    private double angle1, angle2;
    public static double toUnitCircleAngle(double crapAngle) //returns angle in radians
    {
        crapAngle -= 90;
        if(crapAngle < 0)
        {
            crapAngle += 360;
        }
        crapAngle %= 360;
        crapAngle = 360 - crapAngle;
        double radAngle = crapAngle * (2*Math.PI)/360;
        return radAngle;
    }
    
    public static Point intersection(Line line1, Line line2)
    {
        Point currentApprox = new Point(line1.getX(),line1.getY());
        double change = 1;
        boolean hasCrossed = false;
        boolean startAbove = currentApprox.isAbove(line2);
        for(int i = 0; i < 1000; i++)
        {
            if(startAbove != currentApprox.isAbove(line2) || change != 1)
            {
                hasCrossed = true;
            }
            if(currentApprox.isAbove(line2))
            {
                currentApprox.x -= change;
                currentApprox.y = line1.getCurrentY(currentApprox.x);
            }
            else if(!currentApprox.isAbove(line2))
            {
                currentApprox.x += change;
                currentApprox.y = line1.getCurrentY(currentApprox.x);
            }
            if(hasCrossed)
            {
                change *= .5;
            }
        }
        return currentApprox;
    }
}