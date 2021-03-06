package animacjee;

	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.RenderingHints;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Vector;
	import javax.swing.JPanel;
	import javax.swing.Timer;

	public class AnimPanel extends JPanel implements ActionListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		// bufor
		Image image;
		// wykreslacz ekranowy
		Graphics2D device;
		Graphics2D buffer;

		private int delay = 30;

		private Timer timer;

		private static int numer = 0;
		 
		
		private Vector<Figura> figurs = new Vector<>();
		
		public static boolean czyStop=false;
		

		public AnimPanel() {
			super();
			setBackground(Color.WHITE);
			timer = new Timer(delay, this);
		}

		public void initialize() {
			int width = getWidth();
			int height = getHeight();

			image = createImage(width, height);
			buffer = (Graphics2D) image.getGraphics();
			buffer.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			buffer.setBackground(Color.WHITE);
			device = (Graphics2D) getGraphics();
			device.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		}

		void addFig() {	
			Figura fig;
			switch(numer++%4+1)
			{
			case 1:
				fig=new Kwadrat(buffer, delay, getWidth(), getHeight());
				figurs.add(fig);		
				timer.addActionListener(fig);
				new Thread(fig).start();
				break;
			case 2:
				fig=new Elipsa(buffer, delay, getWidth(), getHeight());
				figurs.add(fig);		
				timer.addActionListener(fig);
				new Thread(fig).start();
				break;
			case 3:
				fig=new Trojkat(buffer,delay,getWidth(),getHeight());
				figurs.add(fig);		
				timer.addActionListener(fig);
				new Thread(fig).start();
				break;
			case 4:
				fig=new Pieciokat(buffer,delay,getWidth(),getHeight());
				figurs.add(fig);		
				timer.addActionListener(fig);
				new Thread(fig).start();
				break;

			}
		}

		void animate() {
			if (timer.isRunning()) {
				timer.stop();
				czyStop=false;
			} else {
				timer.start();
				czyStop=true;
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			device.drawImage(image, 0, 0, null);
			buffer.clearRect(0, 0, getWidth(), getHeight());
			
			
		}
		
		public void changeSize(int weight, int height){
		    setSize(weight, height);
		    initialize();

		    for (Figura figura : figurs){
	            figura.updateBuffer(buffer, weight, height);
	}
	}

	} 
