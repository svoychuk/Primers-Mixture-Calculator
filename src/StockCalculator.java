import java.math.BigDecimal;

public class StockCalculator {

	static double stockMolarity = Double.parseDouble(btnStocksCalculator.textField_3.getText());
	
/**Button 1*/
		public static String waterQuantityString1() {
			double waterQuantity1 = 1000 * Double.parseDouble(btnStocksCalculator.textField_5.getText()) / stockMolarity;
				BigDecimal bdWQ = new BigDecimal(waterQuantity1); 
				String waterQuantityString1 = bdWQ.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			return waterQuantityString1;
			}
		
/**Button 2*/
		public static String waterQuantityString2() {
			double waterQuantity2 = 10 * Double.parseDouble(btnStocksCalculator.textField_9.getText()) / stockMolarity - 10;
				BigDecimal bdWQ_3 = new BigDecimal(waterQuantity2); 
				String waterQuantityString2 = bdWQ_3.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			return waterQuantityString2;
			}
		
/**Button 3*/
		public static String primerConcentrationString() {
			double primerConcentration = Double.parseDouble(btnStocksCalculator.textField_6.getText()) * 0.02 * Double.parseDouble(btnStocksCalculator.textField_4.getText());
				BigDecimal pConc = new BigDecimal(primerConcentration);
				String primerConcentrationString = pConc.setScale(3,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			return primerConcentrationString;
			}
		public static String molarConcentrationString() {
			double molarConcentration = Double.parseDouble(StockCalculator.primerConcentrationString()) / 330 * 1000000 / Double.parseDouble(btnStocksCalculator.textField_8.getText());
				BigDecimal mC = new BigDecimal(molarConcentration); 
				String molarConcentrationString = mC.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			return molarConcentrationString;
			}
		public static String waterQuantityString3() {
			double waterQuantity = 10 * Double.parseDouble(StockCalculator.molarConcentrationString()) / stockMolarity - 10;
				BigDecimal bdWQ_1 = new BigDecimal(waterQuantity); 
				String waterQuantityString3 = bdWQ_1.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
			return waterQuantityString3;
			}
		
/**Button 4*/
		public static double AnhydrousMolecularWeight() {
			String textField12String = btnStocksCalculator.textField_12.getText();
				long countCharA = textField12String.chars().filter(ch -> ch =='A').count();
				long countChara = textField12String.chars().filter(ch -> ch =='a').count();
				long countCharT = textField12String.chars().filter(ch -> ch =='T').count();
				long countChart = textField12String.chars().filter(ch -> ch =='t').count();
				long countCharG = textField12String.chars().filter(ch -> ch =='G').count();
				long countCharg = textField12String.chars().filter(ch -> ch =='g').count();
				long countCharC = textField12String.chars().filter(ch -> ch =='C').count();
				long countCharc = textField12String.chars().filter(ch -> ch =='c').count();
				long countCharU = textField12String.chars().filter(ch -> ch =='U').count();
				long countCharI = textField12String.chars().filter(ch -> ch =='I').count();
			/**	Anhydrous Molecular Weight of ssDNA = (An x 313.21) + (Tn x 304.2) + (Cn x 289.18) + (Gn x 329.21) - 61.96*/
				double AnhydrousMolecularWeight = (countCharA * 313.21 + countChara * 313.21) + (countCharT * 304.2 + countChart * 304.2) +
					(countCharC * 289.18 + countCharc * 289.18) + (countCharG * 329.21 + countCharg * 329.21) + countCharU * 290.169 +
					countCharI * 314 - 61.96;
				return AnhydrousMolecularWeight;
			}
			
		public static String amountInNanoMolString() {
			String textField12String = btnStocksCalculator.textField_12.getText();
				long countCharA = textField12String.chars().filter(ch -> ch =='A').count();
				long countChara = textField12String.chars().filter(ch -> ch =='a').count();
				long countCharT = textField12String.chars().filter(ch -> ch =='T').count();
				long countChart = textField12String.chars().filter(ch -> ch =='t').count();
				long countCharG = textField12String.chars().filter(ch -> ch =='G').count();
				long countCharg = textField12String.chars().filter(ch -> ch =='g').count();
				long countCharC = textField12String.chars().filter(ch -> ch =='C').count();
				long countCharc = textField12String.chars().filter(ch -> ch =='c').count();
				
			/**Amount in nmol*/			
				double amountInNanoMol = 100*Double.parseDouble(btnStocksCalculator.textField_7.getText())/((countCharA * 1.54 + countChara * 1.54) + (countCharT * 0.92 + countChart * 0.92) +
						(countCharC * 0.75 + countCharc * 0.75) + (countCharG * 1.17 + countCharg * 1.17));
				BigDecimal bAINM = new BigDecimal(amountInNanoMol); 
				String amountInNanoMolString = bAINM.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
				return amountInNanoMolString;
			}
			
			public static String amountInMkGString() {
			/**Amount in mkg*/				
				double amountInMkG = Double.parseDouble(StockCalculator.amountInNanoMolString()) * StockCalculator.AnhydrousMolecularWeight()/ 1000;
				BigDecimal bAIMG = new BigDecimal(amountInMkG); 
				String amountInMkGString = bAIMG.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
				return amountInMkGString;
			}
		
			public static String waterQuantityString4() {
			/**Dilution to target concentration*/
				double waterQuantity4 = 1000 * Double.parseDouble(StockCalculator.amountInNanoMolString()) / stockMolarity;
				BigDecimal bdWQ_4 = new BigDecimal(waterQuantity4); 
				String waterQuantityString4 = bdWQ_4.setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
				return waterQuantityString4;
	}
	
}
