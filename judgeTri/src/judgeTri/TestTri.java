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
		assertEquals("ֱ��������",jt.judgeTri(3, 5, 4));
		assertEquals("�ȱ�������",jt.judgeTri(3, 3, 3));
		assertEquals("����������",jt.judgeTri(3, 3, 4));
		assertEquals("����������",jt.judgeTri(3, 3, 9));
		assertEquals("��ͨ������",jt.judgeTri(3, 7, 9));
	}

}
