
            Composite group = UIUtils.createTitledComposite(
                            case SOUND_FILE_LABEL: {
                        return getSettings((NotificationDescriptor) element).isShowPopup();

                    protected CellEditor getCellEditor(Object element) {
            longOperationsCheck = UIUtils.createCheckbox(
                        return true;
                                dialog.setFilterExtensions(new String[]{"*.wav"});
                CoreMessages.pref_page_notifications_enable_notifications_label_tip,

            viewer.getTable().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(600, SWT.DEFAULT).create());
                    @Override
                new ColumnLabelProvider() {
                    }
            final NotificationSettings settings = entry.getValue();


import org.eclipse.swt.layout.GridData;

                    protected CellEditor getCellEditor(Object element) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                            case SOUND_BEEP_LABEL:
            viewer = new TableViewer(composite, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
            );
            soundVolumeSpinner = UIUtils.createLabelSpinner(
                        );
            viewer.setInput(NotificationRegistry.getInstance().getNotifications().stream()

    private static final String SOUND_NONE_LABEL = "No sound";
                group,
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        {
                            return SOUND_BEEP_LABEL;
                        }
            hideDelaySpinner = UIUtils.createLabelSpinner(
    private static final String SOUND_FILE_LABEL = "Choose file...";
                SWT.LEFT, true, true,
                                final FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);

                CoreMessages.pref_page_notifications_sound_volume_label,
                CoreMessages.pref_page_notifications_column_name_label, null,
    @NotNull
                    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ui.notifications.NotificationUtils;
                            choices.toArray(new String[0]),
                    }
            );

                    @Override
                group,
            ColumnViewerToolTipSupport.enableFor(viewer);
                CoreMessages.pref_page_ui_general_label_long_operation_timeout + UIMessages.label_sec,
                SWT.CENTER, true, true,
        // nothing to initialize
        return settings.computeIfAbsent(descriptor, d -> NotificationUtils.getNotificationSettings(d.getId()));


        {
    protected Control createPreferenceContent(@NotNull Composite parent) {
                    protected boolean canEdit(Object element) {
                .collect(Collectors.toList()));
                    @Override

    private TableViewer viewer;
                group,
            controller.addColumn(
public class PrefPageNotifications extends AbstractPrefPage implements IWorkbenchPreferencePage {
                preferences.getBoolean(ModelPreferences.NOTIFICATIONS_ENABLED),
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                settings.setSoundFile(null);
import org.eclipse.ui.IWorkbench;
        enablePopupsCheckbox.setSelection(preferences.getDefaultBoolean(ModelPreferences.NOTIFICATIONS_ENABLED));
    }
                    } else {
        preferences.setValue(ModelPreferences.NOTIFICATIONS_SOUND_ENABLED, enableSoundsCheckbox.getSelection());
    @Override

                CoreMessages.pref_page_notifications_label_notifications_close_delay,
                }
import org.jkiss.dbeaver.ui.internal.UIMessages;
    }
            final ViewerColumnController<Object, Object> controller = new ViewerColumnController<>("PrefPageNotifications", viewer);
    private Spinner hideDelaySpinner;
        }
                    if (!settings.isPlaySound()) {
                    }
    private static final String SOUND_BEEP_LABEL = "System beep";
                        return ((NotificationDescriptor) element).getDescription();
                CoreMessages.pref_page_notifications_enable_sounds_label,

import java.util.stream.Collectors;
                                settings.setSoundFile(null);
                    }

                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            );
            viewer.setContentProvider(new ListContentProvider());
                preferences.getInt(ModelPreferences.NOTIFICATIONS_CLOSE_DELAY_TIMEOUT), 0, Integer.MAX_VALUE
