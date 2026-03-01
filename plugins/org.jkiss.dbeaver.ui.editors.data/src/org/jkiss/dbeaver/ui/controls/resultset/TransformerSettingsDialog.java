        }
                    if (td != null) {
    }
            DBVTransformSettings settings = vAttr.getTransformSettings();
                if (prop.getValue() != null) {
                    }
        DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(attr, false);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
            if (currentAttribute != null) {



    private static final Type PROPERTIES_TYPE = new TypeToken<Map<String, Object>>(){}.getType();
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (composite.getLayout() instanceof GridLayout) {
            attrItem.setImage(0, DBeaverIcons.getImage(DBValueFormatting.getObjectImage(attr, true)));
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and
        propertiesEditor.saveEditorValues();
import java.util.List;
            DBVUtils.getVirtualEntity(currentAttribute, true);
        }



        if (selector) {
    @Override
            log.error("Can't get transform settings for " + currentAttribute.getName());
        if (settings == null) {
    }
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        if (vAttr == null) {
import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.model.DBPDataSource;
        } else {
        propertiesEditor = new PropertyTreeViewer(settingsPanel, SWT.BORDER);
        saveTransformerSettings();
            loadTransformerSettings(Collections.emptyList());
        for (TableItem item : attributeTable.getItems()) {
        DBVTransformSettings settings = vAttr == null ? null : DBVUtils.getTransformSettings(vAttr, false);
        if (transformOptions == null) {
import java.lang.reflect.Type;
        if (transformer != null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (this.vEntity != null) {
    private void createAttributeSelectorArea(Composite composite) {
        this.vEntitySrc = this.currentAttribute == null ?
        if (currentAttribute == null) {
        }
                "Transformer",
            panel = divider;
import java.util.*;
            if (item.getData() == currentAttribute) {
            }

        this.viewer = viewer;
                transformerCombo.add(ResultSetViewer.EMPTY_TRANSFORMER_NAME);
            attrItem.setData(attr);
    }
        createTransformSettingsArea(panel);
 */
            }
            } else {
            viewer.getModel().getVirtualEntity(true) :
            if (propertiesJson != null) {
                        DBWorkbench.getPlatform().getValueHandlerRegistry().getTransformer(settings.getCustomTransformer());
        return super.close();
                updateTransformItem(item);
import org.jkiss.utils.CommonUtils;
    }


        Composite settingsPanel = UIUtils.createComposite(composite, 1);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private PropertyTreeViewer propertiesEditor;
            settings.setTransformOptions(new LinkedHashMap<>());
            return;
        this.selector = selector;
        }
        attributeTable.setLayoutData(gd);
import org.eclipse.swt.events.SelectionAdapter;
        DBDAttributeBinding attr = (DBDAttributeBinding) attrItem.getData();
package org.jkiss.dbeaver.ui.controls.resultset;
        }
    }
        Map<String, Object> transformOptions = settings == null ? null : settings.getTransformOptions();
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
        DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(currentAttribute, false);
    }
    }
                });
            settings.setCustomTransformer(transformer == null ? null : transformer.getId());
    private DBDAttributeBinding currentAttribute;
    private void updateTransformItem(TableItem attrItem) {
            infoLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    private static IDialogSettings getDialogSettings() {
                            loadTransformerSettings(transformer.getProperties());
        if (transformer == null) {
        DBVTransformSettings settings = currentAttribute == null ? null : DBVUtils.getTransformSettings(currentAttribute, false);
    private void updateAttributeSelection() {
        this.currentAttribute = currentAttribute;
        super.okPressed();
        if (selector) {
        }
                        transformStr = td.getName();
                        int selectionIndex = transformerCombo.getSelectionIndex();
 * Unless required by applicable law or agreed to in writing, software
    private Text infoText;
                    DBDAttributeTransformerDescriptor td =
            if (transformer != null && transformer.getDescription() != null) {

            return;
import org.jkiss.dbeaver.model.virtual.DBVTransformSettings;
                if (!CommonUtils.isEmpty(settings.getIncludedTransformers())) {
 *

                2,
        } else {

                            transformer = null;
                transformOptions = GSON.fromJson(propertiesJson, PROPERTIES_TYPE);
        } else {
    @NotNull
            UIUtils.asyncExec(this::okPressed);
    private static final String PROP_FOR_TRANSFORMER = "propertiesForTransformerWithId=";

                infoText.setText("");
                updateAttributeSelection();
import org.jkiss.code.NotNull;
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            divider.setSashWidth(10);
 *
    private Combo transformerCombo;
        this.vEntity = new DBVEntity(vEntitySrc.getContainer(), vEntitySrc, vEntitySrc.getModel());
            }

        }
            // Nothing to save - just ignore
            }
        vEntitySrc.persistConfiguration();
        }
                transformerCombo.select(0);
import org.jkiss.dbeaver.model.DBUtils;
                } else if (!CommonUtils.isEmpty(settings.getCustomTransformer())) {
        transformerList = DBWorkbench.getPlatform().getValueHandlerRegistry().findTransformers(currentAttribute.getDataSource(), currentAttribute, null);
            }
            transformOptions);
    @Override
    }
    private void saveTransformerSettings() {
                    }
            updateTransformerInfo();
