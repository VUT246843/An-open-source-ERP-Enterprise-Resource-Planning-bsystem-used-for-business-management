
            if (element == null) {
        }
            if (element instanceof DBNDatabaseNode) {
            }
        @Override
            return null;
 */
        @Override

 * You may obtain a copy of the License at
                return DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT);
import org.jkiss.dbeaver.model.navigator.DBNModel;


                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class DatabaseLabelProviders {
        public Color getBackground(Object element) {
        }
            return ((DBNDatabaseNode) element).getNodeDisplayName();
 * DBeaver - Universal Database Manager
        public Color getForeground(Object element) {
            final DBNDatabaseNode node = nm.findNode((DBPDataSourceContainer) element);
                return DBeaverIcons.getImage(DBIcon.DATABASE_DEFAULT);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        public Color getBackground(Object element) {
import org.eclipse.jface.viewers.LabelProvider;

import org.eclipse.jface.viewers.IColorProvider;
            }
            return element == null ? null : UIUtils.getConnectionColor(((DBPDataSourceContainer) element).getConnectionConfiguration());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * limitations under the License.
        public Image getImage(Object element) {
        public Color getForeground(Object element) {

import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static final String EMPTY_SELECTION_TEXT = UINavigatorMessages.toolbar_datasource_selector_empty;
    public static class DatabaseLabelProvider extends LabelProvider implements IColorProvider {
        public String getText(Object element) {
        @Override

                final DBPDataSourceContainer container = ((DBNDatabaseNode) element).getDataSourceContainer();
 */
            if (element == null) {
        }
        public String getText(Object element) {
                if (container != null) {
            if (element == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
        }
        }
        }
            return DBeaverIcons.getImage(((DBNDatabaseNode)element).getNodeIconDefault());
        @Override
 * you may not use this file except in compliance with the License.


                return EMPTY_SELECTION_TEXT;
            }
            }
 *
/**
        @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.graphics.Image;
    public static class ConnectionLabelProvider extends LabelProvider implements IColorProvider {
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
            return ((DBPDataSourceContainer) element).getName();
 * Label providers
    }
 * See the License for the specific language governing permissions and
            return null;
package org.jkiss.dbeaver.ui.controls;
            return node == null ? null : DBeaverIcons.getImage(node.getNodeIcon());
        public Image getImage(Object element) {
import org.jkiss.dbeaver.model.DBIcon;
            if (element == null) {
    }
                    return UIUtils.getConnectionColor((container.getConnectionConfiguration()));
            nm.ensureProjectLoaded(((DBPDataSourceContainer) element).getRegistry().getProject());
        @Override
            return null;

                return EMPTY_SELECTION_TEXT;

        @Override
}import org.eclipse.swt.graphics.Color;
 *


import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.ui.UIUtils;
        }
            DBNModel nm = DBWorkbench.getPlatform().getNavigatorModel();
        }
 *
