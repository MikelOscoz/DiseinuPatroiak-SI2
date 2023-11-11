package businessLogic;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import configuration.UtilDate;
import domain.Event;

public class ProbaIterator {

	public static void main(String[] args) {
		boolean isLocal = true;
		
		Calendar today = Calendar.getInstance();

		int month = today.get(Calendar.MONTH);
		month += 1;
		int year = today.get(Calendar.YEAR);
		if (month == 12) {
			month = 0;
			year += 1;
		}
		
		// Facade objektua lortu lehendabiziko ariketa erabiliz
		BLFacade facadeInterface = new BLFacadeImplementation();
		Date d = new Date(year,month,17);
		//EventIterator i = facadeInterface.getEvents(d);
		EventIterator i = facadeInterface.getEventss(d);
		i.events.add(new Event(3, "Real Sociedad", UtilDate.newDate(year, month, 17)));
		i.events.add(new Event(2, "Barcelona", UtilDate.newDate(year, month, 17)));
		i.events.add(new Event(1, "Atlético-Athletic", UtilDate.newDate(year, month, 17)));
		Event ev;
		
		i.goLast();
		while (i.hasPrevious()) {
			ev = i.previous();
			System.out.println("Primero "+ev.toString());
		}
		// Nahiz eta suposatu hasierara ailegatu garela, eragiketa egiten dugu.
		i.goFirst();
		while (i.hasNext()) {
			ev = i.next();
			System.out.println("Segundo "+ev.toString());
		}
	}

}
