import org.eclipse.swt.widgets.Text;
 *
            2);
        urlText.setLayoutData(gd);

        itemDescriptor.setResolveVariables(resolveVariablesCheck.getSelection());


        urlText.addModifyListener(e -> propertyChangeListener.run());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Button;
    private Button resolveVariablesCheck;
 *
    public void createControl(@NotNull Composite composite, DashboardItemConfiguration itemDescriptor, @NotNull Runnable propertyChangeListener) {
        int baseStyle = !readOnly ? SWT.NONE : SWT.READ_ONLY;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
    public void loadSettings(@NotNull DashboardItemConfiguration itemConfiguration) {
        return !urlText.getText().isEmpty();
 */
    @Override
    @Override
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void resetSettings(@NotNull DashboardItemConfiguration itemConfiguration) {
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
}
 * DBeaver - Universal Database Manager

    public boolean isComplete() {
    }
        urlText = UIUtils.createLabelText(composite, "URL", CommonUtils.notEmpty(itemDescriptor.getDescription()), SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | baseStyle);
 * distributed under the License is distributed on an "AS IS" BASIS,
        itemDescriptor.setDashboardURL(urlText.getText());
        boolean readOnly = !itemDescriptor.isCustom();
        GridData gd = new GridData(GridData.FILL_BOTH);
    }
        resolveVariablesCheck = UIUtils.createCheckbox(
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            "Resolve variables",
 * you may not use this file except in compliance with the License.
/*
    @Override

import org.jkiss.utils.CommonUtils;
    }
import org.eclipse.swt.layout.GridData;
    }
    private Text urlText;
        gd.widthHint = UIUtils.getFontHeight(urlText) * 50;
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.dashboard.browser;

    public void saveSettings(@NotNull DashboardItemConfiguration itemDescriptor) {
            "Resolve environment and database-specific variables in URL",
        urlText.setText(CommonUtils.notEmpty(itemConfiguration.getDashboardURL()));
        resolveVariablesCheck.setSelection(itemConfiguration.isResolveVariables());
        gd.heightHint = UIUtils.getFontHeight(urlText) * 8;
import org.eclipse.swt.widgets.Composite;

            itemDescriptor.isResolveVariables(),
public class BrowserChartConfigurationEditor implements IObjectPropertyConfigurator<DashboardItemConfiguration, DashboardItemConfiguration> {
 * limitations under the License.


 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
    }
            composite,
    @Override
 *
