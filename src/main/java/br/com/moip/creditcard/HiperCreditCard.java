package br.com.moip.creditcard;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HiperCreditCard {

   private static final Set<String> HIPER_BINS = new TreeSet<>(Arrays.asList(
            "637095", "637612", "637599", "637609", "637568",
            "384100", "384140", "384160", "606282"
    ));

    public static boolean isBrandHiper(final String number) {
        return number != null
                && number.length() == 16
                && HIPER_BINS.contains(number.substring(0,6));
    }
}

