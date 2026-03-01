 */
            // Do not pass event to avoid focus change (#7908)
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
public class DefaultViewerToolTipSupport extends ColumnViewerToolTipSupport {
            super.afterHideToolTip(event);
 */
        super(viewer, ToolTip.NO_RECREATE, false);
            super.afterHideToolTip(null);

    protected void afterHideToolTip(Event event) {
 *
 * Unless required by applicable law or agreed to in writing, software
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
 * you may not use this file except in compliance with the License.
/*
import org.eclipse.jface.viewers.ColumnViewer;
 *
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Event;
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DefaultViewerToolTipSupport(ColumnViewer viewer) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
package org.jkiss.dbeaver.ui;
/**

import org.eclipse.jface.window.ToolTip;
        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }
        if (AbstractPopupPanel.isPopupOpen()) {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
 * Tooltips
    }
