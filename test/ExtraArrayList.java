import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs2321.ArrayList;

public class ExtraArrayList {

	private ArrayList<String> T = init();
	public ArrayList<String> init() {
		return new ArrayList<String>();
	}
	
	@Before
	public void setup() throws Throwable {
		/* insert "A", "B", "C" */
			T.addLast("A");
			T.addLast("B");
			T.addLast("C");
			T.addLast("D");
			T.addLast("E");
			T.addLast("F");
			T.addLast("G");
			T.addLast("H");
			T.addLast("I");
			T.addLast("J");
			T.addLast("K");
			T.addLast("L");
			T.addLast("M");
			T.addLast("N");
	}
	
	@Test
	public void test1() {
		T.addLast("O");
		T.addLast("P");
		T.addLast("Q");
		T.addLast("R");
		T.addLast("S");
		org.junit.Assert.assertEquals((Object)32, (Object)T.capacity());
	}

}
