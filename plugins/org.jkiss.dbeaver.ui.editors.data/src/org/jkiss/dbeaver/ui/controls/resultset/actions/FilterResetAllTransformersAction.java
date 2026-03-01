package org.jkiss.dbeaver.ui.controls.resultset.actions;
    }
            return;
 */
    public FilterResetAllTransformersAction(ResultSetViewer resultSetViewer) {
        execute(true);
 * You may obtain a copy of the License at
        }
            for (DBVEntityAttribute vAttr : vAttrs) {
    }
        final DBVEntity virtualEntity = DBVUtils.getVirtualEntity(getResultSetViewer().getDataContainer(), false);
    void execute(boolean refresh) {
import java.util.List;
    }
            getResultSetViewer().refreshData(null);
import org.jkiss.dbeaver.model.virtual.DBVEntity;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    @Override
 * See the License for the specific language governing permissions and

/*
            }
        }
 * limitations under the License.
        List<DBVEntityAttribute> vAttrs = virtualEntity.getEntityAttributes();
 *

 *
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.virtual.DBVUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void run() {

        if (refresh) {
                vAttr.setTransformSettings(null);
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
        if (virtualEntity.getTransformSettings() != null && virtualEntity.getTransformSettings().hasValuableData()) {
 * you may not use this file except in compliance with the License.
        super(resultSetViewer, ResultSetMessages.controls_resultset_viewer_action_reset_all_transformers);
        if (vAttrs != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            virtualEntity.setTransformSettings(null);
        if (virtualEntity == null) {
}
 * Unless required by applicable law or agreed to in writing, software
public class FilterResetAllTransformersAction extends AbstractResultSetViewerAction {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        }

