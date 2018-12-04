import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public abstract class btnStocksCalculator implements ActionListener {
	
	static JTextField [] arrayOfJTextFields = new JTextField [10];
	
	private static JTextField textField_13;
	private static JTextField textField_9;
	private static JTextField textField_10;
	static JTextField textField1;
	static JTextField textField_4;
	static JTextField textField2;
	static JTextField textField_5;
	static JTextField textField7;
	static JTextField textField_6;
	static JTextField textField_3;
	private static JTextField textField_11;
	private static JTextField textField_12;
	static JTextField textField_8;
	private static JTextField textField_14;
	private static JTextField textField_15;
	private static JTextField textField_16;
	private static JButton btnCalculate1 = new JButton();
	private static JButton btnCalculate2 = new JButton();
	private static JButton buttonCalculate3 = new JButton();
	private static JButton btnCalculate4 = new JButton();

	
//	public void actionPerformed(ActionEvent e) {
		public static void main(String[] args) {
				JFrame framePSC = new JFrame();
				framePSC.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 9));
				framePSC.setType(Type.UTILITY);
				framePSC.setFont(fontCalibriPlain14());
				framePSC.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
				framePSC.setResizable(true);
				framePSC.setTitle("Primers' Stocks Calculator");
				framePSC.setBounds(600, 100, 605, 677);
						SpringLayout springLayout = new SpringLayout();
				framePSC.getContentPane().setLayout(springLayout);
				
						JLabel lablePSC = new JLabel();
						lablePSC.setForeground(Color.BLUE);
							springLayout.putConstraint(SpringLayout.WEST, lablePSC, 10, SpringLayout.WEST, framePSC.getContentPane());
								lablePSC.setHorizontalAlignment(SwingConstants.LEFT);
								lablePSC.setVerticalAlignment(SwingConstants.TOP);
								lablePSC.setText("<html><h3>1. From a lyophilized powder of known Molarity: </html>");
								lablePSC.setHorizontalTextPosition(SwingConstants.CENTER);
								lablePSC.setFont(fontArialPlain14());
				framePSC.getContentPane().add(lablePSC);
				
				JLabel lblNewLabel = new JLabel("What is a concentration of your lyophilized primer?");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lablePSC);
				lblNewLabel.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Dilute your lyophilized primer in ");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 8, SpringLayout.SOUTH, lblNewLabel);
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
				lblNewLabel_1.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblNewLabel_1);
				
				textField_9 = new JTextField();
				springLayout.putConstraint(SpringLayout.NORTH, textField_9, -2, SpringLayout.NORTH, lblNewLabel_1);
				springLayout.putConstraint(SpringLayout.WEST, textField_9, 6, SpringLayout.EAST, lblNewLabel_1);
				textField_9.setFont(fontTahomaBold11());
				textField_9.setHorizontalAlignment(SwingConstants.CENTER);
				textField_9.setEditable(false);
				framePSC.getContentPane().add(textField_9);
				textField_9.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("mkL of diWater.");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel_1);
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 6, SpringLayout.EAST, textField_9);
				lblNewLabel_2.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblNewLabel_2);
				
				JLabel lblNewLabel_4 = new JLabel("What is the concentration of a stock you'd like to prepare?");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 14, SpringLayout.NORTH, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_4);
				springLayout.putConstraint(SpringLayout.NORTH, lablePSC, 6, SpringLayout.SOUTH, lblNewLabel_4);
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 34, SpringLayout.WEST, framePSC.getContentPane());
				lblNewLabel_4.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblNewLabel_4);
				
				textField1 = new JTextField ();
				springLayout.putConstraint(SpringLayout.WEST, textField1, 6, SpringLayout.EAST, lblNewLabel_4);
				springLayout.putConstraint(SpringLayout.EAST, textField1, -164, SpringLayout.EAST, framePSC.getContentPane());
				textField1.setHorizontalAlignment(SwingConstants.CENTER);
				springLayout.putConstraint(SpringLayout.NORTH, textField1, -1, SpringLayout.NORTH, lblNewLabel_4);
				textField1.setText("100");
				framePSC.getContentPane().add(textField1);
				textField1.setColumns(10);
								
				JLabel lblNewLabel_5 = new JLabel("nM");
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_5, 422, SpringLayout.WEST, framePSC.getContentPane());
				lblNewLabel_5.setFont(fontCalibriPlain14());
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 2, SpringLayout.NORTH, lblNewLabel);
				framePSC.getContentPane().add(lblNewLabel_5);
				
				JLabel lblMkm = new JLabel("mkM");
				springLayout.putConstraint(SpringLayout.NORTH, lblMkm, 0, SpringLayout.NORTH, lblNewLabel_4);
				springLayout.putConstraint(SpringLayout.WEST, lblMkm, 17, SpringLayout.EAST, textField1);
				lblMkm.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblMkm);
				
				JLabel lblFromDiluted = new JLabel();
				springLayout.putConstraint(SpringLayout.EAST, textField_9, -22, SpringLayout.EAST, lblFromDiluted);
				springLayout.putConstraint(SpringLayout.WEST, lblFromDiluted, 10, SpringLayout.WEST, framePSC.getContentPane());
				lblFromDiluted.setVerticalAlignment(SwingConstants.TOP);
				lblFromDiluted.setText("<html><h3>2. From a diluted stock of known Molarity:</html>");
				lblFromDiluted.setHorizontalTextPosition(SwingConstants.CENTER);
				lblFromDiluted.setHorizontalAlignment(SwingConstants.LEFT);
				lblFromDiluted.setForeground(Color.BLUE);
				lblFromDiluted.setFont(fontArialPlain14());
				framePSC.getContentPane().add(lblFromDiluted);
		
		/**Button 3*/
				buttonCalculate3 = new JButton("Calculate3");
				springLayout.putConstraint(SpringLayout.EAST, buttonCalculate3, -23, SpringLayout.EAST, framePSC.getContentPane());
				framePSC.getContentPane().add(buttonCalculate3);
				buttonCalculate3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField_11.setText(StocksCalculatorMethods.primerConcentrationString());
						textField_12.setText(StocksCalculatorMethods.molarConcentrationString());
						textField_13.setText(StocksCalculatorMethods.waterQuantityString3());		
					}
				});  
				
				JLabel lblNewLabel_6 = new JLabel("What is the current concentration of primer in solution?");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 176, SpringLayout.NORTH, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.SOUTH, lblFromDiluted, -4, SpringLayout.NORTH, lblNewLabel_6);
				lblNewLabel_6.setFont(fontCalibriPlain14());
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_6, 33, SpringLayout.WEST, framePSC.getContentPane());
				framePSC.getContentPane().add(lblNewLabel_6);
				
				JLabel label = new JLabel("mkM");
				springLayout.putConstraint(SpringLayout.WEST, label, 422, SpringLayout.WEST, framePSC.getContentPane());
				label.setFont(fontCalibriPlain14());
				springLayout.putConstraint(SpringLayout.NORTH, label, -1, SpringLayout.NORTH, lblNewLabel_6);
				framePSC.getContentPane().add(label);
				
		/**Button 1*/
				btnCalculate1 = new JButton("Calculate1");
				springLayout.putConstraint(SpringLayout.NORTH, btnCalculate1, -2, SpringLayout.NORTH, lblNewLabel);
				springLayout.putConstraint(SpringLayout.WEST, btnCalculate1, 0, SpringLayout.WEST, buttonCalculate3);
				framePSC.getContentPane().add(btnCalculate1);
				btnCalculate1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField_9.setText(StocksCalculatorMethods.waterQuantityString1());
						}
					}); 
				
		/**Button 2*/
				btnCalculate2 = new JButton("Calculate2");
				springLayout.putConstraint(SpringLayout.NORTH, btnCalculate2, -4, SpringLayout.NORTH, lblNewLabel_6);
				springLayout.putConstraint(SpringLayout.EAST, btnCalculate2, -23, SpringLayout.EAST, framePSC.getContentPane());
				framePSC.getContentPane().add(btnCalculate2);
				btnCalculate2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField_10.setText(StocksCalculatorMethods.waterQuantityString2());
						}
					}); 
									
				JLabel lblNewLabel_10 = new JLabel("<html>What is the optical dencity (at 260nm) of the current <br>primer's solution?</html>");
				springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, lblNewLabel);
				lblNewLabel_10.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblNewLabel_10);
				
				textField_5 = new JTextField ();
				springLayout.putConstraint(SpringLayout.WEST, textField_5, 41, SpringLayout.EAST, lblNewLabel_10);
				springLayout.putConstraint(SpringLayout.SOUTH, textField_5, 0, SpringLayout.SOUTH, lblNewLabel_10);
				textField_5.setHorizontalAlignment(SwingConstants.CENTER);
				framePSC.getContentPane().add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblOpticalUnits = new JLabel("optical units");
				springLayout.putConstraint(SpringLayout.EAST, textField_5, -6, SpringLayout.WEST, lblOpticalUnits);
				springLayout.putConstraint(SpringLayout.NORTH, lblOpticalUnits, 1, SpringLayout.NORTH, textField_5);
				springLayout.putConstraint(SpringLayout.WEST, lblOpticalUnits, 0, SpringLayout.WEST, lblNewLabel_5);
				lblOpticalUnits.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblOpticalUnits);
				
				JLabel lblToEach = new JLabel("To each 10 mkL of the current stock solution add");
				springLayout.putConstraint(SpringLayout.WEST, lblToEach, 0, SpringLayout.WEST, lblNewLabel);
				lblToEach.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblToEach);
				
				JLabel lblMklOfDiwater = new JLabel("mkL of diWater.");
				springLayout.putConstraint(SpringLayout.NORTH, lblMklOfDiwater, 0, SpringLayout.NORTH, lblToEach);
				springLayout.putConstraint(SpringLayout.WEST, lblMklOfDiwater, 0, SpringLayout.WEST, textField_5);
				lblMklOfDiwater.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblMklOfDiwater);
				
				JLabel lblFromA = new JLabel();
				springLayout.putConstraint(SpringLayout.NORTH, lblFromA, 229, SpringLayout.NORTH, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.SOUTH, lblToEach, -6, SpringLayout.NORTH, lblFromA);
				springLayout.putConstraint(SpringLayout.WEST, lblFromA, 0, SpringLayout.WEST, lablePSC);
				lblFromA.setVerticalAlignment(SwingConstants.TOP);
				lblFromA.setText("<html><h3>3. From a diluted stock of known OD value:</html>");
				lblFromA.setHorizontalTextPosition(SwingConstants.CENTER);
				lblFromA.setHorizontalAlignment(SwingConstants.LEFT);
				lblFromA.setForeground(Color.BLUE);
				lblFromA.setFont(fontArialPlain14());
				framePSC.getContentPane().add(lblFromA);
				
				textField_3 = new JTextField ();
				springLayout.putConstraint(SpringLayout.WEST, textField_3, 22, SpringLayout.EAST, lblNewLabel_6);
				springLayout.putConstraint(SpringLayout.EAST, textField_3, -6, SpringLayout.WEST, label);
				textField_3.setHorizontalAlignment(SwingConstants.CENTER);
				springLayout.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, lblNewLabel_6);
				textField_3.setColumns(10);
				framePSC.getContentPane().add(textField_3);
				
				textField_10 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_10, -2, SpringLayout.NORTH, lblToEach);
				springLayout.putConstraint(SpringLayout.WEST, textField_10, -52, SpringLayout.EAST, lblNewLabel_4);
				textField_10.setHorizontalAlignment(SwingConstants.CENTER);
				textField_10.setFont(fontTahomaBold11());
				textField_10.setEditable(false);
				textField_10.setColumns(10);
				framePSC.getContentPane().add(textField_10);
				
				JLabel lblWhatIsThe = new JLabel("What is the length of your primer?");
				springLayout.putConstraint(SpringLayout.NORTH, lblWhatIsThe, 351, SpringLayout.NORTH, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.WEST, lblWhatIsThe, 0, SpringLayout.WEST, lblNewLabel);
				lblWhatIsThe.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblWhatIsThe);
				
				textField_6 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_6, 1, SpringLayout.NORTH, buttonCalculate3);
				springLayout.putConstraint(SpringLayout.WEST, textField_6, -277, SpringLayout.EAST, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, lblNewLabel_6);
				textField_6.setHorizontalAlignment(SwingConstants.CENTER);
				textField_6.setColumns(10);
				framePSC.getContentPane().add(textField_6);
				
				JLabel lblBases = new JLabel("nucleotides");
				springLayout.putConstraint(SpringLayout.NORTH, lblBases, 0, SpringLayout.NORTH, lblWhatIsThe);
				springLayout.putConstraint(SpringLayout.WEST, lblBases, 6, SpringLayout.EAST, textField_6);
				lblBases.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblBases);
				
				JLabel lblYouHave = new JLabel("You have ");
				lblYouHave.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblYouHave);
				
				textField_11 = new JTextField ();
				springLayout.putConstraint(SpringLayout.WEST, textField_11, 99, SpringLayout.WEST, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.NORTH, lblYouHave, 2, SpringLayout.NORTH, textField_11);
				springLayout.putConstraint(SpringLayout.EAST, lblYouHave, -6, SpringLayout.WEST, textField_11);
				springLayout.putConstraint(SpringLayout.NORTH, textField_11, 6, SpringLayout.SOUTH, lblWhatIsThe);
				textField_11.setHorizontalAlignment(SwingConstants.CENTER);
				textField_11.setFont(fontTahomaBold11());
				textField_11.setEditable(false);
				textField_11.setColumns(10);
				framePSC.getContentPane().add(textField_11);
				
				JLabel lblMkgmlSingleStranded = new JLabel("mkg/mL of single stranded DNA in your current stock solution.");
				springLayout.putConstraint(SpringLayout.NORTH, lblMkgmlSingleStranded, 377, SpringLayout.NORTH, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.SOUTH, buttonCalculate3, -6, SpringLayout.NORTH, lblMkgmlSingleStranded);
				springLayout.putConstraint(SpringLayout.WEST, lblMkgmlSingleStranded, 150, SpringLayout.WEST, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.EAST, textField_11, -6, SpringLayout.WEST, lblMkgmlSingleStranded);
				lblMkgmlSingleStranded.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblMkgmlSingleStranded);
				
				JLabel lblThisMeansThat = new JLabel("This means that you have ");
				springLayout.putConstraint(SpringLayout.WEST, lblThisMeansThat, 0, SpringLayout.WEST, lblNewLabel);
				lblThisMeansThat.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblThisMeansThat);
				
				textField_12 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_12, 3, SpringLayout.SOUTH, lblMkgmlSingleStranded);
				springLayout.putConstraint(SpringLayout.NORTH, lblThisMeansThat, 2, SpringLayout.NORTH, textField_12);
				springLayout.putConstraint(SpringLayout.WEST, textField_12, 201, SpringLayout.WEST, framePSC.getContentPane());
				textField_12.setHorizontalAlignment(SwingConstants.CENTER);
				textField_12.setFont(fontTahomaBold11());
				textField_12.setEditable(false);
				textField_12.setColumns(10);
				framePSC.getContentPane().add(textField_12);
				
				JLabel lblMkmSolution = new JLabel("mkM solution.");
				springLayout.putConstraint(SpringLayout.WEST, lblMkmSolution, 252, SpringLayout.WEST, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.EAST, textField_12, -6, SpringLayout.WEST, lblMkmSolution);
				springLayout.putConstraint(SpringLayout.NORTH, lblMkmSolution, 6, SpringLayout.SOUTH, lblMkgmlSingleStranded);
				lblMkmSolution.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblMkmSolution);
				
				JLabel label_1 = new JLabel("To each 10 mkL of the current stock solution add");
				springLayout.putConstraint(SpringLayout.NORTH, label_1, 9, SpringLayout.SOUTH, textField_12);
				springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, lblNewLabel);
				label_1.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(label_1);
				
				textField_13 = new JTextField ();
				springLayout.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, textField_13);
				springLayout.putConstraint(SpringLayout.NORTH, textField_13, -2, SpringLayout.NORTH, label_1);
				springLayout.putConstraint(SpringLayout.WEST, textField_13, 6, SpringLayout.EAST, label_1);
				springLayout.putConstraint(SpringLayout.EAST, textField_13, -4, SpringLayout.EAST, lblNewLabel_2);
				textField_13.setHorizontalAlignment(SwingConstants.CENTER);
				textField_13.setFont(fontTahomaBold11());
				textField_13.setEditable(false);
				textField_13.setColumns(10);
				framePSC.getContentPane().add(textField_13);
				
				JLabel label_2 = new JLabel("mkL of diWater.");
				springLayout.putConstraint(SpringLayout.NORTH, label_2, 0, SpringLayout.NORTH, label_1);
				springLayout.putConstraint(SpringLayout.WEST, label_2, 2, SpringLayout.EAST, textField_13);
				label_2.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(label_2);
				
				JLabel lblhaveYouDiluted = new JLabel("<html>Have you diluted sample before to measure OD260?<br>If not, leave \"1\". If yes, indicate how much?</html>");
				springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_10, 6, SpringLayout.SOUTH, lblhaveYouDiluted);
				springLayout.putConstraint(SpringLayout.NORTH, lblhaveYouDiluted, 2, SpringLayout.SOUTH, lblFromA);
				springLayout.putConstraint(SpringLayout.WEST, lblhaveYouDiluted, 0, SpringLayout.WEST, lblNewLabel);
				lblhaveYouDiluted.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblhaveYouDiluted);
				
				textField_4 = new JTextField ();
				springLayout.putConstraint(SpringLayout.WEST, textField_4, 43, SpringLayout.EAST, lblhaveYouDiluted);
				springLayout.putConstraint(SpringLayout.SOUTH, textField_4, 0, SpringLayout.SOUTH, lblhaveYouDiluted);
				textField_4.setHorizontalAlignment(SwingConstants.CENTER);
				textField_4.setText("1");
				textField_4.setColumns(10);
				framePSC.getContentPane().add(textField_4);
				
				JLabel lblTimes = new JLabel("times");
				springLayout.putConstraint(SpringLayout.EAST, textField_4, -6, SpringLayout.WEST, lblTimes);
				springLayout.putConstraint(SpringLayout.WEST, lblTimes, 0, SpringLayout.WEST, lblNewLabel_5);
				springLayout.putConstraint(SpringLayout.SOUTH, lblTimes, 0, SpringLayout.SOUTH, lblhaveYouDiluted);
				lblTimes.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblTimes);
				
				JLabel lblFromAn = new JLabel();
				springLayout.putConstraint(SpringLayout.NORTH, lblFromAn, 6, SpringLayout.SOUTH, label_1);
				springLayout.putConstraint(SpringLayout.WEST, lblFromAn, 0, SpringLayout.WEST, lablePSC);
				lblFromAn.setVerticalAlignment(SwingConstants.TOP);
				lblFromAn.setText("<html><h3>4. From a lyophilized powder of known OD value:</html>");
				lblFromAn.setHorizontalTextPosition(SwingConstants.CENTER);
				lblFromAn.setHorizontalAlignment(SwingConstants.LEFT);
				lblFromAn.setForeground(Color.BLUE);
				lblFromAn.setFont(fontArialPlain14());
				framePSC.getContentPane().add(lblFromAn);
				
				JLabel lblWhatIsA = new JLabel("What is a nucleotide sequence of the primer? 5`-> 3`");
				springLayout.putConstraint(SpringLayout.NORTH, lblWhatIsA, 32, SpringLayout.SOUTH, lblFromAn);
				springLayout.putConstraint(SpringLayout.WEST, lblWhatIsA, 0, SpringLayout.WEST, lblNewLabel);
				lblWhatIsA.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblWhatIsA);
				
				JLabel lblwhatIsThe = new JLabel("<html>What is the optical dencity (OD260) of the primer?</html>");
				springLayout.putConstraint(SpringLayout.NORTH, lblwhatIsThe, 6, SpringLayout.SOUTH, lblFromAn);
				springLayout.putConstraint(SpringLayout.WEST, lblwhatIsThe, 0, SpringLayout.WEST, lblNewLabel);
				lblwhatIsThe.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(lblwhatIsThe);
				
				textField7 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField7, 2, SpringLayout.NORTH, lblwhatIsThe);
				springLayout.putConstraint(SpringLayout.WEST, textField7, 57, SpringLayout.EAST, lblwhatIsThe);
				springLayout.putConstraint(SpringLayout.EAST, textField7, 0, SpringLayout.EAST, textField_5);
				textField7.setText("1");
				textField7.setHorizontalAlignment(SwingConstants.CENTER);
				textField7.setColumns(10);
				framePSC.getContentPane().add(textField7);
				
				JLabel label_3 = new JLabel("optical units");
				springLayout.putConstraint(SpringLayout.NORTH, label_3, 3, SpringLayout.NORTH, lblwhatIsThe);
				springLayout.putConstraint(SpringLayout.WEST, label_3, 0, SpringLayout.WEST, lblNewLabel_5);
				label_3.setFont(fontCalibriPlain14());
				framePSC.getContentPane().add(label_3);
				
	/**Button 4*/
				btnCalculate4 = new JButton("Calculate4");
				springLayout.putConstraint(SpringLayout.EAST, btnCalculate4, 0, SpringLayout.EAST, buttonCalculate3);
				framePSC.getContentPane().add(btnCalculate4);
				btnCalculate4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField_14.setText(StocksCalculatorMethods.amountInNanoMolString());
						textField_15.setText(StocksCalculatorMethods.amountInMkGString());
						textField_16.setText(StocksCalculatorMethods.waterQuantityString4());
						}
					});
					
				textField_8 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, lblWhatIsA);
				springLayout.putConstraint(SpringLayout.WEST, textField_8, 6, SpringLayout.EAST, lblWhatIsA);
				springLayout.putConstraint(SpringLayout.EAST, textField_8, -10, SpringLayout.EAST, framePSC.getContentPane());
				textField_8.setHorizontalAlignment(SwingConstants.CENTER);
				textField_8.setColumns(10);
				framePSC.getContentPane().add(textField_8);
								
				JLabel label_4 = new JLabel("You have ");
				springLayout.putConstraint(SpringLayout.NORTH, btnCalculate4, -2, SpringLayout.NORTH, label_4);
				springLayout.putConstraint(SpringLayout.NORTH, label_4, 9, SpringLayout.SOUTH, lblWhatIsA);
				springLayout.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, lblNewLabel);
				label_4.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(label_4);
				
				textField_14 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_14, -2, SpringLayout.NORTH, label_4);
				springLayout.putConstraint(SpringLayout.WEST, textField_14, 6, SpringLayout.EAST, label_4);
				springLayout.putConstraint(SpringLayout.EAST, textField_14, 0, SpringLayout.EAST, textField_11);
				textField_14.setHorizontalAlignment(SwingConstants.CENTER);
				textField_14.setFont(fontTahomaBold11());
				textField_14.setEditable(false);
				textField_14.setColumns(10);
				framePSC.getContentPane().add(textField_14);
				
				textField_15 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_15, -2, SpringLayout.NORTH, label_4);
				springLayout.putConstraint(SpringLayout.WEST, textField_15, -24, SpringLayout.WEST, textField_9);
				textField_15.setHorizontalAlignment(SwingConstants.CENTER);
				textField_15.setFont(fontTahomaBold11());
				textField_15.setEditable(false);
				textField_15.setColumns(10);
				framePSC.getContentPane().add(textField_15);
				
				JLabel lblNmol = new JLabel("nmol and");
				springLayout.putConstraint(SpringLayout.NORTH, lblNmol, 0, SpringLayout.NORTH, label_4);
				springLayout.putConstraint(SpringLayout.WEST, lblNmol, 0, SpringLayout.WEST, lblMkgmlSingleStranded);
				lblNmol.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblNmol);
				
				JLabel lblMkgmlOfSsdna = new JLabel("mkg/ml of ssDNA.");
				springLayout.putConstraint(SpringLayout.EAST, textField_15, -6, SpringLayout.WEST, lblMkgmlOfSsdna);
				springLayout.putConstraint(SpringLayout.NORTH, lblMkgmlOfSsdna, 2, SpringLayout.NORTH, btnCalculate4);
				springLayout.putConstraint(SpringLayout.EAST, lblMkgmlOfSsdna, 0, SpringLayout.EAST, lblNewLabel_2);
				lblMkgmlOfSsdna.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(lblMkgmlOfSsdna);
				
				JLabel label_5 = new JLabel("Dilute your lyophilized primer in ");
				springLayout.putConstraint(SpringLayout.NORTH, label_5, 9, SpringLayout.SOUTH, textField_14);
				springLayout.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, lblNewLabel);
				label_5.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(label_5);
				
				textField_16 = new JTextField ();
				springLayout.putConstraint(SpringLayout.NORTH, textField_16, 6, SpringLayout.SOUTH, textField_15);
				springLayout.putConstraint(SpringLayout.WEST, textField_16, -45, SpringLayout.EAST, textField_9);
				springLayout.putConstraint(SpringLayout.EAST, textField_16, 0, SpringLayout.EAST, textField_9);
				textField_16.setHorizontalAlignment(SwingConstants.CENTER);
				textField_16.setFont(fontTahomaBold11());
				textField_16.setEditable(false);
				textField_16.setColumns(10);
				framePSC.getContentPane().add(textField_16);
				
				JLabel label_6 = new JLabel("mkL of diWater.");
				springLayout.putConstraint(SpringLayout.WEST, label_6, 0, SpringLayout.WEST, lblNewLabel_2);
				springLayout.putConstraint(SpringLayout.SOUTH, label_6, 0, SpringLayout.SOUTH, label_5);
				label_6.setFont(fontCalibriBold14());
				framePSC.getContentPane().add(label_6);
				
				textField2 = new JTextField();
				springLayout.putConstraint(SpringLayout.NORTH, textField2, -1, SpringLayout.NORTH, lblNewLabel);
				springLayout.putConstraint(SpringLayout.WEST, textField2, 371, SpringLayout.WEST, framePSC.getContentPane());
				springLayout.putConstraint(SpringLayout.EAST, textField2, -6, SpringLayout.WEST, lblNewLabel_5);
				framePSC.getContentPane().add(textField2);
				textField2.setColumns(10);
				framePSC.setVisible(true);
				
				arrayOfJTextFields[1] = textField1;
				arrayOfJTextFields[2] = textField2;
				arrayOfJTextFields[3] = textField_3;
				arrayOfJTextFields[4] = textField_4;
				arrayOfJTextFields[5] = textField_5;
				arrayOfJTextFields[6] = textField_6;
				arrayOfJTextFields[7] = textField7;
				arrayOfJTextFields[8] = textField_8;
	}

		private static Font fontArialPlain14() {
			return new Font("Arial", Font.PLAIN, 14);
		}

		private static Font fontCalibriBold14() {
			return new Font("Calibri", Font.BOLD, 14);
		}

		private static Font fontCalibriPlain14() {
			return new Font("Calibri", Font.PLAIN, 14);
		}

		private static Font fontTahomaBold11() {
			return new Font("Tahoma", Font.BOLD, 11);
		}
}
