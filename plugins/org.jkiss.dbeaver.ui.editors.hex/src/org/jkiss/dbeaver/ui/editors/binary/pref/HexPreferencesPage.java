        super.performDefaults();
    public static final String DEFAULT_WIDTH_VALUE = "8";
        store.setValue(HexEditorPreferences.HEX_FONT_SIZE, fontData.getHeight());
    @Override
    /* (non-Javadoc)
import org.jkiss.dbeaver.ui.editors.binary.HexEditorPreferences;
        PrefUtils.savePreferenceStore(store);
 * you may not use this file except in compliance with the License.
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
        store.setValue(HexEditorPreferences.HEX_FONT_STYLE, fontData.getStyle());

    public static final String PROP_DEF_WIDTH = "default.hex.width";
 *
    public static final String PROP_FONT_DATA = "prop.hex.font.data";
    }
    @Override
     * @see HexPreferencesPage#performOk()
public class HexPreferencesPage extends AbstractPrefPage implements IWorkbenchPreferencePage {

     */
        store.firePropertyChangeEvent(PROP_DEF_WIDTH, 0, preferences.getDefWidth());
     * Get font data information common to all plugin editors. Data comes from preferences store.
        FontData fontData = getPrefFontData();
 * DBeaver - Universal Database Manager

} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new FontData(fontName, fontSize, fontStyle);
    protected void performDefaults() {
            fontSize = 10;
 * to the main plug-in class. That way, preferences can be accessed directly via the preference store.
    public static String getDefaultWidth() {
     */
        int fontStyle = store.getInt(HexEditorPreferences.HEX_FONT_STYLE);

        FontData fontData = preferences.getFontData();


    /**
import org.jkiss.dbeaver.ui.editors.binary.HexEditControl;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        String defWidth = store.getString(HexEditorPreferences.HEX_DEF_WIDTH);
/*
        String defWidth = getDefaultWidth();
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
        preferences.resetDefWidthValue(DEFAULT_WIDTH_VALUE);
    public static FontData getPrefFontData() {
            fontName = HexEditControl.DEFAULT_FONT_NAME;
import org.eclipse.swt.graphics.FontData;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @NotNull
        if (!CommonUtils.isEmpty(fontName) && fontSize > 0) {
        if (fontSize == 0) {
 */
 * This page is used to modify preferences only. They are stored in the preference store that belongs


import org.eclipse.swt.widgets.Control;
        preferences.setFontData(null);
        String fontName = store.getString(HexEditorPreferences.HEX_FONT_NAME);
        return true;




        store.firePropertyChangeEvent(PROP_FONT_DATA, null, fontData);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    /**
    public boolean performOk() {
import org.eclipse.ui.IWorkbench;
 * limitations under the License.
        preferences = new HexPreferencesManager(fontData, defWidth);
        if (CommonUtils.isEmpty(fontName)) {

 *
        int fontSize = store.getInt(HexEditorPreferences.HEX_FONT_SIZE);
    private HexPreferencesManager preferences = null;
     *
        }
import org.jkiss.utils.CommonUtils;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * <p/>
 * This class represents a preference page that is contributed to the Preferences dialog.
    }

     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
    /**
     * @return font data to be used by plugin editors. Returns null for default font data.
 * You may obtain a copy of the License at

    }
     */
        store.setValue(HexEditorPreferences.HEX_FONT_NAME, fontData.getName());
    public void init(IWorkbench workbench) {
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.utils.PrefUtils;
    protected Control createPreferenceContent(@NotNull Composite parent) {
     */
import org.eclipse.swt.widgets.Composite;
        return HexEditControl.DEFAULT_FONT_DATA;
        store.setValue(HexEditorPreferences.HEX_DEF_WIDTH, preferences.getDefWidth());
 * See the License for the specific language governing permissions and
import org.eclipse.ui.IWorkbenchPreferencePage;
        }

        return CommonUtils.isEmpty(defWidth) ? DEFAULT_WIDTH_VALUE : defWidth;

import org.jkiss.code.NotNull;
    /**
 */
package org.jkiss.dbeaver.ui.editors.binary.pref;
    }
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
     * @see HexPreferencesPage#performDefaults()
        return preferences.createPreferencesPart(parent);
    @Override
/**
    }
     * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
