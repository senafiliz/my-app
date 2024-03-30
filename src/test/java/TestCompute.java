import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;
  MessageQueue mq;	
  @Test
  public void example() {
    mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void size_0() {
  	mq = mock(MessageQueue.class); 
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    assertEquals(-1, c.countNumberOfOccurrences("bil481"));
  }
  @Test
  public void notContainsString() {
    mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(10);
    when(mq.contains("bil481")).thenReturn(false);
    assertEquals(0, c.countNumberOfOccurrences("bil481"));
  }
  @Test
  public void countNot0() {
  	mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.getAt(0)).thenReturn("bil481");
    when(mq.contains("bil481")).thenReturn(true);
    assertEquals(1, c.countNumberOfOccurrences("bil481"));
  }
  @Test
  public void count0() {
  	mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.getAt(0)).thenReturn("sena");
    when(mq.contains("bil481")).thenReturn(true);
    assertEquals(0, c.countNumberOfOccurrences("bil481"));
  }
}
