package com.emitrom.pilot.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.impl.PermutationsUtil;
import com.google.gwt.core.linker.IFrameLinker;

public class SwfIFrameLinker extends IFrameLinker {

    @Override
    public String getDescription() {
        return "Flash (" + super.getDescription() + " with support for injected SWF \"scripts\")";
    }

    /**
     * Generate a selection script. The selection information should previously
     * have been scanned using
     * {@link PermutationsUtil#setupPermutationsMap(ArtifactSet)}.
     */
    @Override
    protected String fillSelectionScriptTemplate(StringBuffer selectionScript, TreeLogger logger,
                    LinkerContext context, ArtifactSet artifacts, CompilationResult result)
                    throws UnableToCompleteException {
        String script = super.fillSelectionScriptTemplate(selectionScript, logger, context, artifacts, result);
        return ScriptInjectionUtils.fixScriptInjector(script);
    }

}
