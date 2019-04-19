import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KarateTest {

	@Test
	public void tests() {
		Karate karate = new Karate ();
		assertEquals(-1, karate.chop(-1, ary ()));
		assertEquals(0, karate.chop(1, ary (1)));
		assertEquals(1, karate.chop(2, ary(1,2)));
		
		assertEquals(0, karate.chop(1, ary(1, 3, 5)));
		assertEquals(1, karate.chop(3, ary(1, 3, 5)));
		assertEquals(2, karate.chop(5, ary(1, 3, 5)));
		
		assertEquals(1, karate.chop(1, upTo(100000)));
		
	}

	private int[] upTo(int high) {
		int [] result = new int [high];
		for (int i = 0; i < high; i++) {
			result[i] = i;
		}
	
		return result;
	}

	private int[] ary(int... values) {
		
		return values;
	}

}

