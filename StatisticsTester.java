public class StatisticsTester {

	public static void main(String[] args) {
		
		Statistics arry = new Statistics();
		
		double avg = arry.calcAvg();
		int min = arry.getMin();
		int max = arry.getMax();
		double dev = arry.calcStdDev();
		
		System.out.println("Array Average: " + avg);
		System.out.println("Array Min: " + min);
		System.out.println("Array Max: " + max);
		System.out.println("Standard Deviation: " + dev); 
		
		arry.displayHistogram();
		
		System.out.println();
		String a = arry.toString();
		System.out.println(a);
	}

}
 
