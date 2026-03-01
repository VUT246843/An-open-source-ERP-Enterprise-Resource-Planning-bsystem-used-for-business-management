                }
                public void widgetSelected(SelectionEvent e) {
    private Combo lobExtractType;

        DBPDataFormatterRegistry registry = DBPPlatformDesktop.getInstance().getDataFormatterRegistry();
    private static final int EXTRACT_LOB_SKIP = 0;
                        settings.setFormatterProfile(null);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
                        switch (lobExtractType.getSelectionIndex()) {
import java.util.ArrayList;
            Button editProfileButton = UIUtils.createDialogButton(
                    }

                DTMessages.data_transfer_wizard_settings_button_edit,
            settings.getDataMappings().clear();

                            case EXTRACT_LOB_FILES: settings.setLobExtractType(StreamConsumerSettings.LobExtractType.FILES); break;
                valueFormatSelector.getCombo().setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false, 4, 1));
                updateCompletion();
import org.jkiss.dbeaver.model.DBIcon;
                }
                });
                        }
    private static final int LOB_ENCODING_BINARY = 2;
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
import org.jkiss.dbeaver.ui.controls.CustomComboBoxCellEditor;
                    public void widgetSelected(SelectionEvent event) {
    private static class ConfigureColumnsPopup extends BaseDialog {
                        new ConfigureColumnsPopup(getShell(), mappings, settings).open();

    @Override
    private static final int EXTRACT_LOB_FILES = 1;
            errorLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
                    "Binary", //$NON-NLS-1$
        }
            gd.heightHint = 200;
            for (DataTransferPipe pipe : pipes) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        @Override
                    // Create a copy to avoid direct modifications
        setTitle(DTUIMessages.stream_consumer_page_settings_title);
                        settings.setValueFormat(valueFormatSelector.getSelection());

            generalExpander.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
                @Override
                    UIUtils.resizeShell(parent.getShell());
        DataTransferProcessorDescriptor processor = getWizard().getSettings().getProcessor();
            editProfileButton.setEnabled(true);
            });
        @NotNull
    private Combo formatProfilesCombo;
                binariesPanel.setLayoutData(gd);
    }
            );
        switch (settings.getLobExtractType()) {
 *
                });
            formatProfilesCombo.add(profile.getProfileName());
        protected void okPressed() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
    public StreamConsumerPageSettings() {
            }
            final boolean isComplete = mappings.stream().allMatch(StreamMappingContainer::isComplete);
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                    }
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;

        }
        }

                });
                    }
        {
        } else if (selectionIndex == 0) {
            return null;
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;

import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
 * See the License for the specific language governing permissions and
                            dataFormatterRegistry.getCustomProfile(UIUtils.getComboSelection(formatProfilesCombo)));
import java.lang.reflect.InvocationTargetException;

                        try {
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
                viewer.expandAll(true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        updatePageCompletion();
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        }

        @Override
                    "Native"); //$NON-NLS-1$
                lobEncodingCombo = new Combo(binariesPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
                            null,

    private void refreshMappings(@NotNull DBRProgressMonitor monitor, @NotNull List<StreamMappingContainer> mappings) {

                valueFormatSelector = new ValueFormatSelector(generalSettings);
        } else {
        setControl(composite);
                });
                            cell.setText(type != null ? type.name() : "");
        }

    }
                @Override
                    protected boolean canEdit(Object element) {
            lobEncodingCombo.setVisible(true);
    private PropertyTreeViewer propsEditor;

    private Combo lobEncodingCombo;
                }

                    @Override
                    for (StreamMappingAttribute attribute : mapping.getAttributes(monitor)) {
            propsEditor.getControl().setLayoutData(GridDataFactory.create(GridData.FILL_BOTH).hint(200, 150).create());
            if (!UIUtils.setComboSelection(formatProfilesCombo, formatterProfile.getProfileName())) {
        updatePageCompletion();
            generalExpander.setText(UIConnectionMessages.dialog_connection_advanced_settings);
                mappings.add(mapping);
                        if (element instanceof StreamMappingAttribute attribute) {

        }
                            return attribute.getMappingType().name();
}            errorLabel = new CLabel(group, SWT.NONE);
        if (selectionIndex == EXTRACT_LOB_INLINE) {
            lobEncodingLabel.setVisible(true);

                            cell.setBackground(container.isComplete() ? null : UIUtils.getSharedTextColors().getColor(SharedTextColors.COLOR_WARNING));
            lobEncodingCombo.setVisible(false);
                        updateCompletion();
        }
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            super(shell, DTUIMessages.stream_consumer_page_mapping_title, null);
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }

