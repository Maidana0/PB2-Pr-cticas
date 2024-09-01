package salaDeCine;

public class SalaDeCine {
	public Boolean[][] butacas;

	public SalaDeCine() {
		this.butacas = new Boolean[6][6];
		generarButacas();
	}

	public SalaDeCine(int butacas, int filas) {
		int cantButacasTotales = butacas > 1 ? butacas : 1;
		int cantFilas = filas > 0 && cantButacasTotales >= filas ? filas : 1;
		int cantButacasPorFila = cantButacasTotales / cantFilas;
		this.butacas = new Boolean[cantFilas][cantButacasPorFila];
		generarButacas();
	}

	public boolean estaVacia() {
		boolean estaVacia = true;
		int f = 0;

		while (estaVacia && f < this.butacas.length) {
			for (int b = 0; b < this.butacas[f].length; b++) {
				if (!this.butacas[f][b]) {
					estaVacia = false;
					break;
				}
			}
			f++;
		}

		return estaVacia;
	}

	public boolean laButacaEstaOcupada(int fila, int butaca) {
		boolean estaOcupada = false;
		if (!this.butacas[fila][butaca]) {
			estaOcupada = true;
		}
		return estaOcupada;
	}

	public boolean ocuparButaca(int fila, int butaca) {
		boolean butacaOcupadaCorrectamente = false;

		if (!this.laButacaEstaOcupada(fila, butaca)) {
			this.butacas[fila][butaca] = false;
			butacaOcupadaCorrectamente = true;
		}

		return butacaOcupadaCorrectamente;
	}

	public int obtenerCantidadDeButacasOcupadas() {
		int butacasOcupadas = 0;
		for (int f = 0; f < this.butacas.length; f++) {
			for (int b = 0; b < this.butacas[f].length; b++) {
				if (!this.butacas[f][b]) {
					butacasOcupadas++;
				}
			}
		}
		return butacasOcupadas;
	}

	public boolean hayEspacioPara(int cantidadDePersonas) {
		int butacasConsecutivas;

		for (int f = 0; f < this.butacas.length; f++) {
			butacasConsecutivas = 0;
			for (int b = 0; b < this.butacas[f].length; b++) {
				if (this.butacas[f][b]) {
					butacasConsecutivas++;
					if (butacasConsecutivas >= cantidadDePersonas) {
						return true;
					}
				} else {
					butacasConsecutivas = 0;
				}
			}
		}

		return false;
	}

	public String verButacas() {
		String info = "L = LIBRE || O = OCUPADA\n----------------------------\n";
		for (int f = 0; f < this.butacas.length; f++) {
			info += "\nFila " + (f + 1) + ": ";
			for (int b = 0; b < this.butacas[f].length; b++) {
				info += "[" + (b + 1) + " = " + (this.butacas[f][b] ? "L" : "O") + "] ";
			}
		}
		return info;
	}

	private void generarButacas() {
		for (int fila = 0; fila < this.butacas.length; fila++) {
			for (int butaca = 0; butaca < this.butacas[fila].length; butaca++) {
				butacas[fila][butaca] = true;
			}
		}
	}

	public Boolean[][] getButacas() {
		return this.butacas;
	}

}
