package theLocaleClass;

import java.util.Currency;
import java.util.Locale;

public class theLocaleClass {

	public static void main(String[] args) {

		Locale us = new Locale("en", "US"); // English - USA
		Locale uk = new Locale("en", "GB"); // English - UK
		Locale mx = new Locale("es", "MX"); // Spanish - MEX
		Locale pa = new Locale("es", "PA"); // Spanish - PAN
		Locale ja = new Locale("ja", "JP"); // Japanese - JAP

		displayMyLocaleInfo(us);
		displayMyLocaleInfo(uk);
		displayMyLocaleInfo(mx);
		displayMyLocaleInfo(pa);
		displayMyLocaleInfo(ja);

	}

	private static void displayMyLocaleInfo(Locale myPassedLocale) {
		Currency currency = Currency.getInstance(myPassedLocale);

		String country = myPassedLocale.getDisplayCountry();
		String language = myPassedLocale.getDisplayLanguage();
		String currencyStr = currency.getDisplayName();

		System.out.println(
				"The country " + country + " speaks " + language + " and uses the currency " + currencyStr + ".");

	}

}
