package Calculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalGUI extends defineCalculator{
	
	public static void main(String args[])
	{
		CalGUI obj =new CalGUI();
		
		obj.addFrame();
		
		obj.addsign();
		
		obj.line789();
		
		obj.line456();

		obj.line123();
		
		obj.line0();
		
		obj.operators();
		
		obj.getResult();
	}
}

	
class defineCalculator{
		
		JFrame frame=new JFrame();
		Panel panel=new Panel();
		
		JLabel l1,l2,header;
		JTextField text;
		JButton c,sign,cut,div,mul,sum,sub,equal,decimal,doublezero,zero,one,two,three,four,five,six,seven,eight,nine;
		int x,y,width,height;

	protected void getResult() {
		// 
		
		Operations oper=new Operations();
		
		equal=new JButton("=");
		equal.setEnabled(true);
		equal.setBounds(308,520,60,50);
		panel.add(equal);

		equal.addActionListener(eq->{try {
									equalOperation();}
									catch(Exception e) {
										if(!(text.getText().equalsIgnoreCase("")))l1.setText(text.getText());}
									l2.setText("");
									text.setText("");
									});
		
	}

	protected void operators() 
	{
		// TODO Auto-generated method stub
		Operations obj=new Operations();
		
		x=308;y=200;width=60;height=50;
		
		sum=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("X");
		div=new JButton("/");
		
		sum.setVisible(true);
		sub.setVisible(true);
		mul.setVisible(true);
		div.setVisible(true);
		
		div.setBounds(x, y, width, height);y+=80;
		mul.setBounds(x, y, width, height);y+=80;
		sub.setBounds(x, y, width, height);y+=80;
		sum.setBounds(x, y, width, height);
		
		panel.add(sub);
		panel.add(sum);
		panel.add(mul);
		panel.add(div);
		
		sum.addActionListener(su->{operatorBehaviour("+");});
		
		sub.addActionListener(su->{operatorBehaviour("-");});
		
		mul.addActionListener(mu->{operatorBehaviour("X");});
		
		div.addActionListener(di->{operatorBehaviour("/");});
	}

	protected void addsign() {
		// TODO Auto-generated method stub
		x=32;y=200;width=60;height=50;
		
		c=new JButton("C");
		sign=new JButton("+/-");
		cut=new JButton("<x");
		
		c.setVisible(true);
		sign.setVisible(true);
		cut.setVisible(true);
		
		c.setBounds(x, y, width, height);x+=92;
		sign.setBounds(x, y, width, height);x+=92;
		cut.setBounds(x, y, width, height);
		
		panel.add(c);
		panel.add(sign);
		panel.add(cut);
		
		c.addActionListener(de->{text.setText("");l1.setText("");l2.setText("");});
		
		sign.addActionListener(si->{
										if(!text.getText().equalsIgnoreCase(""))
										{
											text.setText(signOperation(text.getText()));
										}
										else
										{
											l1.setText(signOperation(l1.getText()));
										}
									});
		
		cut.addActionListener(cu->{text.setText(""+((Integer.parseInt(text.getText().trim()))/10));});
	}

	protected void line789() {
		// TODO Auto-generated method stub
		x=32;y=280;width=60;height=50;
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		
		seven.setVisible(true);
		eight.setVisible(true);
		nine.setVisible(true);
		
		seven.setBounds(x, y, width, height);x+=92;
		eight.setBounds(x, y, width, height);x+=92;
		nine.setBounds(x, y, width, height);
		
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		
		seven.addActionListener(se->{text.setText(text.getText()+"7");});
		eight.addActionListener(ei->{text.setText(text.getText()+"8");});
		nine.addActionListener(ni->{text.setText(text.getText()+"9");});
	}

