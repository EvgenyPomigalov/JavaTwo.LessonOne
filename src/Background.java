import java.awt.*;
public class Background {
    private final int N_TIME_UPDATES = 300;
    private Color color;
    private static int nTime;
    Background(GameCanvas canvas) {
        if (nTime == N_TIME_UPDATES) {
            color = new Color(
                    (int) (Math.random() * 255), // R
                    (int) (Math.random() * 255), // G
                    (int) (Math.random() * 255)  // B
            );
            canvas.setBackground(color);
            nTime = 0;
       }
        else {
            nTime++;
        }
    }
}







