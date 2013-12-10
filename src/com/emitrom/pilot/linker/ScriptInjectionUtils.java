package com.emitrom.pilot.linker;

import java.util.regex.Pattern;

class ScriptInjectionUtils {

    private static final Pattern languageJavascriptAttribute = Pattern.compile(
                    "language=((?:\\\\?[\"'])?)javascript\1", Pattern.CASE_INSENSITIVE);

    public static String fixScriptInjector(String scriptInjector) {
        if (scriptInjector.indexOf(".swf") >= 0) {
            scriptInjector = languageJavascriptAttribute.matcher(scriptInjector).replaceAll(
                            "type=$1application/x-shockwave-flash$1");
        }
        return scriptInjector;
    }

}
