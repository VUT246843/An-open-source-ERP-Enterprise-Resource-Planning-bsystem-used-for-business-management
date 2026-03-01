                e.gc.setForeground(UIStyles.getDefaultTextForeground());
    {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            };
import org.jkiss.code.Nullable;
            return;
                if (showDictionaryView || singleLineEditor) {
import org.jkiss.dbeaver.model.impl.data.DBDValueError;

        if (previewController == null) {
            }
    @Override
            presentation.updateValueView();
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
/*
        }
                    viewPlaceholder.setLayout(new FillLayout());
    @Override
        if (!force && (valueManager == null || valueEditor == null)) {
            updateActions = force = (
            }
                    referenceValueEditor.setValueEditor(valueEditor);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                    }
        valueEditor = null;
            referenceValueEditor = new ReferenceValueEditor(controller, previewController, valueEditor);
        return null;
                            //setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.AUTO_SAVE));
import org.jkiss.dbeaver.DBException;

                        control instanceof CCombo ||

import org.jkiss.utils.CommonUtils;

        if (forceRefresh) {
            } catch (Exception e) {

                return ((IAdaptable) valueEditor).getAdapter(adapter);

                    try {

        if (valueEditor instanceof BaseValueEditor<?> baseValueEditor) {

        viewPlaceholder.layout();
            DBWorkbench.getPlatformUI().showError(ResultSetMessages.value_viewer_apply_error_title, ResultSetMessages.value_viewer_apply_error_message, e);
        viewPlaceholder.addPaintListener(e -> {
    @Override

import org.jkiss.dbeaver.model.DBPAdaptable;
            valueSaving = true;
 */
            e.doit = false;
                            return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(

import org.jkiss.dbeaver.ui.data.IValueController;
    }
            final boolean showDictionaryView = controller.getPreferenceStore().getInt(ModelPreferences.DICTIONARY_MAX_ROWS) > 0
            valueEditor.dispose();

import org.eclipse.core.runtime.IAdaptable;
    }
        public void run() {
            }));
                    log.error(e);
            }
