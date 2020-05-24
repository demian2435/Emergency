package it.polito.tdp.Emergency.model;

import java.time.Duration;

public class TestSimulator {

	public static void main(String[] args) {
		Simulator sim = new Simulator() ;
		sim.setNS(5);
		sim.setT_ARRIVAL(Duration.ofMinutes(3));
		sim.init();
		sim.run();
		
		System.out.println("** STATISTICHE **") ;
		System.out.format("Studi medici:\t\t%d\n", sim.getNS());
		System.out.format("Pazienti:\t\t\t%d\n", sim.getPazientiTot());
		System.out.format("Dimessi:\t\t\t%d\n", sim.getPazientiDimessi());
		System.out.format("Morti:\t\t\t%d\n", sim.getPazientiMorti());
		System.out.format("Abbandonano:\t\t%d\n", sim.getPazientiAbbandonano());
	}

}
