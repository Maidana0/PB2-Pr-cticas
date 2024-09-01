package salaDeCineTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import salaDeCine.SalaDeCine;

public class TestSalaDeCine {
	private SalaDeCine salaDeCine;

	@Before
	public void inicializacion() {
		this.salaDeCine = new SalaDeCine();
	}

	@Test
	public void dadoQueExisteUnaSalaDeCineVaciaCon6FilasY6AsientosPorFilaCuandoConsultoSiEstaVaciaEntoncesObtengoComoRespuestaTrue() {
		boolean valorObtenido = this.salaDeCine.estaVacia();
		assertTrue(valorObtenido);
	}

	@Test
	public void dadoQueExisteUnaSalaDeCineVaciaCon6FilasY6AsientosPorFilaCuandoConsultoSiLaButaca3DeLaFila3EstaOcupadaEntoncesObtengoComoRespuestaFalse() {
		boolean butacaOcupada = this.salaDeCine.laButacaEstaOcupada(3, 3);
		assertFalse(butacaOcupada);
	}

	@Test
	public void dadoQueExisteUnaSalaDeCineVaciaCon6FilasY6AsientosPorFilaCuandoOcupoLaButaca3DeLaFila3EntoncesObtengoComoRespuestaTrue() {
		boolean butacaOcupadaCorrectamente = this.salaDeCine.ocuparButaca(3, 3);
		assertTrue(butacaOcupadaCorrectamente);
	}

	@Test
	public void dadoQueExisteUnaSalaDeCineCon1ButacaOcupadaCuandoConsultoLaCantidadDeButacasOcupadasEntoncesObtengoComoRespuesta1() {
		this.salaDeCine.ocuparButaca(3, 3);
		int cantidadDeButacasOcupadas = this.salaDeCine.obtenerCantidadDeButacasOcupadas();
		int valorEsperado = 1;
		assertEquals(valorEsperado, cantidadDeButacasOcupadas);
	}
	
	@Test
	public void dadoQueExisteUnaSalaDeCineVaciaCon6FilasY6AsientosPorFilaCuandoConsultoSiEsPosibleAcomodarA3PersonasConsecutivasEnLaMismaFilaEntoncesObtengoComoRespuestaTrue() {
		boolean hayEspacioPara3PersonasJuntasEnLaMismaFila = this.salaDeCine.hayEspacioPara(3);
		assertTrue(hayEspacioPara3PersonasJuntasEnLaMismaFila);
	}
}
