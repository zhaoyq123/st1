package judgeTri;

import static org.junit.Assert.*;
import static org.hamcrest.Matcher.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTri {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		judgeTri jt = new judgeTri();
		assertEquals("直角三角形",jt.judgeTri(3, 5, 4));
		assertEquals("等边三角形",jt.judgeTri(3, 3, 3));
		assertEquals("等腰三角形",jt.judgeTri(3, 3, 4));
		assertEquals("不是三角形",jt.judgeTri(3, 3, 9));
		assertEquals("普通三角形",jt.judgeTri(3, 7, 9));
	}

}
