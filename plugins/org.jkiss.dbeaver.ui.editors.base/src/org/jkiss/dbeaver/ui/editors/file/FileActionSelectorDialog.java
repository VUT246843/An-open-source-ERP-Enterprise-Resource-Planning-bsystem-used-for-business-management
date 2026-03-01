 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public FileActionSelectorDialog(@NotNull Shell shell, @NotNull List<FileTypeAction> actions) {
import org.jkiss.code.NotNull;
                if (radio.getSelection()) {
 *
    }
/*
        Composite composite = super.createDialogArea(parent);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        super(shell, EditorsMessages.dialog_file_type_selector_title, null);
        return selectedAction;

                    selectedAction = action;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;
        for (FileTypeAction action : actions) {
import org.jkiss.dbeaver.model.file.FileTypeAction;
import org.eclipse.swt.widgets.Shell;
 */
    public FileTypeAction getSelectedAction() {
 *
}
import java.util.List;
public class FileActionSelectorDialog extends BaseDialog {
    }
        this.selectedAction = actions.isEmpty() ? null : actions.getFirst();
 * FileActionSelectorDialog
 * Unless required by applicable law or agreed to in writing, software
            radio.setText(action.getLabel());
package org.jkiss.dbeaver.ui.editors.file;
                }
            Button radio = new Button(composite, SWT.RADIO);
import org.eclipse.swt.SWT;

    @Nullable

/**
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            }));
            radio.setSelection(action == selectedAction);
 * you may not use this file except in compliance with the License.
        }
    }

 * You may obtain a copy of the License at

        return composite;
    @Override
            radio.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
        this.actions = actions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected Composite createDialogArea(@NotNull Composite parent) {
    private FileTypeAction selectedAction;
 */
import org.eclipse.swt.widgets.Button;
 * DBeaver - Universal Database Manager

 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    private final List<FileTypeAction> actions;
 *
