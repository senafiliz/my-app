import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  
  @Test
  public void argEquals1() { 
  	assertFalse(new Util().compute(8)); 
  }
  @Test
  public void argEven() { 
  	assertFalse(new Util().compute(8,10)); 
  }
  @Test
  public void argHas0() { 
  	try {
    boolean answer = new Util().compute(8,10,0);
    fail();
  	}
  	catch(RuntimeException e){
  	}
  }
  @Test
  public void sumModTrue() { 
  	assertTrue(new Util().compute(8,10,2));
  }
  @Test
  public void sumModFalse() { 
  	assertFalse(new Util().compute(8,10,5));
  }
  
}
