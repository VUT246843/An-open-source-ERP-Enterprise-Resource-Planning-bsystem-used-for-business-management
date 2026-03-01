
    }
 *
 *
/*
                if (((TreeItem)event.item).getItemCount() > 0) {
    }
        if (element instanceof DBNDatabaseNode) {
 *
    public String getToolTipText(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
public class DefaultNavigatorNodeRenderer implements INavigatorItemRenderer {
 * You may obtain a copy of the License at
 */
    @Override

        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                //int boxSize = event.height - 4;
import org.jkiss.code.NotNull;
                gc.setForeground(conColor);
                //gc.drawLine(10, event.y + event.height - 1, event.x + event.width, event.y + event.height - 1);

                gc.setLineWidth(3);
        Color conColor = null;
            }

            DBPDataSourceContainer ds = ((DBNDatabaseNode) element).getDataSourceContainer();
        if (conColor != null) {

                //gc.setLineWidth(2);
                //            gc.fillRectangle(0, event.y + 2, textSize.x, textSize.y);

                //gc.setLineStyle(SWT.LINE_SOLID);
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
import org.eclipse.swt.graphics.Cursor;
        // do nothing by default
 * Copyright (C) 2010-2024 DBeaver Corp and others
                gc.setLineWidth(oldLineWidth);
    @Override
import org.jkiss.code.Nullable;
import org.eclipse.swt.graphics.Color;
            gc.setForeground(conColor);
        return null;
        Object element = event.item.getData();
 * limitations under the License.
 * you may not use this file except in compliance with the License.


    @Nullable
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Default node renderer.
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.graphics.GC;

 *     http://www.apache.org/licenses/LICENSE-2.0
    public Cursor getCursor(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
            } else {
            if (element instanceof DBNDataSource) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.navigator.DBNNode;
/**
package org.jkiss.dbeaver.ui.navigator.database;
                    gc.drawLine(event.x - 4, event.y - 1, event.x - 4, event.y + event.height + 1);
 * See the License for the specific language governing permissions and
                //gc.drawLine(event.x, event.y, event.x + event.width, event.y);
                }
    public void performAction(DBNNode node, Tree tree, Event event, boolean defaultAction) {
        }
import org.jkiss.dbeaver.ui.navigator.INavigatorItemRenderer;
    @Nullable
                //gc.drawRectangle(event.x - 2, event.y + 1, event.width + 3, event.height - 2/*, event.height / 2, event.height / 2*/);
    }
                    gc.drawLine(event.x - 20, event.y - 1, event.x - 20, event.y + event.height + 1);
                } else {
 * DBeaver - Universal Database Manager
    public void paintNodeDetails(DBNNode node, Tree tree, GC gc, Event event) {
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                //            gc.drawRectangle(0, event.y + 2, textSize.x - 1, textSize.y - 1);
                //gc.drawLine(event.x, event.y + event.height - 1, event.x + event.width, event.y + event.height - 1);
import org.eclipse.swt.widgets.Tree;
            conColor = UIUtils.getConnectionColor(ds.getConnectionConfiguration());

 * Draws connection type marker next to the item name.
                int oldLineWidth = gc.getLineWidth();
}
import org.eclipse.swt.widgets.TreeItem;
 */
import org.eclipse.swt.widgets.Event;
