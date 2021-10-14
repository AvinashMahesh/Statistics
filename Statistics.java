public class Statistics {

	private int [] array;
	
	public Statistics()
	{
		array = new int [1000];
		
		for (int a = 0; a < array.length; a++)
			array[a] = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
					
	}
			
	
	public double calcAvg() {
		double avgtot = 0;
		for(int n = 0; n < array.length; n++)
		{
			avgtot += array[n];
		}
		double avg = avgtot / 1000;
		return avg;
	}  

	public int getMin() { 
	
		int min = array[0];
		  for(int i = 0; i < array.length; i++){
		    if (array[i] < min) {
			  min = array[i];
			}
		  }
		  return min;

	}  //returns the lowest number in the array 

	public int getMax() { 
		
		int max = array[0];
		  for(int i = 0; i < array.length; i++){
		    if (array[i] > max) {
			  max = array[i];
			}
		  }
		  return max;
		  
	}  //returns the highest number in the array

	public double calcStdDev() { 
		int sum = 0;
		int avg = 0; 
		int summ = 0;
		double stdv;

		for(int a = 0; a < array.length; a++) 
			sum += array[a];
		
		avg = sum / 1000;

		for(int a = 0; a < array.length; a++) {
			summ += Math.pow ((array[a] - avg), 2);
		}

		stdv = Math.sqrt(summ / 999);

		return stdv;
	}  
	  //returns the standard deviation using values from the array and calculated
	  //from the following formula
	  public void displayHistogram() { 
		int [] freq = new int[18];

		for(int b = 0; b < freq.length; b++) {
			freq[b] = 0;
		}

		int n = 0;

		for(int i = 0; i < array.length; i++) {
			n = array[i];
			freq[n - 1]++;
		}

		int times = 0;
		int num = 1;

		System.out.println("  Frequency Distribution Table");

		System.out.print("  ----------------------------\n\n");

		for(int a = 0; a < freq.length; a++) {
			times = freq[a] / 5;
			
			if(freq[a] % 5 != 0)
				times ++;
			
			System.out.print(num + " | \t");

			for(int c = 0; c < times; c++) {
				System.out.print("*");
			}

			System.out.println();
			num++;
		}
		
	}  
	   

	public String toString() { 
		String grid = "";
		int count = 0;
		for(int a = 0; a < array.length; a++) {
			grid += array[a] + "   ";
			count ++;
			
			if(count % 25 == 0) {
				grid += "\n";
			}
		}
		return grid; 
	}  

	
}


