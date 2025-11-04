// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);
		double futurevalue = currentvalue * Math.pow(1+rate, years);
		System.out.println("After " + years + " years, $" + currentvalue + " saved at " + String.format("%.1f", rate*100) + "% will yield $" + (int)futurevalue);
	}
}