/**
                            oldValue = valueEditor.extractEditorValue();
                force ||
                    IResultSetCommands.CMD_TOGGLE_PANELS,
        }
 * See the License for the specific language governing permissions and

                    Object oldValue = null;

    public void saveValue()
            previewController.updateValue(newValue, true);
                @Override
    private void refreshValue(boolean force) {
                        (control instanceof Text && (control.getStyle() & SWT.MULTI) == 0);
 * limitations under the License.
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.SAVE));
            previewController = new ResultSetValueController(
                    }
                viewPlaceholder)
                Control control = valueEditor.getControl();
        //UIUtils.applyMainFont(viewPlaceholder);

    private static final String VALUE_VIEW_CONTROL_ID = "org.jkiss.dbeaver.ui.resultset.panel.valueView";
                    String message = "No editor for [" + previewController.getValueType().getTypeName() + "]";
        });
            Object newValue = valueEditor.extractEditorValue();
    public void setFocus() {
                log.error("Can't contribute value manager actions", e);
                    // Do not check for difference

                Object newValue = previewController.getValue();
        if (valueEditor == null) {
            @Override
                    valueEditor.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        // Cleanup previous viewer

                } else {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.layout.FillLayout;
                    CSSUtils.setExcludeFromStyling(control);
        addTraverseListener(new TraverseListener() {
                }
}


                return adapter.cast(valueEditor);
        // FIXME: applying font breaks ref panel layout??
                    controller.lockActionsByFocus(control);
    private void cleanupPanel()
            force = true;
                        }
        ResultSetRow row = presentation.getController().getCurrentRow();
            baseValueEditor.setAutoSaveEnabled(true);
        if (valueManager != null) {
                IValueController.EditType.PANEL,
            super(ResultSetMessages.controls_resultset_edit_save, Action.AS_DROP_DOWN_MENU);
                        }
                } else {
        if (e.detail == SWT.TRAVERSE_TAB_NEXT) {
                    try {

                try {
                        }
import org.eclipse.swt.widgets.*;

            valueEditor = null;
    public void contributeActions(IContributionManager manager) {
 * DBeaver - Universal Database Manager
        }
            setActionDefinitionId(ValueViewCommandHandler.CMD_SAVE_VALUE);
            }
        // Dispose panel control
    class SaveValueAction extends Action {
                        }
            if (adapter.isAssignableFrom(valueEditor.getClass())) {
            setMenuCreator(new MenuCreator(widget -> {
                        control instanceof Button ||

                        valueLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                menuManager.add(
import org.jkiss.dbeaver.ui.data.editors.ReferenceValueEditor;
            valueSaving = false;
        if (valueEditor instanceof BaseValueEditor<?> baseValueEditor) {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridLayout;
    }
    public void activatePanel() {
        return true;
            return;
                    refreshValue(false);
import org.eclipse.swt.graphics.Point;
import org.jkiss.dbeaver.ui.data.IValueManager;
        if (valueEditor != null && !valueEditor.isReadOnly()) {
        viewValue(force);
                        super.updateValue(value, updatePresentation);
        if (valueEditor != null) {
        }
        refreshValue(force);

        if (valueSaving) {
                            DBWorkbench.getPlatform().getPreferenceStore().setValue(
                    control.addTraverseListener(this::handleTraverseEvent);
                }
import org.eclipse.jface.viewers.ISelectionChangedListener;
            for (ContributionItem contributionItem : referenceValueEditor.getContributionItems()) {
                boolean singleLineEditor = false;
        viewPlaceholder = new Composite(parent, SWT.NONE);
            cleanupPanel();
    @Override
            return;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
        DBDAttributeBinding attr = presentation.getCurrentAttribute();
        }
import org.eclipse.osgi.util.NLS;
        if (valueEditor != null) {
                UIUtils.drawMessageOverControl(viewPlaceholder, e, ResultSetMessages.value_viewer_select_view_message, 0);

import org.eclipse.jface.action.*;
import org.jkiss.dbeaver.ui.*;
import org.jkiss.dbeaver.ModelPreferences;
        if (referenceValueEditor != null && referenceValueEditor.isReferenceValue()) {
        viewPlaceholder.setLayout(FillLayoutFactory.fillDefaults().margins(2, 2).create());
import org.jkiss.dbeaver.ui.css.CSSUtils;
            //item.setMode(ActionContributionItem.MODE_FORCE_TEXT);
    public void clearValue()
            updateActions = true;
import org.jkiss.dbeaver.model.data.DBDValue;
                        if (previewController.getExecutionContext() != null) {
import org.jkiss.dbeaver.ui.controls.resultset.*;
        contributionManager.add(new GroupMarker(IValueManager.GROUP_ACTIONS_ADDITIONAL));
        presentation.getController().updateEditControls();
            baseValueEditor.setAutoSaveEnabled(false);
            selectionProvider.addSelectionChangedListener(selectionListener);
    @Override
                        public void run() {
    @Override
        SaveValueAction() {
    @Override
import org.eclipse.jface.layout.FillLayoutFactory;
                placeholder.addPaintListener(e -> {
            clearValue();

        } else {
            };

    private ReferenceValueEditor referenceValueEditor;
                previewController.setEditType(IValueController.EditType.INLINE);
 *
        return valueEditor != null && valueEditor.isDirty();
    private void fillToolBar(final IContributionManager contributionManager) {
        if (viewPlaceholder != null && !viewPlaceholder.isDisposed()) {
        }
                } catch (Exception e) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                ResultSetPreferences.RS_EDIT_AUTO_UPDATE_VALUE);
            final ISelectionChangedListener selectionListener = event -> {
        disposeValueEditor();
                        // This may happen if we were disconnected
    }
        if (attr == null || row == null) {
                valueManager.contributeActions(contributionManager, previewController, valueEditor);
            try {
        int[] rowIndexes = presentation.getCurrentRowIndexes();
        return viewPlaceholder;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            if (valueEditor instanceof IAdaptable) {
                    true);
    private IValueManager valueManager;
            }
                    });
                    ValueViewCommandHandler.CMD_SAVE_VALUE));
            if (previewController == null && viewPlaceholder.getChildren().length == 0) {
            presentation.getController().updatePanelActions();
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;

        }
        } finally {
                        Label valueLabel = new Label(viewPlaceholder, SWT.NONE);
    private void disposeValueEditor() {
            UIUtils.asyncExec(() -> presentation.getControl().setFocus());
        //new CompositeBorderPainter(this.viewPlaceholder);
    }
    private IResultSetPresentation presentation;
        valueManager = null;
 * You may obtain a copy of the License at
    }
    }
        }
            updateActions = true;
        }
        });

                    ValueViewerPanel.this.presentation.getController().getSite(),
            if (showDictionaryView) {
    }
                String hidePanelCmd = ActionUtils.findCommandDescription(

*/
                        valueLabel.setText(ResultSetMessages.reference_value_editor_value_label);
                    presentation.updateValueView();
    private volatile boolean valueSaving;

                } else if (newValue instanceof DBDValue) {
 *
                if (newValue instanceof DBDValueError) {
    }
        viewPlaceholder.setFocus();
                presentation.getController().getSite());
            // Create a new one
        }
                valueEditor = valueManager.createEditor(previewController);
                        valueSaving = false;
                    }

            } catch (DBException e) {
            public void keyTraversed(TraverseEvent e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                log.error(e);
            ActionContributionItem item = new ActionContributionItem(new SaveValueAction());
import org.jkiss.code.NotNull;
import org.eclipse.swt.custom.CCombo;
 */
            if (valueEditor != null) {
    private static final Log log = Log.getLog(ValueViewerPanel.class);
            }

            viewPlaceholder.dispose();
    private IValueEditor valueEditor;


                });
                    valueEditor.createControl();
        }

            }
 *
            contributionManager.add(item);
