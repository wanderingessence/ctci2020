
public class p38PrintBinary2 {
	
	
	public String printBinary(double num) {
		if(num >= 1 || num <= 0) return "ERROR";
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		while(num > 0) {
			if(binary.length() >= 32) return "ERROR";
			if(num >= frac) {
				binary.append(1);
				num -= frac;
			} else {
				binary.append(0);
			}
			frac /= 2;
		}
		return binary.toString();
	}
	

}
