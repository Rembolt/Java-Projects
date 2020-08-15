import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();
		
		Gamepanel gamePanel = new Gamepanel();
		
		frame.add(gamePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Snake Game");
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Main();
		// Iai Ianzao do futuru, sentiu saudade?  deixei onde parei nesse video aqui so patu https://www.youtube.com/watch?v=91a7ceECNTc&t=88s  tempo: 21:14 Bjao cumpade

	}

}
