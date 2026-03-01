 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        onMouseDoubleClick(e);
    public void onMouseDoubleClick(@NotNull MouseEvent e) {
    private boolean singleClick = false;
        // do nothing
    public final void mouseDown(MouseEvent e) {
package org.jkiss.dbeaver.ui.controls;
    public final void mouseDoubleClick(MouseEvent e) {
 *
}

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        singleClick = false;
    }
        if (e.button != 1) {
    public void onMouseSingleClick(@NotNull MouseEvent e) {
import org.eclipse.swt.events.MouseEvent;
 * limitations under the License.
    @Override
        singleClick = true;
        // do nothing

    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
            return;
            if (singleClick) {
public class DoubleClickMouseAdapter extends MouseAdapter {

 *
 * See the License for the specific language governing permissions and

        if (e.button != 1) {
            return;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        UIUtils.timerExec(UIUtils.getDisplay().getDoubleClickTime(), () -> {
 * you may not use this file except in compliance with the License.
        });
    }
                onMouseSingleClick(e);
    }
/*
        }
 *
import org.jkiss.code.NotNull;
import org.eclipse.swt.events.MouseAdapter;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
 */
 * DBeaver - Universal Database Manager
