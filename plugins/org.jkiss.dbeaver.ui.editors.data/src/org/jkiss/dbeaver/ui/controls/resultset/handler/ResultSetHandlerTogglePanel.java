
    public static class PanelIdParameterValues implements IParameterValues {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.eclipse.ui.commands.IElementUpdater;
        if (panelId == null) {
    }
        if (panelId != null) {

 */
    private static void toggleResultsPanel(IResultSetController resultSet, String panelId) {
import org.eclipse.ui.menus.UIElement;

            rsv.activatePanel(panelId, true, true);
        boolean isVisible = rsv.isPanelsVisible() && rsv.isPanelVisible(panelId);
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelDescriptor;
import java.util.Map;
        public Map<String,String> getParameterValues() {
            }
                if (resultSet != null) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
            rsv.closePanel(panelId);

        }
            return null;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
    }
                }

        ResultSetViewer rsv = (ResultSetViewer) resultSet;
 */

import java.util.HashMap;
 * Copy special handler
import org.eclipse.core.commands.ExecutionEvent;
                values.put(pd.getLabel(), pd.getId());
        }

                element.setText(panel.getLabel());
import org.eclipse.core.commands.IParameterValues;
import org.jkiss.utils.CommonUtils;
            final Map<String,String> values = new HashMap<>();
            if (workbenchPart != null) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (isVisible) {
        // Put panel name in command label
            case CMD_TOGGLE_PANEL:
            IWorkbenchPart workbenchPart = element.getServiceLocator().getService(IWorkbenchPart.class);
import org.eclipse.core.commands.ExecutionException;
 *
        }
/*
        showResultsPanel(rsv, panelId, isVisible);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPresentationRegistry;
 * DBeaver - Universal Database Manager
 *
    {
public class ResultSetHandlerTogglePanel extends AbstractHandler implements IElementUpdater {
        }
                if (!CommonUtils.isEmpty(panel.getDescription())) {
            }
package org.jkiss.dbeaver.ui.controls.resultset.handler;
        switch (event.getCommand().getId()) {
                }

import org.eclipse.ui.handlers.HandlerUtil;
            return null;
                toggleResultsPanel(resultSet, panelId);
                Map.of("panel", panelId)
/**
 * limitations under the License.
        return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final String PARAM_PANEL_ID = "panelId";

    }
 *     http://www.apache.org/licenses/LICENSE-2.0

}
        } else {
        IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));

            ResultSetPanelDescriptor panel = ResultSetPresentationRegistry.getInstance().getPanel(panelId);
    @Override
        String panelId = (String) parameters.get(PARAM_PANEL_ID);
import org.jkiss.dbeaver.ui.DataEditorFeatures;
        @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    element.setChecked(((ResultSetViewer)resultSet).isPanelVisible(panelId));
import org.eclipse.ui.IWorkbenchPart;
            return values;
 * Unless required by applicable law or agreed to in writing, software
    }
            }
        }
import org.eclipse.core.commands.AbstractHandler;
    public void updateElement(UIElement element, Map parameters) {
            );
 *
            DataEditorFeatures.RESULT_SET_PANEL_OPEN.use(
        if (resultSet == null) {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    public static void showResultsPanel(ResultSetViewer rsv, String panelId, boolean isVisible) {
                break;
    public static final String CMD_TOGGLE_PANEL = "org.jkiss.dbeaver.core.resultset.grid.togglePanel";
    public Object execute(ExecutionEvent event) throws ExecutionException
            for (ResultSetPanelDescriptor pd : ResultSetPresentationRegistry.getInstance().getAllPanels()) {
                IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(workbenchPart);


            if (panel != null) {
                    element.setTooltip(panel.getDescription());
    }
        String panelId = event.getParameter(PARAM_PANEL_ID);
