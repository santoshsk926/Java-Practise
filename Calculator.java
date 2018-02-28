                                    //CALCULATOR
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,be,b_cls;
	TextField t1;
	int val=0;
	String sym;
	public void init()
	{
		setSize(500,600);
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		ba = new Button("+");
		bs = new Button("-");
		bm = new Button("*");
		bd = new Button("/");
		be = new Button("=");
		b_cls = new Button("clear");
		t1 = new TextField(50);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(ba);
		add(bs);
		add(bm);
		add(bd);
		add(be);
		add(b_cls);
		b1.addActionListener(this);
		b2.addActionListener(this);
	    b4.addActionListener(this);
		b3.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		b_cls.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String st = ae.getActionCommand();
		if(st.equals("1"))
			t1.setText(t1.getText()+"1");
		else if(st.equals("2"))
			t1.setText(t1.getText()+"2");
		else if(st.equals("3"))
			t1.setText(t1.getText()+"3");
		else if(st.equals("4"))
			t1.setText(t1.getText()+"4");
		else if(st.equals("5"))
			t1.setText(t1.getText()+"5");
		else if(st.equals("6"))
			t1.setText(t1.getText()+"6");
		else if(st.equals("7"))
			t1.setText("7"+t1.getText());
		else if(st.equals("8"))
			t1.setText(t1.getText()+"8");
		else if(st.equals("9"))
			t1.setText(t1.getText()+"9");
		else if(st.equals("0"))
			t1.setText(t1.getText()+"0");
		else if(st.equals("+"))
		{
			val=Integer.parseInt(t1.getText());
			t1.setText("");
			sym="+";
		}
		else if(st.equals("-"))
		{
			val=Integer.parseInt(t1.getText());
			t1.setText("");
			sym="-";
		}
		else if(st.equals("*"))
		{
			val=Integer.parseInt(t1.getText());
			t1.setText("");
			sym = "*";
		}
		else if(st.equals("/"))
		{
			val=Integer.parseInt(t1.getText());
			t1.setText("");
			sym = "/";
		}
		else if(st.equals("="))
		{
			if(sym.equals("+"))
			t1.setText(""+(val+Integer.parseInt(t1.getText())));
			if(sym.equals("-"))
			t1.setText(""+(val-Integer.parseInt(t1.getText())));
		    if(sym.equals("*"))
			t1.setText(""+(val*Integer.parseInt(t1.getText())));
		    if(sym.equals("/"))
			t1.setText(""+(val/Integer.parseInt(t1.getText())));
		}	
	
	    else if (st.equals("clear"))
		{
		    t1.setText("");
		}
			
	}
}
/* <applet code=Calculator width=200 height=200></applet> */