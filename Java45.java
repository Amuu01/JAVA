/*
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code=FactApplet.class width=400 height=400></applet>

public class Java45 extends Applet implements ActionListener 
{

    TextField number, factorial;
    Button compute;

    public void init() 
    {

        Label l1 = new Label("Input Number: ");
        Label l2 = new Label("Factorial: ");

        number = new TextField(30);
        factorial = new TextField(30);
        compute = new Button("Compute ->>");

        add(l1);
        add(number);

        add(l2);
        add(factorial);

        add(compute);
        compute.addActionListener(this);

    }

        
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==compute)
		{
			int fact=fact(Integer.parseInt(number.getText())); 
			factorial.setText(String.valueOf(fact));
		}
	}

	int fact(int f)
	{
		if(f==0) 
			return 1; 
		else
			return f*fact(f-1);
	}
}
*/