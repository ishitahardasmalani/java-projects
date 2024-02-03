import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Register extends JFrame implements ActionListener
{
	Container c;
	JLabel lfirst,llast,lbranch,laddress;
	JTextField tfirst,tlast;
	JComboBox branch;
	JTextArea address;
	JButton submit,it;

	public RegisterExp()
	{
		c = getContentPane();
		lfirst= new JLabel("First Name:");
		llast= new JLabel("Last Name:");
		lbranch= new JLabel("Branch:");
		laddress= new JLabel("Address:");

		tfirst= new JTextField();
		tlast= new JTextField();

		String branchselect[]={"COMPS","IT","AIDS","EXTC"};
		branch = new JComboBox(branchselect);

		address = new JTextArea();

		submit = new JButton("Submit");
		submit.addActionListener(this);
	

		lfirst.setBounds(40,20,150,20);
		llast.setBounds(40,60,150,20);
		lbranch.setBounds(40,180,150,20);
		laddress.setBounds(40,220,150,20);

		tfirst.setBounds(180,20,150,20);
		tlast.setBounds(180,60,150,20);
		

		branch.setBounds(180,180,150,20);

		address.setBounds(180,220,150,70);

		submit.setBounds(70,320,80,20);

		

		c.add(lfirst);
		c.add(llast);
		c.add(lbranch);
		c.add(laddress);
		c.add(branch);
		c.add(address);
		c.add(submit);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			String first,last;
			first = tfirst.getText();
			last = tlast.getText();
			

			JOptionPane.showMessageDialog(c,("First name:"+first+"\nLast Name:"+last+"\n));
		}
		
		}
	}
	public static void main(String[] args)
	{
		Register reg = new Register();
		reg.setSize(500,500);
		reg.setLayout(null);
		reg.setVisible(true);
		reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}