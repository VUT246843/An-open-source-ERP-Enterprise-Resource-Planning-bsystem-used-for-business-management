                configurator.loadSettings(attr);
        protected void okPressed() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        if (dialog.open() == IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;


                configurator = HintConfigurationAction.this.configDescriptor.createConfigurator();
import org.jkiss.code.NotNull;

/*
    private class ConfigDialog extends BaseDialog {
        setToolTipText(hint.getHintDescription());
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software


 * You may obtain a copy of the License at
}
        @NotNull DBDValueHint hint,
            super(parentShell, hint.getHintDescription(), null);
        @NotNull DBDAttributeBinding attr,
    public HintConfigurationAction(
        this.hint = hint;
        }
    public void run() {
            Composite composite = super.createDialogArea(parent);

            } catch (Exception e) {
import org.eclipse.swt.widgets.Shell;
                log.error(e);

        super(resultSetViewer, hint.getHintDescription() + " ...");
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        protected Composite createDialogArea(Composite parent) {
    private final UIPropertyConfiguratorDescriptor configDescriptor;
        this.attr = attr;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
                configurator.createControl(composite, hint, () -> {});
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.controls.resultset.actions;
            configurator.saveSettings(attr);
            getResultSetViewer().refreshData(null);
 *     http://www.apache.org/licenses/LICENSE-2.0
            try {
        public ConfigDialog(Shell parentShell) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 *
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
public class HintConfigurationAction extends AbstractResultSetViewerAction {
 *
        @NotNull ResultSetViewer resultSetViewer,
 * DBeaver - Universal Database Manager
            return composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        private IObjectPropertyConfigurator<DBDValueHint, DBDAttributeBinding> configurator;
    ) {
        @Override
    }
            super.okPressed();
    private static final Log log = Log.getLog(HintConfigurationAction.class);
    private final DBDValueHint hint;
 */
 *

    @Override
    private final DBDAttributeBinding attr;
        @NotNull UIPropertyConfiguratorDescriptor configDescriptor
    }
            }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

import org.jkiss.dbeaver.Log;
    }
        ConfigDialog dialog = new ConfigDialog(getResultSetViewer().getSite().getShell());
 * you may not use this file except in compliance with the License.
        @Override
        this.configDescriptor = configDescriptor;
