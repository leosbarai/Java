package exercicio7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import votacao.Votacao;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2004));
	}

	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2002));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 1993));
	}
	
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto e obrigatorio", Votacao.podeVotar("Ana", 1949));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto e facultativo", Votacao.podeVotar("Pedro", 1947));
	}
}
