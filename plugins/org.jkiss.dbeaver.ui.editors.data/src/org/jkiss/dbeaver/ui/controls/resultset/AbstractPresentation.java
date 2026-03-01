
    }

        controller.updateEditControls();
                controller.updateEditControls();
                    controller.setCurrentRow(model.getRow(currentRow.getVisualNumber()));
        getControl().setMenu(menu);
}
 * DBeaver - Universal Database Manager
        // Enable horizontal scrolling
    public IResultSetController getController() {
        if (site instanceof IEditorSite) {
    @Override
    private static final String PRESENTATION_CONTROL_ID = "org.jkiss.dbeaver.ui.resultset.presentation";

            manager,
    // ISelectionProvider
import org.eclipse.ui.contexts.IContextService;
            case PREVIOUS:
    @NotNull
                }
        EditorUtils.trackControlContext(site, control, RESULTS_CONTROL_CONTEXT_ID);
            ((IEditorSite) site).registerContextMenu(getClass().getSimpleName() + "_menu", menuMgr, this, false);

        return null;
            }

        menuMgr.setRemoveAllWhenShown(true);
    public ISelection getSelection() {
    public int[] getCurrentRowIndexes() {
    public void setSelection(@NotNull ISelection selection, boolean reflect) {

    public void fillMenu(@NotNull IMenuManager menu) {
    }
import org.eclipse.jface.action.IMenuManager;

    }
    public void dispose() {
    @Override
            case NEXT:
    protected void activateTextKeyBindings(@NotNull IResultSetController controller, Control control) {

                break;
                }

     * In record mode refreshes data.
        }
 *
    @Override
            case FIRST:
import org.eclipse.swt.events.FocusListener;
                }
                    activation = contextService.activateContext("org.eclipse.ui.textEditorScope");
 *

    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
            }
            public void focusLost(FocusEvent e) {
import java.util.List;

 * distributed under the License is distributed on an "AS IS" BASIS,

            getControl().redraw();
 */

    }
    public Point getCursorLocation() {

        SelectionChangedEvent event = new SelectionChangedEvent(this, selection);
                performHorizontalScroll(e.count);
                }
    public void printResultSet() {
            if (shift) {
 * you may not use this file except in compliance with the License.
            public void focusGained(FocusEvent e) {
    }
        }
    }
        Control control = getControl();
                }
import org.eclipse.ui.contexts.IContextActivation;
    public boolean isDirty() {
            IResultSetController.ContextMenuLocation.UNKNOWN
        selectionChangedListenerList.remove(listener);
import org.eclipse.swt.widgets.Menu;
    public void showAttribute(@NotNull DBDAttributeBinding attribute) {

                break;
    @NotNull
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        return ThemeConstants.FONT_SQL_RESULT_SET;
    }
        } else {
    public static final String RESULT_SET_PRESENTATION_CONTEXT_MENU = "org.jkiss.dbeaver.ui.controls.resultset.conext.menu";
    public void setCurrentAttribute(@NotNull DBDAttributeBinding attribute) {
        controller.updateStatusMessage();
        // do nothing
        UIUtils.addFocusTracker(site, PRESENTATION_CONTROL_ID, control);
                if (model.getRowCount() > 0) {
    public void addSelectionChangedListener(ISelectionChangedListener listener) {

        return EMPTY_SELECTION;

        if (control != null && !control.isDisposed()) {
    protected void fireSelectionChanged(ISelection selection) {
    @Override
        });
import org.eclipse.ui.IWorkbenchPartSite;
    protected void applyThemeSettings(ITheme currentTheme) {
import org.eclipse.swt.widgets.Control;
package org.jkiss.dbeaver.ui.controls.resultset;
                controller.updateEditControls();

    @Override
            control.setFocus();
    protected void applyCurrentThemeSettings() {

import org.eclipse.jface.action.MenuManager;
    @Override
 */
        // Set focus to main control
        }
    }
            // Exclude editor input contributions from context menu
    }
    @Nullable
        // do nothing
    }
            boolean shift = ((e.stateMask & SWT.MOD2) != 0);
    public void scrollToRow(@NotNull RowPosition position) {
    @Override


        controller.getDecorator().registerDragAndDrop(this);

    @Override
                    activation = null;
        control.addFocusListener(new FocusListener() {
 * You may obtain a copy of the License at

        final Control control = getControl();

        // RSV control context
    }
    }
        return getCurrentAttribute();
    @Override
                    controller.setCurrentRow(model.getRow(currentRow.getVisualNumber() - 1));

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IEditorSite;

            listener.selectionChanged(event);
    }
 * Unless required by applicable law or agreed to in writing, software
        Menu menu = menuMgr.createContextMenu(getControl());
                    controller.setCurrentRow(model.getRow(currentRow.getVisualNumber() + 1));
            controller.getCurrentRow(),
 * limitations under the License.
    @Override
            case LAST:
    }
    public DBDAttributeBinding getFocusAttribute() {
 * Abstract presentation.
    protected void performHorizontalScroll(int scrollCount) {
        selectionChangedListenerList.add(listener);
            refreshData(true, false, false);
        return controller;
        return false;
            IContextActivation activation;
     */
                if (currentRow != null) {

            null,
        });


    private final List<ISelectionChangedListener> selectionChangedListenerList = new ArrayList<>();
    ///////////////////////////////////////////////////////////////////////
    }
    }
            @Override
                    controller.setCurrentRow(model.getRow(model.getRowCount() - 1));
            }
