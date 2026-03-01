
 *
    @Override
import org.eclipse.jface.action.*;
                Label sepLabel = new Label(folder, SWT.SEPARATOR | SWT.HORIZONTAL);
            }
 * You may obtain a copy of the License at
                button.setText("N/A");
 *
            } else {
package org.jkiss.dbeaver.ui.controls;
            } else if (item instanceof GroupMarker) {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
                // ignore
                button.setCommand(UIUtils.getActiveWorkbenchWindow(), ((CommandContributionItem) item).getCommand().getId(), false);
    private final int itemStyle;

    public VerticalFolderManager(VerticalFolder folder, int itemStyle) {
                // ignore
import org.jkiss.dbeaver.ui.UIUtils;
        }
    public void update(boolean force) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    private final VerticalFolder folder;
}/*
 * Licensed under the Apache License, Version 2.0 (the "License");
                button.setAction(((ActionContributionItem) item).getAction(), false);
        this.itemStyle = itemStyle;
            } else if (item instanceof Separator) {
import org.eclipse.ui.menus.CommandContributionItem;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            VerticalButton button = new VerticalButton(folder, itemStyle);
        for (IContributionItem item : getItems ()) {
    }
public class VerticalFolderManager extends ContributionManager {
            if (item instanceof ActionContributionItem) {
            } else if (item instanceof CommandContributionItem) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        this.folder = folder;

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * limitations under the License.
import org.eclipse.swt.widgets.Label;
 */
