package com.emitrom.pilot.linker;

import java.util.Locale;

class ScriptInjectionUtils {

    public static String fixScriptInjector(String scriptUrl, String scriptInjector) {
        if (scriptUrl.toLowerCase(Locale.ENGLISH).endsWith(".swf")) {
            scriptInjector = scriptInjector.replaceAll("language=", "type=\"application/x-shockwave-flash\"   ");
            scriptInjector = scriptInjector.replaceAll("javascript", "");
        }
        return scriptInjector;
    }

}
