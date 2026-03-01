}            case PANEL:
                return setString.toString();
                }
    public IValueController.EditType[] getSupportedEditTypes() {
/*
            if (isMultiValue(valueController)) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Listener;
            case INLINE:

                    return null;
                        ((IMultiController) controller).closeInlineEditor();
                fillSetList(valueController, control, value);
            if (editor.getSelectionIndex() < 0) {
                return new EnumInlineEditor(controller);
                        if (control.getItem(i).equals(value)) {
import org.jkiss.dbeaver.DBException;
        }
                String enumValue = enumValues.get(i);
                    }
        }

            }
                for (String enumValue : enumValues) {
                if (isMultiValue(controller)) {
            if (controller.getEditType() == IValueController.EditType.INLINE) {
                return control.getItem(selIndex);
package org.jkiss.dbeaver.ui.data.managers;
        protected org.eclipse.swt.widgets.List createControl(Composite editPlaceholder)
    }
            }
            int style = SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL;
                }
                        saveValue();

    private class EnumInlineEditor extends BaseValueEditor<Combo> {
            }
                if (setValues.contains(enumValue)) {
                    editor.add(enumValue);
 *
import org.eclipse.swt.widgets.Combo;
            editPlaceholder.setFocus();
        if (enumValues != null) {
            if (selIndex < 0) {
 * See the License for the specific language governing permissions and
            {
        {
            }
    @Override
        }
            return editor;

 */
        {
import org.jkiss.dbeaver.ui.data.IMultiController;
        {
import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;

    @Override
        @Override
        switch (controller.getEditType()) {

 * Abstract Enum/Set value manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (isMultiValue(valueController)) {
            this.controller = controller;
 * you may not use this file except in compliance with the License.
                return new DefaultValueViewDialog(controller);

        List<String> setValues = getSetValues(valueController, value);
            final Combo editor = new Combo(controller.getEditPlaceholder(), SWT.READ_ONLY);
            int selIndex = 0;
    }
        }
                inlineControl.getParent().addFocusListener(new FocusAdapter() {
    void fillSetList(IValueController valueController, org.eclipse.swt.widgets.List editor, Object value)
            }
        public EnumPanelEditor(IValueController controller) {
            super(controller);
    private class EnumPanelEditor extends BaseValueEditor<org.eclipse.swt.widgets.List> {

 *
                });
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
            final org.eclipse.swt.widgets.List editor = new org.eclipse.swt.widgets.List(editPlaceholder, style);
                return null;
    protected abstract List<String> getEnumValues(IValueController valueController);

            super(controller);
                int itemCount = control.getItemCount();
        @Override
        @Override
            }
                    }
    {
                if (itemCount == 0) {
                } else {
                editor.select(0);
        }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                if (value == null) {
            Collection<String> enumValues = getEnumValues(valueController);
        public EnumInlineEditor(IValueController controller) {
import java.util.List;

        protected void addInlineListeners(@NotNull Control inlineControl, @NotNull Listener listener) {
        throws DBException

        public Object extractEditorValue()
import java.util.Collection;
    protected abstract boolean isMultiValue(IValueController valueController);
                }
        @Override
                    return null;

                    }
            int[] selIndices = new int[setValues.size()];
        @Override
            if (RuntimeUtils.isMacOS()) {

    }
                }
                int selIndex = control.getSelectionIndex();
import org.jkiss.utils.CommonUtils;
    }
/**
import org.jkiss.code.Nullable;
import org.eclipse.swt.SWT;
        }
                    for (int i = 0; i < itemCount; i++) {

 * You may obtain a copy of the License at
    public IValueEditor createEditor(@NotNull final IValueController controller)
                    if (setString.length() > 0) setString.append(',');
            this.controller = controller;
                return new EnumPanelEditor(controller);
            } else {

import org.eclipse.swt.widgets.Control;
                    @Override
                editor.add(enumValue);
            } else {
        @Override
        private final IValueController controller;
            }

            }
                        control.add(CommonUtils.toString(value));
                }
            Collection<String> enumValues = getEnumValues(valueController);
            if (editor.getItemCount() == 0) {
            } else {
import org.jkiss.dbeaver.ui.data.editors.BaseValueEditor;
            super.addInlineListeners(inlineControl, listener);
            editor.select(selIndices);
                    control.setSelection(-1);
                    return control.getItem(selIndex);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        @Override
                }

                            control.setSelection(i);
                editor.setFocus();

        public void primeEditorValue(@Nullable Object value) throws DBException
            int selIndex = control.getSelectionIndex();
                for (String sel : control.getSelection()) {
            }
                    public void focusLost(FocusEvent e) {
                } else {
                return null;

        } else {
        editor.removeAll();
        {
 * limitations under the License.
                    editor.add(ev);
 */
                editor.add(CommonUtils.toString(value));

                for (String ev : enumValues) {
        }
                // READ_ONLY Combo can't have a focus on macOS due to bug in SWT. So we place a focus listener on its
            control.setText(DBUtils.isNullValue(value) ? "" : DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.UI));

import org.jkiss.dbeaver.model.DBUtils;
            }
import org.jkiss.dbeaver.ui.data.IValueController;
            return editor;
    protected abstract List<String> getSetValues(IValueController valueController, Object value);
import org.eclipse.swt.events.FocusEvent;
            }
                    setString.append(sel);
            } else {
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                if (selIndex < 0) {
            default:
        private final IValueController controller;
        }
            if (editor.getSelectionIndex() < 0) {
import org.eclipse.swt.events.FocusAdapter;
                            break;
 * Unless required by applicable law or agreed to in writing, software
            }
                    selIndices[selIndex++] = i;
            if (isMultiValue(valueController)) {
        }
        {
            for (int i = 0; i < enumValues.size(); i++) {
        }
                    if (!DBUtils.isNullValue(value)) {
    {
                StringBuilder setString = new StringBuilder();
                style |= SWT.SINGLE;
            case EDITOR:
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }

        {
import org.eclipse.swt.widgets.Composite;
        List<String> enumValues = getEnumValues(valueController);
                }
        public void primeEditorValue(@Nullable Object value) throws DBException
        public Object extractEditorValue()
        protected Combo createControl(Composite editPlaceholder)
            }
            if (enumValues != null) {
 *
import org.jkiss.dbeaver.ui.data.IValueEditor;
    @NotNull
                editor.select(0);
                style |= SWT.MULTI;
import org.jkiss.dbeaver.model.DBValueFormatting;
            if (enumValues != null) {
            setAutoSaveEnabled(true);
                // placeholder instead
            }
                }
            {
public abstract class EnumValueManager extends BaseValueManager {
import org.jkiss.dbeaver.utils.RuntimeUtils;
