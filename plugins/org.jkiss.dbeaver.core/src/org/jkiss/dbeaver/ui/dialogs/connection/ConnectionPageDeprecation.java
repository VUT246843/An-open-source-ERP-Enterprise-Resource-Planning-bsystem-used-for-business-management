    @Override
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.jface.resource.JFaceResources;
        final Composite composite = toolkit.createComposite(parent, SWT.BORDER);
        setDescription(driver.getNonAvailabilityDescription());
        text.setText(driver.getNonAvailabilityReason(), true, false);
    public ConnectionPageDeprecation(@NotNull DBPDriver driver) {
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.dialogs.connection;
        final FormText text = toolkit.createFormText(composite, false);
 * You may obtain a copy of the License at
import org.eclipse.ui.forms.widgets.FormToolkit;

        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    }
import org.eclipse.swt.layout.GridLayout;
 * Unless required by applicable law or agreed to in writing, software
        text.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(200, 200).create());
    private final DBPDriver driver;
        this.driver = driver;

        composite.setLayout(new GridLayout(1, false));
 */

import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.layout.GridData;
 *
        super(ConnectionPageDeprecation.class.getName());
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.jface.layout.GridDataFactory;

    }

import org.eclipse.swt.SWT;
}
        final FormToolkit toolkit = new FormToolkit(parent.getDisplay());
public class ConnectionPageDeprecation extends ConnectionWizardPage {
import org.jkiss.code.NotNull;


        text.setHyperlinkSettings(toolkit.getHyperlinkGroup());
 *
    @Override
    public void createControl(Composite parent) {
    public void saveSettings(@NotNull DBPDataSourceContainer dataSourceDescriptor) {
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * you may not use this file except in compliance with the License.

        setPageComplete(false);
        text.setFont("header", JFaceResources.getFont("org.eclipse.jface.headerfont"));
        setControl(composite);
 * See the License for the specific language governing permissions and
        setTitle(driver.getNonAvailabilityTitle());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.ShellUtils;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
 *
        text.addHyperlinkListener(IHyperlinkListener.linkActivatedAdapter(e -> ShellUtils.launchProgram(e.getHref().toString())));

import org.eclipse.swt.widgets.Composite;
        // do nothing
