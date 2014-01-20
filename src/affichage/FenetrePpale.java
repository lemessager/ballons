package affichage;

import java.awt.*;
import javax.swing.*;

public class FenetrePpale extends JPanel{

	private static final long serialVersionUID = 1L;	
		
	public FenetrePpale(){	    
	    setLayout(new GridLayout(1,10));	    
	    add(new Ballon("A",12,Color.red));
	    add(new Ballon("B",34,Color.green));
	    add(new Ballon("Ta soeur",44,Color.cyan));
	    add(new JPanel());
	    add(new Ballon("Ta soeur",56,Color.cyan));
	    add(new JPanel());
	    add(new JPanel());
	    add(new Ballon("F",99,Color.blue));
	    add(new JPanel());
	    add(new Ballon("F",5,Color.blue));
	}

}