import org.jkiss.dbeaver.ui.controls.ValueFormatSelector;
                UIUtils.createDialogButton(generalSettings, DTUIMessages.stream_consumer_page_mapping_button_configure, new SelectionAdapter() {
                    return element instanceof StreamMappingContainer;
                valueFormatSelector.getCombo().addSelectionListener(new SelectionAdapter() {
    private static final int LOB_ENCODING_HEX = 1;
    public void createControl(Composite parent) {
                        switch (lobEncodingCombo.getSelectionIndex()) {

                    @Override
                    DTMessages.data_transfer_wizard_settings_binaries_item_inline);
            viewer = new TreeViewer(composite, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
import org.jkiss.dbeaver.tools.transfer.stream.*;
                new SelectionAdapter() {
                            reloadFormatProfiles();
                settings.addDataMapping(mapping);
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        getWizard().getSettings().setProcessorProperties(propertySource.getPropertiesWithDefaults());
            viewer.getTree().setHeaderVisible(true);
import java.util.List;
                } else {
            }
    }
                                e
        if (formatterProfile != null) {
                column.setLabelProvider(new CellLabelProvider() {
            {
        }
    private PropertySourceCustom propertySource;
            this.mappings = mappings;
    {
        formatProfilesCombo.add(DTMessages.data_transfer_wizard_settings_listbox_formatting_item_default);
                            propDialog.open();
        propsEditor.loadProperties(propertySource);
                    }
                        final Object element = cell.getElement();
 * limitations under the License.


                        } else if (element instanceof StreamMappingContainer container) {
    }
            });
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);

                        }
import org.eclipse.jface.layout.GridDataFactory;
 * You may obtain a copy of the License at
            case BINARY: lobEncodingCombo.select(LOB_ENCODING_BINARY); break;
            case BASE64: lobEncodingCombo.select(LOB_ENCODING_BASE64); break;
                        final DBPNamedObject object = (DBPNamedObject) element;
                        );
            case INLINE: lobExtractType.select(EXTRACT_LOB_INLINE); break;
                column.setEditingSupport(new EditingSupport(viewer) {
                        attribute.setMappingType(StreamMappingType.export);
            {
                        } else if (element instanceof StreamMappingContainer container) {
                        viewer.refresh();
            viewer.setContentProvider(new TreeContentProvider() {
                        if (((String) value).isEmpty()) {

                    "Base64", //$NON-NLS-1$
        DBPDataFormatterRegistry dataFormatterRegistry = DBPPlatformDesktop.getInstance().getDataFormatterRegistry();
    }
            errorLabel.setImage(DBeaverIcons.getImage(DBIcon.SMALL_ERROR));
 * distributed under the License is distributed on an "AS IS" BASIS,



import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;
        propsEditor.saveEditorValues();

                    mapping = new StreamMappingContainer(mapping);
        private final StreamConsumerSettings settings;
import org.eclipse.jface.preference.PreferenceDialog;


            okButton.setEnabled(isComplete);
                    public void update(ViewerCell cell) {
                        } else if (element instanceof StreamMappingContainer container) {
            formatProfilesCombo = UIUtils.createLabelCombo(generalSettings, DTMessages.data_transfer_wizard_settings_label_formatting, SWT.DROP_DOWN | SWT.READ_ONLY);
    public boolean isPageApplicable() {
 */
            Composite group = super.createDialogArea(parent);
                });
                    public void widgetSelected(SelectionEvent e) {

 * you may not use this file except in compliance with the License.
import org.eclipse.ui.forms.widgets.ExpandableComposite;
                    } else {
                    protected void setValue(Object element, Object value) {
    protected boolean determinePageCompletion()
                            viewer,

                column.getColumn().setText(DTUIMessages.stream_consumer_page_mapping_mapping_column_name);
    @Override
                if (mapping == null) {
                    @Override
            super.okPressed();
                    @Override
                    @Override
                column.getColumn().setText(DTUIMessages.stream_consumer_page_mapping_name_column_name);
    @Override
import org.jkiss.dbeaver.model.app.DBPDataFormatterRegistry;

                    "Hex", //$NON-NLS-1$
            viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
        } else {


            UIUtils.asyncExec(() -> {
                    public void widgetSelected(SelectionEvent e) {
        }
                            final StreamMappingType type = container.getMappingType();
        return true;
                    }
    }
                lobEncodingCombo.addSelectionListener(new SelectionAdapter() {

                }
        formatProfilesCombo.removeAll();

                    @Override
    @Override
            Composite generalSettings = UIUtils.createComposite(generalExpander, 5);
            this.settings = settings;
    private ValueFormatSelector valueFormatSelector;
                    mapping = new StreamMappingContainer(source);
            reloadFormatProfiles();
                            getSelectedFormatterProfile(),
            exporterSettings.setLayoutData(new GridData(GridData.FILL_BOTH));

        setPageComplete(false);
        final List<DataTransferPipe> pipes = getWizard().getSettings().getDataPipes();
                }
        int selectionIndex = formatProfilesCombo.getSelectionIndex();
                            cell.setText(attribute.getMappingType().name());
            formatProfilesCombo.select(0);


            for (StreamMappingContainer mapping : mappings) {
        int selectionIndex = lobExtractType.getSelectionIndex();
            GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
                            dataFormatterRegistry,
                    }
                    }
                }
                            DBWorkbench.getPlatformUI().showError(
                gd.horizontalSpan = 4;
import org.eclipse.swt.layout.GridData;
        private CLabel errorLabel;
                            return;
                    }
            case SKIP: lobExtractType.select(EXTRACT_LOB_SKIP); break;
        {
                    @Override
            getWizard().getSettings().getProcessorProperties());
                UIUtils.packColumns(viewer.getTree(), true, new float[]{0.75f, 0.25f});
                            final StreamMappingType type = container.getMappingType();
            case HEX: lobEncodingCombo.select(LOB_ENCODING_HEX); break;
                    DTMessages.data_transfer_wizard_settings_binaries_item_save_to_file,
                lobEncodingCombo.setItems(
    private static final int LOB_ENCODING_NATIVE = 3;
        } else {
import org.jkiss.dbeaver.ui.UIUtils;
        } finally {
                        }
                    public void widgetSelected(SelectionEvent e) {
                    public void widgetSelected(SelectionEvent e) {
                        final List<StreamMappingContainer> mappings = new ArrayList<>();
                        if (element instanceof StreamMappingAttribute attribute) {
                    }

                    @Override
                column.setLabelProvider(new CellLabelProvider() {
                        cell.setImage(DBeaverIcons.getImage(DBValueFormatting.getObjectImage(object)));
        super(DTMessages.data_transfer_wizard_settings_name);
                        } catch (InvocationTargetException e) {
            errorLabel.setVisible(!isComplete);
                monitor.worked(1);
            final Button okButton = getButton(IDialogConstants.OK_ID);

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
package org.jkiss.dbeaver.tools.transfer.ui.pages.stream;
        private final List<StreamMappingContainer> mappings;
                        final StreamMappingType type = StreamMappingType.valueOf(value.toString());
        }
            UIUtils.createControlLabel(exporterSettings, DTMessages.data_transfer_wizard_settings_group_exporter);
                        }
                    @Override
                            viewer.getTree(),
            this.setShellStyle(SWT.TITLE | SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL);
                            case LOB_ENCODING_NATIVE: settings.setLobEncoding(StreamConsumerSettings.LobEncoding.NATIVE); break;
        propertySource = new PropertySourceCustom(
                        settings.setFormatterProfile(
        final StreamConsumerSettings settings = getWizard().getPageSettings(StreamConsumerPageSettings.this, StreamConsumerSettings.class);
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        setDescription(DTUIMessages.stream_consumer_page_settings_description);
            final ExpandableComposite generalExpander = new ExpandableComposite(composite, SWT.NONE, Section.TREE_NODE);
                            return null;
import org.eclipse.ui.forms.widgets.Section;
            monitor.beginTask("Load mappings", pipes.size());
                    }
                UIUtils.createControlLabel(generalSettings, DTUIMessages.stream_consumer_page_mapping_label_configure);

                    }
        DBPDataFormatterRegistry registry = DBPPlatformDesktop.getInstance().getDataFormatterRegistry();
            generalExpander.addExpansionListener(new ExpansionAdapter() {
                            case EXTRACT_LOB_INLINE: settings.setLobExtractType(StreamConsumerSettings.LobExtractType.INLINE); break;
                        if (element instanceof StreamMappingAttribute attribute) {
        protected Composite createDialogArea(@NotNull Composite parent) {
            return registry.getCustomProfile(UIUtils.getComboSelection(formatProfilesCombo));
                            getShell(),
        for (DBDDataFormatterProfile profile : registry.getCustomProfiles()) {
    }
    private Object getSelectedFormatterProfile()
                    @Override
                generalSettings,
                                DTMessages.stream_transfer_consumer_message_cannot_load_configuration,
    {

                    }

                            attribute.setMappingType(type);
        {
                        } else {
    {
                        }
                    return ((StreamMappingContainer) element).getAttributes(new VoidProgressMonitor()).toArray();
                formatProfilesCombo.select(0);
            lobEncodingLabel.setVisible(false);
    }
import org.jkiss.dbeaver.model.DBValueFormatting;

import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
    private void reloadFormatProfiles()
                UIUtils.createControlLabel(generalSettings, DTMessages.data_transfer_wizard_settings_label_binaries);
                        PreferenceDialog propDialog = PreferencesUtil.createPropertyDialogOn(
                    if (formatProfilesCombo.getSelectionIndex() > 0) {

import org.eclipse.jface.dialogs.IDialogConstants;
            }
            }
            }
        }
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);
            Composite generalSettings = UIUtils.createComposite(composite, 3);
                        }
import org.eclipse.ui.dialogs.PreferencesUtil;
                            return type != null ? type.name() : null;
                            case LOB_ENCODING_HEX: settings.setLobEncoding(StreamConsumerSettings.LobEncoding.HEX); break;
        Composite composite = UIUtils.createComposite(parent, 1);
                        }
                            SWT.DROP_DOWN | SWT.READ_ONLY
                                DTMessages.stream_transfer_consumer_title_configuration_load_failed,
                            );
            });
                public boolean hasChildren(Object element) {
        return isConsumerOfType(StreamTransferConsumer.class);
                            case LOB_ENCODING_BASE64: settings.setLobEncoding(StreamConsumerSettings.LobEncoding.BASE64); break;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.events.SelectionEvent;


                        return true;
import org.jkiss.dbeaver.ui.SharedTextColors;
                            items,


                StreamMappingContainer mapping = settings.getDataMapping(source);
                        if (propDialog != null) {
        if (selectionIndex < 0) {
                        }

                            StreamMappingType.export.name(),
        super.deactivatePage();
            errorLabel.setText(DTUIMessages.stream_consumer_page_mapping_label_error_no_columns_selected_text);
                        final String[] items = {
    private static final Log log = Log.getLog(StreamConsumerPageSettings.class);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.eclipse.swt.SWT;
            Composite exporterSettings = UIUtils.createComposite(composite, 1);

        private TreeViewer viewer;
            Composite composite = UIUtils.createComposite(group, 1);
            case FILES: lobExtractType.select(EXTRACT_LOB_FILES); break;

                lobEncodingLabel = UIUtils.createControlLabel(binariesPanel, DTMessages.data_transfer_wizard_settings_label_encoding);
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
                            container.setMappingType(type);
                            StreamMappingType.skip.name()
                @Override
        switch (settings.getLobEncoding()) {
                });
    {
                    public void update(ViewerCell cell) {
            viewer.getTree().setLinesVisible(false);
        getWizard().loadNodeSettings();
                DBSDataContainer source = (DBSDataContainer) pipe.getProducer().getDatabaseObject();
                            cell.setBackground(attribute.getContainer().isComplete() ? null : UIUtils.getSharedTextColors().getColor(SharedTextColors.COLOR_WARNING));
                public void expansionStateChanged(ExpansionEvent e) {
        private void updateCompletion() {
 *
            case NATIVE: lobEncodingCombo.select(LOB_ENCODING_NATIVE); break;
                lobExtractType = new Combo(binariesPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
                            PreferencesUtil.OPTION_NONE);
                            case LOB_ENCODING_BINARY: settings.setLobEncoding(StreamConsumerSettings.LobEncoding.BINARY); break;
                    }
 * Unless required by applicable law or agreed to in writing, software
                public Object[] getChildren(Object element) {
            return group;
                @Override
            return registry.getGlobalProfile();
        try {
public class StreamConsumerPageSettings extends DataTransferPageNodeSettings {
        DBDDataFormatterProfile formatterProfile = settings.getFormatterProfile();
            monitor.done();
            UIUtils.createControlLabel(generalSettings, DTMessages.data_transfer_wizard_settings_group_general, 5);
                viewer.setInput(mappings);
import org.eclipse.swt.events.SelectionAdapter;
                        final Object element = cell.getElement();
 * DBeaver - Universal Database Manager
                TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.LEFT);
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
                });
    }
                Composite binariesPanel = UIUtils.createComposite(generalSettings, 4);
                valueFormatSelector.select(settings.getValueFormat());
                            case EXTRACT_LOB_SKIP: settings.setLobExtractType(StreamConsumerSettings.LobExtractType.SKIP); break;
                    protected Object getValue(Object element) {
                TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.LEFT);
                    // We have preloaded the attributes before, so it is 'safe' to use void monitor here
            gd.widthHint = 300;
        }
/*
                lobExtractType.addSelectionListener(new SelectionAdapter() {
            });
                        };
    private Label lobEncodingLabel;
            {
            formatProfilesCombo.addSelectionListener(new SelectionAdapter() {
        public ConfigureColumnsPopup(@NotNull Shell shell, @NotNull List<StreamMappingContainer> mappings, @NotNull StreamConsumerSettings settings) {
                    @Override
            generalExpander.setClient(generalSettings);
                    DTMessages.data_transfer_wizard_settings_binaries_item_set_to_null,
                //((GridData) button.getLayoutData()).horizontalSpan = 4;
            composite.setLayoutData(gd);
                lobExtractType.setItems(
            propsEditor = new PropertyTreeViewer(exporterSettings, SWT.BORDER);
    private static final int LOB_ENCODING_BASE64 = 0;

    public void activatePage() {

            viewer.getTree().setLayoutData(gd);
import org.eclipse.swt.custom.CLabel;
import org.eclipse.ui.forms.events.ExpansionAdapter;

                            UIUtils.runInProgressDialog(monitor -> refreshMappings(monitor, mappings));
                        cell.setText(object.getName());
                            "org.jkiss.dbeaver.preferences.main.dataformat", // TODO: replace this hardcode with some model invocation
            }
                        return new CustomComboBoxCellEditor(
            processor.getProperties(),


import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

        initializeDialogUnits(parent);
                    protected CellEditor getCellEditor(Object element) {
            formatProfilesCombo.setLayoutData(gd);
    }


    public void deactivatePage()
        }
    private static final int EXTRACT_LOB_INLINE = 2;