import org.eclipse.swt.graphics.Point;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override

    }
        return null;
    protected void trackPresentationControl() {

    @Override
        ResultSetRow currentRow = controller.getCurrentRow();
        applyThemeSettings(UIUtils.getCurrentTheme());
    public void setSelection(ISelection selection) {
        for (ISelectionChangedListener listener : selectionChangedListenerList) {
        // Register context menu
     * @param position    position
                if (activation != null) {
    }
    }
                if (currentRow != null && currentRow.getVisualNumber() < model.getRowCount() - 1) {

            case CURRENT:
     * Shifts current row and redraws current control.
        setSelection(selection);
    @Override
    private static final String RESULTS_CONTROL_CONTEXT_ID = "org.jkiss.dbeaver.ui.context.resultset.focused";
        this.controller = controller;
    public void createPresentation(@NotNull final IResultSetController controller, @NotNull Composite parent) {
    @Override
    @Override

    }

    }
        final IContextService contextService = controller.getSite().getService(IContextService.class);

    }
        IWorkbenchPartSite site = controller.getSite();
            @Override

                break;
    protected IResultSetController controller;
 *

        final IWorkbenchPartSite site = controller.getSite();
        if (controller.isRecordMode()) {

    }
    public void applyChanges() {
        // Register DnD handlers for this presentation
        }
                break;
                    controller.setCurrentRow(model.getRow(0));
    protected void registerContextMenu() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (currentRow != null) {
                if (currentRow != null && currentRow.getVisualNumber() > 0) {

import org.eclipse.swt.events.FocusEvent;
    @Nullable
                }
/*
import org.eclipse.ui.themes.ITheme;
    public String getFontId() {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.Nullable;
        MenuManager menuMgr = new MenuManager(null, RESULT_SET_PRESENTATION_CONTEXT_MENU);



    }
/**

                break;
    }
        ));

public abstract class AbstractPresentation implements IResultSetPresentation, ISelectionProvider {
    @Override
    /**
                }
import org.jkiss.code.NotNull;
        }
        switch (position) {
        ResultSetModel model = controller.getModel();
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import java.util.ArrayList;

                    contextService.deactivateContext(activation);
    public void rejectChanges() {
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public static final String DATA_VALUE_CONTROLLER = "org.jkiss.dbeaver.resultset.value-controller";
    }
        control.addMouseWheelListener(e -> {
import org.eclipse.jface.viewers.*;
        menuMgr.addMenuListener(manager -> controller.fillContextMenu(
        } else {
    @Override
                if (activation == null) {
    private static final StructuredSelection EMPTY_SELECTION = new StructuredSelection();
 * See the License for the specific language governing permissions and
    @Override
            site.registerContextMenu(menuMgr, this);
            getCurrentAttribute(),

