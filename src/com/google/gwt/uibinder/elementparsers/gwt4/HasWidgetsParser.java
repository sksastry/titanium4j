package com.google.gwt.uibinder.elementparsers.gwt4;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.rebind.FieldWriter;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

/**
 * Parses any widgets that implement
 * {@link com.google.gwt.user.client.ui.HasWidgets}.
 * 
 * This handles all panels that support a single-argument add() method.
 */
public class HasWidgetsParser implements ElementParser {

    public void parse(XMLElement elem, String fieldName, JClassType type, UiBinderWriter writer)
                    throws UnableToCompleteException {
        // Parse children.
        for (XMLElement child : elem.consumeChildElements()) {
            if (!writer.isViewElement(child)) {
                writer.die(child, "Expecting only widgets in %s", elem);
            }
            FieldWriter childField = writer.parseElementToField(child);
            writer.addStatement("%1$s.add(%2$s);", fieldName, childField.getNextReference());
        }
    }
}