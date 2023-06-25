import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tictacoo {
	private static final AbstractButton btn00 = null;
	private static final AbstractButton btn01 = null;
	private static final AbstractButton btn02 = null;
	private JFrame frame;
	int clicked =0;
	boolean btn00Flag= true;
	boolean btn01Flag= true;
	boolean btn02Flag= true;
	boolean btn10Flag= true;
	boolean btn11Flag= true;
	boolean btn12Flag= true;
	boolean btn20Flag= true;
	boolean btn21Flag= true;
	boolean btn22Flag= true;
	/**
	/**
	/**
	/**
	/**
	/**
	 *
	/**
	 */
	/**
	/**
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictacoo window = new tictacoo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tictacoo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 99));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btn00 = new JButton("");
		btn00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(btn00Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn00.setLabel("0");
					btn00.setEnabled(false);
					btn00Flag = false;
				}else {
					btn00.setLabel("X");
					btn00.setEnabled(false);
					btn00Flag = false;
				}
			} 
			{checkwinner();}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn00.setBounds(0, 0, 163, 143);
		frame.getContentPane().add(btn00);
		
		final JButton btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn01.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn01Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn01.setLabel("0");
					btn01.setEnabled(false);
					btn01Flag = false;
				}else {
					btn01.setLabel("X");
					btn01.setEnabled(false);
					btn01Flag = false;
			
				}}{checkwinner();}
			});
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn01.setBounds(161, 0, 163, 143);
		frame.getContentPane().add(btn01);
		
		final JButton btn02 = new JButton("");
		btn02.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn02Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn02.setLabel("0");
					btn02.setEnabled(false);
					btn02Flag = false;
				}else {
					btn02.setLabel("X");
					btn02.setEnabled(false);
					btn02Flag = false;
			}}{checkwinner();}
		});
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn02.setBounds(323, 0, 163, 143);
		frame.getContentPane().add(btn02);
		
		final JButton btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn10.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn10Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn10.setLabel("0");
					btn10.setEnabled(false);
					btn10Flag = false;
				}else {
					btn10.setLabel("X");
					btn10.setEnabled(false);
					btn10Flag = false;
			}}{checkwinner();}
			}
		);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn10.setBounds(0, 142, 163, 155);
		frame.getContentPane().add(btn10);
		
		final JButton btn11 = new JButton("");
		btn11.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn11Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn11.setLabel("0");
					btn11.setEnabled(false);
					btn11Flag = false;
				}else {
					btn11.setLabel("X");
					btn11.setEnabled(false);
					btn11Flag = false;
			}}{checkwinner();}
			
		});
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn11.setBounds(161, 142, 163, 155);
		frame.getContentPane().add(btn11);
		
		final JButton btn12 = new JButton("");
		btn12.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn12Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn12.setLabel("0");
					btn12.setEnabled(false);
					btn12Flag = false;
				}else {
					btn12.setLabel("X");
					btn12.setEnabled(false);
					btn12Flag = false;
			}}{checkwinner();}
			
		});
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn12.setBounds(323, 142, 163, 155);
		frame.getContentPane().add(btn12);
		
		final JButton btn20 = new JButton("");
		btn20.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn20Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn20.setLabel("0");
					btn20.setEnabled(false);
					btn20Flag = false;
				}else {
					btn20.setLabel("X");
					btn20.setEnabled(false);
					btn20Flag = false;
			}}{checkwinner();}
			
		});
		btn20.setFont(new Font("STXinwei", Font.PLAIN, 99));
		btn20.setBounds(0, 295, 163, 168);
		frame.getContentPane().add(btn20);
		
		final JButton btn21 = new JButton("");
		btn21.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn21Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn21.setLabel("0");
					btn21.setEnabled(false);
					btn21Flag = false;
				}else {
					btn21.setLabel("X");
					btn21.setEnabled(false);
					btn21Flag = false;
			}}{checkwinner();}
			
		});
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn21.setBounds(161, 295, 163, 168);
		frame.getContentPane().add(btn21);
		
		final JButton btn22 = new JButton("");
		btn22.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent e) {
				if(btn22Flag) {
					clicked++;}
				if (clicked%2==0) {
					btn22.setLabel("0");
					btn22.setEnabled(false);
					btn22Flag = false;
				}else {
					btn22.setLabel("X");
					btn22.setEnabled(false);
					btn22Flag = false;
			}
			}{checkwinner();}
			
		});
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn22.setBounds(323, 295, 163, 168);
		frame.getContentPane().add(btn22);
	}void checkwinner(){
		;
		if((btn00Flag == false)&& (btn00.getText().equals(btn01.getText()))&&  (btn00.getText().equals(btn01.getText()))) {
			System.out.println("winner");
			
		}
	}

		}
	

