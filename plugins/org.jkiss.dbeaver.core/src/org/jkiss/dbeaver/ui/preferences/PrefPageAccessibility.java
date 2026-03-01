import org.eclipse.ui.IWorkbenchPreferencePage;
            cmbScreenReaderSupport.add(reader.getScreenReaderName());
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private void initControls() {
            SWT.DROP_DOWN | SWT.READ_ONLY);

 * See the License for the specific language governing permissions and
    protected Control createPreferenceContent(Composite parent) {
import org.jkiss.dbeaver.core.CoreMessages;
        boolean forceFocus = store.getBoolean(ScreenReaderPreferences.PREF_FORCE_FOCUS_ON_EDITOR);
    public boolean performOk() {
    private final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            CoreMessages.pref_page_accessibility_force_focus_tooltip,
    private Composite createControls(Composite parent) {


        // no implementation
        store.setValue(ScreenReaderPreferences.PREF_FORCE_FOCUS_ON_EDITOR, forceFocusCheckbox.getSelection());

import org.jkiss.dbeaver.ui.screenreaders.ScreenReader;
    }
import org.eclipse.swt.widgets.Control;
            composite,

        cmbScreenReaderSupport.select(screenReader.ordinal());
 * DBeaver - Universal Database Manager
    protected void performDefaults() {
    private IAdaptable element;


 *

        cmbScreenReaderSupport.select(ScreenReader.DEFAULT.ordinal());
        initForceFocusCheckbox();
 */
        initControls();
    public void init(IWorkbench workbench) {

        ScreenReader screenReader = ScreenReader.getScreenReader(cmbScreenReaderSupport.getText());
 *

            2,
            accessibilityGroup,
import org.jkiss.dbeaver.ui.screenreaders.ScreenReaderPreferences;
        cmbScreenReaderSupport = UIUtils.createLabelCombo(
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.user.interface.accessibility";
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
        return element;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        Composite composite = createControls(parent);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            CoreMessages.pref_page_accessibility_screen_reader_description,
        createForceFocusCheckbox(composite);
    private Combo cmbScreenReaderSupport;
        }
        return composite;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
package org.jkiss.dbeaver.ui.preferences;
    @Override
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
    @Override
            CoreMessages.pref_page_accessibility_force_focus_checkbox,
        return true;
public class PrefPageAccessibility extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
import org.eclipse.swt.widgets.Button;
 * limitations under the License.
    }
import org.eclipse.swt.widgets.Composite;

    }
    @Override
        this.element = element;
import org.jkiss.dbeaver.ui.UIUtils;
    private Button forceFocusCheckbox;
        Composite accessibilityGroup = UIUtils.createTitledComposite(
 * You may obtain a copy of the License at
        forceFocusCheckbox.setSelection(forceFocus);
    }
        forceFocusCheckbox = UIUtils.createCheckbox(
            false,
/*
    }
            2);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (ScreenReader reader : ScreenReader.values()) {
    private void createForceFocusCheckbox(Composite parent) {
        ScreenReader screenReader = ScreenReader.getScreenReader(storedScreenReader);
    }
        store.setValue(ScreenReaderPreferences.PREF_SCREEN_READER_ACCESSIBILITY, screenReader.name());
import org.eclipse.ui.IWorkbench;

    }
    private void initCombo() {
 * Unless required by applicable law or agreed to in writing, software

}
    private void initForceFocusCheckbox() {
        initCombo();
    public void setElement(IAdaptable element) {
            parent,
import org.eclipse.swt.SWT;
        String storedScreenReader = store.getString(ScreenReaderPreferences.PREF_SCREEN_READER_ACCESSIBILITY);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public IAdaptable getElement() {
import org.eclipse.core.runtime.IAdaptable;
    @Override
    }
 * you may not use this file except in compliance with the License.
            GridData.GRAB_HORIZONTAL);
        Composite composite = UIUtils.createComposite(parent, 1);
            CoreMessages.pref_page_accessibility_screen_reader_msg,

            CoreMessages.pref_page_accessibility_screen_reader_group_lbl,
        return composite;
