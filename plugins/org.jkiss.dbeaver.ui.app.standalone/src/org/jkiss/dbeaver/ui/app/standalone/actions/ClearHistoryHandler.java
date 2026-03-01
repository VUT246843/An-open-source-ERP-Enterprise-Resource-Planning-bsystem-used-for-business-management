                    button.setEnabled(!options.isEmpty());
        if (PlatformUI.getWorkbench().restart()) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
                    .newInstance();
            handler.checkObjectClass(DBRRunnableWithProgress.class);
import org.eclipse.jface.dialogs.IDialogConstants;


            try {
        @Override
            for (HandlerDescriptor descriptor : descriptors.values()) {
import org.eclipse.swt.SWT;
    private class ClearHistoryDialog extends BaseDialog {
                if (checkbox.getSelection()) {
            setShellStyle(SWT.DIALOG_TRIM);
    }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.Composite;
 * limitations under the License.
/*

        }
        private final String description;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

        }
            this.handler = new ObjectType(config.getAttribute("handler"));
        @NotNull
                try {
        for (IConfigurationElement element : Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID)) {
    }
            this.id = config.getAttribute("id");
            }
        }
        private final String id;
                final HandlerDescriptor descriptor = descriptors.get(option);
                composite, CoreApplicationMessages.clear_history_dialog_options, 1, GridData.FILL_BOTH);
    }
                    );
            Composite group = UIUtils.createTitledComposite(
 * You may obtain a copy of the License at
import java.util.HashSet;
 * Licensed under the Apache License, Version 2.0 (the "License");

                if (button != null) {

        protected Composite createDialogArea(@NotNull Composite parent) {
            }
                final HandlerDescriptor descriptor = new HandlerDescriptor(element);
        public HandlerDescriptor(@NotNull IConfigurationElement config) {
            SelectionListener listener = SelectionListener.widgetSelectedAdapter(e -> {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            super(shell, CoreApplicationMessages.clear_history_dialog_title, null);
                final Button checkbox = UIUtils.createCheckbox(group, descriptor.name, descriptor.description, false, 1);
}
                } else {
                Button checkbox = (Button) e.widget;
import org.jkiss.dbeaver.runtime.DBWorkbench;

                } catch (Exception e) {

        final ClearHistoryDialog dialog = new ClearHistoryDialog(HandlerUtil.getActiveShell(event));
import org.eclipse.core.commands.ExecutionEvent;
            createButton(parent, IDialogConstants.OK_ID, CoreApplicationMessages.button_apply_and_restart, true).setEnabled(false);
import org.eclipse.swt.widgets.Shell;

        private final Set<String> options = new HashSet<>();
        }
                checkbox.setData(descriptor);
                }

        @NotNull
    @Override
        protected void createButtonsForButtonBar(@NotNull Composite parent) {

        @Override
import org.eclipse.core.runtime.IConfigurationElement;
 * See the License for the specific language governing permissions and


        public DBRRunnableWithProgress getHandler() throws DBException {
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
                final Button button = getButton(IDialogConstants.OK_ID);
                HandlerDescriptor descriptor = (HandlerDescriptor) checkbox.getData();


    private static class HandlerDescriptor extends AbstractDescriptor {

    private final Map<String, HandlerDescriptor> descriptors = new LinkedHashMap<>();
import org.eclipse.osgi.util.NLS;
        return null;
import org.eclipse.swt.events.SelectionListener;

        }
            });
            super(config);
                this.descriptors.put(descriptor.id, descriptor);
                        CoreApplicationMessages.clear_history_error_title,


import org.eclipse.core.commands.ExecutionException;
import java.util.Set;
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.clearHistoryHandler";

        }
import java.lang.reflect.InvocationTargetException;
        public ClearHistoryDialog(@NotNull Shell shell) {
import org.jkiss.dbeaver.ui.UIUtils;
                return handler

            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
            UIUtils.createLabel(composite, CoreApplicationMessages.clear_history_dialog_message);
                    .getImplClass(DBRRunnableWithProgress.class)
    public Object execute(ExecutionEvent event) throws ExecutionException {
            final Composite composite = super.createDialogArea(parent);
        public static final String ELEMENT_ID = "handler";
        if (dialog.open() != IDialogConstants.OK_ID) {

                    options.add(descriptor.id);
import java.util.Map;
import org.eclipse.swt.layout.GridData;
                        NLS.bind(CoreApplicationMessages.clear_history_error_message, descriptor.name),
import org.eclipse.swt.widgets.Button;
            this.name = config.getAttribute("name");
 * Unless required by applicable law or agreed to in writing, software
    public ClearHistoryHandler() {

                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.description = config.getAttribute("description");
public class ClearHistoryHandler extends AbstractHandler {
package org.jkiss.dbeaver.ui.app.standalone.actions;
                        e instanceof InvocationTargetException ? ((InvocationTargetException) e).getTargetException() : e
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        }
            return composite;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.LinkedHashMap;
                    UIUtils.runInProgressDialog(descriptor.getHandler());
            }
                    .getDeclaredConstructor()
import org.jkiss.code.NotNull;
                    options.remove(descriptor.id);
                checkbox.addSelectionListener(listener);
                }
            } catch (Throwable e) {
import org.eclipse.core.commands.AbstractHandler;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
        private final String name;
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;
 */

            }
        private final ObjectType handler;

 *
                throw new DBException("Can't create instance", e);
        }
                    DBWorkbench.getPlatformUI().showError(
 * Copyright (C) 2010-2026 DBeaver Corp and others

            if (HandlerDescriptor.ELEMENT_ID.equals(element.getName())) {
 *
            for (String option : dialog.options) {
import org.eclipse.core.runtime.Platform;