	protected void addFrame()
	{
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		
		header=new JLabel("Welcome Calculator");
		header.setLayout(new FlowLayout());
		header.setBounds(120, 10, 160, 20);
		header.setForeground(Color.getHSBColor(100f, 50f, 25f));
		panel.add(header);
		
		l1=new JLabel();
		l2=new JLabel();
//		l3=new JLabel();
		
		l1.setBounds(25, 40, 100, 50);
		l2.setBounds(125, 40, 50, 50);
//		l3.setBounds(275, 40, 100, 50);
		
		l1.setForeground(Color.getHSBColor(100f, 50f, 25f));
		l2.setForeground(Color.getHSBColor(100f, 50f, 25f));
		l2.setForeground(Color.getHSBColor(100f, 50f, 25f));
		
		panel.add(l1);
		panel.add(l2);
//		panel.add(l3);
		
		text=new JTextField();
		text.setEditable(false);
		text.setBounds(32,120,336,50);
		panel.add(text);
	}
	
	protected void line0()
	{
		y=520;
		width=60;
		height=50;
		x=32;
		
		zero=new JButton("0");
		zero.setVisible(true);
		zero.setBounds(x,y,width,height);
		panel.add(zero);
		
		zero.addActionListener(ze->{text.setText(text.getText()+0);});
		x+=92;
		
		doublezero=new JButton("00");
		doublezero.setVisible(true);
		doublezero.setBounds(x,y,width,height);
		panel.add(doublezero);
		
		doublezero.addActionListener(dze->{text.setText(text.getText()+"00");});
		x+=92;
		
		decimal=new JButton(".");
		decimal.setVisible(true);
		decimal.setBounds(x,y,width,height);
		panel.add(decimal);
		
//		decimal.addActionListener(dec->{text.setText(text.getText()+".");});
	}

	protected void line123()
	{
		x=32;y=440;width=60;height=50;
		
		one=new JButton("1");
		one.setVisible(true);
		one.setBounds(x, y, width, height);
		panel.add(one);
		
		one.addActionListener(on->{text.setText(text.getText()+"1");});
		x+=92;
		
		two=new JButton("2");
		two.setVisible(true);
		two.setBounds(x, y, width, height);
		panel.add(two);
		
		two.addActionListener(tw->{text.setText(text.getText()+"2");});
		x+=92;
		
		three=new JButton("3");
		three.setVisible(true);
		three.setBounds(x, y, width, height);
		panel.add(three);
		
		three.addActionListener(th->{text.setText(text.getText()+"3");});
	}
	
	protected void line456()
	{
		x=32;y=360;width=60;height=50;
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		
		four.setVisible(true);
		five.setVisible(true);
		six.setVisible(true);
		
		four.setBounds(x,y,width,height);x+=92;
		five.setBounds(x, y, width, height);x+=92;
		six.setBounds(x, y, width, height);
		
		panel.add(four);
		panel.add(five);
		panel.add(six);
		
		four.addActionListener(fo->{text.setText(text.getText()+"4");});
		five.addActionListener(fi->{text.setText(text.getText()+"5");});
		six.addActionListener(si->{text.setText(text.getText()+"6");});
	}

	protected void equalOperation()
	{
		Operations oper=new Operations();
			char c=l2.getText().charAt(0);
			switch(c)
			{
			case '+':
				l1.setText(oper.sum(l1.getText(), text.getText()));
				break;
			case '-':
				l1.setText(oper.sub(l1.getText(), text.getText()));
				break;
			case 'X':
				l1.setText(oper.mul(l1.getText(), text.getText()));
				break;
			case '/':
				l1.setText(oper.div(l1.getText(), text.getText()));
				break;}
	}
	
	protected void operatorBehaviour(String c)
	{
		if(!l2.getText().equalsIgnoreCase("")) 
		{
			equalOperation();
			text.setText("");
		}
		else
		{
			if(!text.getText().equalsIgnoreCase("")) {l1.setText(text.getText());}
			l2.setText(c);
			text.setText("");
		}
	}

	protected String signOperation(String s)
	{
		int temp=Integer.parseInt(s);
		temp*=(-1);
		return temp+"";
	}

}
