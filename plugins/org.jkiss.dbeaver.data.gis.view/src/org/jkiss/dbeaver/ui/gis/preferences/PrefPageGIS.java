        final Composite composite = UIUtils.createComposite(parent, 1);
    }

 *
        {
 *
import org.eclipse.swt.widgets.Control;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
    @Override
            maxObjectsText = UIUtils.createLabelText(group, GISMessages.pref_page_gis_viewer_label_max_objects, preferences.getString(GeometryViewerConstants.PREF_MAX_OBJECTS_RENDER), SWT.BORDER);
        preferences.setValue(GeometryViewerConstants.PREF_MIN_ZOOM_LEVEL, CommonUtils.toInt(minZoomLevelSpinner.getText()));

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

            minZoomLevelSpinner = UIUtils.createLabelSpinner(group, GISMessages.pref_page_gis_viewer_spinner_min_zoom_level, preferences.getInt(GeometryViewerConstants.PREF_MIN_ZOOM_LEVEL), GeometryViewerConstants.DEFAULT_MIN_ZOOM_LEVEL, GeometryViewerConstants.DEFAULT_MAX_ZOOM_LEVEL);
        final DBPPreferenceStore preferences = GISViewerActivator.getDefault().getPreferences();


    private Text defaultSridText;
    private Spinner minZoomLevelSpinner;
        final DBPPreferenceStore preferences = GISViewerActivator.getDefault().getPreferences();
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.gis.internal.GISViewerActivator;
        maxObjectsText.setText(preferences.getDefaultString(GeometryViewerConstants.PREF_MAX_OBJECTS_RENDER));
        }
 * limitations under the License.
import org.jkiss.dbeaver.ui.UIUtils;
    public boolean performOk() {
    }
    protected Control createPreferenceContent(@NotNull Composite parent) {

            maxObjectsText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
import java.util.Locale;

        return true;

 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.eclipse.swt.widgets.Composite;
public class PrefPageGIS extends AbstractPrefPage implements IWorkbenchPreferencePage {
 */

}
/*

        preferences.setValue(GeometryViewerConstants.PREF_DEFAULT_SRID, CommonUtils.toInt(defaultSridText.getText()));
package org.jkiss.dbeaver.ui.gis.preferences;
        // nothing to initialize
        final DBPPreferenceStore preferences = GISViewerActivator.getDefault().getPreferences();
 * Copyright (C) 2010-2026 DBeaver Corp and others

        minZoomLevelSpinner.setSelection(preferences.getDefaultInt(GeometryViewerConstants.PREF_MIN_ZOOM_LEVEL));
            Composite group = UIUtils.createTitledComposite(composite, GISMessages.pref_page_gis_viewer_group, 2);
            defaultSridText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));

    public void init(IWorkbench workbench) {
        defaultSridText.setText(preferences.getDefaultString(GeometryViewerConstants.PREF_DEFAULT_SRID));
import org.jkiss.dbeaver.ui.gis.GeometryViewerConstants;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
    @Override
        preferences.setValue(GeometryViewerConstants.PREF_MAX_OBJECTS_RENDER, CommonUtils.toInt(maxObjectsText.getText()));
    }
    protected void performDefaults() {

    @Override
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.IWorkbenchPreferencePage;
 *
        PrefUtils.savePreferenceStore(preferences);
import org.eclipse.ui.IWorkbench;
        return composite;
    private Text maxObjectsText;
import org.eclipse.swt.widgets.Text;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.gis";
    @NotNull
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.utils.PrefUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

            defaultSridText = UIUtils.createLabelText(group, GISMessages.pref_page_gis_viewer_label_srid, preferences.getString(GeometryViewerConstants.PREF_DEFAULT_SRID), SWT.BORDER);
