        return container;
        } else {

        this.container = container;
        }
    }
        if (dataContainer == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
        final DBSDataContainer dataContainer = container.getDataContainer();
            return adapter.cast(container);


    @Override
/*
        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * you may not use this file except in compliance with the License.
    }
        if (dataContainer == null) {
    public IResultSetContainer getContainer() {
 *
        }
import org.eclipse.ui.IEditorInput;
import org.jkiss.utils.CommonUtils;

 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
 * You may obtain a copy of the License at

    public <T> T getAdapter(Class<T> adapter) {
 * See the License for the specific language governing permissions and
    public String getToolTipText() {
    }
        } else {
            return null;
    @Override
            return "Data";
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.jkiss.dbeaver.ui.UIIcon;
}
    public boolean exists() {
import org.eclipse.jface.resource.ImageDescriptor;
    @NotNull
        final DBSDataContainer dataContainer = container.getDataContainer();
    public IPersistableElement getPersistable() {
        }
 * DBeaver - Universal Database Manager
    private final IResultSetContainer container;
import org.jkiss.dbeaver.ui.DBeaverIcons;

    @Override
    public String getName() {
 *
public class SQLResultsEditorInput implements IEditorInput {


 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    }
            return dataContainer.getDescription();
        return false;
    public SQLResultsEditorInput(@NotNull IResultSetContainer container) {
            return "Data";
    }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContainer;
import org.eclipse.ui.IPersistableElement;
    @Override

import org.jkiss.code.NotNull;


        return DBeaverIcons.getImageDescriptor(UIIcon.RS_GRID);
            return CommonUtils.getSingleLineString(dataContainer.getName());
    @Override

        if (adapter.isInstance(container)) {
    public ImageDescriptor getImageDescriptor() {
 *
package org.jkiss.dbeaver.ui.editors.sql;
    }
