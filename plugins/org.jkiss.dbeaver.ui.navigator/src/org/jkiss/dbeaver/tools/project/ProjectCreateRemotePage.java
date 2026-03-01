import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
    public String getProjectName() {
        return projectName;
    public boolean isPageComplete() {
        descriptionText.addModifyListener(e -> {

        Text descriptionText = UIUtils.createLabelText(panel, "Description", null, SWT.SINGLE | SWT.BORDER);
import org.jkiss.utils.CommonUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getProjectDescription() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Text nameText = UIUtils.createLabelText(panel, "Project name", null);
 * you may not use this file except in compliance with the License.
 * limitations under the License.

import org.eclipse.swt.widgets.Composite;
            updatePageCompletion();
    }

import org.jkiss.dbeaver.ui.UIUtils;
        super(pageName);
/**
 * Create data

 *
 * See the License for the specific language governing permissions and
        return !CommonUtils.isEmptyTrimmed(projectName);
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
class ProjectCreateRemotePage extends ActiveWizardPage<ProjectCreateWizard> {
    public void createControl(Composite parent) {

 * Unless required by applicable law or agreed to in writing, software
            projectDescription = descriptionText.getText();
 */
import org.eclipse.swt.widgets.Text;
        nameText.addModifyListener(e -> {
        return projectDescription;
    }

        Composite panel = UIUtils.createTitledComposite(parent, "Project", 2, GridData.FILL_HORIZONTAL);

 * Copyright (C) 2010-2026 DBeaver Corp and others
        panel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 */
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridData;
package org.jkiss.dbeaver.tools.project;
            updatePageCompletion();
    private String projectDescription;

        });
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String projectName;
    @Override

/*
            projectName = nameText.getText();
        });
    }
    }
    @Override

    protected ProjectCreateRemotePage(String pageName) {
        setDescription("Project settings");
}
 *
import org.eclipse.swt.SWT;
 * DBeaver - Universal Database Manager
        setControl(panel);
