package affichage;



import javax.swing.JFrame;

public class Cadre extends JFrame{
	private static final long serialVersionUID = 1L;
	static final int SIZEH =700;
	static final int SIZEL =1000;
	public Cadre()
	{
		setSize(SIZEL,SIZEH);
		FenetrePpale f = new FenetrePpale();
		add(f);
	}
}