import org.jkiss.dbeaver.ui.UIUtils;
    }

                    protected boolean canEdit(Object element) {
import java.util.Map;
                            viewer.getTable(),
import org.jkiss.dbeaver.ui.controls.CustomComboBoxCellEditor;
                                break;

                composite,
        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
        final Composite composite = UIUtils.createComposite(parent, 1);
                null,
                    } else if (settings.getSoundFile() == null) {

                new EditingSupport(viewer) {
                    protected Object getValue(Object element) {
                                dialog.setFilterNames(new String[]{"Waveform Audio File"});
                preferences.getBoolean(ModelPreferences.NOTIFICATIONS_SOUND_ENABLED),
import org.eclipse.jface.viewers.*;
                    }

        for (Map.Entry<NotificationDescriptor, NotificationSettings> entry : settings.entrySet()) {
import org.eclipse.jface.layout.GridDataFactory;
            );
            );
                                }
                        getSettings((NotificationDescriptor) element).setShowPopup((boolean) value);

                        final List<String> choices = new ArrayList<>();
        for (Map.Entry<NotificationDescriptor, NotificationSettings> entry : settings.entrySet()) {
    }
                CoreMessages.pref_page_notifications_group_global,
                        return true;
            controller.createColumns(false);
                element -> {
            settings.setShowPopup(true);
                        final NotificationSettings settings = getSettings((NotificationDescriptor) element);
            );
    private Button longOperationsCheck;
                CoreMessages.pref_page_notifications_column_popup_label, null,

    public void init(IWorkbench workbench) {
import org.eclipse.ui.IWorkbenchPreferencePage;
    private NotificationSettings getSettings(@NotNull NotificationDescriptor descriptor) {
                        viewer.refresh();
            final NotificationDescriptor descriptor = entry.getKey();

                }
                            }

            viewer.getTable().setHeaderVisible(true);
import java.util.ArrayList;
            controller.sortByColumn(0, SWT.UP);
import java.io.File;
import org.jkiss.dbeaver.ModelPreferences;
                group,
                group,
    private final Map<NotificationDescriptor, NotificationSettings> settings = new HashMap<>();
import org.jkiss.dbeaver.ui.controls.ListContentProvider;

import org.eclipse.swt.widgets.*;
    @Override

                    public String getText(Object element) {
 *
                2,
                    final NotificationSettings settings = getSettings((NotificationDescriptor) element);
            enablePopupsCheckbox = UIUtils.createCheckbox(
                        choices.add(SOUND_BEEP_LABEL);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                                settings.setPlaySound(true);
                    }
import org.eclipse.swt.SWT;
        }
        preferences.setValue(DBeaverPreferences.AGENT_LONG_OPERATION_NOTIFY, longOperationsCheck.getSelection());
import org.jkiss.dbeaver.DBeaverPreferences;
                2
            );
                        return SOUND_NONE_LABEL;
import org.jkiss.dbeaver.ui.controls.CustomCheckboxCellEditor;
 * You may obtain a copy of the License at
 */
            );
                    }
                    @Override

                preferences.getInt(ModelPreferences.NOTIFICATIONS_SOUND_VOLUME), 1, 100
