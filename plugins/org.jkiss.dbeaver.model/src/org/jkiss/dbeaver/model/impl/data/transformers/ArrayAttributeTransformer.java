 * you may not use this file except in compliance with the License.

public class ArrayAttributeTransformer implements DBDAttributeTransformer {
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.ModelPreferences;
            DBSDataType componentType = collectionType.getComponentType(session.getProgressMonitor());
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,

import java.util.List;
package org.jkiss.dbeaver.model.impl.data.transformers;
            if (componentType instanceof DBSEntity) {
            collectionType = ((DBSTypedObjectEx) attribute.getAttribute()).getDataType();
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSDataType;
}
 */
        }
        MapAttributeTransformer.resolveMapsFromData(session, attribute, rows);
        if (attribute.getAttribute() instanceof DBSTypedObjectEx) {
/*
 * You may obtain a copy of the License at
        // Array items should be resolved in a lazy mode
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;

import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
 * DBeaver - Universal Database Manager
                ComplexTypeAttributeTransformer.createNestedTypeBindings(session, attribute, rows, componentType);
        if (!session.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES)) {
import org.jkiss.code.NotNull;

 * Unless required by applicable law or agreed to in writing, software
        // No component type found.
import java.util.Map;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
/**
 * Transforms attribute of array type into hierarchy of attributes

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 */
            collectionType = DBUtils.resolveDataType(session.getProgressMonitor(), session.getDataSource(), attribute.getTypeName());
 *
        if (collectionType != null) {
        }
        DBSDataType collectionType;
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
    }
 * See the License for the specific language governing permissions and
        } else {
                return;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
