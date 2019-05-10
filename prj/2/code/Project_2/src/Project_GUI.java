import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project_GUI {

	private JFrame frame;
	private JTextField textName;
	private JTextField textField_1;
	private JTextField textElims;
	private JTextField textObjTime;
	private JTextField textObjElims;
	private JTextField textHealing;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textWin;
	
	Rank bronze = new Rank("Bronze", 10, 7, 20, 1500, 2000, 17, 0, 1499);
	Rank silver = new Rank("Silver", 15, 12, 23, 4000, 3000, 15, 1500, 1999);
	Rank gold = new Rank("Gold", 20, 16, 25, 5000, 5000, 13, 2000, 2499);
	Rank platinum = new Rank("Platinum", 25, 20, 26, 8000, 7500, 14, 2500, 2999);
	Rank diamond = new Rank("Diamond", 30, 23, 29, 11000, 9000, 10, 3000, 3499);
	Rank master = new Rank("Master", 35, 27, 30, 14000, 11000, 11, 3500, 3999);
	Rank grandMaster = new Rank("Grand Master", 40, 33, 36, 17000, 15000, 13, 4000, 5000);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_GUI window = new Project_GUI();
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
	public Project_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 612, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFffff = new JLabel("Enter The Player's");
		lblFffff.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblFffff.setBounds(12, 30, 143, 44);
		frame.getContentPane().add(lblFffff);
		
		JLabel lblNewLabel = new JLabel("Information Here:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setBounds(12, 53, 143, 44);
		frame.getContentPane().add(lblNewLabel);
		
		textName = new JTextField();
		textName.setBounds(406, 43, 116, 22);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblName.setBounds(316, 44, 50, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblSkillRank = new JLabel("Skill Rank:");
		lblSkillRank.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblSkillRank.setBounds(288, 67, 78, 16);
		frame.getContentPane().add(lblSkillRank);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(406, 66, 116, 22);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEnterGameStats = new JLabel("Enter Game Stats:");
		lblEnterGameStats.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblEnterGameStats.setBounds(12, 110, 143, 44);
		frame.getContentPane().add(lblEnterGameStats);
		
		JLabel lblEliminations = new JLabel("Elims:");
		lblEliminations.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblEliminations.setBounds(167, 126, 50, 16);
		frame.getContentPane().add(lblEliminations);
		
		textElims = new JTextField();
		textElims.setColumns(10);
		textElims.setBounds(250, 123, 116, 22);
		frame.getContentPane().add(textElims);
		
		JLabel lblObjTime = new JLabel("Obj Time:");
		lblObjTime.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblObjTime.setBounds(376, 124, 78, 22);
		frame.getContentPane().add(lblObjTime);
		
		textObjTime = new JTextField();
		textObjTime.setColumns(10);
		textObjTime.setBounds(466, 123, 116, 22);
		frame.getContentPane().add(textObjTime);
		
		JLabel lblObjElims = new JLabel("Obj Elims:");
		lblObjElims.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblObjElims.setBounds(167, 170, 78, 22);
		frame.getContentPane().add(lblObjElims);
		
		JLabel lblHealing = new JLabel("Healing:");
		lblHealing.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblHealing.setBounds(167, 213, 78, 32);
		frame.getContentPane().add(lblHealing);
		
		JLabel lblDamage = new JLabel("Damage:");
		lblDamage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblDamage.setBounds(376, 172, 78, 22);
		frame.getContentPane().add(lblDamage);
		
		JLabel lblDeaths = new JLabel("Deaths:");
		lblDeaths.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblDeaths.setBounds(376, 221, 78, 16);
		frame.getContentPane().add(lblDeaths);
		
		textObjElims = new JTextField();
		textObjElims.setColumns(10);
		textObjElims.setBounds(250, 169, 116, 22);
		frame.getContentPane().add(textObjElims);
		
		textHealing = new JTextField();
		textHealing.setColumns(10);
		textHealing.setBounds(250, 218, 116, 22);
		frame.getContentPane().add(textHealing);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(466, 169, 116, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(466, 220, 116, 22);
		frame.getContentPane().add(textField_7);
		
		JLabel lblHolder = new JLabel("");
		lblHolder.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblHolder.setBounds(167, 314, 209, 16);
		frame.getContentPane().add(lblHolder);
		
		JLabel lblHolder_1 = new JLabel("");
		lblHolder_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblHolder_1.setBounds(167, 345, 209, 16);
		frame.getContentPane().add(lblHolder_1);
		
		JButton btnGetRank = new JButton("Get New Rank");
		btnGetRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name, win;
				int kills, objKills, objTime, damage, healing, deaths, SR;
					kills = Integer.parseInt(textElims.getText());
					objKills = Integer.parseInt(textElims.getText());
					objTime = Integer.parseInt(textElims.getText());
					damage = Integer.parseInt(textElims.getText());
					healing = Integer.parseInt(textElims.getText());
					deaths = Integer.parseInt(textElims.getText());
					name = textName.getText();
					SR = Integer.parseInt(textField_1.getText());
					win = textWin.getText().toLowerCase();
					
					//Setting above and below
					bronze.setAboveRank(silver);
					silver.setAboveRank(gold);
					gold.setAboveRank(platinum);
					platinum.setAboveRank(diamond);
					diamond.setAboveRank(master);
					master.setAboveRank(grandMaster);
					
					gold.setBelowRank(silver);
					platinum.setBelowRank(gold);
					diamond.setBelowRank(platinum);
					master.setBelowRank(diamond);
					grandMaster.setBelowRank(master);
					silver.setBelowRank(bronze);
					
					Player player1 =  new Player(name, SR);
					if(SR >= 0 && SR <= 1499 )
						player1.setRank(bronze);
					else if(SR >= 1500 && SR <= 1999)
						player1.setRank(silver);
					else if(SR >= 2000 && SR <= 2499)
						player1.setRank(gold);
					else if(SR >= 2500 && SR <= 2999)
						player1.setRank(platinum);
					else if(SR >= 3000 && SR <= 3499)
						player1.setRank(diamond);
					else if(SR >= 3500 && SR <= 3999)
						player1.setRank(master);
					else if(SR >= 4000)
						player1.setRank(grandMaster);
					
				    
					Performance player1Perf = new Performance(player1, kills, objKills, objTime, damage, healing, deaths);
					
					if(win.equals("yes")) {
						player1Perf.setWin(true);
					}else if(win.equals("no")) {
						player1Perf.setWin(false);
					}
					
					player1.getNewSR(player1Perf);
					lblHolder.setText("The new SR is " + Integer.toString(player1.getSR()));
					lblHolder_1.setText("Your rank is " + player1.getRank().getName());
			}
		});
		btnGetRank.setBounds(12, 182, 123, 68);
		frame.getContentPane().add(btnGetRank);
		
		textWin = new JTextField();
		textWin.setColumns(10);
		textWin.setBounds(406, 268, 116, 22);
		frame.getContentPane().add(textWin);
		
		JLabel lblDidYouWin = new JLabel("Did you win? Yes or No?");
		lblDidYouWin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblDidYouWin.setBounds(167, 258, 189, 39);
		frame.getContentPane().add(lblDidYouWin);
	}
}
