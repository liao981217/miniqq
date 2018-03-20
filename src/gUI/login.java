package gUI;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {
    public static void main(String[] args)
    {	
        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        JLabel image=new JLabel();
        ImageIcon img=new ImageIcon("1.jpg");
        image.setIcon(img);
        JTextField id=new JTextField("id");
        JTextField password=new JTextField("密码");
        JButton btsignup=new JButton("注册帐号");
        ActionListener listener1=new btsignupListener();
        JButton btforgetpassword=new JButton("找回密码");
        JButton btlogin = new JButton("登录");
        JCheckBox cb1=new JCheckBox("记住密码");
        JCheckBox cb2=new JCheckBox("自动登录");
        frame.add(image);
        frame.add(id);
        frame.add(password);
        frame.add(btsignup);
        frame.add(btforgetpassword);
        frame.add(btlogin);
        frame.add(cb1);
        frame.add(cb2);
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        GridBagConstraints s= new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH;
        s.gridwidth=3;
        s.gridheight=3;
        layout.setConstraints(image,s);
        s.gridwidth=6;
        s.gridheight=1; 
        layout.setConstraints(id,s);
        s.gridy=1;
        layout.setConstraints(password, s);
        s.gridy=2;
        s.gridwidth=3;
        layout.setConstraints(cb1, s);
        layout.setConstraints(cb2, s);
        s.gridx=3;
        s.gridy=3;
        s.gridwidth=6;
        layout.setConstraints(btlogin, s);
        s.gridy=0;
        s.gridx=9;
        s.gridwidth=3;
        layout.setConstraints(btsignup, s);
        s.gridy=1;
        layout.setConstraints(btforgetpassword, s);
        frame.setSize(360,160);//Set the frame size
        frame.setLocationRelativeTo(null);//Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class btsignupListener implements ActionListener{
		  public void actionPerformed(ActionEvent arg0) {
			  System.out.println("a");
		  }
    }
    
}
