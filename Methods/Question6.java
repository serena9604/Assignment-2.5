
public class Question6
{
    public static void displayBox(int width, int height) {
        int h = 0;
        int w = 0;
        while (h < height) {
            while (w < width) {
                System.out.print("$");
                w++;
            }
            System.out.println("");
            w = 0;
            h ++;
        }
    }
}
