    public void saveSettings(@NotNull DBPPreferenceStore preferenceStore) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.eclipse.swt.widgets.Composite;
 */
    @Override
    }
 *
        return formatterDescriptor;
    public Runnable changeListener;
        setDescription(formatterDescriptor.getDescription());
 * You may obtain a copy of the License at
    public SQLFormatterConfiguration getConfiguration() {

    }
        super("SQL Format");
    @Override
    }
    public void configure(@NotNull SQLFormatterDescriptor formatterDescriptor, Runnable changeListener) {
    {
        this.changeListener = changeListener;
 * DBeaver - Universal Database Manager
    @Override
 * you may not use this file except in compliance with the License.

    @Override
package org.jkiss.dbeaver.ui.editors.sql.preferences.format;
 *
import org.eclipse.jface.dialogs.DialogPage;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected abstract Composite createFormatSettings(Composite parent);
/*


        this.formatterDescriptor = formatterDescriptor;
    public SQLFormatterDescriptor getFormatterDescriptor() {
    }


    }
}
import org.jkiss.code.NotNull;
    }
    private SQLFormatterConfiguration configuration;
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

 * Copyright (C) 2010-2026 DBeaver Corp and others


    @Override
    public void resetSettings(@NotNull DBPPreferenceStore preferenceStore) {
    }

    public BaseFormatterConfigurationPage()
    @Override
 * Unless required by applicable law or agreed to in writing, software

        setTitle("SQL Format Configuration");

    public void loadSettings(@NotNull DBPPreferenceStore preferenceStore, boolean useDefaults) {
    private SQLFormatterDescriptor formatterDescriptor;
    public final void createControl(Composite parent) {
import org.jkiss.dbeaver.model.sql.registry.SQLFormatterDescriptor;
        Composite composite = createFormatSettings(parent);


    }


 * limitations under the License.

        setControl(composite);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void performHelp() {
 * See the License for the specific language governing permissions and
        return configuration;
    }
public abstract class BaseFormatterConfigurationPage extends DialogPage implements SQLFormatterConfigurator {
        super.performHelp();

        this.configuration = configuration;
