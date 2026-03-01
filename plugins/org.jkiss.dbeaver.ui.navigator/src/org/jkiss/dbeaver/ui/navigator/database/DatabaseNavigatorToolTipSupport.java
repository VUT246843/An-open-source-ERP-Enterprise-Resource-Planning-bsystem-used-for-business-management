 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

        super(databaseNavigatorTree.getViewer());

            }
            public void mouseExit(MouseEvent e) {

 * See the License for the specific language governing permissions and
    protected boolean shouldCreateToolTip(Event event) {
import org.eclipse.swt.events.MouseTrackAdapter;
    }
/*
        this.databaseNavigatorTree = databaseNavigatorTree;
    private DatabaseNavigatorTree databaseNavigatorTree;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        // Reset tooltip cache otherwise old tooltip blinks before new one
import org.jkiss.dbeaver.ui.DefaultViewerToolTipSupport;
    }
class DatabaseNavigatorToolTipSupport extends DefaultViewerToolTipSupport {
 *     http://www.apache.org/licenses/LICENSE-2.0
    DatabaseNavigatorToolTipSupport(DatabaseNavigatorTree databaseNavigatorTree) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.eclipse.swt.events.MouseEvent;
package org.jkiss.dbeaver.ui.navigator.database;
import org.eclipse.swt.widgets.Event;
}
        });
 *
 * limitations under the License.
 * You may obtain a copy of the License at
        return super.shouldCreateToolTip(event);
        databaseNavigatorTree.getViewer().getControl().addMouseTrackListener(new MouseTrackAdapter() {
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
                databaseNavigatorTree.getViewer().getControl().setToolTipText(null);
            @Override
 *
