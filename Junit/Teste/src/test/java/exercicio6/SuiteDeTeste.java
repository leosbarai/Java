package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import exercicio1.*;
import exercicio2.*;
import exercicio3.*;
import exercicio4.*;
import exercicio5.*;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVedadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class,
	PreEPosCondicoesDaClasse.class
})

public class SuiteDeTeste {

}