import org.eclipse.swt.SWT;
                presentation.getController(),
            try {
    private Composite viewPlaceholder;
    public Control createContents(IResultSetPresentation presentation, Composite parent) {
        }
                    } catch (Throwable e) {
    public void refresh(boolean force) {
        boolean updateActions;
                    if (showDictionaryView) {
                }
                final Composite placeholder = UIUtils.createPlaceholder(viewPlaceholder, 1);
                    } finally {
                    singleLineEditor =
/*
                        valueEditor.primeEditorValue(newValue);
                        {
                contributionManager.add(contributionItem);
                        @Override


                && referenceValueEditor.isReferenceValue();

    @Override
            }
                        public boolean isChecked() {
    public boolean isDirty() {
        } catch (Exception e) {
    }
                    Rectangle bounds = placeholder.getBounds();
import org.eclipse.swt.layout.GridData;
                }
                referenceValueEditor = null;
        viewPlaceholder.addTraverseListener(this::handleTraverseEvent);
            }
    {
        viewPlaceholder.addDisposeListener(e -> disposeValueEditor());
            if (valueEditor == null || valueEditor.getControl() == null) {
public class ValueViewerPanel extends ResultSetPanelBase implements DBPAdaptable {
    private ResultSetValueController previewController;
 * Unless required by applicable law or agreed to in writing, software
                            presentation.getController().updatePanelActions();
    }
        if (valueEditor != null) {
        }
                        // Some error extracting current value
                return menuManager;
                }
        this.presentation = presentation;
        }
            valueManager = previewController.getValueManager();
    public boolean needsSeparator() {
                    presentation.getController().getSite(),

            } catch (Throwable e) {
                }
                ValueViewCommandHandler.CMD_SAVE_VALUE,
                previewController.getBinding() != attr ||
                previewController.setEditType(IValueController.EditType.PANEL);
                    hidePanel();
            {
    {
    private void handleTraverseEvent(TraverseEvent e) {
        cleanupPanel();
                menuManager.add(ActionUtils.makeCommandContribution(
package org.jkiss.dbeaver.ui.controls.resultset.panel.valueviewer;
    {
                new ResultSetCellLocation(attr, row, rowIndexes),
                    viewPlaceholder.setLayout(gl);

                        control instanceof Combo ||
                    GridLayout gl = new GridLayout(1, false);
import org.jkiss.dbeaver.ui.data.editors.BaseValueEditor;
                    }
        refreshValue(false);
import org.jkiss.dbeaver.Log;
                !CommonUtils.equalObjects(rowIndexes, previewController.getRowIndexes()));
            valueEditor.setDirty(false);
            viewPlaceholder = null;
        CSSUtils.setExcludeFromStyling(viewPlaceholder);
                    valueEditor.primeEditorValue(newValue);
import org.eclipse.swt.events.TraverseEvent;

    private void viewValue(boolean forceRefresh)
                    if (forceRefresh || !CommonUtils.equalObjects(oldValue, newValue)) {

    }
                                ResultSetPreferences.RS_EDIT_AUTO_UPDATE_VALUE, newValue);
    public void deactivatePanel() {

                    e.doit = false;
            IResultSetController controller = presentation.getController();

            }
        }
                return;
    }
 * RSV value view panel
    @Override
                }
        try {
                    referenceValueEditor.createEditorSelector(viewPlaceholder);
        if (this.presentation instanceof ISelectionProvider selectionProvider) {
                    UIUtils.addFocusTracker(controller.getSite(), VALUE_VIEW_CONTROL_ID, control);
    }
            viewPlaceholder.layout();
    }
        if (updateActions) {
                if (e.detail == SWT.TRAVERSE_ESCAPE) {
            try {
            previewController.setCellLocation(new ResultSetCellLocation(attr, row, rowIndexes));
                MenuManager menuManager = new MenuManager();
            ActionUtils.runCommand(
    public ValueViewerPanel() {
                    e.gc.drawText(message, (bounds.width - ext.x) / 2, bounds.height / 3 + 20);

    }

                    Point ext = e.gc.textExtent(message);
import org.eclipse.swt.graphics.Rectangle;
        }

            }
            } else {
                        @Override
        }
                            boolean newValue = !isChecked();
        fillToolBar(manager);

    public static final String PANEL_ID = "value-view";
    }
            viewPlaceholder.addDisposeListener(e -> selectionProvider.removeSelectionChangedListener(selectionListener));
        @Override
                    // Error value. Do not populate it in value viewer
                UIUtils.drawMessageOverControl(viewPlaceholder, e, NLS.bind(ResultSetMessages.value_viewer_hide_panel_message, hidePanelCmd), 30);
                DBWorkbench.getPlatformUI().showError(ResultSetMessages.value_viewer_preview_error_title, ResultSetMessages.value_viewer_preview_error_message, e);

                    new Action(ResultSetMessages.value_viewer_auto_apply_action_text, Action.AS_CHECK_BOX) {
import org.jkiss.dbeaver.ui.data.IValueEditor;
                    valueSaving = true;
        UIUtils.disposeChildControls(viewPlaceholder);
                public void updateValue(@Nullable Object value, boolean updatePresentation) {
        }
        }
            force = true;
import org.eclipse.jface.viewers.ISelectionProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }

                if (ValueViewerPanel.this.presentation.getController().getVisiblePanel() == ValueViewerPanel.this) {
                if (control != null) {
