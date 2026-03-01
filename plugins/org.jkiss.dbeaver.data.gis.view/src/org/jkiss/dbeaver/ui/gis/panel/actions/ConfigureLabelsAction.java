    @Override
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;
            } else {
        // Seems suitable for now.
            }

import org.jkiss.code.NotNull;
                presentation.getController().updatePanelsContent(false);
        if (source != null && new EditDictionaryPage(source).edit()) {
        this.viewer = viewer;

    public void run() {
    private final GISLeafletViewer viewer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;

        // We're using the "edit dictionary" dialog here, hence
package org.jkiss.dbeaver.ui.gis.panel.actions;
}
 * You may obtain a copy of the License at
        final IResultSetPresentation presentation = viewer.getPresentation();
import org.jkiss.dbeaver.ui.gis.presentation.GeometryPresentation;
import org.eclipse.jface.action.Action;
 * distributed under the License is distributed on an "AS IS" BASIS,
            // access to the result set. Viewers themselves don't have access,
    }
 * Unless required by applicable law or agreed to in writing, software
        super(GISMessages.panel_configure_labels_action_label, AS_PUSH_BUTTON);
import org.jkiss.dbeaver.ui.gis.panel.GISLeafletViewer;
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
            if (presentation instanceof GeometryPresentation) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public ConfigureLabelsAction(@NotNull GISLeafletViewer viewer) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            // so we instead cause a complete refresh of the presentation
 *
        final DBSEntity source = presentation != null ? presentation.getController().getModel().getSingleSource() : null;
        // potentially changing previously selected dictionary columns.

                presentation.refreshData(false, false, true);

/*
public class ConfigureLabelsAction extends Action {

 * limitations under the License.
 *
 */

        }
 * DBeaver - Universal Database Manager
            // HACK: In order to construct new labels for geometries, we need
 * Licensed under the Apache License, Version 2.0 (the "License");
