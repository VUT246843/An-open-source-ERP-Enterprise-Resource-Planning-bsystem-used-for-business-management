 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
    @Override
import org.jkiss.dbeaver.model.erd.DiagramCollectSettings;
        return ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
 * Table collector settings
        return ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS);
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;

    public boolean isShowViews() {
    }
 */
 *
 * DBeaver - Universal Database Manager
/**
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

public class DiagramCollectSettingsDefault implements DiagramCollectSettings {
 * You may obtain a copy of the License at

}
    }
/*
 */

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.erd.model;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
    public boolean isShowPartitions() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
