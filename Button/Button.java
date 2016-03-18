import javax.swing.*;


class Button extends JFrame
{
	JPanel pnl = new JPanel();
	ClassLo
	public Button()
	{
		super("Swing Window");
		setSize( 500, 200);
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);
	}
	public static void main ( String[] args)
	{
		Window gui = new Window();
	}
}
