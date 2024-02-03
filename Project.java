import javax.swing.*;
import java.awt.*;
public class Project extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField tname,tsurname;
	JTextArea address;
	JRadioButton r1,r2,r3;
	JButton b1;
	JLabel msg;
	JButton SUBMIT;
   Project()
   {
	   l1=new JLabel("NAME:"); 
	   l2=new JLabel("SURNAME:");
	   l3=new JLabel("GENDER:");
	   l4=new JLabel("ADDRESS:");
	  
	   tname=new JTextField("Enter Name:");
	   tsurname=new JTextField("Enter Surname:");
	   r1=new JRadioButton("Male");
	   r2=new JRadioButton("Female");
	   r3=new JRadioButton("Others");
	   address=new JTextArea();
	   
	   b1=new JButton("SUBMIT");
	   
	   l1.setBounds(100,100,80,20);
	   l2.setBounds(100,140,80,20);
	   l3.setBounds(100,180,80,20);
	   l4.setBounds(100,220,80,20);
		 
	   tname.setBounds(200,100,100,20);
	   tsurname.setBounds(200,140,100,20);
	   
	   address.setBounds(200,220,200,100);
		  
		r1.setBounds(200,180,80,20);
		r2.setBounds(300,180,80,20);
	    r3.setBounds(400,180,80,20);
		
		ButtonGroup bg=new ButtonGroup();
			 
	    b1.setBounds(300,400,100,20);
		
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(tname);
		add(tsurname);
		
		add(r1);
		add(r2);
		add(r3);
		add(b1);
		
		SUBMIT = new JButton("SUBMIT");
		SUBMIT.setBounds(150,350,80,20);
		c.add(SUBMIT);
		SUBMIT.addActionListener(this);
		msg = new JLabel("msg");
		msg.setBounds(20,400,250,20);
		c.add(msg);
		this.add(address);
}
public void actionPerformed(ActionEvent e){
	msg.setText("REGISTRATION SUCCESSFUL!!");
}
   
   
   public static void main(String args[])
   {
      Project t= new Project();
	  t.setLayout(null);
	 t.setTitle("SAMPLE FORM");
	 t.setSize(800,600);
	 t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 t.setVisible(true);
   }
   
}