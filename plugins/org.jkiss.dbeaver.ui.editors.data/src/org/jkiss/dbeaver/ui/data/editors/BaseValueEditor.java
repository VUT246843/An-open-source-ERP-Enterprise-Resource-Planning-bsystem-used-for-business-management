            setDirty(true);
//            }
                        ((IMultiController) valueController).nextInlineEditor(e.detail == SWT.TRAVERSE_TAB_NEXT);
                if (controlBounds.contains(relativeCursorLocation)) {
    }
        this.valueController = valueController;
import org.jkiss.dbeaver.ui.editors.EditorUtils;


    }
import org.eclipse.jface.action.IContributionManager;
/**
        this.additionalTraverseActions = method;
        this.control = control;
    }
        }




                     } else if (e.detail == SWT.TRAVERSE_ESCAPE) {
                        if (additionalTraverseActions != null) {
        setControl(control);

        }

            //inlineControl.setFocus();

        // Do not use focus listener in dialogs (because dialog has controls like Ok/Cancel buttons)
    }
                        e.detail = SWT.TRAVERSE_NONE;
                        }

            return !(control instanceof StyledText || control instanceof Text || control instanceof Table || control instanceof Tree);
            if (!UIUtils.isInDialog(inlineControl)) {
import org.eclipse.swt.events.FocusListener;

                        e.doit = false;
        control.setFont(getDefaultFont());
        inlineControl.addListener(SWT.Selection, listener);
        // Unfortunately, focusLost events on macOS never reach the listener above.
import org.jkiss.code.NotNull;
            }
 *
            for (Control childControl : ((Composite) inlineControl).getChildren()) {
    protected final IValueController valueController;
                        if (additionalTraverseActions != null) {


    }
    protected boolean autoSaveEnabled;
            public void focusGained(FocusEvent e) {
                        ((IMultiController) valueController).closeInlineEditor();

                     } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.widgets.*;
                             if (!childControl.isDisposed()) {
                        ((IMultiController) valueController).closeInlineEditor();
    }
    protected void saveValue() {
                         for (Control childControl : ((Composite) inlineControl).getChildren()) {

    protected void saveValue(boolean showError) {
    @Nullable
    public void dispose() {
                        e.detail = SWT.TRAVERSE_NONE;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void onFocusLost(@NotNull Consumer<Object> valueSaver) {
}
    private void saveValue(boolean showError, @NotNull Consumer<Object> valueUpdater) {
                Point relativeCursorLocation = editor.control.toControl(e.display.getCursorLocation());
import org.eclipse.swt.custom.CCombo;
                }
        addInlineListeners(inlineControl, modifyListener);

 * Unless required by applicable law or agreed to in writing, software
        });
    }
        TextEditorUtils.enableHostEditorKeyBindingsSupport(valueController.getValueSite(), inlineControl);
                saveValue(false);

        }


import org.jkiss.dbeaver.ui.UIUtils;
                                 addAutoSaveSupport(childControl);
            if (event.type == SWT.Selection) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                // Combos are always dirty (because drop-down menu sets a selection)
                        e.doit = false;
        // However, we rely on them to save the value when the user clicks somewhere on the grid and LightGrid forces focus on itself.
import org.jkiss.dbeaver.ui.data.IValueController;
        return ResultSetThemeSettings.instance.resultSetFont;
    }
    {
    public void setDirty(boolean dirty) {
    public void addAdditionalTraverseActions(@NotNull Consumer<TraverseEvent> method) {
                            additionalTraverseActions.accept(e);
    @NotNull
            }
/*
                inlineControl.setFont(ResultSetThemeSettings.instance.resultSetFont);
    public Control getControl()
import org.eclipse.swt.graphics.Font;
            if (showError) {
                            additionalTraverseActions.accept(e);
    public boolean isDirty() {
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
//            if (!isInline) {
    protected T control;
import org.jkiss.dbeaver.Log;
                         }

            if (valueController instanceof IMultiController) {
        inlineControl.addFocusListener(new FocusListener() {
                        }

    protected Font getDefaultFont() {
        // on some other cell on the grid. Hence, we need to use updateValue() on valueController, not updateSelectionValue().
    {
 *
                        if (!valueController.isReadOnly()) {
            @Override
            public void focusLost(FocusEvent e) {
        }
        // The solution is to add dispose listener. But here is a catch: when inline control is about to be disposed of, the selection is already
    }
            ((IMultiController) valueController).closeInlineEditor();
import org.jkiss.dbeaver.ui.data.IValueEditor;
    }

    }
public abstract class BaseValueEditor<T extends Control> implements IValueEditor {
            }

import org.eclipse.swt.graphics.Rectangle;
    }
                    return;

        @Override
    @Override
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
                // bounds. See [dbeaver#10561].
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                     if (inlineControl instanceof Composite) {
    protected boolean dirty;
                        }
            }
            if (dirty || control instanceof Combo || control instanceof CCombo || control instanceof List) {

        T control = createControl(valueController.getEditPlaceholder());
                    if (e.detail == SWT.TRAVERSE_RETURN) {


                ((IMultiController) valueController).closeInlineEditor();
                }
        }
            } else {
        UIUtils.installMacOSFocusLostSubstitution(inlineControl, () -> onFocusLost(value -> valueController.updateValue(value, true)));
import org.jkiss.dbeaver.ui.data.IMultiController;
 * You may obtain a copy of the License at
                if (!isListControl(event.widget)) {
            //isInline = false;

        if (!valueController.isReadOnly()) {
    {
package org.jkiss.dbeaver.ui.data.editors;

    protected void addInlineListeners(@NotNull Control inlineControl, @NotNull Listener listener) {
    }
            }
                 } else {
        if (this.control != null && control != valueController.getEditPlaceholder()) {
                     } else if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
    public void createControl() {
            }
                // check that in reality we clicked on editor by checking that cursor is in control's
                                 EditorUtils.trackControlContext(valueController.getValueSite(), childControl, RESULTS_EDIT_CONTEXT_ID);
                });
                inlineControl.addTraverseListener(e -> {
                 }
        saveValue(true);
                        e.detail = SWT.TRAVERSE_NONE;
                // It feels like on Linux editor's control is 'invisible' for GTK and mouse clicks

                         addAutoSaveSupport(inlineControl);
    private void addAutoSaveSupport(final Control inlineControl) {

            initInlineControl(this.control);
    protected abstract T createControl(Composite editPlaceholder);
    private static final Log log = Log.getLog(BaseValueEditor.class);
            if (valueController instanceof IMultiController) { // In dialog it also should handle all standard stuff because we have params dialog
                // Set control font (the same as for results viewer)
        if (inlineControl instanceof Composite) {
                onFocusLost(valueController::updateSelectionValue);
    protected void initInlineControl(final Control inlineControl)

                            saveValue();
            //inlineControl.setFont(valueController.getEditPlaceholder().getFont());
    }
    protected BaseValueEditor(final IValueController valueController)
    }
import org.jkiss.dbeaver.DBException;
        }
                Rectangle controlBounds = editor.control.getBounds();
        private boolean isListControl(Widget control) {
                DBWorkbench.getPlatformUI().showError("Value save", "Can't save edited value", e);
        return valueController;
        }
    }
                // 'go through' the control and reach underlying spreadsheet. Workaround:
    public boolean isAutoSaveEnabled() {
        }
                        e.doit = false;
import org.eclipse.swt.graphics.Point;
                log.debug("Error saving value: " + e.getMessage());
    }
            if (autoSaveEnabled && DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ResultSetPreferences.RS_EDIT_AUTO_UPDATE_VALUE)) {
        return dirty;
                    // Just a text selection

        try {


        if (isInline && UIUtils.isInDialog(inlineControl)) {

*/
        if (valueController instanceof IMultiController) {
    public boolean isReadOnly() {
                        if (additionalTraverseActions != null) {
    public void setControl(T control) {
                             }
                        saveValue();

    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
            }

        final ControlModifyListener modifyListener = new ControlModifyListener();
 * you may not use this file except in compliance with the License.
    }
    private Consumer<TraverseEvent> additionalTraverseActions;
 * DBeaver - Universal Database Manager
        }
    private static final String RESULTS_EDIT_CONTEXT_ID = "org.jkiss.dbeaver.ui.context.resultset.edit";
