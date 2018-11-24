import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class PCR_GUI_JPanel extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private final JPanel alignmentPanel = new JPanel();
	private final JPanel alignmentPanel2 = new JPanel();
	private final JTextField volumeOfRMixture = new JTextField("20", 5);
	private final JTextField desirableVolumeOfMix = new JTextField ("", 5);
	private final JTextField samplesQuantity = new JTextField ("", 5);
	private final JTextField primersQuantity = new JTextField ("", 5);
	private final JTextField primersConcentration = new JTextField ("0.1", 5);
	private final JTextField specificPrimersConcentration = new JTextField("", 5);
	private final JLabel volumeOfRMixtureL = new JLabel("The total volume of PCR reaction mixture, in mkL:");
	private final JLabel desirableVolumeOfMixL = new JLabel ("The preferable volume of Primers' Mixture, in mkL:");
	private final JLabel samplesQuantityL = new JLabel ("The quantity of samples (PCR reactions):");
	private final JLabel primersQuantityL = new JLabel ("The quantity of primers (both Forwards and Reverses):");
	private final JLabel primersConcentrationL = new JLabel ("The desirable primers concentration? Normally 0.1-0.5 mkM.");
	private final JButton button = new JButton ("Press to calculate");
	private final JButton btnSaveResults = new JButton("Save receipt");
	private final JRadioButton primersStockConcentration100 = new JRadioButton("100 mkM", true);
	private final JRadioButton primersStockConcentration10 = new JRadioButton("10 mkM");
	private final JRadioButton primersStockConcentrationSpecific = new JRadioButton("Specific: ");
	private final JTabbedPane tabbedPaneHowToUse = new JTabbedPane(JTabbedPane.TOP);
	static String message = "";
	static String messagetxt = "";
	static JRadioButton doc = new JRadioButton ("*.doc");
	static JRadioButton txt = new JRadioButton ("*.txt");
	static JRadioButton xls = new JRadioButton ("*.xls");
	static JRadioButton pdf = new JRadioButton ("*.pdf");
	static JLabel howToUseLabel = new JLabel("");
	static JLabel receiptLabel = new JLabel("");
	static JLabel aboutLabel = new JLabel("");

	private final JLabel helpLabel_1 = new JLabel("");
	private final JLabel helpLabel_2 = new JLabel("");
	private final JLabel helpLabel_4 = new JLabel("");
	private final JLabel helpLabel_3 = new JLabel("");
	private final JButton btnNewButton = new JButton("Need a help to prepare stocks? Press here.");
	private final JLabel lblMm = new JLabel("mkM");
	
	
	
	public PCR_GUI_JPanel (){
		super("Multiplex Primers' Mix Compouser");
		setTitle("Multiplex Primers' Mix Calculator");
		this.setBounds(100, 200, 1125, 382);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(getClass().getResource("/PMC-icon.png")).getImage());
				
/* Fonts and Colors:
 **/
        Font font1 = new Font("Calibri", Font.BOLD, 16);
		Font font2 = new Font("Tahoma", Font.BOLD, 12);
		Font font3 = new Font("Tahoma", Font.PLAIN, 12);
		
        volumeOfRMixtureL.setFont(font1);
        desirableVolumeOfMixL.setFont(font1);  
		samplesQuantityL.setFont(font1);
		primersQuantityL.setFont(font1);
		primersConcentrationL.setFont(font1);
		
		primersStockConcentration100.setForeground(Color.RED);
		primersStockConcentration100.setFont(font2);
		primersStockConcentration10.setForeground(Color.RED);
		primersStockConcentration10.setFont(font2);
		primersStockConcentrationSpecific.setForeground(Color.RED);
		primersStockConcentrationSpecific.setFont(font2);
		button.setFont(font2);
		
		volumeOfRMixture.setFont(font3);
		desirableVolumeOfMix.setFont(font3);
		samplesQuantity.setFont(font3);
		primersQuantity.setFont(font3);
		primersConcentration.setFont(font3);
		
