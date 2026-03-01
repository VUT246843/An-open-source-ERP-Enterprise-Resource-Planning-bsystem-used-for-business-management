        }
        if (settings == null) {
 *

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
        super(resultSetViewer, text, style);
    @NotNull
/*
    }
    private final DBDAttributeBinding attribute;
        setChecked(checked);
 *
            throw new IllegalStateException("Can't get/create transformer settings for '" + attribute.getFullyQualifiedName(DBPEvaluationContext.UI) + "'");

package org.jkiss.dbeaver.ui.controls.resultset.actions;
        return settings;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        attribute.getDataSource().getContainer().persistConfiguration();
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * limitations under the License.
    public void saveTransformerSettings() {

        final DBVTransformSettings settings = DBVUtils.getTransformSettings(attribute, true);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    public TransformerAction(ResultSetViewer resultSetViewer, DBDAttributeBinding attr, String text, int style, boolean checked) {
        this.attribute = attr;
}
public class TransformerAction extends AbstractResultSetViewerAction {
        getResultSetViewer().refreshData(null);

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
    public DBVTransformSettings getTransformSettings() {
import org.jkiss.dbeaver.model.virtual.DBVUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.virtual.DBVTransformSettings;
 * DBeaver - Universal Database Manager
