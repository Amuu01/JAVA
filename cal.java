/*import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
//<applet code="Cal" width=300 height=300></applet>/
public class cal extends Applet implements ActionListener
{
	//String msg=" "; 
	int num1,num2,result; 
	TextField t1;
	Button b[]=new Button[10];
	Button Add,Sub,Mul,Div,Clear,Mod,EQUAL;
	char OPERATION;
	public void init()
	{
		Color k=new Color(120,89,90); 
		setBackground(k);
		t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5); 
		setLayout(gl);
		setFont(new Font("Arial",Font.BOLD,25));
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		Add=new Button("+");
		Sub=new Button("-"); 
		Mul=new Button("x"); 
		Div=new Button("/");
		Mod=new Button("%");
		Clear=new Button("clear");
		EQUAL=new Button("=");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(Add);
		add(Sub);
		add(Mul);
		add(Div);
		add(Mod);
		add(Clear);
		add(EQUAL);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		Add.addActionListener(this);
		Sub.addActionListener(this);
		Mul.addActionListener(this);
		Div.addActionListener(this);
		Mod.addActionListener(this);
		Clear.addActionListener(this);
		EQUAL.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand(); 
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
			t1.setText(t1.getText()+str); 
		else
			if(str.equals("+"))
			{
				num1=Integer.parseInt(t1.getText());
				OPERATION='+';
				t1.setText("");
			}
			else if(str.equals("-"))
			{
				num1=Integer.parseInt(t1.getText()); OPERATION='-';
				t1.setText("");
			}
			else if(str.equals("x"))
			{
				num1=Integer.parseInt(t1.getText());
				OPERATION='*';
				t1.setText("");
			}
			else if(str.equals("/"))
			{
				num1=Integer.parseInt(t1.getText());
				OPERATION='/';
				t1.setText("");
			}

			else if(str.equals("%"))
			{
				num1=Integer.parseInt(t1.getText());
				OPERATION='%';
				t1.setText("");
			}
			if(str.equals("="))
			{
				num2=Integer.parseInt(t1.getText());
				if(OPERATION=='+')
					result=num1+num2; 
				else if(OPERATION=='-')
					result=num1-num2; 
				else if(OPERATION=='*')
					result=num1*num2; 
				else if(OPERATION=='/')
					result=num1/num2; 
				else if(OPERATION=='%')
					result=num1%num2;
				t1.setText(""+result);
				}
				if(str.equals("clear"))
				{
					t1.setText("");
				}
			}
		}*/