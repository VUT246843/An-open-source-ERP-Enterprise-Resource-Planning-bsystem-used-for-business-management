                        shell.dispose ();

            public void handleEvent (Event event) {
                        label = null;
                        }
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                    case SWT.Dispose:
                    case SWT.MouseExit:
        table.addListener (SWT.KeyDown, tableListener);
                            }
        table.addListener (SWT.MouseHover, tableListener);
                                    break;

                                FillLayout layout = new FillLayout ();
                Shell shell = label.getShell ();
            }
                            if (!CommonUtils.isEmpty(toolTip)) {
 * See the License for the specific language governing permissions and
                                layout.marginWidth = 2;
                            for (int i = 0; i < columnCount; i++) {
                                tip.setVisible (true);
                        tip.dispose ();
        table.setToolTipText (""); //$NON-NLS-1$
                        Point eventPt = new Point(event.x, event.y);

import org.jkiss.utils.CommonUtils;

import org.eclipse.swt.SWT;
 */
    public TableToolTip(Table table) {
                switch (event.type) {
        // Disable native tooltip
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                label.setText (toolTip);
                            String toolTip = getItemToolTip(item, selectedColumn);
 * DBeaver - Universal Database Manager
        table.addListener (SWT.Dispose, tableListener);
            Shell tip = null;

        Listener tableListener = new Listener () {
                        break;
                            }
                        int selectedColumn = -1;
                                tip.setBounds (pt.x, pt.y + item.getBounds().height, size.x, size.y);
                            if (toolTip != null) {
 * Unless required by applicable law or agreed to in writing, software
                    case SWT.KeyDown:
                                tip = new Shell (table.getShell(), SWT.ON_TOP | SWT.NO_FOCUS | SWT.TOOL);
 *
    }
 * limitations under the License.
    }
                                label = new Label (tip, SWT.NONE);

                        tip = null;
}
    {

 */
                switch (event.type) {
                                if (item.getBounds(i).contains(eventPt)) {
    }
                            int columnCount = table.getColumnCount();
    private final Table table;
    public String getItemToolTip(TableItem item, int selectedColumn) {
                        if (item != null) {
                                tip.setForeground (table.getDisplay().getSystemColor (SWT.COLOR_INFO_FOREGROUND));
import org.eclipse.swt.graphics.Point;
 *

        table.addListener (SWT.MouseMove, tableListener);
        // Implement a "fake" tooltip
 * Fake table tooltip provider
                Label label = (Label)event.widget;
                    }
        final Listener labelListener = new Listener () {
                                toolTip = toolTip.trim();

                                label.setBackground (table.getDisplay().getSystemColor (SWT.COLOR_INFO_BACKGROUND));
            public void handleEvent (Event event) {
        };
                                Point size = tip.computeSize (SWT.DEFAULT, SWT.DEFAULT);
                }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        applyCustomTolTips();
        this.table = table;

                        if (tip == null) break;
        };
            @Override
import org.eclipse.swt.layout.FillLayout;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    case SWT.MouseHover: {
                }
                                label.addListener (SWT.MouseExit, labelListener);
        return item.getText(selectedColumn);
            Label label = null;
                                    selectedColumn = i;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        TableItem item = table.getItem (eventPt);
                                }
                                tip.setBackground (table.getDisplay().getSystemColor (SWT.COLOR_INFO_BACKGROUND));
                        if (item != null && selectedColumn >= 0) {
package org.jkiss.dbeaver.ui;
                    }
 *
                            }
    public void applyCustomTolTips()
                                label.setForeground (table.getDisplay().getSystemColor (SWT.COLOR_INFO_FOREGROUND));
public class TableToolTip {
                    case SWT.MouseMove: {
            @Override
/**
import org.eclipse.swt.widgets.*;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
                                if (tip != null && !tip.isDisposed ()) tip.dispose ();
                        }
                                tip.setLayout (layout);
                                Point pt = table.toDisplay (event.x, event.y);
                        break;
