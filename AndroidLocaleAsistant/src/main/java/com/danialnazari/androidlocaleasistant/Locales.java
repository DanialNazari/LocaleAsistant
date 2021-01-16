package com.danialnazari.androidlocaleasistant;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class Locales {

    //public static final Locale PERSIAN = new Locale(LocaleConstants.PERSIAN_LANGUAGE_CODE , LocaleConstants.PERSIAN_COUNTRY_CODE);
    //public static final Locale ENGLISH = new Locale(LocaleConstants.ENGLISH_LANGUAGE_CODE , LocaleConstants.ENGLISH_COUNTRY_CODE);

    private static final HashSet<String> rtlLanguage = new HashSet<>();

    static {
        rtlLanguage.add(LocaleConstants.PERSIAN_LANGUAGE_CODE);
    }


    static Set<String> RTL(){
        return rtlLanguage;
    }

    public static Locale getLocale (@NotNull String language){
        switch (language){
            case LocaleConstants.ENGLISH_LANGUAGE_CODE:
                return new Locale(LocaleConstants.ENGLISH_LANGUAGE_CODE ,LocaleConstants.ENGLISH_COUNTRY_CODE);

                default:
                    return new Locale(LocaleConstants.PERSIAN_LANGUAGE_CODE,LocaleConstants.PERSIAN_COUNTRY_CODE);
        }
    }

}
