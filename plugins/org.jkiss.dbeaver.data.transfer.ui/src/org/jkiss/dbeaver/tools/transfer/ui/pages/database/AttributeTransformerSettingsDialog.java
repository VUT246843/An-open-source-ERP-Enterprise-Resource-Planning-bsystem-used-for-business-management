        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            }
        infoLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        super.create();
    public boolean close() {
        this.transformer = transformer;

    private void saveTransformerSettings() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        if (transformer != null) {
import org.eclipse.swt.layout.GridData;
        mapping.setTransformerProperties(settings);
    }
        if (composite.getLayout() instanceof GridLayout) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    {
        if (transformOptions == null) {

        }
            if (prop.getValue() != null) {

    private void loadTransformerSettings(Collection<? extends DBPPropertyDescriptor> properties) {
    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        propertiesEditor.saveEditorValues();
    }

 * limitations under the License.
    @Override
        Composite composite = super.createDialogArea(parent);

import java.util.LinkedHashMap;
        }
        infoText.setLayoutData(gd);
        }
import java.util.Collections;
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
        return parent;


            loadTransformerSettings(transformerProperties);
        for (Map.Entry<String, Object> prop : properties.entrySet()) {
        Label infoLabel = UIUtils.createControlLabel(placeholder, "Info");

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.jface.dialogs.IDialogConstants;
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
        } else {
            transformOptions);
        }
 * You may obtain a copy of the License at
        propertiesEditor.getControl().setFocus();
    private final DatabaseMappingAttribute mapping;
        createTransformSettingsArea(composite);
            loadTransformerSettings(Collections.emptyList());
        final Map<String, Object> properties = propertySource.getPropertiesWithDefaults();
import java.util.Map;
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
 */
 *
    public void create() {

        if (settings == null) {
    }
            transformOptions = Collections.emptyMap();
                settings.put(prop.getKey(), prop.getValue());
        return super.close();
            if (transformer != null && transformer.getDescription() != null) {
        }
 *

        Map<String, Object> transformOptions = mapping.getTransformerProperties();
    @Override
/*
            UIUtils.asyncExec(this::okPressed);
    @Override
        saveTransformerSettings();
    protected Composite createDialogArea(Composite parent)

import org.jkiss.dbeaver.Log;
            }
    private final DataTransferAttributeTransformerDescriptor transformer;
    private void updateTransformerInfo() {
        propertySource = new PropertySourceCustom(

    }
import org.eclipse.swt.layout.GridLayout;

                infoText.setText("");
        propertiesEditor = new PropertyTreeViewer(settingsPanel, SWT.BORDER);
 * DBeaver - Universal Database Manager
        super(parentShell, "Transformer " + transformer.getName() + " settings", null);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void okPressed()
        if (infoText != null) {
 * Unless required by applicable law or agreed to in writing, software
    }
            Collection<? extends DBPPropertyDescriptor> transformerProperties = transformer.getProperties();
        infoText = new Text(placeholder, SWT.READ_ONLY | SWT.WRAP);
    private Text infoText;
    @Override
    public AttributeTransformerSettingsDialog(Shell parentShell, DatabaseMappingAttribute mapping, DataTransferAttributeTransformerDescriptor transformer) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        UIUtils.createLabelText(placeholder, "Transformer", transformer.getName(), SWT.READ_ONLY);
    private static final Log log = Log.getLog(AttributeTransformerSettingsDialog.class);
}
    }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 * See the License for the specific language governing permissions and

 *
            } else {
        propertiesEditor.loadProperties(propertySource);
import org.eclipse.swt.widgets.Label;
        final Composite placeholder = UIUtils.createComposite(settingsPanel, 2);
                infoText.setText(transformer.getDescription());

import org.eclipse.swt.SWT;

            // No properties
class AttributeTransformerSettingsDialog extends BaseDialog {
            settings = new LinkedHashMap<>();
    {
        }
        super.okPressed();
        gd.widthHint = 300;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingAttribute;
            properties,
import java.util.Collection;
    }
    }

        updateTransformerInfo();
        this.mapping = mapping;
import org.eclipse.swt.widgets.Text;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferAttributeTransformerDescriptor;
        Map<String, Object> settings = mapping.getTransformerProperties();

import org.eclipse.swt.widgets.Shell;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UIUtils;
        Composite settingsPanel = UIUtils.createComposite(composite, 1);

            settingsPanel.setLayoutData(new GridData(GridData.FILL_BOTH));

    private PropertyTreeViewer propertiesEditor;
    @Override

    private void createTransformSettingsArea(Composite composite) {
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
    private PropertySourceCustom propertySource;
import org.eclipse.swt.widgets.Composite;

        if (propertySource != null && propertySource.getProperties().length == 0) {
    }
        }
    protected void createButtonsForButtonBar(Composite parent)
