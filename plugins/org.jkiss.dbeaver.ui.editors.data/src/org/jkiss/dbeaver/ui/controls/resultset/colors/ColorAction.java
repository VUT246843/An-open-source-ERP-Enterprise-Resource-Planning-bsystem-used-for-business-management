 *
        }
    @NotNull


    private ResultSetViewer resultSetViewer;
    protected ColorAction(ResultSetViewer resultSetViewer, String name) {
    {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.eclipse.jface.action.Action;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            resultSetViewer.redrawData(false, false);

        resultSetViewer.getModel().updateColorMapping(entity, true);
        if (refresh) {
    }
        return DBVUtils.getVirtualEntity(dataContainer, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(name);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.virtual.DBVUtils;

import org.jkiss.code.NotNull;
        this.resultSetViewer = resultSetViewer;
/*
import org.jkiss.dbeaver.model.virtual.DBVEntity;
    void updateColors(DBVEntity entity) {
            throw new IllegalStateException("No data container");
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * DBeaver - Universal Database Manager
        if (dataContainer == null) {
}
 * You may obtain a copy of the License at
        }
    void updateColors(DBVEntity entity, boolean refresh) {
    }
        entity.persistConfiguration();
package org.jkiss.dbeaver.ui.controls.resultset.colors;
    DBVEntity getColorsVirtualEntity()
        updateColors(entity, true);
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        DBSDataContainer dataContainer = resultSetViewer.getDataContainer();

 *
        throws IllegalStateException
 *
abstract class ColorAction extends Action {
 * you may not use this file except in compliance with the License.
