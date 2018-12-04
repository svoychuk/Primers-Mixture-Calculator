import java.math.BigDecimal;

public class StocksCalculatorMethods {
	private static double stockMolarity = textToDouble(1);
	private static double result;
	
	private static double textToDouble(int number) {
		return Double.parseDouble(btnStocksCalculator.arrayOfJTextFields[number].getText());
		}
	
	private static BigDecimal bd(double result) {
		return new BigDecimal(result);
		}
	
	@SuppressWarnings("deprecation")
	private static String result() {
		return bd(result).setScale(1,BigDecimal.ROUND_HALF_EVEN).toPlainString();
		}
	
/**Button 1*/
		public static String waterQuantityString1() {
			result = 1000 * textToDouble(2) / stockMolarity;
			return result();
			}

/**Button 2*/
		public static String waterQuantityString2() {
			result = 10 * textToDouble(3) / stockMolarity - 10;
			return result();
			}
		
/**Button 3*/
		public static String primerConcentrationString() {
			result = textToDouble(5) * 0.02 * textToDouble(4);
			return result();
			}
		public static String molarConcentrationString() {
			result = Double.parseDouble(StocksCalculatorMethods.primerConcentrationString()) / 
					330 * 1000000 / textToDouble(6);
			return result();
			}
		public static String waterQuantityString3() {
			result = 10 * Double.parseDouble(StocksCalculatorMethods.molarConcentrationString()) / 
					stockMolarity - 10;
			return result();
			}
		
/**Button 4*/
		public static double AnhydrousMolecularWeight() {
			String textField12String = btnStocksCalculator.textField_8.getText();
				long countCharA = textField12String.toUpperCase().chars().filter(ch -> ch =='A').count();
				long countCharT = textField12String.toUpperCase().chars().filter(ch -> ch =='T').count();
				long countCharG = textField12String.toUpperCase().chars().filter(ch -> ch =='G').count();
				long countCharC = textField12String.toUpperCase().chars().filter(ch -> ch =='C').count();
				long countCharU = textField12String.toUpperCase().chars().filter(ch -> ch =='U').count();
				long countCharI = textField12String.toUpperCase().chars().filter(ch -> ch =='I').count();
			/**	Anhydrous Molecular Weight of ssDNA = (An x 313.21) + (Tn x 304.2) + 
			    + (Cn x 289.18) + (Gn x 329.21) - 61.96*/
				double AnhydrousMolecularWeight = countCharA * 313.21 + countCharT * 304.2 
						+ countCharC * 289.18 + countCharG * 329.21  
						+ countCharU * 290.169 + countCharI * 314 
						- 61.96;
				return AnhydrousMolecularWeight;
			}
			
		public static String amountInNanoMolString() {
			String textField12String = btnStocksCalculator.textField_8.getText();
				long countCharA = textField12String.toUpperCase().chars().filter(ch -> ch =='A').count();
				long countCharT = textField12String.toUpperCase().chars().filter(ch -> ch =='T').count();
				long countCharG = textField12String.toUpperCase().chars().filter(ch -> ch =='G').count();
				long countCharC = textField12String.toUpperCase().chars().filter(ch -> ch =='C').count();
				
			/**Amount in nmol*/			
				result = 100 * textToDouble(7) / 
						(countCharA * 1.54 + countCharT * 0.92 + countCharC * 0.75 + countCharG * 1.17);
				return result();
			}
			
			private static double nanoMoles() {
				return Double.parseDouble(StocksCalculatorMethods.amountInNanoMolString());
			}
			
			/**Amount in mkg*/		
			public static String amountInMkGString() {
				result = nanoMoles() * StocksCalculatorMethods.AnhydrousMolecularWeight()/ 1000;
				return result();
				}
			
			/**Dilution to target concentration*/
			public static String waterQuantityString4() {
				result = 1000 * nanoMoles() / stockMolarity;
				return result();
				}
	
}
