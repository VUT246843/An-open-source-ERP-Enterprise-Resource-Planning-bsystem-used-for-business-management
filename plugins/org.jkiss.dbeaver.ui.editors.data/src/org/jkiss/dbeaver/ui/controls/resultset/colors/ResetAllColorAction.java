import org.jkiss.dbeaver.ui.UIUtils;
    public void execute(boolean refresh) {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.controls.resultset.colors;
 *     http://www.apache.org/licenses/LICENSE-2.0

            ResultSetMessages.controls_resultset_viewer_action_reset_all_colors,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            "Are you sure you want to reset all color settings for '" + vEntity.getName() + "'?")) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    }
    }
        super(resultSetViewer, ResultSetMessages.controls_resultset_viewer_action_reset_all_colors);
    public void run() {
/*
            return;
        updateColors(vEntity);
 *
 * limitations under the License.
        }

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        final DBVEntity vEntity = getColorsVirtualEntity();
 */
}
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        vEntity.removeAllColorOverride();
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
public class ResetAllColorAction extends ColorAction {

    public ResetAllColorAction(ResultSetViewer resultSetViewer) {
    }
        execute(true);
        if (!UIUtils.confirmAction(
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

import org.jkiss.dbeaver.model.virtual.DBVEntity;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
