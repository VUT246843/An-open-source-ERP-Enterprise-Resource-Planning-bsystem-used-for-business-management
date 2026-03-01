
        }
 *
public class ComplexTypeAttributeTransformer implements DBDAttributeTransformer {
            attribute.setNestedBindings(nestedBindings);
        @NotNull DBCSession session,
 * You may obtain a copy of the License at
    ) throws DBException {
 * See the License for the specific language governing permissions and
        }
        for (DBSEntityAttribute nestedAttr : CommonUtils.safeCollection(nestedAttrs)) {

 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
                nestedAttrs = entity.getAttributes(session.getProgressMonitor());
        }
        if (nestedAttrs == null) {

import org.jkiss.dbeaver.model.struct.*;
            nestedBindings.add(nestedBinding);
            createNestedTypeBindings(session, attribute, rows, dataType);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 *
    ) throws DBException {
    }
/**
        @NotNull DBDAttributeBinding attribute,
        @NotNull List<Object[]> rows,
    static void createNestedTypeBindings(
    public void transformAttribute(
}
            nestedAttrs = bdt.bindAttributesToContext(session.getProgressMonitor(), attribute);
        @NotNull DBCSession session,
        @NotNull Map<String, Object> options
 * Transforms attribute of complex type into hierarchy of attributes
            nestedBinding.lateBinding(session, rows);
    @Override
import java.util.ArrayList;

 * you may not use this file except in compliance with the License.
        }
        }


        if (dataType instanceof DBSEntity) {
        @NotNull List<Object[]> rows,
import org.jkiss.dbeaver.model.data.*;
/*
 */

import org.jkiss.dbeaver.ModelPreferences;
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.model.impl.data.transformers;
        List<DBDAttributeBinding> nestedBindings = new ArrayList<>();
        @NotNull DBSDataType dataType
 */
            DBDAttributeBindingType nestedBinding = new DBDAttributeBindingType(attribute, nestedAttr, nestedBindings.size());
        if (dataType instanceof DBSBindableDataType bdt) {
        List<? extends DBSEntityAttribute> nestedAttrs = null;
            dataType = DBUtils.resolveDataType(session.getProgressMonitor(), session.getDataSource(), attribute.getTypeName());
        DBSDataType dataType = DBUtils.getDataType(attribute);
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
        if (!nestedBindings.isEmpty()) {
            if (dataType instanceof DBSEntity entity) {
            return;
        if (dataType == null) {
        }
        if (!session.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES)) {
    }
        @NotNull DBDAttributeBinding attribute,
import org.jkiss.dbeaver.model.DBUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
import org.jkiss.code.NotNull;
