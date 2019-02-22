package exercicio14;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.Positivos;
import categorias.Smoke;

public class TesteCategorizado {
	
	@Test
	@Category(Smoke.class)
	public void Teste1() {
				
	}
	
	@Test
	@Category(Positivos.class)
	public void Teste2() {
		
	}
	
	@Test
	public void Teste3() {
		
	}
	

}
