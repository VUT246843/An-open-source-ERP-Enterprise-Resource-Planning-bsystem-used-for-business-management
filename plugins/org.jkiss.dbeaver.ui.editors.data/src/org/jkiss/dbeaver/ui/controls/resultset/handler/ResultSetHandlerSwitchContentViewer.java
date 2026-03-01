            element.setTooltip(manager.getDescription());

        final ContentPanelEditor editor = getEditor(element.getServiceLocator().getService(IWorkbenchPart.class));
/*
import org.jkiss.dbeaver.utils.GeneralUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public static final String COMMAND_ID = "org.jkiss.dbeaver.core.resultset.grid.switchContentViewer";
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.core.commands.IParameterValues;
    public static class StreamManagerIdParameterValues implements IParameterValues {

 *
import org.eclipse.core.commands.AbstractHandler;
package org.jkiss.dbeaver.ui.controls.resultset.handler;

import org.jkiss.dbeaver.ui.data.registry.StreamValueManagerDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
            element.setIcon(DBeaverIcons.getImageDescriptor(manager.getIcon()));

        }

import org.jkiss.dbeaver.ui.controls.resultset.panel.valueviewer.ValueViewerPanel;
 * you may not use this file except in compliance with the License.
 */
    public void updateElement(UIElement element, Map parameters) {

import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;

    }
 *
                    StreamValueManagerDescriptor::getId


}
            editor.setCurrentStreamManager(manager);
import org.eclipse.core.commands.ExecutionException;
        return null;
    public static final String PARAM_STREAM_MANAGER_ID = "managerId";
import org.jkiss.dbeaver.ui.data.editors.ContentPanelEditor;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.ui.menus.UIElement;
public class ResultSetHandlerSwitchContentViewer extends AbstractHandler implements IElementUpdater {
        public Map<String, String> getParameterValues() {
        return null;

        }
    }
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
 * See the License for the specific language governing permissions and
    @Override
 * DBeaver - Universal Database Manager
                ));
        final StreamValueManagerDescriptor manager = ValueManagerRegistry.getInstance().getStreamManager(managerId);
        @Override
    }
            element.setChecked(editor != null && editor.getCurrentStreamManager() == manager);
 * Unless required by applicable law or agreed to in writing, software
        if (manager != null && editor != null) {
import org.jkiss.code.NotNull;
        if (rsv != null && rsv.isPanelVisible(ValueViewerPanel.PANEL_ID)) {
    @Nullable

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            element.setText(manager.getLabel());
            return ValueManagerRegistry.getInstance().getAllStreamManagers().stream()
        if (manager != null) {
        final String managerId = event.getParameter(PARAM_STREAM_MANAGER_ID);
import org.eclipse.ui.IWorkbenchPart;
 * limitations under the License.
        final String managerId = (String) parameters.get(PARAM_STREAM_MANAGER_ID);
import java.util.Map;
                .collect(Collectors.toMap(
        final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(workbenchPart);
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
        }
import org.eclipse.ui.handlers.HandlerUtil;
        final StreamValueManagerDescriptor manager = ValueManagerRegistry.getInstance().getStreamManager(managerId);
    }
import java.util.stream.Collectors;
import org.jkiss.code.Nullable;
            return GeneralUtils.adapt(rsv.getVisiblePanel(), ContentPanelEditor.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    StreamValueManagerDescriptor::getLabel,
    private static ContentPanelEditor getEditor(@NotNull IWorkbenchPart workbenchPart) {
        final ContentPanelEditor editor = getEditor(HandlerUtil.getActivePart(event));
