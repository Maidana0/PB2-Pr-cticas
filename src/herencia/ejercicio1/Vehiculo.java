package herencia.ejercicio1;

public class Vehiculo {
	public String patente;
	private Integer pesoMaximo, capacidadDeCarga;

	public Vehiculo() {
		this.patente = this.generarPatente();
	}

	public void cargarPasajeros() {

	}

	public void obtenerCapacidadMaximaDePasajeros() {

	}

	public void obtenerPesoMaximo() {

	}

	private String generarPatente() {
		char placa[] = new char[7];
		placa[0] = generarVocal();
		placa[1] = generarConsonante();
		placa[2] = generarConsonante();
		placa[3] = '-';
		placa[4] = generarNumero();
		placa[5] = generarNumero();
		placa[6] = generarNumero();

		return String.valueOf(placa);
	}

	public static char generarConsonante() {
		return generarRandomChar("BCDFGHJKLMNPQRSTVWXYZ");
	}

	public static char generarVocal() {
		return generarRandomChar("AEIOU");
	}

	public static char generarNumero() {
		return generarRandomChar("0123456789");
	}

	private static char generarRandomChar(String str) {
		char caracteres[] = str.toCharArray();
		int index = (int) (Math.random() * caracteres.length);
		return caracteres[index];
	}
}
