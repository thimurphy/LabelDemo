
package labeldemo;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author thiagomurphy
 */

public class LabelDemo {

    public static void main(String[] args) {
        
        //create a label with plain text
        JLabel northLabel = new JLabel("North");
        
        //create an icon from an image so I can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("bug.png");
        
        //create a label with an icon instead of text
        JLabel centerLabel = new JLabel (labelIcon );
        
        //create another label with an icon
        JLabel southLabel = new JLabel (labelIcon);
        
        //set the label to display text (as well as an icon)
        southLabel.setText("South");
        
        //create a frame to hold the labels
        JFrame app = new JFrame ();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add labels to the frame;the second argument specifies
        //where on the frame to add the label
        app.add(northLabel, BorderLayout.NORTH);
        app.add(centerLabel, BorderLayout.CENTER);
        app.add(southLabel, BorderLayout.SOUTH);
        
        app.setSize(300, 300);//set the size of the frame
        app.setVisible(true);//show the frame
        
    }
    
}
