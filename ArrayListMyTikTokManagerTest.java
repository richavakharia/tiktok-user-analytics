package tiktokers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListMyTikTokManagerTest {
	private MyTikTokManager dir;
	private MyTikTokManager topTen;
	
	@Test 
	 public void anEmptyDirectoryHasNoRumpledEater() 
		 {
		     
		     assertNull(dir.get("@rumpledeater", "Followers"));
	 }
	@Test
	public void basicRemove() {
		
		dir.put("@Cam Wilder", "followers", "120000");
		dir.remove("@Cam Wilder", "followers");
		assertNull(dir.get("@Cam Wilder", "followers"));
		
	}
	@Test
	public void removeNonExistentEntryEmptyManager() {
		
		assertNull(dir.remove("BryceHall", "followers"));
		

	}
	@Test
	public void removeNonExistentEntryNonEmptyManager() {
		
		dir.put("Josh", "followers", "1223232");
		assertNull(dir.remove("CoreyKenshin", "followers"));
		
		
	}
	@Test
	public void topTenContainsBurak() {
		assertNotNull(topTen.get("@cznburak", "Followers"));
	}
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dir = new ArrayListMyTikTokManager();
		topTen = new ArrayListMyTikTokManager();
		topTen.load("src/Top10TikTokers.txt");	
		System.out.println(System.getProperty("user.dir"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
