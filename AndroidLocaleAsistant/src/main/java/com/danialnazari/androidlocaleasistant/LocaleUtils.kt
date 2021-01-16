package com.danialnazari.localeassistant

import android.annotation.TargetApi
import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Build
import java.util.*

class LocaleUtils {
    companion object {

        private const val SELECTED_LANGUAGE = "Locale.Utils.Selected.Language"
        private const val SELECTED_COUNTRY = "Locale.Utils.Selected.Country"

        @JvmStatic
        public fun updateBaseContextLocale(languageCode:String,context: Context): Context? {
            val locale = Locale(languageCode)
            Locale.setDefault(locale)
            return if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {
                updateResourcesLocale(context, locale)
            } else updateResourcesLocaleLegacy(context, locale)
        }
        @JvmStatic
        private fun updateResourcesLocale(context: Context, locale: Locale): Context {
            val configuration = Configuration(context.resources.configuration)
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration);
        }
        @JvmStatic
        private fun updateResourcesLocaleLegacy(context: Context, locale: Locale): Context? {
            val resources = context.resources
            val configuration: Configuration = resources.configuration
            configuration.locale = locale
            resources.updateConfiguration(configuration, resources.displayMetrics)
            return context
        }
    }
}