/* Pictures:
 **/
		Image img1 = new ImageIcon(this.getClass().getResource("/ok-icon.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/sc24_icon.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/Tubes24-icon.png")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/DNA24-icon.png")).getImage();
		Image img5 = new ImageIcon(this.getClass().getResource("/percentage24-icon.png")).getImage();
		Image img6 = new ImageIcon(this.getClass().getResource("/Pot32-icon.png")).getImage();
		Image img7 = new ImageIcon(this.getClass().getResource("/Help-icon.png")).getImage();
			
		button.setIcon(new ImageIcon(img1));
		desirableVolumeOfMixL.setIcon(new ImageIcon(img2));
		samplesQuantityL.setIcon(new ImageIcon(img3));
		primersQuantityL.setIcon(new ImageIcon(img4));
		primersConcentrationL.setIcon(new ImageIcon(img5));
		volumeOfRMixtureL.setIcon(new ImageIcon(img6));
		helpLabel_1.setIcon(new ImageIcon(img7));
		helpLabel_2.setIcon(new ImageIcon(img7));
		helpLabel_3.setIcon(new ImageIcon(img7));
		helpLabel_4.setIcon(new ImageIcon(img7));
		

		
/* Container structure: 
 **/
		Container container = this.getContentPane();
		container.setLayout(new MigLayout("", "[338px][338px,grow][grow]", "[42px,grow][][42px][42px][42px][42px][42px][42px,grow]"));
			
		ButtonGroup primerStockConcentration = new ButtonGroup();
			alignmentPanel2.setBorder(BorderFactory.createTitledBorder("What is the concentration of primers' Stock solutions?"));
				primerStockConcentration.add(primersStockConcentration10);
				primerStockConcentration.add(primersStockConcentrationSpecific);
				primerStockConcentration.add(primersStockConcentration100);
				alignmentPanel2.add(primersStockConcentration100, "flowx,cell 0 1");
				alignmentPanel2.add(primersStockConcentration10, "cell 0 1");
				alignmentPanel2.add(primersStockConcentrationSpecific, "cell 0 1");
				alignmentPanel2.add(specificPrimersConcentration, "cell 0 1");
				specificPrimersConcentration.setFont(font3);
			container.add(alignmentPanel2, "cell 0 0,grow");
			lblMm.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblMm.setForeground(Color.RED);
			
			alignmentPanel2.add(lblMm);
		
		
		ButtonGroup fileFormat = new ButtonGroup();
			alignmentPanel.setBorder(BorderFactory.createTitledBorder("Choose a type to save results:"));
				fileFormat.add(doc);
				fileFormat.add(txt);
				fileFormat.add(xls);
				fileFormat.add(pdf);
				alignmentPanel.add(doc);
				txt.setSelected(true);
				alignmentPanel.add(txt);
				alignmentPanel.add(xls);
				alignmentPanel.add(pdf);
		container.add(alignmentPanel, "cell 1 0,grow");
		
		container.add(tabbedPaneHowToUse, "cell 2 0 1 8,grow");
					tabbedPaneHowToUse.setForeground(new Color(128, 0, 0));
					tabbedPaneHowToUse.setBackground(new Color(255, 222, 173));
		
/**TabbedPane How to use*/
			tabbedPaneHowToUse.add("How to use", howToUseLabel);
				howToUseLabel.setForeground(new Color(128, 0, 0));
				howToUseLabel.setVerticalAlignment(SwingConstants.TOP);
				howToUseLabel.setFont(new Font("Arial", Font.PLAIN, 14));
				howToUseLabel.setText(Description.plainText);
				
/**TabbedPane Receipt*/
			tabbedPaneHowToUse.add("Receipt", receiptLabel);
				String caution = "<html><h2><font color=red><ul><b><i>You have not make a receipt yet.<h3><br>"
				+ "<ul><font color=red><i>To make a receipt, idicate all nesessary values in <br>the cells</html>";
				receiptLabel.setText(caution);

/**TabbedPane About the PMC*/
			tabbedPaneHowToUse.add("About the PMC", aboutLabel);
				aboutLabel.setFont(new Font("Arial", Font.PLAIN, 14));
				String aboutAuthor = "<html><br><b>This software is free for use. It was developed by:"
					+ "<h3><ul><ul><font color=red><b><i>Serhiy Voychuk</b></i></ul></ul></h3><br>"
					+ "<ul>Any reccomendation on improvment of this soft,<br> "
					+ "please send to <font color=red>svoychuk@hotmail.com</font><br><br><br><br>"
					+ "<ul>2018, Kyiv, Ukraine</html>";
				aboutLabel.setText(aboutAuthor);

						
		container.add(btnNewButton, "flowx,cell 0 1,alignx left,growy");
			btnSaveResults.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.addActionListener(new btnStocksCalculator());
		container.add(btnSaveResults, "cell 1 1,alignx center");
			btnSaveResults.addActionListener(new BtnSaveResult());
		container.add(volumeOfRMixtureL, "flowx,cell 0 2,alignx left,growy");
		container.add(volumeOfRMixture, "cell 1 2,grow");
		container.add(desirableVolumeOfMixL, "flowx,cell 0 3,alignx left,growy");
		container.add(desirableVolumeOfMix, "cell 1 3,grow");
		container.add(samplesQuantityL, "cell 0 4,grow");
		container.add(samplesQuantity, "cell 1 4,grow");
		container.add(primersQuantityL, "flowx,cell 0 5,alignx left,growy");
		container.add(primersQuantity, "cell 1 5,grow");
		container.add(primersConcentrationL, "flowx,cell 0 6,alignx left,growy");
		container.add(primersConcentration, "cell 1 6,grow");
		container.add(button, "cell 0 7,grow");
			button.addActionListener(new ButtonEventListener());
		container.add(helpLabel_1, "cell 0 2,alignx left,aligny top");
			String help1 = "<html><h4><font color=red>This is a sum of volumes of:<br> "
					+ "MasterMix + PrimersMix + DNA/RNA template + diWater.<br><br>"
					+ "Usually the volume of PCR reaction is indicated in the Protocol <br>to the kit and usually it is between 20-100 mkL.</h4><br></html>";
			helpLabel_1.setToolTipText(help1);
		container.add(helpLabel_2, "cell 0 3,alignx left,aligny top");
			String help2 = "<html><h4><font color=red>It is reccomended to prepare at first a mixure of primers <br>"
					+ "and then take aliquotes and add them to the MasterMix.<br>"
					+ "The \"desirable volume of Primers Mixture\" is a volume of <br>"
					+ "one such an aliquot that you'll add to the MasterMix. <br>"
					+ "The programm will autoamtically calculate the Total Volume <br>"
					+ "of the Primers Mixture that you'll have to prepare in accordance<br>"
					+ "to the quantity of samples that you've indicated.</h4></html>";
			helpLabel_2.setToolTipText(help2);
		container.add(helpLabel_4, "cell 0 6,alignx left,aligny top");
			String help4 = "<html><h4><font color=red>Normally the recommended concentrations are within the <br>"
					+ "range 0.1-0.5mkM of each primer per PCR reaction.</h4></html>";
			helpLabel_4.setToolTipText(help4);
		container.add(helpLabel_3, "cell 0 5,alignx left,aligny top");
		String help3 = "<html><h4><font color=red>This is a summ of all primers (!!! and NOT the pares of primers !!!) that you'll use.<br>"
					+ "For example, if you're going to use one pare of primers (one Forward and one Reverse) <br>"
					+ "than idicate number 2 as a \"quantity of primers\".</h4></html>";
			helpLabel_3.setToolTipText(help3);
	}
	
