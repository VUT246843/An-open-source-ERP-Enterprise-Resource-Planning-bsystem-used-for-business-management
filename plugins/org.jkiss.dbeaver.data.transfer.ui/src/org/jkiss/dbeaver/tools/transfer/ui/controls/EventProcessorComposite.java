 * DBeaver - Universal Database Manager
        }
        propertyChangeListener.run();
}
        super(parent, SWT.NONE);
        if (isProcessorEnabled()) {

                        rawSettings = null;
    private final Runnable propertyChangeListener;
    public boolean isProcessorApplicable() {
            configurator.createControl(composite, settings, this::updateCompletion);
        final boolean hasControl = configurator != null && configurator.hasControl();
            public void widgetSelected(SelectionEvent e) {

        enabledCheckbox.setEnabled(available);
        protected void createButtonsForButtonBar(Composite parent) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
import org.jkiss.code.NotNull;

    private final T settings;
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
 */


        setLayout(GridLayoutFactory.fillDefaults().numColumns(hasControl ? 2 : 1).create());
                @Override

import org.jkiss.dbeaver.tools.transfer.ui.IDataTransferEventProcessorConfigurator;
        }
                    if (rawSettings != null) {
 *
    private Map<String, Object> rawSettings;
                        propertyChangeListener.run();

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
    }
        private void updateCompletion() {
        setProcessorEnabled(enabledCheckbox.getSelection(), available);
            settings.removeEventProcessor(descriptor);
import org.eclipse.osgi.util.NLS;
                public void widgetSelected(SelectionEvent e) {
 *
    }
            }
import org.eclipse.swt.events.SelectionAdapter;
package org.jkiss.dbeaver.tools.transfer.ui.controls;

        this.descriptor = descriptor;
        if (configurator.hasControl()) {
        } else {
            final Composite composite = super.createDialogArea(parent);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        this.settings = settings;
    }
    public void setProcessorAvailable(boolean available) {
        if (hasControl) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            super.createButtonsForButtonBar(parent);
        public ConfigureDialog(@NotNull Shell shell) {
        }
                }
                button.setEnabled(configurator.isComplete());
    private final Button enabledCheckbox;

            setShellStyle(SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
            if (button != null) {
        }
                    final ConfigureDialog dialog = new ConfigureDialog(getShell());
        this.propertyChangeListener = propertyChangeListener;
 *
        setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
import org.jkiss.dbeaver.ui.UIUtils;
    public DataTransferEventProcessorDescriptor getDescriptor() {
    private Link configureLink;
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumerSettings;
        protected Composite createDialogArea(Composite parent) {
import java.util.Map;
    }
            @Override
    }
            updateCompletion();
import org.jkiss.code.Nullable;
    }
 * limitations under the License.
    private void setProcessorEnabled(boolean enabled, boolean available) {
        enabledCheckbox.setSelection(enabled);
        } else {
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.SWT;
            final Button button = getButton(IDialogConstants.OK_ID);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.tools.transfer.registry.DataTransferEventProcessorDescriptor;
            super(shell, NLS.bind(DTMessages.data_transfer_wizard_output_event_processor_configure_title, descriptor.getLabel()), null);
            });

        this.configurator = configurator;

            }
    private final DataTransferEventProcessorDescriptor descriptor;


            configureLink = UIUtils.createLink(this, DTMessages.data_transfer_wizard_output_event_processor_configure, new SelectionAdapter() {
                    }


        if (enabled && available) {
        return configurator.isComplete();
            rawSettings = settings;
    public boolean isProcessorEnabled() {
 * Unless required by applicable law or agreed to in writing, software
    private class ConfigureDialog extends BaseDialog {
import org.eclipse.jface.layout.GridDataFactory;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        configurator.saveSettings(settings);
            configureLink.setEnabled(enabled && available);
        @Override

        });
        setProcessorEnabled(enabled, enabledCheckbox.getEnabled());
        }
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return enabledCheckbox.getEnabled() && enabledCheckbox.getSelection();
                setProcessorEnabled(enabledCheckbox.getSelection());
            settings.addEventProcessor(descriptor);
                    if (dialog.open() == IDialogConstants.OK_ID) {
        return configurator != null && configurator.isApplicable(settings);
    public boolean isProcessorComplete() {
            configurator.loadSettings(settings);

    }

        }
    }
    public EventProcessorComposite(@NotNull Runnable propertyChangeListener, @NotNull Composite parent, @NotNull T settings, @NotNull DataTransferEventProcessorDescriptor descriptor, @Nullable IDataTransferEventProcessorConfigurator<T> configurator) {
    private final IDataTransferEventProcessorConfigurator<T> configurator;
    public void saveSettings(@NotNull Map<String, Object> settings) {
 * You may obtain a copy of the License at
public class EventProcessorComposite<T extends IDataTransferConsumerSettings> extends Composite {

import org.eclipse.jface.layout.GridLayoutFactory;
                        configurator.loadSettings(rawSettings);
    @NotNull
                    }
        enabledCheckbox.addSelectionListener(new SelectionAdapter() {
 * you may not use this file except in compliance with the License.
    public void loadSettings(@NotNull Map<String, Object> settings) {
        @Override
        return descriptor;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Shell;
    }


        enabledCheckbox = UIUtils.createCheckbox(this, descriptor.getLabel(), descriptor.getDescription(), false, 1);
    public void setProcessorEnabled(boolean enabled) {
            return composite;
