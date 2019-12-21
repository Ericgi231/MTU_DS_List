import org.junit.*;
import cs2321.*;

@jug.SuiteName("Test CircularArrayQueue Interface {\"A\",\"B\",\"C\"}")
public class ExtraCircularArrayQueue {

	private CircularArrayQueue<String> T = init();
	public CircularArrayQueue<String> init() {

		return new CircularArrayQueue<String>(3);
	
	}

	@Before
	public void setup() throws Throwable {
		/* insert "A", "B", "C" */
			T.enqueue("A");
			T.enqueue("B");
			T.enqueue("C");
	}

	@org.junit.Test(timeout=12000)
	@jug.TestName("enqueue extra")
	public void Test1() throws Throwable {
		T.enqueue("D");
		T.enqueue("E");
		T.enqueue("F");
		T.enqueue("G");
		
		org.junit.Assert.assertEquals("size() is 7", (Object)(7), (Object)(T.size()));
	}
	
	@org.junit.Test(timeout=12000)
	@jug.TestName("Queue is circular")
	public void Test2() throws Throwable {
		T.rotate();
		
		org.junit.Assert.assertEquals("Returned B", "B", (Object)(T.dequeue()));
	}
}