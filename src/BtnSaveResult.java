import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class BtnSaveResult implements ActionListener {

	static JRadioButton doc = PCR_GUI_JPanel.doc;
	static JRadioButton txt = PCR_GUI_JPanel.txt;
	static JRadioButton xls = PCR_GUI_JPanel.xls;
	static JRadioButton pdf = PCR_GUI_JPanel.pdf;
	private File dataFile;
	private String fileResults = "";
	
	public void actionPerformed(ActionEvent e) {
		
/* Save results in various formats:
**/			
	if (doc.isSelected()) {fileResults = "Primers_Mixture_Data.doc";}
	if (txt.isSelected()) {fileResults = "Primers_Mixture_Data.txt";}
	if (xls.isSelected()) {fileResults = "Primers_Mixture_Data.xls";}
	if (pdf.isSelected()) {fileResults = "Primers_Mixture_Data.pdf";}
		
	File filePath = new File(System.getProperty("user.home"), "Desktop");
		dataFile = new File(filePath, fileResults);
	
	try {
		if(!dataFile.exists())
			dataFile.createNewFile();
			
/*Add current time to Results Report (dataFile)**/				
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
			PrintWriter pw = new PrintWriter (dataFile);
			if (!txt.isSelected()) {
			pw.println(sdf.format(new Date()) + "\n\n" + PCR_GUI_JPanel.message);}
			else {pw.println(sdf.format(new Date()) + "\n\n" + PCR_GUI_JPanel.messagetxt);}
			pw.close();
			
/*Open a created dataFile**/	
		java.awt.Desktop.getDesktop().open(dataFile);
		} 
	catch (IOException a) {}	
	}		
}
