package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {
		int str = 20;
		innleggtabell = new Innlegg[str];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];

	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < innleggtabell.length; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		if (finnInnlegg(innlegg) != -1) {
			return true;
		}
		return false;
	}

	public boolean ledigPlass() {

		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				return true;
			}
		}
		return false;

	}

	public boolean leggTil(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return false;
			}
		}

		innleggtabell[nesteLedige] = innlegg;
		nesteLedige++;

		return true;
	}

	public String toString() {
		String n = "\n";
		String string = "";

		for (int i = 0; i < innleggtabell.length; i++) {
			string += innleggtabell[i].toString();
		}

		return getAntall() + n + string;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		Innlegg[] temp = innleggtabell;
		innleggtabell = new Innlegg[innleggtabell.length * 2];

		for (int i = 0; i < temp.length; i++) {
			innleggtabell[i] = temp[i];
		}
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		int ant = 0;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (keyword == innleggtabell[i].getTekst()) {
				ant++;
			}
		}

		int[] ider = new int[ant];
		return ider;

	}
}