import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bill extends JFrame implements ActionListener
{
	public static int total=0;
	public static String orders1="";
	JLabel l1,limage;
	JTextArea t1;
	JButton b1,b2;
	Font f,f1;
	bill()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\billbackground.jpg");
		limage=new JLabel(i);
		t1=new JTextArea(orders1);
		l1=new JLabel("YOUR ORDER SUMMARY");
		l1.setForeground(Color.white);
		t1.setOpaque(false);
		t1.setEditable(false);
		t1.setForeground(Color.white);
		b1=new JButton("Add more Option");
		b2=new JButton("Finalise Bill");
		f=new Font("Verdana",Font.BOLD,15);
		f1=new Font("Serif",Font.ITALIC,35);
		t1.setBounds(250,180,500,700);
		t1.setFont(f);
		l1.setFont(f1);
		limage.setBounds(0,0,1000,960);
		b1.setBounds(300,750,150,50);
		b2.setBounds(600,750,100,50);
		l1.setBounds(300,50,500,100);
		add(limage);
		limage.add(b1);
		limage.add(b2);
		limage.add(l1);
		limage.add(t1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Add more Option"))
		{
			this.setVisible(false);
			order o1=new order();
		}
		if(e.getActionCommand().equals("Finalise Bill"))
		{
			this.setVisible(false);
			Thankyou t=new Thankyou();
		}
	}
}
class Thankyou extends JFrame
{
	JLabel t,limage;
	 Thankyou()
	 {
		 t=new JLabel("Your total amount is "+bill.total);
		 Font f=new Font("Verdana",Font.BOLD,30);
		 t.setFont(f);
		 ImageIcon i=new ImageIcon("F:\\Java Pgms\\loginpage.jpeg");		
		 limage=new JLabel(i);
		 t.setBounds(500,700,500,50);
		 limage.setBounds(0,0,1000,1000);
		 add(limage);
		 limage.add(t);
		 this.setLayout(null);
         this.setSize(1000,1000);   
		 this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
class Desserts extends JFrame implements ActionListener
{
	JLabel d,m1,p1,q1,m2,p2,q2,limage;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;;
	JButton b2;
	Desserts()
	{
		d=new JLabel("DESSERTS");
		m1=new JLabel("Menu");
		p1=new JLabel("Price");
		q1=new JLabel("Qty");
		m2=new JLabel("Menu");
		p2=new JLabel("Price");
		q2=new JLabel("Qty");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Desserts.jpg");		
		limage=new JLabel(i);
		b2=new JButton("PREV");
		Font f=new Font("Verdana",Font.BOLD,15);
		d.setFont(f);
		c1=new JCheckBox("Stawberry And Cream Tart--------Rs299");
		c2=new JCheckBox("Chocolate Passion---------------Rs239");
		c3=new JCheckBox("Triple Hot Fudge Nut Sundae-----Rs249");
		c4=new JCheckBox("Brownie in Hot Chocolate--------Rs179");
		c5=new JCheckBox("Pani Puri Ice Cream-------------Rs149");
		c6=new JCheckBox("Rasmalai Milk Cake--------------Rs149");
		c7=new JCheckBox("Lotus Biscoff Cheesecake--------Rs239");
		c8=new JCheckBox("Chocolate Pull-Me Cake----------Rs249");
		c9=new JCheckBox("Belgian Chocolate Pastry--------Rs239");
		c10=new JCheckBox("Deconstructed Black Forest-----Rs99");
		c11=new JCheckBox("Liege Cinnamon Buns------------Rs199");
		c12=new JCheckBox("Berry Crepe Cake---------------Rs149");
		c13=new JCheckBox("Royal Falooda------------------Rs199");
		c14=new JCheckBox("Chocolate Croustillant---------Rs199");
		c15=new JCheckBox("Black Triple Ice Cream---------Rs149");
		c16=new JCheckBox("Cold Coco----------------------Rs99");
		c17=new JCheckBox("Gulab jamun--------------------Rs99");
		c18=new JCheckBox("Rasgulla-----------------------Rs149");
		c19=new JCheckBox("Mango Cream--------------------Rs149");
		c20=new JCheckBox("Caramel Custard----------------Rs149");
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		limage.setBounds(0,0,1000,1000);
		c1.setBounds(125,200,300,30);
		cb1.setBounds(430,200,40,30);
		c2.setBounds(125,250,300,30);
		cb2.setBounds(430,250,40,30);
		c3.setBounds(125,300,300,30);
		cb3.setBounds(430,300,40,30);
		c4.setBounds(125,350,300,30);
		cb4.setBounds(430,350,40,30);
		c5.setBounds(125,400,300,30);
		cb5.setBounds(430,400,40,30);
		c6.setBounds(125,450,300,30);
		cb6.setBounds(430,450,40,30);
		c7.setBounds(125,500,300,30);
		cb7.setBounds(430,500,40,30);
		c8.setBounds(125,550,300,30);
		cb8.setBounds(430,550,40,30);
		c9.setBounds(125,600,300,30);
		cb9.setBounds(430,600,40,30);
		c10.setBounds(125,650,300,30);
		cb10.setBounds(430,650,40,30);
		c11.setBounds(490,200,300,30);
		cb11.setBounds(820,200,40,30);
		c12.setBounds(490,250,300,30);
		cb12.setBounds(820,250,40,30);
		c13.setBounds(490,300,300,30);
		cb13.setBounds(820,300,40,30);
		c14.setBounds(490,350,300,30);
		cb14.setBounds(820,350,40,30);
		c15.setBounds(490,400,300,30);
		cb15.setBounds(820,400,40,30);
		c16.setBounds(490,450,300,30);
		cb16.setBounds(820,450,40,30);
		c17.setBounds(490,500,300,30);
		cb17.setBounds(820,500,40,30);
		c18.setBounds(490,550,300,30);
		cb18.setBounds(820,550,40,30);
		c19.setBounds(490,600,300,30);
		cb19.setBounds(820,600,40,30);
		c20.setBounds(490,650,300,30);
		cb20.setBounds(820,650,40,30);
		m1.setBounds(140,160,100,30);
		p1.setBounds(300,160,100,30);
		q1.setBounds(440,160,100,30);
		m2.setBounds(520,160,100,30);
		p2.setBounds(680,160,100,30);
		q2.setBounds(820,160,100,30);
		d.setBounds(400,100,100,30);
		b2.setBounds(130,750,100,30);
		add(limage);
		limage.add(d);
		limage.add(m1);
		limage.add(p1);
		limage.add(q1);
		limage.add(m2);
		limage.add(p2);
		limage.add(q2);
		limage.add(c1);
		limage.add(cb1);
		limage.add(c2);
		limage.add(cb2);
		limage.add(c3);
		limage.add(cb3);
		limage.add(c4);
		limage.add(cb4);
		limage.add(c5);
		limage.add(cb5);
		limage.add(c6);
		limage.add(cb6);
		limage.add(c7);
		limage.add(cb7);
		limage.add(c8);
		limage.add(cb8);
		limage.add(c9);
		limage.add(cb9);
		limage.add(c10);
		limage.add(cb10);
		limage.add(c11);
		limage.add(cb11);
		limage.add(c12);
		limage.add(cb12);
		limage.add(c13);
		limage.add(cb13);
		limage.add(c14);
		limage.add(cb14);
		limage.add(c15);
		limage.add(cb15);
		limage.add(c16);
		limage.add(cb16);
		limage.add(c17);
		limage.add(cb17);
		limage.add(c18);
		limage.add(cb18);
		limage.add(c19);
		limage.add(cb19);
		limage.add(c20);
		limage.add(cb20);
		limage.add(b2);	
		b2.addActionListener(this);
        this.setSize(1000,960);
	    this.setLayout(null);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
	public void actionPerformed(ActionEvent e)
	{
		int total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+299*x;
			bill.orders1+=s;
			bill.orders1+=" Stawberry And Cream Tart--------Rs299   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Passion---------------Rs239   ";
			bill.orders1+="\n";
			
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
				bill.orders1+=" Triple Hot Fudge Nut Sundae-----Rs249   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+179*x;
			bill.orders1+=s;
				bill.orders1+=" Brownie in Hot Chocolate--------Rs179  ";
			bill.orders1+=s+"\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
				bill.orders1+=" Pani Puri Ice Cream-------------Rs149   ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Rasmalai Milk Cake--------------Rs149   ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Lotus Biscoff Cheesecake--------Rs239   ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Pull-Me Cake----------Rs249    ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Belgian Chocolate Pastry--------Rs239    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x;
			bill.orders1+=s;
			bill.orders1+=" Deconstructed Black Forest-----Rs99     ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Liege Cinnamon Buns------------Rs199   ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Berry Crepe Cake---------------Rs149    ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Royal Falooda------------------Rs199   ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Croustillant---------Rs199    ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Black Triple Ice Cream---------Rs149    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x; 
			bill.orders1+=s;
			bill.orders1+=" Cold Coco----------------------Rs99    ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x;
			bill.orders1+=s;
			bill.orders1+=" Gulab jamun--------------------Rs99    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Rasgulla-----------------------Rs149    ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Mango Cream--------------------Rs149   ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Caramel Custard----------------Rs149   ";
			bill.orders1+="\n";
			System.out.println(bill.orders1);
		}
		    this.setVisible(false);
			order d=new order();
	}
}
class Drinks extends JFrame implements ActionListener
{
	JLabel d,m1,p1,q1,m2,p2,q2,limage;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;;
	JButton b2;
	Drinks()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Drink3.jpg");
		limage=new JLabel(i); 
		d=new JLabel("DRINKS");
		m1=new JLabel("Menu");
		p1=new JLabel("Price");
		q1=new JLabel("Qty");
		m2=new JLabel("Menu");
		p2=new JLabel("Price");
		q2=new JLabel("Qty");
		limage.setBounds(0,0,1000,1000);
		b2=new JButton("PREV");
		b2.addActionListener(this);		
		Font f=new Font("Verdana",Font.BOLD,15);
		d.setFont(f);
		c1=new JCheckBox("Melon Cooler--------------------Rs210");
		c2=new JCheckBox("Orange Punch--------------------Rs210");
		c3=new JCheckBox("Guava Delight-------------------Rs210");
		c4=new JCheckBox("Pacific Blue--------------------Rs210");
		c5=new JCheckBox("Blue Lagoon---------------------Rs210");
		c6=new JCheckBox("Green Lust----------------------Rs210");
		c7=new JCheckBox("Soda Shikanji-------------------Rs210");
		c8=new JCheckBox("Purple Rain---------------------Rs210");
		c9=new JCheckBox("Stawberry Daiquiry--------------Rs249");
		c10=new JCheckBox("Black Current------------------Rs199");
		c11=new JCheckBox("Butter scotch------------------Rs249");
		c12=new JCheckBox("Choco Loaded-------------------Rs249");
		c13=new JCheckBox("Kitkat Shake-------------------Rs249");
		c14=new JCheckBox("Oreo shake---------------------Rs249");
		c15=new JCheckBox("Mango shake--------------------Rs249");
		c16=new JCheckBox("Caffe Mocha--------------------Rs199");
		c17=new JCheckBox("Espresso-----------------------Rs269");
		c18=new JCheckBox("Cappuccino---------------------Rs199");
		c19=new JCheckBox("Roasted Hazelnut---------------Rs249");
		c20=new JCheckBox("Americano----------------------Rs299");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c1.setBounds(50,250,300,30);
		cb1.setBounds(380,250,40,30);
		c2.setBounds(50,300,300,30);
		cb2.setBounds(380,300,40,30);
		c3.setBounds(50,350,300,30);
		cb3.setBounds(380,350,40,30);
		c4.setBounds(50,400,300,30);
		cb4.setBounds(380,400,40,30);
		c5.setBounds(50,450,300,30);
		cb5.setBounds(380,450,40,30);
		c6.setBounds(50,500,300,30);
		cb6.setBounds(380,500,40,30);
		c7.setBounds(50,550,300,30);
		cb7.setBounds(380,550,40,30);
		c8.setBounds(50,600,300,30);
		cb8.setBounds(380,600,40,30);
		c9.setBounds(50,650,300,30);
		cb9.setBounds(380,650,40,30);
		c10.setBounds(50,700,300,30);
		cb10.setBounds(380,700,40,30);
		c11.setBounds(450,250,300,30);
		cb11.setBounds(780,250,40,30);
		c12.setBounds(450,300,300,30);
		cb12.setBounds(780,300,40,30);
		c13.setBounds(450,700,300,30);
		cb13.setBounds(780,700,40,30);
		c14.setBounds(450,350,300,30);
		cb14.setBounds(780,350,40,30);
		c15.setBounds(450,400,300,30);
		cb15.setBounds(780,400,40,30);
		c16.setBounds(450,450,300,30);
		cb16.setBounds(780,450,40,30);
		c17.setBounds(450,500,300,30);
		cb17.setBounds(780,500,40,30);
		c18.setBounds(450,550,300,30);
		cb18.setBounds(780,550,40,30);
		c19.setBounds(450,600,300,30);
		cb19.setBounds(780,600,40,30);
		c20.setBounds(450,650,300,30);
		cb20.setBounds(780,650,40,30);
		m1.setBounds(80,200,100,30);
		p1.setBounds(250,200,100,30);
		q1.setBounds(380,200,100,30);
		m2.setBounds(480,200,100,30);
		p2.setBounds(650,200,100,30);
		q2.setBounds(780,200,100,30);
		d.setBounds(400,50,100,30);
		b2.setBounds(130,750,100,30);		
		add(limage);		
		limage.add(d);
		limage.add(m1);
		limage.add(p1);
		limage.add(q1);
		limage.add(m2);
		limage.add(p2);
		limage.add(q2);
		limage.add(c1);
		limage.add(cb1);
		limage.add(c2);
		limage.add(cb2);
		limage.add(c3);
		limage.add(cb3);
		limage.add(c4);
		limage.add(cb4);
		limage.add(c5);
		limage.add(cb5);
		limage.add(c6);
		limage.add(cb6);
		limage.add(c7);
		limage.add(cb7);
		limage.add(c8);
		limage.add(cb8);
		limage.add(c9);
		limage.add(cb9);
		limage.add(c10);
		limage.add(cb10);
		limage.add(c11);
		limage.add(cb11);
		limage.add(c12);
		limage.add(cb12);
		limage.add(c13);
		limage.add(cb13);
		limage.add(c14);
		limage.add(cb14);
		limage.add(c15);
		limage.add(cb15);
		limage.add(c16);
		limage.add(cb16);
		limage.add(c17);
		limage.add(cb17);
		limage.add(c18);
		limage.add(cb18);
		limage.add(c19);
		limage.add(cb19);
		limage.add(c20);
		limage.add(cb20);
		limage.add(b2);
		this.setSize(1000,960);
	    this.setLayout(null);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
	{
		int total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Melon Cooler--------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Orange Punch--------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Guava Delight-------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Pacific Blue--------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Blue Lagoon---------------------Rs210    ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Green Lust----------------------Rs210    ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Soda Shikanji-------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Purple Rain---------------------Rs210   ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Stawberry Daiquiry--------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Black Current------------------Rs199   ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Butter scotch------------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Choco Loaded-------------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Kitkat Shake-------------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Oreo shake---------------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Mango shake--------------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Caffe Mocha--------------------Rs199   ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+269*x;
			bill.orders1+=s;
			bill.orders1+=" Espresso-----------------------Rs269    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Cappuccino---------------------Rs199    ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+="Roasted Hazelnut---------------Rs249    ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+299*x;
			bill.orders1+=s;
			bill.orders1+=" Americano----------------------Rs299     ";
			bill.orders1+="\n";
		}
		System.out.println(bill.total);
		    this.setVisible(false);
			order d=new order();
	}
}
class italy_veg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_veg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Italianveg.jpeg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Stuffed Shells-----RS250");
		c2=new JCheckBox("White Pesto Pasta----------RS270");
		c3=new JCheckBox("Herby Pasta with Garlic----------RS290");
		c4=new JCheckBox("Spaghetti al Limone----------RS260");
		c5=new JCheckBox("Creamy Pasta--------RS280");
		c6=new JCheckBox("Stuffed Grilled Zucchini--------RS300");
		c7=new JCheckBox("Spinach Pie Parma--------RS270");
		c8=new JCheckBox("Italian Cheese Loaf----------RS290");
		c9=new JCheckBox("Spinach and Artichoke Pizza----------RS310");
	   c10=new JCheckBox("Italian Mushrooms----------RS280");
	   c11=new JCheckBox("Cheese Ravioli-----------RS300");
	   c12=new JCheckBox("Linguine--------RS320");
	   c13=new JCheckBox("Spring Green Risotto--------RS260");
	   c14=new JCheckBox("White Pizza--------RS270");
	   c15=new JCheckBox("Arborio Rice--------RS280");
	   c16=new JCheckBox("Grilled Veggie Pizza--------RS280");
	   c17=new JCheckBox("Cheese Focaccia--------RS300");
	   c18=new JCheckBox("Arugula Sandwiches--------RS260");
	   c19=new JCheckBox("Pasta with Asparagus--------RS290");
	   c20=new JCheckBox("Veggie Lasagna--------RS310");
	   c21=new JCheckBox("Garlic Bread--------RS350");
	   c22=new JCheckBox("Ziti Bake--------RS360");
	   c23=new JCheckBox("Mixed Olive Crostini--------RS390");
	   c24=new JCheckBox("White Pesto Pasta--------RS280");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		limage.setBounds(0,0,1000,1000);
        c1.setBounds(210,150,250,30);
		 cb1.setBounds(470,150,50,20);
		 c2.setBounds(210,200,250,30);
		 cb2.setBounds(470,200,50,20);
		 c3.setBounds(210,250,250,30);
		 cb3.setBounds(470,250,50,20);
		 c4.setBounds(210,300,250,30);
		 cb4.setBounds(470,300,50,20);
		 c5.setBounds(210,350,250,30);
		 cb5.setBounds(470,350,50,20);
		 c6.setBounds(210,400,250,30);
		  cb6.setBounds(470,400,50,20);
		 c7.setBounds(210,450,250,30);
		  cb7.setBounds(470,450,50,20);
		 c8.setBounds(210,500,250,30);
		  cb8.setBounds(470,500,50,20);
		  c9.setBounds(210,550,250,30);
		  cb9.setBounds(470,550,50,20);
		  c10.setBounds(210,600,250,30);
		  cb10.setBounds(470,600,50,20);
		  c11.setBounds(210,650,250,30);
		  cb11.setBounds(470,650,50,20);
		  c12.setBounds(210,700,250,30);
		  cb12.setBounds(470,700,50,20);
		   c13.setBounds(560,150,250,30);
		 cb13.setBounds(820,150,50,20);
		 c14.setBounds(560,200,250,30);
		 cb14.setBounds(820,200,50,20);
		 c15.setBounds(560,250,250,30);
		 cb15.setBounds(820,250,50,20);
		 c16.setBounds(560,300,250,30);
		 cb16.setBounds(820,300,50,20);
		 c17.setBounds(560,350,250,30);
		 cb17.setBounds(820,350,50,20);
		 c18.setBounds(560,400,250,30);
		  cb18.setBounds(820,400,50,20);
		 c19.setBounds(560,450,250,30);
		  cb19.setBounds(820,450,50,20);
		 c20.setBounds(560,500,250,30);
		  cb20.setBounds(820,500,50,20);
		  c21.setBounds(560,550,250,30);
		  cb21.setBounds(820,550,50,20);
		  c22.setBounds(560,600,250,30);
		  cb22.setBounds(820,600,50,20);
		  c23.setBounds(560,650,250,30);
		  cb23.setBounds(820,650,50,20);
		  c24.setBounds(560,700,250,30);
		  cb24.setBounds(820,700,50,20);
		  l1.setBounds(200,100,310,30);
		   l2.setBounds(550,100,310,30);
		 b1.setBounds(500,750,100,30);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		 limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		 limage. add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Stuffed Shells-----RS250   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" White Pesto Pasta----------RS270    ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Herby Pasta with Garlic----------RS290   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti al Limone----------RS260    ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Creamy Pasta--------RS280    ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Stuffed Grilled Zucchini--------RS300    ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Spinach Pie Parma--------RS270    ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Italian Cheese Loaf----------RS290   ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Spinach and Artichoke Pizza----------RS310    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Italian Mushrooms----------RS280   ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Cheese Ravioli-----------RS300   ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+="Linguine--------RS320   ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Spring Green Risotto--------RS260     ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" White Pizza--------RS270     ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Arborio Rice--------RS280    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Veggie Pizza--------RS280    ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Cheese Focaccia--------RS300    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Arugula Sandwiches--------RS260     ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta with Asparagus--------RS290     ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Veggie Lasagna--------RS310     ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Garlic Bread--------RS350      ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Ziti Bake--------RS360     ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Mixed Olive Crostini--------RS390     ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" White Pesto Pasta--------RS280      ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class italy_nonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_nonveg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
	    ImageIcon i=new ImageIcon("F:\\Java Pgms\\Italianveg.jpeg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Lemon Chicken and Pea Gemelli-----RS300");
		c2=new JCheckBox("Spaghetti with Roasted Chicken ----------RS330");
		c3=new JCheckBox("Skillet Chicken----------RS350");
		c4=new JCheckBox("Chicken Osso Buco----------RS370");
		c5=new JCheckBox("Parmesan Chicken Skillet--------RS400");
		c6=new JCheckBox("Chicken Fettuccine--------RS450");
		c7=new JCheckBox("Chicken Florentine Pasta--------RS430");
		c8=new JCheckBox("Caprese Chicken----------RS360");
		c9=new JCheckBox("Chicken Piccata Pasta----------RS350");
	   c10=new JCheckBox("Chicken Parmesan Stuffed Shells----------RS390");
	   c11=new JCheckBox("Grilled Chicken Risotto-----------RS410");
	   c12=new JCheckBox("Pasta with Grilled Chicken--------RS420");
	   c13=new JCheckBox("Mozzarella Chicken--------RS360");
	   c14=new JCheckBox("Chicken Marsala--------RS430");
	   c15=new JCheckBox("Tuscan Chicken Skillet--------RS380");
	   c16=new JCheckBox("Lemon Chicken Piccata--------RS400");
	   c17=new JCheckBox("Tuscan Garlic Chicken--------RS390");
	   c18=new JCheckBox("Balsamic Chicken--------RS385");
	   c19=new JCheckBox("Asiago Chicken Pasta--------RS300");
	   c20=new JCheckBox("White Sauce Pasta Chicken--------RS420");
	   c21=new JCheckBox("Spaghetti Bolognese--------RS430");
	   c22=new JCheckBox("Panzenella--------RS420");
	   c23=new JCheckBox("bruschetta--------RS400");
	   c24=new JCheckBox("Pasta Carbonara--------RS360");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		limage.setBounds(0,0,1000,1000);
		 c1.setBounds(250,150,250,30);
		 cb1.setBounds(510,150,50,20);
		 c2.setBounds(250,200,250,30);
		 cb2.setBounds(510,200,50,20);
		 c3.setBounds(250,250,250,30);
		 cb3.setBounds(510,250,50,20);
		 c4.setBounds(250,300,250,30);
		 cb4.setBounds(510,300,50,20);
		 c5.setBounds(250,350,250,30);
		 cb5.setBounds(510,350,50,20);
		 c6.setBounds(250,400,250,30);
		  cb6.setBounds(510,400,50,20);
		 c7.setBounds(250,450,250,30);
		  cb7.setBounds(510,450,50,20);
		 c8.setBounds(250,500,250,30);
		  cb8.setBounds(510,500,50,20);
		  c9.setBounds(250,550,250,30);
		  cb9.setBounds(510,550,50,20);
		  c10.setBounds(250,600,250,30);
		  cb10.setBounds(510,600,50,20);
		  c11.setBounds(250,650,250,30);
		  cb11.setBounds(510,650,50,20);
		  c12.setBounds(250,700,250,30);
		  cb12.setBounds(510,700,50,20);
		   c13.setBounds(600,150,250,30);
		 cb13.setBounds(860,150,50,20);
		 c14.setBounds(600,200,250,30);
		 cb14.setBounds(860,200,50,20);
		 c15.setBounds(600,250,250,30);
		 cb15.setBounds(860,250,50,20);
		 c16.setBounds(600,300,250,30);
		 cb16.setBounds(860,300,50,20);
		 c17.setBounds(600,350,250,30);
		 cb17.setBounds(860,350,50,20);
		 c18.setBounds(600,400,250,30);
		  cb18.setBounds(860,400,50,20);
		 c19.setBounds(600,450,250,30);
		  cb19.setBounds(860,450,50,20);
		 c20.setBounds(600,500,250,30);
		  cb20.setBounds(860,500,50,20);
		  c21.setBounds(600,550,250,30);
		  cb21.setBounds(860,550,50,20);
		  c22.setBounds(600,600,250,30);
		  cb22.setBounds(860,600,50,20);
		  c23.setBounds(600,650,250,30);
		  cb23.setBounds(860,650,50,20);
		  c24.setBounds(600,700,250,30);
		  cb24.setBounds(860,700,50,20);
		  l1.setBounds(250,100,310,30);
		   l2.setBounds(600,100,310,30);
		b1.setBounds(250,750,100,30);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		  limage.add(c4);
		 limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12); 
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Lemon Chicken and Pea Gemelli-----RS300      ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti with Roasted Chicken ----------RS330     ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Skillet Chicken----------RS350     ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Osso Buco----------RS370      ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Parmesan Chicken Skillet--------RS400     ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+450*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Fettuccine--------RS450     ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Florentine Pasta--------RS430     ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Caprese Chicken----------RS360     ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Piccata Pasta----------RS350    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Parmesan Stuffed Shells----------RS390  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+410*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Chicken Risotto-----------RS410     ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta with Grilled Chicken--------RS420     ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Mozzarella Chicken--------RS360      ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Marsala--------RS430     ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Tuscan Chicken Skillet--------RS380      ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Lemon Chicken Piccata--------RS400     ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Tuscan Garlic Chicken--------RS390     ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+385*x;
			bill.orders1+=s;
			bill.orders1+=" Balsamic Chicken--------RS385     ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Asiago Chicken Pasta--------RS300     ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" White Sauce Pasta Chicken--------RS420     ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti Bolognese--------RS430     ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" Panzenella--------RS420        ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" bruschetta--------RS400       ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta Carbonara--------RS360      ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class mexican_veg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	mexican_veg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Mexicanveg.jpeg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Vegetarian Empanadas-----RS300");
		c2=new JCheckBox("Mexican Bean Soup----------RS310");
		c3=new JCheckBox("Vegan Delight----------RS320");
		c4=new JCheckBox("Casserole----------RS330");
		c5=new JCheckBox("Crispy Potato Tacos--------RS340");
		c6=new JCheckBox("Mexican Lasagna--------RS350");
		c7=new JCheckBox("Black Beans and Rice--------RS360");
		c8=new JCheckBox("Mexican Pizza----------RS370");
		c9=new JCheckBox("Mexican Corn Salad----------RS380");
	   c10=new JCheckBox("Vegetarian Tacos----------RS390");
	   c11=new JCheckBox("Quinoa Salad-----------RS400");
	   c12=new JCheckBox("Cottage Breakfast Burrito--------RS370");
	   c13=new JCheckBox("Mexican Cauli-Rice--------RS400");
	   c14=new JCheckBox("Fuego del Dragon--------RS360");
	   c15=new JCheckBox("Tomato Quesadilla--------RS270");
	   c16=new JCheckBox("Mexican Tortilla Pan--------RS280");
	   c17=new JCheckBox("Speedy Vegan Burrito--------RS290");
	   c18=new JCheckBox("Crispy Tortilla Pizza--------RS350");
	   c19=new JCheckBox("Vegan Mexican Quinoa--------RS290");
	   c20=new JCheckBox("Speedy Gonzales--------RS310");
	   c21=new JCheckBox("Lentil Tacos-------RS350");
	   c22=new JCheckBox("Nachos--------RS360");
	   c23=new JCheckBox("Burrito--------RS390");
	   c24=new JCheckBox("blue corn nachos--------RS280");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		 c1.setBounds(170,150,250,30);
		 cb1.setBounds(430,150,50,20);
		 c2.setBounds(170,200,250,30);
		 cb2.setBounds(430,200,50,20);
		 c3.setBounds(170,250,250,30);
		 cb3.setBounds(430,250,50,20);
		 c4.setBounds(170,300,250,30);
		 cb4.setBounds(430,300,50,20);
		 c5.setBounds(170,350,250,30);
		 cb5.setBounds(430,350,50,20);
		 c6.setBounds(170,400,250,30);
		  cb6.setBounds(430,400,50,20);
		 c7.setBounds(170,450,250,30);
		  cb7.setBounds(430,450,50,20);
		 c8.setBounds(170,500,250,30);
		  cb8.setBounds(430,500,50,20);
		  c9.setBounds(170,550,250,30);
		  cb9.setBounds(430,550,50,20);
		  c10.setBounds(170,600,250,30);
		  cb10.setBounds(430,600,50,20);
		  c11.setBounds(170,650,250,30);
		  cb11.setBounds(430,650,50,20);
		  c12.setBounds(170,700,250,30);
		  cb12.setBounds(430,700,50,20);
		   c13.setBounds(520,150,250,30);
		 cb13.setBounds(780,150,50,20);
		 c14.setBounds(520,200,250,30);
		 cb14.setBounds(780,200,50,20);
		 c15.setBounds(520,250,250,30);
		 cb15.setBounds(780,250,50,20);
		 c16.setBounds(520,300,250,30);
		 cb16.setBounds(780,300,50,20);
		 c17.setBounds(520,350,250,30);
		 cb17.setBounds(780,350,50,20);
		 c18.setBounds(520,400,250,30);
		  cb18.setBounds(780,400,50,20);
		 c19.setBounds(520,450,250,30);
		  cb19.setBounds(780,450,50,20);
		 c20.setBounds(520,500,250,30);
		  cb20.setBounds(780,500,50,20);
		  c21.setBounds(520,550,250,30);
		  cb21.setBounds(780,550,50,20);
		  c22.setBounds(520,600,250,30);
		  cb22.setBounds(780,600,50,20);
		  c23.setBounds(520,650,250,30);
		  cb23.setBounds(780,650,50,20);
		  c24.setBounds(520,700,250,30);
		  cb24.setBounds(780,700,50,20);
		  l1.setBounds(170,100,310,30);
		   l2.setBounds(520,100,310,30);
		 b1.setBounds(570,750,100,30);
		 limage.setBounds(0,0,1000,1000);
		  b1.addActionListener(this);
		add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		 limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		  limage.add(c4);
		  limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24);
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Vegetarian Empanadas-----RS300      ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Bean Soup----------RS310       ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Vegan Delight----------RS320        ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Casserole----------RS330        ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+340*x;
			bill.orders1+=s;
			bill.orders1+=" Crispy Potato Tacos--------RS340      ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Lasagna--------RS350      ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Black Beans and Rice--------RS360     ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Pizza----------RS370       ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Corn Salad----------RS380      ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Vegetarian Tacos----------RS390        ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Quinoa Salad-----------RS400       ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Cottage Breakfast Burrito--------RS370      ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Cauli-Rice--------RS400       ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Fuego del Dragon--------RS360        ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Tomato Quesadilla--------RS270       ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Tortilla Pan--------RS280       ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Speedy Vegan Burrito--------RS290      ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Crispy Tortilla Pizza--------RS350     ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Vegan Mexican Quinoa--------RS290       ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Speedy Gonzales--------RS310      ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Lentil Tacos-------RS350       ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Nachos--------RS360      ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Burrito--------RS390      ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" blue corn nachos--------RS280       ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class mexican_nonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	mexican_nonveg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Mexicanveg.jpeg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Skillet Enchiladas-----RS300");
		c2=new JCheckBox("Margarita Chicken----------RS310");
		c3=new JCheckBox("Chili-Stuffed Poblano----------RS320");
		c4=new JCheckBox("Fantastic Fish Tacos----------RS330");
		c5=new JCheckBox("Blue-Ribbon Beef Nachos--------RS340");
		c6=new JCheckBox("Shrimp Tostadas--------RS350");
		c7=new JCheckBox("Steak Fajitas--------RS360");
		c8=new JCheckBox("Chimichangas----------RS370");
		c9=new JCheckBox("Beef Taco Skillet----------RS380");
	   c10=new JCheckBox("Texas Tacos----------RS390");
	   c11=new JCheckBox("Noodles & Ground Beef-----------RS400");
	   c12=new JCheckBox("Chili Lime Shrimp--------RS370");
	   c13=new JCheckBox("Chicken & Cheese Tortilla Pie--------RS400");
	   c14=new JCheckBox("Chicken Fajita Salad--------RS360");
	   c15=new JCheckBox("Sweet 'n' Spicy Chicken--------RS270");
	   c16=new JCheckBox("Chicken Tostada Salad--------RS280");
	   c17=new JCheckBox("Baked Chimichangas--------RS290");
	   c18=new JCheckBox("Shrimp Gazpacho--------RS350");
	   c19=new JCheckBox("Turkey Posole--------RS290");
	   c20=new JCheckBox("Skirt Steak Tacos--------RS310");
	   c21=new JCheckBox("Chicken Verde-------RS350");
	   c22=new JCheckBox("Mexican Chicken  Pizza--------RS360");
	   c23=new JCheckBox("Chicken Fajitas--------RS390");
	   c24=new JCheckBox("Pinto Bean Tostadas--------RS280");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		 c1.setBounds(170,150,250,30);
		 cb1.setBounds(430,150,50,20);
		 c2.setBounds(170,200,250,30);
		 cb2.setBounds(430,200,50,20);
		 c3.setBounds(170,250,250,30);
		 cb3.setBounds(430,250,50,20);
		 c4.setBounds(170,300,250,30);
		 cb4.setBounds(430,300,50,20);
		 c5.setBounds(170,350,250,30);
		 cb5.setBounds(430,350,50,20);
		 c6.setBounds(170,400,250,30);
		  cb6.setBounds(430,400,50,20);
		 c7.setBounds(170,450,250,30);
		  cb7.setBounds(430,450,50,20);
		 c8.setBounds(170,500,250,30);
		  cb8.setBounds(430,500,50,20);
		  c9.setBounds(170,550,250,30);
		  cb9.setBounds(430,550,50,20);
		  c10.setBounds(170,600,250,30);
		  cb10.setBounds(430,600,50,20);
		  c11.setBounds(170,650,250,30);
		  cb11.setBounds(430,650,50,20);
		  c12.setBounds(170,700,250,30);
		  cb12.setBounds(430,700,50,20);
		   c13.setBounds(520,150,250,30);
		 cb13.setBounds(780,150,50,20);
		 c14.setBounds(520,200,250,30);
		 cb14.setBounds(780,200,50,20);
		 c15.setBounds(520,250,250,30);
		 cb15.setBounds(780,250,50,20);
		 c16.setBounds(520,300,250,30);
		 cb16.setBounds(780,300,50,20);
		 c17.setBounds(520,350,250,30);
		 cb17.setBounds(780,350,50,20);
		 c18.setBounds(520,400,250,30);
		  cb18.setBounds(780,400,50,20);
		 c19.setBounds(520,450,250,30);
		  cb19.setBounds(780,450,50,20);
		 c20.setBounds(520,500,250,30);
		  cb20.setBounds(780,500,50,20);
		  c21.setBounds(520,550,250,30);
		  cb21.setBounds(780,550,50,20);
		  c22.setBounds(520,600,250,30);
		  cb22.setBounds(780,600,50,20);
		  c23.setBounds(520,650,250,30);
		  cb23.setBounds(780,650,50,20);
		  c24.setBounds(520,700,250,30);
		  cb24.setBounds(780,700,50,20);
		  l1.setBounds(170,100,310,30);
		   l2.setBounds(520,100,310,30);
		 b1.setBounds(570,750,100,30);
		 limage.setBounds(0,0,1000,1000);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		 limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		  limage.add(c4);
		  limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24);
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Skillet Enchiladas-----RS300      ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Margarita Chicken----------RS310      ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Chili-Stuffed Poblano----------RS320      ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Fantastic Fish Tacos----------RS330         ";
			bill.orders1+=s+"\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+340*x;
			bill.orders1+=s; 
			bill.orders1+=" Blue-Ribbon Beef Nachos--------RS340         ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Shrimp Tostadas--------RS350        ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Steak Fajitas--------RS360         ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Chimichangas----------RS370         ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Beef Taco Skillet----------RS380        ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Texas Tacos----------RS390          ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Noodles & Ground Beef-----------RS400       ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Chili Lime Shrimp--------RS370        ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken & Cheese Tortilla Pie--------RS400      ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Fajita Salad--------RS360        ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Sweet 'n' Spicy Chicken--------RS270      ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Tostada Salad--------RS280      ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Baked Chimichangas--------RS290         ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Shrimp Gazpacho--------RS350       ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Turkey Posole--------RS290         ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Skirt Steak Tacos--------RS310      ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Verde-------RS350         ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Mexican Chicken  Pizza--------RS360    ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Fajitas--------RS390      ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Pinto Bean Tostadas--------RS280       ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class Chinesenonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery1 x;
	Chinesenonveg()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\chineseback.jpg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Egg And Garlic Fried Rice:-----RS300");
		c2=new JCheckBox("Stir-Fried Chilli Chicken:----------RS310");
		c3=new JCheckBox("Chicken Manchow Soup:----------RS320");
		c4=new JCheckBox("chickken chowmein----------RS330");
		c5=new JCheckBox("Chicken Lollipops--------RS340");
		c6=new JCheckBox("Dragon Chicken--------RS350");
		c7=new JCheckBox("Sweet and sour pork--------RS360");
		c8=new JCheckBox("Kung Pao chicken----------RS370");
		c9=new JCheckBox("Sweet N sour chicken----------RS380");
	   c10=new JCheckBox("Butter Garlic Prawns----------RS390");
	   c11=new JCheckBox("Diced Chicken-----------RS400");
	   c12=new JCheckBox("Egg Drop Soup--------RS370");
	   c13=new JCheckBox("Deep Fried Wontons--------RS400");
	   c14=new JCheckBox(" Chicken Balls--------RS360");
	   c15=new JCheckBox("Pork Ribs--------RS270");
	   c16=new JCheckBox("Chicken Wings--------RS280");
	   c17=new JCheckBox("Prawn Toast--------RS290");
	   c18=new JCheckBox("Crispy Crab--------RS350");
	   c19=new JCheckBox("Grilled Lobster--------RS290");
	   c20=new JCheckBox("Chicken Salad--------RS310");
	   c21=new JCheckBox("Prawn Potstickers-------RS350");
	   c22=new JCheckBox("Chive Potstickers--------RS360");
	   c23=new JCheckBox("Chicken Drumstick--------RS390");
	   c24=new JCheckBox("Tea Smoked Chicken--------RS280");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		 c1.setBounds(150,150,250,30);
		 cb1.setBounds(410,150,50,20);
		 c2.setBounds(150,200,250,30);
		 cb2.setBounds(410,200,50,20);
		 c3.setBounds(150,250,250,30);
		 cb3.setBounds(410,250,50,20);
		 c4.setBounds(150,300,250,30);
		 cb4.setBounds(410,300,50,20);
		 c5.setBounds(150,350,250,30);
		 cb5.setBounds(410,350,50,20);
		 c6.setBounds(150,400,250,30);
		  cb6.setBounds(410,400,50,20);
		 c7.setBounds(150,450,250,30);
		  cb7.setBounds(410,450,50,20);
		 c8.setBounds(150,500,250,30);
		  cb8.setBounds(410,500,50,20);
		  c9.setBounds(150,550,250,30);
		  cb9.setBounds(410,550,50,20);
		  c10.setBounds(150,600,250,30);
		  cb10.setBounds(410,600,50,20);
		  c11.setBounds(150,650,250,30);
		  cb11.setBounds(410,650,50,20);
		  c12.setBounds(150,700,250,30);
		  cb12.setBounds(410,700,50,20);
		   c13.setBounds(500,150,250,30);
		 cb13.setBounds(760,150,50,20);
		 c14.setBounds(500,200,250,30);
		 cb14.setBounds(760,200,50,20);
		 c15.setBounds(500,250,250,30);
		 cb15.setBounds(760,250,50,20);
		 c16.setBounds(500,300,250,30);
		 cb16.setBounds(760,300,50,20);
		 c17.setBounds(500,350,250,30);
		 cb17.setBounds(760,350,50,20);
		 c18.setBounds(500,400,250,30);
		  cb18.setBounds(760,400,50,20);
		 c19.setBounds(500,450,250,30);
		  cb19.setBounds(760,450,50,20);
		 c20.setBounds(500,500,250,30);
		  cb20.setBounds(760,500,50,20);
		  c21.setBounds(500,550,250,30);
		  cb21.setBounds(760,550,50,20);
		  c22.setBounds(500,600,250,30);
		  cb22.setBounds(760,600,50,20);
		  c23.setBounds(500,650,250,30);
		  cb23.setBounds(760,650,50,20);
		  c24.setBounds(500,700,250,30);
		  cb24.setBounds(760,700,50,20);
		  l1.setBounds(150,100,310,30);
		   l2.setBounds(500,100,310,30);
		  b1.setBounds(570,750,100,30);
		  limage.setBounds(0,0,1000,960);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		limage.add(b1);
		limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		 limage.add(c4);
		  limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);	  
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Egg And Garlic Fried Rice:-----RS300        ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Stir-Fried Chilli Chicken:----------RS310        ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Manchow Soup:----------RS320        ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" chickken chowmein----------RS330        ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+340*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Lollipop--------RS340        ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Dragon Chicken--------RS350        ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Sweet and sour pork--------RS360        ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Kung Pao chicken----------RS370        ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Sweet N sour chicken----------RS380        ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Butter Garlic Prawns----------RS390        ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Diced Chicken-----------RS400        ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Egg Drop Soup--------RS370        ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Deep Fried Wontons--------RS400        ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Balls--------RS360        ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Pork Ribs--------RS270        ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Wings--------RS280        ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Prawn Toast--------RS290        ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Crispy Crab--------RS350        ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Lobster--------RS290        ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Salad--------RS310        ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Prawn Potstickers-------RS350        ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Chive Potstickers--------RS360        ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Drumstick--------RS390        ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Tea Smoked Chicken--------RS280        ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class Chinese extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery z;
	Chinese()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\chineseback.jpg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Chinese Broccoli-----RS250");
		c2=new JCheckBox("Chinese Cucumber Salad ----------RS260");
		c3=new JCheckBox("Tofu and Broccoli----------RS270");
		c4=new JCheckBox("Garlic Sesame Noodles----------RS280");
		c5=new JCheckBox("Lo Mein--------RS290");
		c6=new JCheckBox("Vegetable Chow Mein--------RS300");
		c7=new JCheckBox("Sichuan Green Beans--------RS320");
		c8=new JCheckBox("Chinese Eggplant----------RS310");
		c9=new JCheckBox("Chinese Cabbage Salad----------RS330");
	   c10=new JCheckBox("Veg Fried Rice----------RS390");
	   c11=new JCheckBox("East West Spring Rolls-----------RS350");
	   c12=new JCheckBox("Stir Fried Tofu With Rice--------RS360");
	   c13=new JCheckBox("Chilli Paneer Dry--------RS270");
	   c14=new JCheckBox("Crunchy Iceberg Dumpling--------RS290");
	   c15=new JCheckBox("Veg Manchurian--------RS300");
	   c16=new JCheckBox("Honey Chilli Potato--------RS230");
	   c17=new JCheckBox("Deal Sesame Noodles--------RS250");
	   c18=new JCheckBox("Chinese Tacos--------RS320");
	   c19=new JCheckBox("Dry Chilli Baby Corn--------RS300");
	   c20=new JCheckBox("Black Bean Noodles--------RS240");
	   c21=new JCheckBox("Spicy Chilli Garlic Noodles--------RS250");
	   c22=new JCheckBox("Tofu fried rice--------RS260");
	   c23=new JCheckBox("Chinese vegan pancakes--------RS240");
	   c24=new JCheckBox("Hot and sour soup--------RS230");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
         limage.setBounds(0,0,1000,960);
		 c1.setBounds(150,150,250,30);
		 cb1.setBounds(410,150,50,20);
		 c2.setBounds(150,200,250,30);
		 cb2.setBounds(410,200,50,20);
		 c3.setBounds(150,250,250,30);
		 cb3.setBounds(410,250,50,20);
		 c4.setBounds(150,300,250,30);
		 cb4.setBounds(410,300,50,20);
		 c5.setBounds(150,350,250,30);
		 cb5.setBounds(410,350,50,20);
		 c6.setBounds(150,400,250,30);
		  cb6.setBounds(410,400,50,20);
		 c7.setBounds(150,450,250,30);
		  cb7.setBounds(410,450,50,20);
		 c8.setBounds(150,500,250,30);
		  cb8.setBounds(410,500,50,20);
		  c9.setBounds(150,550,250,30);
		  cb9.setBounds(410,550,50,20);
		  c10.setBounds(150,600,250,30);
		  cb10.setBounds(410,600,50,20);
		  c11.setBounds(150,650,250,30);
		  cb11.setBounds(410,650,50,20);
		  c12.setBounds(150,700,250,30);
		  cb12.setBounds(410,700,50,20);
		   c13.setBounds(500,150,250,30);
		 cb13.setBounds(760,150,50,20);
		 c14.setBounds(500,200,250,30);
		 cb14.setBounds(760,200,50,20);
		 c15.setBounds(500,250,250,30);
		 cb15.setBounds(760,250,50,20);
		 c16.setBounds(500,300,250,30);
		 cb16.setBounds(760,300,50,20);
		 c17.setBounds(500,350,250,30);
		 cb17.setBounds(760,350,50,20);
		 c18.setBounds(500,400,250,30);
		  cb18.setBounds(760,400,50,20);
		 c19.setBounds(500,450,250,30);
		  cb19.setBounds(760,450,50,20);
		 c20.setBounds(500,500,250,30);
		  cb20.setBounds(760,500,50,20);
		  c21.setBounds(500,550,250,30);
		  cb21.setBounds(760,550,50,20);
		  c22.setBounds(500,600,250,30);
		  cb22.setBounds(760,600,50,20);
		  c23.setBounds(500,650,250,30);
		  cb23.setBounds(760,650,50,20);
		  c24.setBounds(500,700,250,30);
		  cb24.setBounds(760,700,50,20);
		  l1.setBounds(150,100,310,30);
		   l2.setBounds(500,100,310,30);
		 b1.setBounds(570,750,100,30);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		limage.add(b1);
		limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		 limage.add(c4);
		  limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);	  
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese Broccoli-----RS250  ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese Cucumber Salad ----------RS260  ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Tofu and Broccoli----------RS270  ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Garlic Sesame Noodles----------RS280  ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Lo Mein--------RS290  ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Vegetable Chow Mein--------RS300  ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Sichuan Green Beans--------RS320  ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese Eggplant----------RS310  ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese Cabbage Salad----------RS330  ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+="Veg Fried Rice----------RS390  ";
			bill.orders1+=s+"\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" East West Spring Rolls-----------RS350  ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Stir Fried Tofu With Rice--------RS360  ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Chilli Paneer Dry--------RS270  ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Crunchy Iceberg Dumpling--------RS290  ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Veg Manchurian--------RS300  ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Honey Chilli Potato--------RS230  ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Deal Sesame Noodles--------RS250  ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese Tacos--------RS320  ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Dry Chilli Baby Corn--------RS300  ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+240*x;
			bill.orders1+=s;
			bill.orders1+=" Black Bean Noodles--------RS240  ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Spicy Chilli Garlic Noodles--------RS250  ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Tofu fried rice--------RS260  ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+240*x;
			bill.orders1+=s;
			bill.orders1+=" Chinese vegan pancakes--------RS240  ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Hot and sour soup--------RS230  ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class Indianveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery v;
	Indianveg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\indianveg.jpeg");
		limage=new JLabel(i);
		c1=new JCheckBox("Garlic Mushroom-----RS190");
		c2=new JCheckBox("Malai Kofta----------RS170");
		c3=new JCheckBox("Kathi Rolls----------RS230");
		c4=new JCheckBox("Litti Choka----------RS220");
		c5=new JCheckBox("Panner Sathe--------RS130");
		c6=new JCheckBox("Panner Chilli--------RS150");
		c7=new JCheckBox("Panner Tikka--------RS150");
		c8=new JCheckBox("Panner Roll----------RS110");
		c9=new JCheckBox("Spring Roll----------RS130");
	   c10=new JCheckBox("Manchurian----------RS175");
	   c11=new JCheckBox("Veg Crispy-----------RS160");
	   c12=new JCheckBox("Manchaw Soup--------RS130");
	   c13=new JCheckBox("Dal-Fry-----------------------RS180");
	   c14=new JCheckBox("Stuffed Mushrooms-----------RS170");
	   c15=new JCheckBox("Paneer-Butter-Masala--------RS210");
	   c16=new JCheckBox("Rajma-MASALA----------------RS200");
	   c17=new JCheckBox("Kadai-Paneer----------------RS220");
	   c18=new JCheckBox("Dal-Khichdi-----------------RS200");
	   c19=new JCheckBox("Dal-Makhani-----------------RS190");
	   c20=new JCheckBox("Veg-Kurma-------------------RS250");
	   c21=new JCheckBox("Aloo-Gobi-------------------RS230");
	   c22=new JCheckBox("ROTI--------------------------RS70");
	   c23=new JCheckBox("Naan--------------------------RS90");
	   c24=new JCheckBox("Jeera-Rice--------------------RS80");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
	     limage.setBounds(0,0,1000,1000);
		 c1.setBounds(300,150,250,30);
		 cb1.setBounds(560,150,50,20);
		 c2.setBounds(300,200,250,30);
		 cb2.setBounds(560,200,50,20);
		 c3.setBounds(300,250,250,30);
		 cb3.setBounds(560,250,50,20);
		 c4.setBounds(300,300,250,30);
		 cb4.setBounds(560,300,50,20);
		 c5.setBounds(300,350,250,30);
		 cb5.setBounds(560,350,50,20);
		 c6.setBounds(300,400,250,30);
		  cb6.setBounds(560,400,50,20);
		 c7.setBounds(300,450,250,30);
		  cb7.setBounds(560,450,50,20);
		 c8.setBounds(300,500,250,30);
		  cb8.setBounds(560,500,50,20);
		  c9.setBounds(300,550,250,30);
		  cb9.setBounds(560,550,50,20);
		  c10.setBounds(300,600,250,30);
		  cb10.setBounds(560,600,50,20);
		  c11.setBounds(300,650,250,30);
		  cb11.setBounds(560,650,50,20);
		  c12.setBounds(300,700,250,30);
		  cb12.setBounds(560,700,50,20);
		  c13.setBounds(650,150,250,30);
		 cb13.setBounds(910,150,50,20);
		 c14.setBounds(650,200,250,30);
		 cb14.setBounds(910,200,50,20);
		 c15.setBounds(650,250,250,30);
		 cb15.setBounds(910,250,50,20);
		 c16.setBounds(650,300,250,30);
		 cb16.setBounds(910,300,50,20);
		 c17.setBounds(650,350,250,30);
		 cb17.setBounds(910,350,50,20);
		 c18.setBounds(650,400,250,30);
		  cb18.setBounds(910,400,50,20);
		 c19.setBounds(650,450,250,30);
		  cb19.setBounds(910,450,50,20);
		 c20.setBounds(650,500,250,30);
		  cb20.setBounds(910,500,50,20);
		  c21.setBounds(650,550,250,30);
		  cb21.setBounds(910,550,50,20);
		  c22.setBounds(650,600,250,30);
		  cb22.setBounds(910,600,50,20);
		  c23.setBounds(650,650,250,30);
		  cb23.setBounds(910,650,50,20);
		  c24.setBounds(650,700,250,30);
		  cb24.setBounds(910,700,50,20);
		  l1.setBounds(300,100,310,30);
		   l2.setBounds(650,100,310,30);
		 b1.setBounds(570,750,100,30);
		 b1.addActionListener(this);
		 add(limage);
		 limage.add(l1);
		 limage.add(l2);
		 limage.add(c1);
		 limage.add(c2);
		 limage.add(c3);
		 limage.add(c4);
		 limage.add(c5);
		 limage.add(c6);
		 limage.add(c7);
		 limage.add(c8);
		 limage.add(c9);
		 limage.add(c10);
		 limage.add(c11);
		 limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24);
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  limage.add(b1);
		  this.setLayout(null);
		  this.setSize(1000,960);
		  this.setTitle("Hotel");
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+190*x;
			bill.orders1+=s;
			bill.orders1+=" Garlic Mushroom-----RS190  ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+170*x;
			bill.orders1+=s;
			bill.orders1+=" Malai Kofta----------RS170  ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Kathi Rolls----------RS230  ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+220*x;
			bill.orders1+=s;
			bill.orders1+=" Litti Choka----------RS220  ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Panner Sathe--------RS130  ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+150*x;
			bill.orders1+=s;
			bill.orders1+=" Panner Chilli--------RS150  ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+150*x;
			bill.orders1+=s;
			bill.orders1+=" Panner Tikka--------RS150  ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+110*x;
			bill.orders1+=s;
			bill.orders1+=" Panner Roll----------RS110  ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Spring Roll----------RS130  ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+175*x;
			bill.orders1+=s;
			bill.orders1+=" Manchurian----------RS175  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+160*x;
			bill.orders1+=s;
			bill.orders1+=" Veg Crispy-----------RS160  ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Manchaw Soup--------RS130  ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+180*x;
			bill.orders1+=s;
			bill.orders1+=" Dal-Fry-----------------------RS180  ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+170*x;
			bill.orders1+=s;
			bill.orders1+=" Stuffed Mushrooms-----------RS170  ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer-Butter-Masala--------RS210  ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+200*x;
			bill.orders1+=s;
			bill.orders1+=" Rajma-MASALA----------------RS200  ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+220*x;
			bill.orders1+=s;
			bill.orders1+=" Kadai-Paneer----------------RS220  ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+200*x;
			bill.orders1+=s;
			bill.orders1+=" Dal-Khichdi-----------------RS200  ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+190*x;
			bill.orders1+=s;
			bill.orders1+=" Dal-Makhani-----------------RS190  ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Veg-Kurma-------------------RS250  ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Aloo-Gobi-------------------RS230  ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+70*x;
			bill.orders1+=s;
			bill.orders1+=" ROTI--------------------------RS70  ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+90*x;
			bill.orders1+=s;
			bill.orders1+=" Naan--------------------------RS90  ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+80*x;
			bill.orders1+=s;
			bill.orders1+=" Jeera-Rice--------------------RS80  ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class Indiannonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	delivery1 r;
	Indiannonveg()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\indianveg.jpeg");
		limage=new JLabel(i); 
		c1=new JCheckBox("Macher Jhol-----RS300");
		c2=new JCheckBox("Machcha Besarou----------RS310");
		c3=new JCheckBox("Parsi Fish Curry----------RS320");
		c4=new JCheckBox("Hilsa Fish Curry----------RS330");
		c5=new JCheckBox("Assamese Fish Curry--------RS340");
		c6=new JCheckBox("Chepala Iguru--------RS350");
		c7=new JCheckBox("Meen Curry--------RS360");
		c8=new JCheckBox("Goan Fish Head Curry----------RS370");
		c9=new JCheckBox("Bihari Fish Curry----------RS380");
	   c10=new JCheckBox("Malabari Prawn Curry----------RS390");
	   c11=new JCheckBox("Andhra Crab Meat Masala-----------RS400");
	   c12=new JCheckBox("Rogan Josh--------RS370");
	   c13=new JCheckBox("Gongura Mamsam--------RS400");
	   c14=new JCheckBox("Nihari Mutton--------RS360");
	   c15=new JCheckBox("Champaran Mutton Curry--------RS270");
	   c16=new JCheckBox("Mutton Kofte--------RS280");
	   c17=new JCheckBox("Laal Maas--------RS290");
	   c18=new JCheckBox("Chicken Vindaloo--------RS350");
	   c19=new JCheckBox("Chicken Kolhapuri--------RS290");
	   c20=new JCheckBox("Chicken Korma--------RS310");
	   c21=new JCheckBox("chicken tikka--------RS350");
	   c22=new JCheckBox("chicken handi--------RS360");
	   c23=new JCheckBox("chicken platter--------RS390");
	   c24=new JCheckBox("Brain--------RS280");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		 c1.setBounds(300,150,250,30);
		 cb1.setBounds(560,150,50,20);
		 c2.setBounds(300,200,250,30);
		 cb2.setBounds(560,200,50,20);
		 c3.setBounds(300,250,250,30);
		 cb3.setBounds(560,250,50,20);
		 c4.setBounds(300,300,250,30);
		 cb4.setBounds(560,300,50,20);
		 c5.setBounds(300,350,250,30);
		 cb5.setBounds(560,350,50,20);
		 c6.setBounds(300,400,250,30);
		  cb6.setBounds(560,400,50,20);
		 c7.setBounds(300,450,250,30);
		  cb7.setBounds(560,450,50,20);
		 c8.setBounds(300,500,250,30);
		  cb8.setBounds(560,500,50,20);
		  c9.setBounds(300,550,250,30);
		  cb9.setBounds(560,550,50,20);
		  c10.setBounds(300,600,250,30);
		  cb10.setBounds(560,600,50,20);
		  c11.setBounds(300,650,250,30);
		  cb11.setBounds(560,650,50,20);
		  c12.setBounds(300,700,250,30);
		  cb12.setBounds(560,700,50,20);
		  c13.setBounds(650,150,250,30);
		 cb13.setBounds(910,150,50,20);
		 c14.setBounds(650,200,250,30);
		 cb14.setBounds(910,200,50,20);
		 c15.setBounds(650,250,250,30);
		 cb15.setBounds(910,250,50,20);
		 c16.setBounds(650,300,250,30);
		 cb16.setBounds(910,300,50,20);
		 c17.setBounds(650,350,250,30);
		 cb17.setBounds(910,350,50,20);
		 c18.setBounds(650,400,250,30);
		  cb18.setBounds(910,400,50,20);
		 c19.setBounds(650,450,250,30);
		  cb19.setBounds(910,450,50,20);
		 c20.setBounds(650,500,250,30);
		  cb20.setBounds(910,500,50,20);
		  c21.setBounds(650,550,250,30);
		  cb21.setBounds(910,550,50,20);
		  c22.setBounds(650,600,250,30);
		  cb22.setBounds(910,600,50,20);
		  c23.setBounds(650,650,250,30);
		  cb23.setBounds(910,650,50,20);
		  c24.setBounds(650,700,250,30);
		  cb24.setBounds(910,700,50,20);
		  l1.setBounds(300,100,310,30);
		   l2.setBounds(650,100,310,30);
		 b1.setBounds(570,750,100,30);
		 limage.setBounds(0,0,1000,1000);
		  b1.addActionListener(this);
		 add(limage);
		 limage.add(l1);
		 limage.add(l2);
		limage.add(b1);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		  limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24);
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Macher Jhol-----RS300  ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Machcha Besarou----------RS310  ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Parsi Fish Curry----------RS320  ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Hilsa Fish Curry----------RS330  ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+340*x;
			bill.orders1+=s;
			bill.orders1+=" Assamese Fish Curry--------RS340  ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chepala Iguru--------RS350  ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Meen Curry--------RS360  ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Goan Fish Head Curry----------RS370  ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Bihari Fish Curry----------RS380  ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Malabari Prawn Curry----------RS390  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Andhra Crab Meat Masala-----------RS400  ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Rogan Josh--------RS370  ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Gongura Mamsam--------RS400  ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Nihari Mutton--------RS360  ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Champaran Mutton Curry--------RS270  ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Mutton Kofte--------RS280  ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Laal Maas--------RS290  ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Vindaloo--------RS350  ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Kolhapuri--------RS290  ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Korma--------RS310  ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" chicken tikka--------RS350  ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" chicken handi--------RS360  ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" chicken platter--------RS390  ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Brain--------RS280  ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class delivery1 extends JFrame implements ActionListener
{
	JButton t1,t2,t3,t4,t5;
	JLabel limage;
	order previous;
	delivery1()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Cuisinefinal.jpg");
		limage=new JLabel(i); 
		t1=new JButton("Indian");
		t2=new JButton("Chinese");
		t3=new JButton("Mexican");
		t4=new JButton("Italian");
		t5=new JButton("Prev");
		t1.setBounds(400,100,200,50);
		t2.setBounds(400,200,200,50);
		t3.setBounds(400,300,200,50);
		t4.setBounds(400,400,200,50);
		t5.setBounds(200,480,100,30);
		limage.setBounds(0,0,1000,1000);
		add(limage);
		limage.add(t1);
		limage.add(t2);
		limage.add(t3);
		limage.add(t4);
		limage.add(t5);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					order o =new order();
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indiannonveg s=new Indiannonveg();
		}
		if(e.getActionCommand().equals("Chinese"))
		{
			this.setVisible(false);
			Chinesenonveg h=new Chinesenonveg();
		}
		if(e.getActionCommand().equals("Mexican"))
		{
			this.setVisible(false);
			mexican_nonveg mn=new mexican_nonveg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
			italy_nonveg in=new italy_nonveg();
		}
	}
}
class delivery extends JFrame implements ActionListener
{
	JButton t1,t2,t3,t4,t5;
	JLabel limage;
	order previous;
	delivery()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Cuisinefinal.jpg");
		limage=new JLabel(i); 
		t1=new JButton("Indian");
		t2=new JButton("Chinese");
		t3=new JButton("Mexican");
		t4=new JButton("Italian");
		t5=new JButton("Prev");
		t1.setBounds(400,100,200,50);
		t2.setBounds(400,200,200,50);
		t3.setBounds(400,300,200,50);
		t4.setBounds(400,400,200,50);
		t5.setBounds(200,480,100,30);
		limage.setBounds(0,0,1000,960);
		add(limage);
		limage.add(t1);
		limage.add(t2);
		limage.add(t3);
		limage.add(t4);
		limage.add(t5);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					order o=new order();	
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indianveg z=new Indianveg();
		}
		if(e.getActionCommand().equals("Chinese"))
		{
			this.setVisible(false);
		    Chinese c=new Chinese();
		}
		if(e.getActionCommand().equals("Mexican"))
		{
			this.setVisible(false);
			mexican_veg mv=new mexican_veg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
		    italy_veg iv=new italy_veg();
		}
	}
}
class order extends JFrame implements ActionListener
{
	JButton d1,d2,d3,d4,d5,d6;
	JLabel limage;
	market previous;
	order()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\vnv.jpeg");
		limage=new JLabel(i); 
		d1=new JButton("VEG");
		d2=new JButton("NON-VEG");
		d3=new JButton("DESSERTS");
		d4=new JButton("DRINKS");
		d5=new JButton("Prev");
		d6=new JButton("Generate Bill");
		d1.setBounds(400,200,200,50);
		d2.setBounds(400,300,200,50);
		d3.setBounds(400,400,200,50);
		d4.setBounds(400,500,200,50);
		d5.setBounds(200,600,100,30);
		d6.setBounds(720,600,150,30);
		limage.setBounds(0,0,1000,1000);
		add(limage);
		limage.add(d1);
		limage.add(d2);
		limage.add(d3);
		limage.add(d4);
		limage.add(d5);
		limage.add(d6);
	    d1.addActionListener(this);
		d5.addActionListener(this);
		d2.addActionListener(this);
		d3.addActionListener(this);
		d4.addActionListener(this);
		d6.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					market m=new market();
				}
		if(e.getActionCommand().equals("VEG"))
		{
			this.setVisible(false);
		   delivery d=new delivery();
		}
		if(e.getActionCommand().equals("NON-VEG"))
		{
			this.setVisible(false);
		    delivery1 d=new delivery1();
		}
		
		if(e.getActionCommand().equals("DESSERTS"))
		{
			this.setVisible(false);
			Desserts d=new Desserts();
		}
		if(e.getActionCommand().equals("DRINKS"))
		{
			 this.setVisible(false);
			 Drinks dr=new Drinks();
		}
		if(e.getActionCommand().equals("Generate Bill"))
		{
			 this.setVisible(false);
			 bill b=new bill();
		}		
	}
}
class market extends JFrame implements ActionListener
{
	JButton j1,j2,j3,j4,j5;
	JLabel limage;
	market()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\Hotels.jpg");
		limage=new JLabel(i); 
		j1=new JButton("Bombay Taqueria");
		j2=new JButton("Ralphys");
		j3=new JButton("Solitaire");
		j4=new JButton("Euthopia");
		j5=new JButton("Ummrao");
		j1.setBounds(400,100,200,50);
		j2.setBounds(400,200,200,50);
		j3.setBounds(400,300,200,50);
		j4.setBounds(400,400,200,50);
		j5.setBounds(400,500,200,50);
		limage.setBounds(0,0,1000,1000);
		add(limage);	
		limage.add(j1);
		limage.add(j2);
		limage.add(j3);
		limage.add(j4);
		limage.add(j5);
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Bombay Taqueria"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Ralphys"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Euthopia"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Solitaire"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Ummrao"))
				{
					this.setVisible(false);
					order o=new order();
				}	
	}
}
class Test extends JFrame implements ActionListener
{
	JLabel u1,p1,limage;
	JTextField f1;
	JButton b1;
	JPasswordField pass;
	Test()
	{
		ImageIcon i=new ImageIcon("F:\\Java Pgms\\loginpage.jpeg");
		limage=new JLabel(i); 
		u1=new JLabel("USERNAME");
		p1=new JLabel("PASSWORD");
		f1=new JTextField();
		b1=new JButton("Login");
		pass=new JPasswordField();
		u1.setForeground(Color.white);
		p1.setForeground(Color.white);
		limage.setBounds(0,0,1000,1000);
		f1.setBounds(450,300,200,30);
		u1.setBounds(300,300,150,30);
		p1.setBounds(300,350,150,30);
		pass.setBounds(450,350,200,30);
		b1.setBounds(400,450,100,30);
		limage.add(pass);
		limage.add(p1);
		limage.add(u1);
		limage.add(f1);
		limage.add(b1);
         b1.addActionListener(this);
		 add(limage);
		 this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String username=f1.getText();
		String passw=pass.getText();
		if(username.equals("admin")&&passw.equals("abc"))
		{
			if(e.getActionCommand().equals("Login"))
				{
					this.setVisible(false);
					market m=new market();
				}
		}
		else if(username.equals("sahil")&&passw.equals("123"))
		{
			if(e.getActionCommand().equals("Login"))
				{
					this.setVisible(false);
						market m=new market();           
				}
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Incorrect Username or password");
		}
	}
	public static void main(String args[])
	{
		Test T=new Test();
	}
}