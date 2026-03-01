 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
public class ConnectionTypeLabelProvider extends LabelProvider implements IColorProvider {
 * you may not use this file except in compliance with the License.
 *

    @Override
    public Color getForeground(Object element) {
    public Color getBackground(Object element) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return ((DBPConnectionType) element).getName();
    }
    @Override
}
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

package org.jkiss.dbeaver.ui.dialogs.connection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.viewers.IColorProvider;
 * See the License for the specific language governing permissions and
 * limitations under the License.

import org.jkiss.dbeaver.ui.UIUtils;
    public String getText(Object element) {
import org.jkiss.dbeaver.model.connection.DBPConnectionType;

    }
        return UIUtils.getConnectionTypeColor((DBPConnectionType) element);
 */
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
    @Override
