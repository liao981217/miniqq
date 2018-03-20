package gUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class mainpage {
    public static void main(String[] args)
    {	
        JFrame frame = new JFrame("myQQ");
        frame.setLayout(new GridBagLayout());
        JLabel image=new JLabel();
        ImageIcon img=new ImageIcon("1.jpg");
        image.setIcon(img);
        JLabel username=new JLabel("傲的像光");
        JLabel bio=new JLabel("屡教不改");
        JButton friends=new JButton();
        JButton group=new JButton();
        JButton chat=new JButton();
        JScrollPane spFriends=new JScrollPane();
        JScrollPane spGroup=new JScrollPane();
        JScrollPane spChat=new JScrollPane();
        JPanel pFriends=new JPanel();
        JPanel pGroup=new JPanel();
        JPanel pChat=new JPanel();
        spFriends.add(pFriends);
        spGroup.add(pGroup);
        spChat.add(pChat);
        frame.add(image);
        frame.add(username);
        frame.add(bio);
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        GridBagConstraints s= new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH;
        s.gridwidth=3;
        s.gridheight=3;
        layout.setConstraints(image,s);
        s.gridheight=1;
        s.gridwidth=GridBagConstraints.REMAINDER;
        layout.setConstraints(username, s);
        s.gridy=1;
        layout.setConstraints(bio, s);
        frame.setSize(360,720);//Set the frame size
        frame.setLocationRelativeTo(null);//Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
