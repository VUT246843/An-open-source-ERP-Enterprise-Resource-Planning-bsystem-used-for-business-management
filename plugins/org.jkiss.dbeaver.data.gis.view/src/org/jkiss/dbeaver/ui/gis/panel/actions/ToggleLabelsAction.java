 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBIcon;
package org.jkiss.dbeaver.ui.gis.panel.actions;
import org.eclipse.jface.action.Action;
        viewer.updateToolbar();
    }
        setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.SMALL_INFO));
    }

    @Override
import org.jkiss.dbeaver.ui.MenuCreator;
            return manager;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
/*
 *
            manager.addMenuListener(m -> manager.add(new ConfigureLabelsAction(viewer)));

    public ToggleLabelsAction(@NotNull GISLeafletViewer viewer) {
 *
import org.jkiss.dbeaver.ui.gis.panel.GISLeafletViewer;

    private String getActionText() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return new MenuCreator(control -> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        super(null, AS_DROP_DOWN_MENU);
}
 */
        this.viewer = viewer;
public class ToggleLabelsAction extends Action {
    @NotNull
 * See the License for the specific language governing permissions and
        setText(getActionText());
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.action.MenuManager;
    public void run() {
 *
    private final GISLeafletViewer viewer;
        });

        return viewer.isShowLabels() ? GISMessages.panel_hide_labels_action_label : GISMessages.panel_show_labels_action_label;
import org.eclipse.jface.action.IMenuCreator;
 * you may not use this file except in compliance with the License.
            final MenuManager manager = new MenuManager();
import org.jkiss.code.NotNull;
        viewer.setShowLabels(!viewer.isShowLabels());
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
    }

    }
            manager.setRemoveAllWhenShown(true);

    public IMenuCreator getMenuCreator() {
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * DBeaver - Universal Database Manager
        setText(getActionText());

 * distributed under the License is distributed on an "AS IS" BASIS,
