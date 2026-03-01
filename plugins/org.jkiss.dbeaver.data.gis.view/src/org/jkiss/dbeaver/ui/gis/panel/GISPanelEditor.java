    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
        public void runWithEvent(Event event)
        if (curViewer != null) {

        {
                    item.setText(viewerDescriptor.getLabel());
import java.util.List;
    private GeometryViewerDescriptor curViewerDescriptor;
            viewerDescriptor = GeometryViewerRegistry.getInstance().getViewer(viewerId);
            curViewer.primeEditorValue(value);
        }
            return new Composite(editPlaceholder, SWT.NONE);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            }

                    }
        private Menu createMenu(ToolItem toolItem) {
import org.eclipse.swt.events.SelectionListener;
        List<GeometryViewerDescriptor> viewers = GeometryViewerRegistry.getInstance().getSupportedViewers(controller.getExecutionContext().getDataSource());
            if (event.widget instanceof ToolItem) {
                menu.setLocation(point.x, point.y);


            String viewerId = valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore().getString(PROP_VIEWER_ID);
 * GISPanelEditor
                if (item.getData() instanceof GeometryViewerDescriptor) {
                        GeometryViewerDescriptor newManager = (GeometryViewerDescriptor) itemData;
import org.jkiss.dbeaver.DBException;
            PROP_VIEWER_ID, curViewerDescriptor.getId());
                    MenuManager menuManager = new MenuManager();
                ToolBar toolBar = toolItem.getParent();
    @Override
        public void widgetSelected(SelectionEvent e) {
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (menu == null) {
                    MenuItem item = new MenuItem(menu, SWT.RADIO);
        public boolean isChecked() {
        valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore().setValue(
            for (MenuItem item : menu.getItems()) {
        //manager.add(new ToolbarSeparatorContribution(false));
                    try {
            }
            return curViewer.getControl();
            viewerId = DEFAULT_VIEWER_ID;
                            valueController.refreshEditor();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            viewerDescriptor = vd;
            return viewerDescriptor.getId().equals(viewerId);
                        log.error(e);
        public void widgetDefaultSelected(SelectionEvent e) {

            }
        }
                            item.fill(menu, -1);

 *
    }
import org.eclipse.swt.graphics.Rectangle;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
            Action switchAction = new ViewerSetAction(vd);
            viewerId = DEFAULT_VIEWER_ID;
    private static final String PROP_VIEWER_ID = "gis.geometry.viewer.id";

        }
            curViewer = curViewerDescriptor.createGeometryViewer(valueController);
                Point point = toolItem.getParent().toDisplay(bounds.x, bounds.y + bounds.height);
                        curViewer.contributeActions(menuManager, valueController);
        }
            for (MenuItem item : menu.getItems()) {

            }

        }
import org.jkiss.dbeaver.Log;
    }
    protected Control createControl(Composite editPlaceholder) {
                }
        if (viewerDescriptor != null) {
            setViewer(viewerDescriptor);
        ViewerSwitchAction() {
    private class ViewerSetAction extends Action {
            setToolTipText(GISMessages.panel_gis_panel_editor_viewer_action_tool_tip_text_settings);
            setToolTipText(viewerDescriptor.getDescription());
    private static final String DEFAULT_VIEWER_ID = "browser";
        if (curViewer == null) {
                if (item.getSelection()) {
            curViewer.createControl();
            if (curViewerDescriptor == viewerDescriptor) {

                ToolItem toolItem = (ToolItem) event.widget;
            }
    private class ViewerSwitchAction extends Action implements SelectionListener {
            curViewer.contributeActions(manager, controller);

import org.eclipse.jface.action.*;
            super(null, Action.AS_DROP_DOWN_MENU);
            super(vd.getLabel(), Action.AS_RADIO_BUTTON);


                            setViewer(newManager);
    public Object extractEditorValue() throws DBException {
                Menu menu = createMenu(toolItem);
        if (curViewer != null) {
public class GISPanelEditor extends BaseValueEditor<Control> {
            if (i > 0) {
        }
        if (CommonUtils.isEmpty(viewerId)) {
        }

                menu.setVisible(true);
 * You may obtain a copy of the License at

            return menu;
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerRegistry;
    }
    private void setDefaultViewer() {
                    if (itemData instanceof GeometryViewerDescriptor) {
    }
        }
        private Menu menu;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        }
 *
/**
    @Override
        }
        try {
                menu = new Menu(toolBar);
            }
                setImageDescriptor(DBeaverIcons.getImageDescriptor(viewerDescriptor.getIcon()));
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
        @Override
                manager.add(new Separator());
/*
                    getValueController().getExecutionContext().getDataSource());
        private GeometryViewerDescriptor viewerDescriptor;
        }
        @Override
            GeometryViewerDescriptor vd = viewers.get(i);
        }
    }
import org.jkiss.dbeaver.model.DBIcon;
                }

                    toolBar.addDisposeListener(e -> menu.dispose());
import org.jkiss.dbeaver.ui.gis.IGeometryViewer;
            setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_SCRIPT_FOLDER));
        public void run() {
        setDefaultViewer();
    }
        super(controller);
                    item.setData(viewerDescriptor);
        @Override

 * limitations under the License.

            manager.add(ActionUtils.makeActionContribution(switchAction, true));
            log.error(e);
        if (viewerDescriptor == null || valueController.getEditType() == IValueController.EditType.INLINE && !viewerDescriptor.supportsInlineView()) {
                }
                return;
                List<GeometryViewerDescriptor> viewers = GeometryViewerRegistry.getInstance().getSupportedViewers(
            valueController.refreshEditor();
        @Override
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
        }
                for (GeometryViewerDescriptor viewerDescriptor : viewers) {
    private IGeometryViewer curViewer;

    public void primeEditorValue(Object value) throws DBException {
            }
import org.jkiss.dbeaver.ui.ActionUtils;
    private static final Log log = Log.getLog(GISPanelEditor.class);
 * See the License for the specific language governing permissions and
            if (CommonUtils.isEmpty(viewerId)) {
        String viewerId = valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore().getString(PROP_VIEWER_ID);
        }
        ViewerSetAction(GeometryViewerDescriptor vd) {
import org.jkiss.utils.CommonUtils;

        curViewerDescriptor = viewerDescriptor;
                viewerId = DEFAULT_VIEWER_ID;
        @Override
 */
        }
                        if (newManager != curViewerDescriptor) {

        return curViewer == null || curViewer.isReadOnly();
import org.jkiss.dbeaver.ui.data.IValueController;
        GeometryViewerDescriptor viewerDescriptor = GeometryViewerRegistry.getInstance().getViewer(viewerId);
    public GISPanelEditor(IValueController controller) {
        return curViewer == null ? null : curViewer.extractEditorValue();
 *
                Rectangle bounds = toolItem.getBounds();
                        for (IContributionItem item : menuManager.getItems()) {
*/
import org.eclipse.swt.events.SelectionEvent;
                if (curViewer != null) {

            setViewer(viewerDescriptor);
    public boolean isReadOnly() {
        } else {
    }
import org.eclipse.swt.widgets.*;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

                }
                    item.setSelection(item.getData() == curViewerDescriptor);
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerDescriptor;
}
import org.eclipse.swt.graphics.Point;
            }
                        }
        for (int i = 0; i < viewers.size(); i++) {
                    } catch (DBCException e) {
    }
        }
import org.jkiss.dbeaver.ui.data.editors.BaseValueEditor;
                    }
    @Override
        //manager.add(new ViewerSwitchAction());
        } catch (DBException e) {
import org.eclipse.swt.SWT;
                    item.addSelectionListener(this);

package org.jkiss.dbeaver.ui.gis.panel;
    private void setViewer(GeometryViewerDescriptor viewerDescriptor) {
            if (viewerDescriptor.getIcon() != null) {
                    Object itemData = item.getData();