import com.google.gson.Gson;
        UIUtils.executeOnResize(attributeTable, () -> UIUtils.packColumns(attributeTable, true));
        if (selector || transformer != null) {
            log.error("Can't get attribute settings for " + currentAttribute.getName());

    }
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        if (dataSource != null && settings != null && !CommonUtils.isEmpty(settings.getCustomTransformer())) {
        UIUtils.createTableColumn(attributeTable, SWT.LEFT, "Transforms");
            if (transformerCombo.getSelectionIndex() < 0) {
        super.create();
                attributeTable.setSelection(attrItem);
                        composite.layout(true, true);
    private static final Gson GSON = new Gson();
        if (vAttr != null) {
    {
            if (settings != null) {
    private void updateTransformerInfo() {
                            transformer = transformerList.get(selectionIndex - 1);
        return parent;
        }

 * DBeaver - Universal Database Manager
        gd.widthHint = 400;
            getDialogSettings().put(PROP_FOR_TRANSFORMER + transformer.getId(), GSON.toJson(properties, PROPERTIES_TYPE));
    public TransformerSettingsDialog(ResultSetViewer viewer, DBDAttributeBinding currentAttribute, boolean selector) {
        });
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.Log;
    @Override
            final Map<String, Object> properties = propertySource.getPropertiesWithDefaults();
                    @Override
        DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(currentAttribute, true);

        for (DBDAttributeBinding attr : viewer.getModel().getVisibleAttributes()) {
        }
            currentAttribute = (DBDAttributeBinding) attributeTable.getItem(attributeTable.getSelectionIndex()).getData();
            divider.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

            Label infoLabel = UIUtils.createControlLabel(settingsPanel, "Info");
                        transformerCombo.select(transformerCombo.getItemCount() - 1);
        Composite panel = UIUtils.createComposite(composite, 1);
            TableItem attrItem = new TableItem(attributeTable, SWT.NONE);;

import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
        }
                    transformerCombo.add(td.getName());
            this.vEntity.dispose();
                            loadTransformerSettings(Collections.emptyList());
        final DBPDataSource dataSource = viewer.getDataSource();
 * You may obtain a copy of the License at
            Collection<? extends DBPPropertyDescriptor> transformerProperties = transformer.getProperties();
            }

    }

        }
    private List<? extends DBDAttributeTransformerDescriptor> transformerList;

    private static final Log log = Log.getLog(TransformerSettingsDialog.class);
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }




        attributeTable.setHeaderVisible(true);
    private final DBVEntity vEntity;
            attrItem.setText(0, attr.getName());
                transformerCombo = UIUtils.createLabelCombo(placeholder, "Name", SWT.DROP_DOWN | SWT.READ_ONLY);
                        updateAttributeItemText();
                    public void widgetSelected(SelectionEvent e) {

                GridData.FILL_HORIZONTAL
        if (attributeTable.getSelectionIndex() < 0) {
        propertiesEditor.loadProperties(propertySource);
import com.google.gson.reflect.TypeToken;
    public boolean close() {
                        } else {
    private boolean selector;

            transformer = DBWorkbench.getPlatform().getValueHandlerRegistry().getTransformer(settings.getCustomTransformer());

import org.jkiss.dbeaver.model.DBValueFormatting;
import org.jkiss.dbeaver.ui.UIUtils;

            @Override
            currentAttribute = null;
    @Override
            }

                transformerCombo.select(0);
        DBVTransformSettings settings = DBVUtils.getTransformSettings(vAttr, true);
    private void createTransformSettingsArea(Composite composite) {
    protected void createButtonsForButtonBar(Composite parent)
    private final ResultSetViewer viewer;
            for (Map.Entry<String, Object> prop : properties.entrySet()) {


        vEntitySrc.copyFrom(vEntity, vEntity.getModel());

    }
                settingsPanel,
public class TransformerSettingsDialog extends BaseDialog {
                transformerCombo.addSelectionListener(new SelectionAdapter() {
            updateAttributeItemText();

            gd.widthHint = 300;
    private void loadTransformerSettings(Collection<? extends DBPPropertyDescriptor> properties) {
    }
        if (currentAttribute != null) {
            infoText.setLayoutData(gd);
        }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        String transformStr = "";
                        updateTransformerInfo();
            infoText = new Text(settingsPanel, SWT.READ_ONLY | SWT.WRAP);
        }
            properties,
                            infoText.setText("N/A");
        }
        if (currentAttribute != null) {
/*

        saveTransformerSettings();
                    transformStr = String.join(",", settings.getIncludedTransformers());
        }
                }
            if (transformerList != null && selector) {
 *
    {
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        if (infoText != null) {
            } else {
            transformerCombo.add(ResultSetViewer.EMPTY_TRANSFORMER_NAME);
                }
    protected void okPressed()
            transformOptions = Collections.emptyMap();
            String propertiesJson = getDialogSettings().get(PROP_FOR_TRANSFORMER + transformer.getId());
            return;
                        }
    private void detectTransformers() {
                        if (selectionIndex == 0) {

import org.eclipse.swt.events.SelectionEvent;
    private final DBVEntity vEntitySrc;
            detectTransformers();
                    settings.setTransformOption(prop.getKey().toString(), prop.getValue().toString());
        attributeTable.addSelectionListener(new SelectionAdapter() {
            transformerCombo.removeAll();
        attributeTable = new Table(panel, SWT.FULL_SELECTION | SWT.BORDER);
            loadTransformerSettings(transformerProperties);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public void create() {
            }
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
                infoText.setText(transformer.getDescription());
        if (selector) {
    protected Composite createDialogArea(Composite parent)

        if (transformOptions == null && transformer != null) {
                            infoText.setText(CommonUtils.notEmpty(transformer.getDescription()));
import org.eclipse.swt.layout.GridLayout;
                }
                break;
        Composite panel = composite;
        GridData gd = new GridData(GridData.FILL_BOTH);

import org.eclipse.swt.custom.SashForm;
        attrItem.setText(1, transformStr);
        }
                transformerCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                    }
    private DBDAttributeTransformerDescriptor transformer;

                    if (td == transformer) {
            }
            );
        }
}
                detectTransformers();
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IDialogConstants;
        }

                UIUtils.createLabelText(placeholder, "Name", transformer.getName(), SWT.READ_ONLY);
    }
import org.eclipse.swt.layout.GridData;

            public void widgetSelected(SelectionEvent e) {
 * you may not use this file except in compliance with the License.
            createAttributeSelectorArea(panel);
            if (!selector) {
            // No properties
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (propertySource != null && propertySource.getProperties().length == 0 && !selector) {
        Composite composite = super.createDialogArea(parent);

            updateTransformItem(attrItem);
    private void updateAttributeItemText() {
        super(viewer.getControl().getShell(), DBUtils.getObjectFullName(viewer.getDataContainer(), DBPEvaluationContext.UI) + " transforms", null);
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        }
            updateTransformerInfo();
        }
    private PropertySourceCustom propertySource;
            }
            transformer = null;
            SashForm divider = new SashForm(composite, SWT.HORIZONTAL);
                for (DBDAttributeTransformerDescriptor td : transformerList) {
    {
        propertiesEditor.getControl().setFocus();
        } else {
        return UIUtils.getDialogSettings(TransformerSettingsDialog.class.getSimpleName());

            final Composite placeholder = UIUtils.createTitledComposite(
        UIUtils.createTableColumn(attributeTable, SWT.LEFT, "Name");
        propertySource = new PropertySourceCustom(
    private Table attributeTable;
        } else {

    }
            settingsPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
            if (this.currentAttribute == attr) {
