    }

 *
import org.eclipse.ui.IWorkbenchPropertyPage;
        return composite;
    }
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.eclipse.main";
        Label descLabel = new Label(groupObjects, SWT.WRAP);
            composite,
 * Unless required by applicable law or agreed to in writing, software
                "<a>''{0}''</a> " + CoreMessages.pref_page_ui_general_label_settings,
 */
    }
        return null;
import org.eclipse.swt.widgets.Label;
}

 *
    @Override

    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {
        descLabel.setText(CoreMessages.pref_page_eclipse_ui_general_group_label);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Composite;
    }

    public IAdaptable getElement() {
public class PrefPageEclipseGeneral extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
/*
    @Override
 *



            addLinkToSettings(composite, PrefPageResultSetMain.PAGE_ID);
            1,
        }
            addLinkToSettings(composite, PrefPageErrorHandle.PAGE_ID);
    protected Control createPreferenceContent(@NotNull Composite parent) {
            addLinkToSettings(composite, PrefPageSQLEditor.PAGE_ID);
                null

                wpc,
            );
        }
            addLinkToSettings(composite, PrefPageDatabaseNavigator.PAGE_ID);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            UIUtils.createPreferenceLink(
    @NotNull
import org.jkiss.dbeaver.ui.editors.sql.preferences.PrefPageSQLEditor;
 * limitations under the License.
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ui.editors.data.preferences.PrefPageResultSetMain;
    public void init(IWorkbench iWorkbench) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));

            GridData.VERTICAL_ALIGN_BEGINNING
import org.jkiss.dbeaver.ui.UIUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
        performDefaults();
        Composite groupObjects = UIUtils.createTitledComposite(
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.core.CoreMessages;
 * See the License for the specific language governing permissions and

    private void addLinkToSettings(Composite composite, String pageID) {
            CoreMessages.pref_page_eclipse_ui_general_group_general,
        {
        );
                composite,

package org.jkiss.dbeaver.ui.preferences;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        super();
    public PrefPageEclipseGeneral() {
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.core.runtime.IAdaptable;
                pageID,
    public void setElement(IAdaptable iAdaptable) {
            // Link to secure storage config
import org.eclipse.swt.widgets.Control;
