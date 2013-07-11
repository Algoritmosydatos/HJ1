import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RadiodecarroTest {
	
	float[] botones;
	float sintonia_random=10f;
	float sintonia_random2;
	int posicion = 5;
	
	@Before
	protected void setUp(){
		botones = new float[12];
		botones[posicion+1] = sintonia_random;
		sintonia_random2 = 0;
	}
	
	@After
	protected void tearDown(){
		botones = null;
		sintonia_random = 0f;
		posicion = 0;
	}
	
	@Test
	public void testGuardar() {
		botones[posicion] = sintonia_random;
		assertEquals((int)sintonia_random,(int)botones[posicion]);
	}
	
	@Test
	public void testMemoria(){
		sintonia_random2 = botones[posicion+1];
		assertEquals((int)sintonia_random2,(int)botones[posicion+1]);
	}

}
