import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterExp extends JFrame implements ActionListener
{
	Container c;
	JLabel lfirst,llast,lpass,lcpass,lbranch,laddress;
	JTextField tfirst,tlast,tpass,tcpass;
	JComboBox branch;
	JTextArea address;
	JButton submit,it,reset;

	RegisterExp()
	{
		c = getContentPane();
		lfirst= new JLabel("First Name:");
		llast= new JLabel("Last Name:");
		lpass= new JLabel("Password:");
		lcpass= new JLabel("Confirm Password:");
		lbranch= new JLabel("Branch:");
		laddress= new JLabel("Address:");

		tfirst= new JTextField();
		tlast= new JTextField();
		tpass= new JTextField();
		tcpass= new JTextField();

		String branchselect[]={"COMPS","IT","AIDS","EXTC"};
		branch = new JComboBox(branchselect);

		address = new JTextArea();

		submit = new JButton("Submit");
		submit.addActionListener(this);
		submit = new JButton("Reset");
		reset.addActionListener(this);

		lfirst.setBounds(40,20,150,20);
		llast.setBounds(40,60,150,20);
		lpass.setBounds(40,100,150,20);
		lcpass.setBounds(40,140,150,20);
		lbranch.setBounds(40,180,150,20);
		laddress.setBounds(40,220,150,20);

		tfirst.setBounds(180,20,150,20);
		tlast.setBounds(180,60,150,20);
		tpass.setBounds(180,100,150,20);
		tcpass.setBounds(180,140,150,20);

		branch.setBounds(180,180,150,20);

		address.setBounds(180,220,150,70);

		submit.setBounds(70,320,80,20);

		reset.setBounds(190,320,80,20);

		c.add(lfirst);
		c.add(llast);
		c.add(lpass);
		c.add(lcpass);
		c.add(lbranch);
		c.add(laddress);
		c.add(tfirst);
		c.add(tlast);
		c.add(tpass);
		c.add(tcpass);
		c.add(branch);
		c.add(address);
		c.add(submit);
		c.add(reset);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			String first,last,pass;
			first = tfirst.getText();
			last = tlast.getText();
			pass = tpass.getText();

			JOptionPane.showMessageDialog(c,("First name:"+first+"\nLast Name:"+last+"\nPassword:"+pass));
		}
		else if(e.getActionCommand().equals("Reset"))
		{
			tfirst.setText("");
			tlast.setText("");
			tpass.setText("");
			tcpass.setText("");
			address.setText("");
		}
	}
	public static void main(String[] args)
	{
		RegisterExp reg = new RegisterExp();
		reg.setSize(500,500);
		reg.setLayout(null);
		reg.setVisible(true);
		reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
