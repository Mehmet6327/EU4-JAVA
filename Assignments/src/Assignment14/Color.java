package Assignment14;

import java.util.Arrays;

public class Color {
    /*     Question-13
   
*/
    
    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};
    private int[] rgb = new int[3];
    
   
    public Color(int r, int g, int b) {
        if (r > -1 && r < 256) {
            this.rgb[0] = r;
        }
        if (g > -1 && g < 256) {
            this.rgb[1] = g;
        }
        if (b > -1 && b < 256) {
            this.rgb[2] = b;
        }
        
    }
    
   
    public Color() {
        this(255, 255, 255);
    }
    
    
    public String toString() {
        if (Arrays.equals(this.rgb, WHITE)) {
            return "white";
        } else if (Arrays.equals(this.rgb, LIGHT_GRAY)) {
            return "light gray";
        } else if (Arrays.equals(this.rgb, GRAY)) {
            return "gray";
        } else if (Arrays.equals(this.rgb, DARK_GRAY)) {
            return "dark gray";
        } else if (Arrays.equals(this.rgb, BLACK)) {
            return "black";
        } else if (Arrays.equals(this.rgb, RED)) {
            return "red";
        } else if (Arrays.equals(this.rgb, PINK)) {
            return "pink";
        } else if (Arrays.equals(this.rgb, ORANGE)) {
            return "orange";
        } else if (Arrays.equals(this.rgb, YELLOW)) {
            return "yellow";
        } else if (Arrays.equals(this.rgb, GREEN)) {
            return "green";
        } else if (Arrays.equals(this.rgb, MAGENTA)) {
            return "magenta";
        } else if (Arrays.equals(this.rgb, CYAN)) {
            return "cyan";
        } else if (Arrays.equals(this.rgb, BLUE)) {
            return "blue";
        }
        
        return "n/a";
    }
}