package org.jkiss.dbeaver.ui.preferences;
    public boolean performOk() {
            controller.addColumn(
                2
    }
    private Button enablePopupsCheckbox;

import java.util.List;
                            return settings.getSoundFile().toString();
                    @Override

        super.performDefaults();
            enableSoundsCheckbox = UIUtils.createCheckbox(
                CoreMessages.pref_page_ui_general_label_enable_long_operations_tip,
        viewer.refresh();
        longOperationsCheck.setSelection(preferences.getDefaultBoolean(DBeaverPreferences.AGENT_LONG_OPERATION_NOTIFY));
                    public String getToolTipText(Object element) {
    @Override
                    @Override
                .filter(descriptor -> !descriptor.isHidden())
}
                preferences.getInt(DBeaverPreferences.AGENT_LONG_OPERATION_TIMEOUT), 0, Integer.MAX_VALUE
                            viewer,
                    @Override
                },
        return composite;
        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();

                CoreMessages.pref_page_notifications_column_sound_label, null,
import java.util.HashMap;
                    @Override
                element -> getSettings((NotificationDescriptor) element).isShowPopup(),
    private Spinner longOperationsTimeout;
                preferences.getBoolean(DBeaverPreferences.AGENT_LONG_OPERATION_NOTIFY),
            controller.addBooleanColumn(

        preferences.setValue(ModelPreferences.NOTIFICATIONS_SOUND_VOLUME, soundVolumeSpinner.getSelection());
    @Override

                    }
                                    settings.setPlaySound(true);
    private Button enableSoundsCheckbox;
            NotificationUtils.setNotificationSettings(entry.getKey().getId(), entry.getValue());

                            return SOUND_NONE_LABEL;
        preferences.setValue(ModelPreferences.NOTIFICATIONS_CLOSE_DELAY_TIMEOUT, hideDelaySpinner.getSelection());
                2
            UIUtils.asyncExec(() -> UIUtils.packColumns(viewer.getTable(), true));

                        switch ((String) value) {
    @NotNull
        soundVolumeSpinner.setSelection(preferences.getDefaultInt(ModelPreferences.NOTIFICATIONS_SOUND_VOLUME));
                        choices.add(SOUND_NONE_LABEL);
                                if (dialog.open() != null) {
                        return ((NotificationDescriptor) element).getName();
                        return new CustomCheckboxCellEditor(viewer.getTable(), true);
 *     http://www.apache.org/licenses/LICENSE-2.0

                    }
            );
                SWT.LEFT, true, true,
import org.jkiss.dbeaver.ui.registry.NotificationDescriptor;
                        choices.add(SOUND_FILE_LABEL);



        preferences.setValue(ModelPreferences.NOTIFICATIONS_ENABLED, enablePopupsCheckbox.getSelection());
        }
import org.jkiss.dbeaver.ui.notifications.NotificationSettings;

                                break;
                                dialog.setText("Choose notification sound file");
import org.jkiss.dbeaver.ui.registry.NotificationRegistry;
            );
                        } else if (settings.getSoundFile() == null) {
            final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();

        hideDelaySpinner.setSelection(preferences.getDefaultInt(ModelPreferences.NOTIFICATIONS_CLOSE_DELAY_TIMEOUT));
                        final NotificationSettings settings = getSettings((NotificationDescriptor) element);
                    }
                        return new CustomComboBoxCellEditor(
                CoreMessages.pref_page_ui_general_label_enable_long_operations,
                GridData.FILL_HORIZONTAL
            settings.setPlaySound(descriptor.isSoundEnabled());
                    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                                settings.setPlaySound(false);
                        return SOUND_BEEP_LABEL;
                                break;
                            case SOUND_NONE_LABEL:
 * See the License for the specific language governing permissions and
 *
            settings.setSoundFile(null);
                        if (!settings.isPlaySound()) {
        preferences.setValue(DBeaverPreferences.AGENT_LONG_OPERATION_TIMEOUT, longOperationsTimeout.getSelection());
                    protected void setValue(Object element, Object value) {
                    protected Object getValue(Object element) {
                            SWT.DROP_DOWN | SWT.READ_ONLY
    protected void performDefaults() {
    private Spinner soundVolumeSpinner;
        enableSoundsCheckbox.setSelection(preferences.getDefaultBoolean(ModelPreferences.NOTIFICATIONS_SOUND_ENABLED));
                    @Override
        }
                }
                        return settings.getSoundFile().toString();
                                    settings.setSoundFile(new File(dialog.getFilterPath(), dialog.getFileName()));
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
        longOperationsTimeout.setSelection(preferences.getDefaultInt(DBeaverPreferences.AGENT_LONG_OPERATION_TIMEOUT));
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                new EditingSupport(viewer) {
import org.jkiss.dbeaver.core.CoreMessages;

            longOperationsTimeout = UIUtils.createLabelSpinner(
                    protected void setValue(Object element, Object value) {
                CoreMessages.pref_page_notifications_enable_notifications_label,
 * you may not use this file except in compliance with the License.
                group,
        return super.performOk();
                        } else {
/*
