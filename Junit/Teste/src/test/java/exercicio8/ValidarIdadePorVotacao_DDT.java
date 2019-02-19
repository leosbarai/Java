package exercicio8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import junitparams.Parameters;
import votacao.Votacao;

public class ValidarIdadePorVotacao_DDT {
	public String nome;
	public int anoDeNascimento;
	public String resultado;

	public ValidarIdadePorVotacao_DDT(String $nome, int $anoDeNascimento, String $resultado) {
		this.nome = $nome;
		this.anoDeNascimento = $anoDeNascimento;
		this.resultado = $resultado;
	}

	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<object[]> data(){
		return Arrays.asList(new Object[][] {
			{”nome" , ano, ”resultado"},
		});
	}
}
