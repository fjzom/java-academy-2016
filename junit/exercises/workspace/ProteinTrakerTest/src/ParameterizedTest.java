import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.accenture.junit.TrackingService;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;


@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private static TrackingService trackingService = new TrackingService(); 
	private int input;
	private int expected;
	
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{5,5},
			{5,10},
			{-12,0},
			{50,50},
			{1,51}
		});
	}
	
	public ParameterizedTest(int input, int expected){
		this.input = input;		
		this.expected = expected;
	}
	
	@Test
	public void test(){
		if(this.input > 0)
			trackingService.addProtein(this.input);
		else
			trackingService.removeProtein(-this.input);
		assertEquals(expected, trackingService.getTotal());
	}
}
