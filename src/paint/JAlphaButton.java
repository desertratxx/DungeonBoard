package paint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * {@link JButton} with correct visualization of a {@link Color} with alpha
 * channel
 *
 * @author DesertRatX
 */
public class JAlphaButton extends JButton {

    
    public JAlphaButton(String label){
        super(label);
    }
    /**
     * @inherited
     * <p>
     */
    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBackground().getAlpha() < 255) {
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        super.paintComponent(g);
    }
}
