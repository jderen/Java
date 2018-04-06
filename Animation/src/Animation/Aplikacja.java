package animacjee;





import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javax.swing.JButton;

import java.awt.Dimension;


public class Aplikacja extends JFrame {


	/**

	 * 

	 */

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;


	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Aplikacja frame = new Aplikacja();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}


	/**

	 * Create the frame.

	 */

	public Aplikacja() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize(); 
		int ww=450,wh=300;												
		setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh); 

		contentPane = new JPanel();


		setContentPane(contentPane);

		contentPane.setLayout(null);

		
		AnimPanel animPanel=new AnimPanel();
		animPanel.setBounds(10,11,422,159);
		contentPane.add(animPanel);
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				animPanel.initialize();
			}
		});
		

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animPanel.addFig();
			}
		});
		btnAdd.setBounds(10, getHeight()-30, 80, 23);
		
		contentPane.add(btnAdd);

		

		JButton btnAnimate = new JButton("Animate");
		btnAnimate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animPanel.animate();
			}
		});
		btnAnimate.setBounds(100, getHeight()-30, 80, 23);
		
		contentPane.add(btnAnimate);

		addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				animPanel.changeSize(getWidth()-45, getHeight()-45);
				btnAdd.setBounds(10, getHeight() -20, 80, 23);
				btnAnimate.setBounds(100, getHeight()-20, 80, 23);
			}
});

	}

}


