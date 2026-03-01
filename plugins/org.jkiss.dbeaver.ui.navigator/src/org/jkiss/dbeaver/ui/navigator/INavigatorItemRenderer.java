 * distributed under the License is distributed on an "AS IS" BASIS,
 *
package org.jkiss.dbeaver.ui.navigator;
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.code.NotNull;


 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
 */
/*
public interface INavigatorItemRenderer {
 */
 * You may obtain a copy of the License at
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    Cursor getCursor(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event);

 *     http://www.apache.org/licenses/LICENSE-2.0
    void performAction(DBNNode node, Tree tree, Event event, boolean defaultAction);
}
import org.eclipse.swt.graphics.GC;
 *
import org.eclipse.swt.widgets.Event;
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager

/**
    String getToolTipText(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event);
    @Nullable
import org.eclipse.swt.widgets.Tree;

 * See the License for the specific language governing permissions and
    void paintNodeDetails(DBNNode node, Tree tree, GC gc, Event event);
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
 * Tree item renderer


import org.eclipse.swt.graphics.Cursor;
