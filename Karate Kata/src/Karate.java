
public class Karate {

	public int chop(int value, int [] array) {
			int low = 0;
			int high = array.length - 1;
			while(low <= high) {
				int index = ((high - low) / 2) + low;
				if (array[index] == value)
					return index;
				else if (array[index] < value)
					low = index + 1;
				else if (array[index] > value)
					high = index - 1;
			}
			return -1;
		}
		
	}

