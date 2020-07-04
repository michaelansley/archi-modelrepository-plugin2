package com.archimatetool.modelrepository.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

    private static final String BUNDLE_NAME = "com.archimatetool.modelrepository.actions.messages"; //$NON-NLS-1$

    public static String AbstractModelAction_0;

    public static String AbstractModelAction_1;

    public static String AbstractModelAction_2;

    public static String PropertiesAction_0;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