/* Calculations and presentation of Results: 
	  	mixVolume = desirableVolumeOfMix * samplesQuantity
		primersQFromStock = samplesQuantity * stockDilution * (volumeOfRMixture/20)
		water = mixVolume - (primersQFromStock * primersQuantity)
**/
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed (ActionEvent e){
			
			try {
			if (primersStockConcentration100.isSelected() || primersStockConcentration10.isSelected() || primersStockConcentrationSpecific.isSelected() ) {
				double primerConcentration = 0;
				double primerStockConcentration = 0;
				if (primersStockConcentration100.isSelected()) {
					primerConcentration = Double.parseDouble(primersConcentration.getText()); primerStockConcentration = 100;
					}
				if (primersStockConcentration10.isSelected()) {
					primerConcentration = Double.parseDouble(primersConcentration.getText()) * 10; primerStockConcentration = 10;
					}
				if (primersStockConcentrationSpecific.isSelected()) {
					primerConcentration = Double.parseDouble(primersConcentration.getText()) * 100 / Double.parseDouble(specificPrimersConcentration.getText());
					primerStockConcentration = Double.parseDouble(specificPrimersConcentration.getText());}
												
				final double MixVolume = Double.parseDouble(desirableVolumeOfMix.getText()) * Double.parseDouble(samplesQuantity.getText());
				final double PrimersQFromStock = Double.parseDouble(samplesQuantity.getText()) * primerConcentration * (Double.parseDouble(volumeOfRMixture.getText())/20);
				final double WaterQuantity = MixVolume - (PrimersQFromStock * Double.parseDouble(primersQuantity.getText()));
					BigDecimal bdPQS = new BigDecimal(PrimersQFromStock);
					BigDecimal bdWQ = new BigDecimal(WaterQuantity);
					String bdPrimersQFromStock = bdPQS.setScale(2,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			        String bdWaterQuantity = bdWQ.setScale(2,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			        
		/*Warning for the incorrectly entered data by user: **/
				if (WaterQuantity < 0) {
					String message1 = "Incorect values were introduced!!!\n Please check all the values once more.";
					JOptionPane.showMessageDialog(null, message1, "Output", JOptionPane.PLAIN_MESSAGE);
					}
				
		/*Presentation and Saving Results in *.doc and *.xls**/	
				message = "<html><h3><b><font color=red>HERE IS YOUR RECEIPT: </font></b></h3>"
						+ "<b>PRECAUTIONS: </b><br>"
						+ "The primers' stocks are " + primerStockConcentration + " mM solutions.<br>"
						+ "The PCR Reaction Mixture is " + volumeOfRMixture.getText() + " mkL.<br>"
						+ "The desirable volume of Primers Mixture is " + desirableVolumeOfMix.getText() + " mkL.<br>"
						+ "The desirable primers concentration in PCR mix is " + primersConcentration.getText() + " mkM.<br>"
						+ "<br>"
						+ "<b>PRIMERS' MIXTURE RECIEPT: </b><br>"
						+ "The total volume of the Primers' Mixture will be " + MixVolume + " mkL.<br>"
						+ "<b>To make it:</b><br>"
						+ "Add into a DNase/RNase free tube:<br>"
						+ "<font color=blue><b><li>diWater: " + bdWaterQuantity + " mkL.<br>"
						+ "<li>Primers from the stocks: " + bdPrimersQFromStock + " mkL of each.</b></font>"
						+ "Mix well by pipetting.<br>"
						+ "<b><font color=blue>USE: </font></b>" + Double.parseDouble(desirableVolumeOfMix.getText()) + " mkL of Primers Mix per each PCR reaction.</html>";
			
				receiptLabel.setText(message);
				tabbedPaneHowToUse.setSelectedIndex(1);
				
		/*Saving Results in *.txt**/	
				messagetxt = "HERE IS YOUR RECEIPT: \n\n"
						+ "PRECAUTIONS: \n"
						+ "    The primers' stocks are " + primerStockConcentration + " mM solutions.\n"
						+ "    The PCR Reaction Mixture is " + volumeOfRMixture.getText() + " mkL.\n"
						+ "    The desirable volume of Primers Mixture is " + desirableVolumeOfMix.getText() + " mkL.\n"
						+ "    The desirable primers concentration in PCR mix is " + primersConcentration.getText() + " mkM.\n\n"
						+ "PRIMERS' MIXTURE RECIEPT: \n"
						+ "    The total volume of the Primers' Mixture will be " + MixVolume + " mkL.\n"
						+ "To make it:\n"
						+ "    Add into a DNase/RNase free tube:\n"
						+ "    1. diWater: " + bdWaterQuantity + " mkL.\n"
						+ "    2. Primers from the stocks: " + bdPrimersQFromStock + " mkL of each.\n"
						+ "    Mix well by pipetting.\n\n"
						+ "USE: \n" + "    " + Double.parseDouble(desirableVolumeOfMix.getText()) + " mkL of Primers Mix per each PCR reaction.";
			
		}
				
/* In case of Incorrect behavior:
**/
			else {if (primersStockConcentrationSpecific.isSelected()) {
				String message1 = "Primers' stock concentration was not inicated!\nPress Ok and indicate the concentration of primers' stocks.";
			JOptionPane.showMessageDialog(null, message1, "Output", JOptionPane.PLAIN_MESSAGE);}
			}
		} catch (NumberFormatException c){
			String message = "Not enough data to make calculations!\nAll cells should be filled.";
			JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
		}
		}	
	}
}



	
	
