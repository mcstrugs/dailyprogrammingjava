public class RadarTester
{
    public static void main()
    {
        Line ray1 = new Line(24, 0 , 0);
        Line ray2 = new Line(343.4, 11 , 7);
        Point intersection = RadarData.intersection(ray1, ray2);
        System.out.println(intersection);
    }
}

