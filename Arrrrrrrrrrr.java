public class Arrrrrrrrrrr
{
    public static void main()
    {
        int[][][][][][][][] arr = new int[2][2][2][2][2][2][2][2];
        for(int a = 0; a < 2; a++)
        {
            for(int b = 0; b < 2; b++)
            {
                for(int c = 0; c < 2; c++)
                {
                    for(int d = 0; d < 2; d++)
                    {
                        for(int e = 0; e < 2; e++)
                        {
                            for(int f = 0; f < 2; f++)
                            {
                                for(int g = 0; g < 2; g++)
                                {
                                    for(int h = 0; h < 2; h++)
                                    {
                                        arr[a][b][c][d][e][f][g][h] = (int)(Math.random()*100) + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int a = 0; a < 2; a++)
        {
            for(int b = 0; b < 2; b++)
            {
                for(int c = 0; c < 2; c++)
                {
                    for(int d = 0; d < 2; d++)
                    {
                        for(int e = 0; e < 2; e++)
                        {
                            for(int f = 0; f < 2; f++)
                            {
                                for(int g = 0; g < 2; g++)
                                {
                                    for(int h = 0; h < 2; h++)
                                    {
                                        System.out.println(arr[a][b][c][d][e][f][g][h]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
