package affichage;

import java.awt.*;   
import java.awt.event.*;
import javax.swing.*;

public class Ballon extends JPanel
{
	
		private static final long serialVersionUID = 1L;
		private Timer timer ;
	    private int x=25,taille=50;
	    private int y=Cadre.SIZEH;
	    private Color couleur;
	    private String lettre;
	    public Ballon(String lettre ,int vitesse, Color couleur)
	    {
	    	// A commenter si tu ne veux plus voir la grille
	    	// setBorder(new javax.swing.border.LineBorder(Color.black));
	    	timer = new Timer(vitesse, new TimerListener());
	        timer.start();	    
	        this.couleur = couleur;
	        this.lettre = lettre;
	    }

	    private class TimerListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            y -= 5;
	            repaint();
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g)
	    {
	        super.paintComponent(g);
	        g.setColor(couleur);
	        g.fillOval(x, y, taille, (int)(taille*1.3));
	        g.setColor(Color.black);
	        g.drawOval(x, y, taille, (int)(taille*1.3));
	        g.drawString(lettre, x+taille/3, y+taille/2);
	    }
}
