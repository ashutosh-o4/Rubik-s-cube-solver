import java.util.*;
public class rubikscube
{
    private char [][][] cube;
    private static final char[]color={'W','Y','B','G','R','O'};

    public rubikscube()
    {
        cube =new char[6][3][3];
        initializecube();
    }
    public void initializecube(){
        for(int i=0;i<6;i++)
            for(int j=0;j<3;j++)
                Arrays.fill(cube[i][j],color[i]);
    }

    public void printCube()
    {
        String [] facename={"Top","Bottom","Front","Back","Left","Right"};
        for(int i=0;i<6;i++)
        {
            System.out.println(facename[i]+"Face:");
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(cube[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rubikscube cube = new rubikscube();
        cube.printCube();
    }
}
