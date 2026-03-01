    @Override
                            settings.setOutputType(outputType);
            outputFolderText.addModifyListener(new ModifyListener() {

    }

                        }
 */

 *
            });
    public void activatePage() {


 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.ModifyListener;
 * Unless required by applicable law or agreed to in writing, software
        super.deactivatePage();
                    settings.setShowOnlyDifferences(showOnlyDifference.getSelection());
            reportSettings.setText(CompareUIMessages.compare_objects_page_report_settings);
            outputSettings.setText(CompareUIMessages.compare_objects_page_settings_configuration_output);

                {
            showOnlyDifference = UIUtils.createCheckbox(reportSettings,
                    settings.setOutputFolder(outputFolderText.getText());
            }
    }
                {
            });
        initializeDialogUnits(parent);
                            UIUtils.enableWithChildren(outputFolderText.getParent(), outputType == CompareObjectsSettings.OutputType.FILE);

    public void createControl(Composite parent) {
            showOnlyDifference.addSelectionListener(new SelectionAdapter() {
 *
                {
}import org.jkiss.dbeaver.tools.compare.simple.CompareObjectsSettings;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    for (CompareObjectsSettings.OutputType outputType : CompareObjectsSettings.OutputType.values()) {
            outputSettings.setLayout(gl);
    {
            for (CompareObjectsSettings.OutputType outputType : CompareObjectsSettings.OutputType.values()) {
                CompareUIMessages.compare_objects_page_checkbox_show_only_differences,

            UIUtils.enableWithChildren(outputFolderText.getParent(), settings.getOutputType() == CompareObjectsSettings.OutputType.FILE);
    public void deactivatePage()
                @Override
                settings.isShowOnlyDifferences());
                @Override
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
 *
 * you may not use this file except in compliance with the License.
            reportTypeCombo.select(settings.getOutputType().ordinal());
    }
import org.eclipse.swt.layout.GridData;
        Composite composite = new Composite(parent, SWT.NULL);
                public void modifyText(ModifyEvent e)
        }
                    }
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.events.ModifyEvent;
    private Button showOnlyDifference;
    }
import org.jkiss.dbeaver.ui.UIUtils;
        return true;

                }
import org.eclipse.swt.SWT;
    @Override
    private Combo reportTypeCombo;
            outputFolderText.setText(settings.getOutputFolder());
                            break;
            });
        setTitle(CompareUIMessages.compare_objects_page_settings_title);
/*

            reportSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * DBeaver - Universal Database Manager
        updatePageCompletion();
        setControl(composite);
        {
    {
            gl = new GridLayout(2, false);
    }
import org.eclipse.swt.events.SelectionEvent;
    CompareObjectsPageOutput() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (outputType.ordinal() == reportTypeCombo.getSelectionIndex()) {
            outputFolderText = DialogUtils.createOutputFolderChooser(outputSettings, null, null, false, null);
 * Licensed under the Apache License, Version 2.0 (the "License");
        gl.marginWidth = 0;
            Group reportSettings = new Group(composite, SWT.NONE);

            reportTypeCombo = new Combo(outputSettings, SWT.DROP_DOWN | SWT.READ_ONLY);
                reportTypeCombo.add(outputType.getTitle());
        super(CompareUIMessages.compare_objects_page_settings_page);
package org.jkiss.dbeaver.tools.compare.simple.ui;
    @Override
            reportTypeCombo.addSelectionListener(new SelectionAdapter() {
                @Override

        gl.marginHeight = 0;
                }
        final CompareObjectsSettings settings = getWizard().getSettings();
        setPageComplete(false);
import org.jkiss.dbeaver.tools.compare.simple.ui.internal.CompareUIMessages;
            gl = new GridLayout(1, false);
                CompareUIMessages.compare_objects_page_settings_configuration_output_type);
            reportSettings.setLayout(gl);
        setDescription(CompareUIMessages.compare_objects_page_settings_configuration_output_report);
import org.eclipse.swt.layout.GridLayout;
        GridLayout gl = new GridLayout();

 * limitations under the License.
            Group outputSettings = new Group(composite, SWT.NONE);
        {


                public void widgetSelected(SelectionEvent e)
                }
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
        composite.setLayout(gl);
                public void widgetSelected(SelectionEvent e)
        }
    protected boolean determinePageCompletion()
            outputSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionAdapter;

 * You may obtain a copy of the License at
            UIUtils.createControlLabel(outputSettings,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private Text outputFolderText;
class CompareObjectsPageOutput extends ActiveWizardPage<CompareObjectsWizard> {
