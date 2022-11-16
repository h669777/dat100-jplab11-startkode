package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			File file = new File(mappe + filnavn);
			PrintWriter writer = new PrintWriter(file);

			writer.println(samling.getAntall()+ 10);
			for (int i = 0; i < samling.getAntall(); i++) {
				writer.print(samling.getSamling()[i].toString());
			}
			writer.close();
			return true;

		} catch (FileNotFoundException e) {
			return false;
		}

	}
}