import org.eclipse.swt.events.FocusEvent;
            }
import org.jkiss.code.Nullable;
                     }
 * limitations under the License.
import org.eclipse.swt.SWT;
    private class ControlModifyListener implements Listener {
                     }
        return valueController.isReadOnly();
            @Override
import org.eclipse.swt.custom.StyledText;
    @Override
        public void handleEvent(Event event) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetThemeSettings;
                    return;
        BaseValueEditor<?> editor = this;
        this.dirty = dirty;

                 if (!UIUtils.isInDialog(inlineControl)) {
    }
 * See the License for the specific language governing permissions and
                valueUpdater.accept(newValue);
                     ((IMultiController) valueController).closeInlineEditor();

    }
    @Override
        return control;
    public void setAutoSaveEnabled(boolean autoSaveEnabled) {
                TextEditorUtils.enableHostEditorKeyBindingsSupport(valueController.getValueSite(), childControl);
            Object newValue = extractEditorValue();
        saveValue(showError, valueController::updateSelectionValue);
 *
        inlineControl.addListener(SWT.Modify, listener);
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import java.util.function.Consumer;

import org.jkiss.dbeaver.model.exec.DBCException;
//                inlineControl.setBackground(valueController.getEditPlaceholder().getBackground());
    public IValueController getValueController() {
                            additionalTraverseActions.accept(e);
    @Override
        } catch (DBException e) {
        return autoSaveEnabled;
* BaseValueEditor
        boolean isInline = (valueController.getEditType() == IValueController.EditType.INLINE);
        this.autoSaveEnabled = autoSaveEnabled;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }
 */
        if (isInline) {
    }
            EditorUtils.trackControlContext(valueController.getValueSite(), inlineControl, RESULTS_EDIT_CONTEXT_ID);
            saveValue(false, valueSaver);
import org.eclipse.swt.events.TraverseEvent;
