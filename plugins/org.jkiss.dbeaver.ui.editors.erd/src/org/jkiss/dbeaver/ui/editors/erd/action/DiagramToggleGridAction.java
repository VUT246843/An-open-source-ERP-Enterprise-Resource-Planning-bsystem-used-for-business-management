 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.erd.action;
    public DiagramToggleGridAction() {
 * you may not use this file except in compliance with the License.
        final DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
public class DiagramToggleGridAction extends Action {
}
        PrefUtils.savePreferenceStore(store);
 */
        store.setValue(ERDUIConstants.PREF_GRID_ENABLED, isChecked());
        setImageDescriptor(DBeaverIcons.getImageDescriptor(ERDIcon.LAYER_GRID));
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
 * Created on Jul 23, 2004
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setChecked(ERDUIActivator.getDefault().getPreferences().getBoolean(ERDUIConstants.PREF_GRID_ENABLED));

    }
    public void run() {

import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
 *
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * DBeaver - Universal Database Manager
    }

import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
    @Override
 * @author Serge Rider
 * limitations under the License.
 * See the License for the specific language governing permissions and
 */
/**
import org.jkiss.dbeaver.utils.PrefUtils;
 */
import org.eclipse.jface.action.Action;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

/*
 *
        super(ERDUIMessages.erd_editor_control_action_toggle_grid, AS_CHECK_BOX);
 * Action to toggle the layout between manual and automatic
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
