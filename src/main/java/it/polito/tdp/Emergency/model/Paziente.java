package it.polito.tdp.Emergency.model;

import java.time.LocalTime;

public class Paziente implements Comparable<Paziente> {

	public enum CodiceColore {
		WHITE, YELLOW, RED, BLACK, UNKNOWN, OUT
	}

	private LocalTime oraArrivo;
	private CodiceColore codiceColore;

	public Paziente(LocalTime oraArrivo, CodiceColore codiceColore) {
		this.oraArrivo = oraArrivo;
		this.codiceColore = codiceColore;
	}

	public LocalTime getOraArrivo() {
		return oraArrivo;
	}

	public CodiceColore getColore() {
		return codiceColore;
	}

	public void setColore(CodiceColore codiceColore) {
		this.codiceColore = codiceColore;
	}

	@Override
	public String toString() {
		return "Paziente [oraArrivo=" + oraArrivo + ", codiceColore=" + codiceColore + "]";
	}

	@Override
	public int compareTo(Paziente o) {
		if (codiceColore == o.codiceColore) {
			return oraArrivo.compareTo(o.oraArrivo);
		} else {
			return o.codiceColore.compareTo(codiceColore);
		}
	}
}
