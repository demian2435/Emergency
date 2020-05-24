package it.polito.tdp.Emergency.model;

import java.time.LocalTime;

public class Event implements Comparable<Event> {

	public enum EventType {
		ARRIVAL, // arrivo paziente
		TRIAGE, // assegno codice triage
		FREE_STUDIO, // si libera uno studio
		TREATED, // paziente curato
		TIMEOUT, // in caso superata attesa
		TICK // Controllo studi vuoti
	}

	private LocalTime time;
	private EventType type;
	private Paziente paziente;

	public Event(LocalTime time, EventType type, Paziente paziente) {
		this.time = time;
		this.type = type;
		this.paziente = paziente;
	}
	
	public Paziente getPaziente() {
		return paziente;
	}

	public LocalTime getTime() {
		return time;
	}

	public EventType getType() {
		return type;
	}
	
	

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", paziente=" + paziente + "]";
	}

	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.time);
	}
}
