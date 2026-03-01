 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
                    break;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (attr instanceof DBSEntityAttribute) {
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                    sql.append("0");
        } else {
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.model.sql.generator;
    }
                case DATETIME:

        List<DBSAttributeBase> valueAttributes = new ArrayList<>(getAllAttributes(monitor, object));
                    break;
import java.util.Collection;


import org.jkiss.utils.CommonUtils;
                    sql.append("false");

 * Unless required by applicable law or agreed to in writing, software
        if (CommonUtils.isEmpty(keyAttributes)) {

import java.util.List;
 *
 * you may not use this file except in compliance with the License.
 */
    protected void appendDefaultValue(StringBuilder sql, DBSAttributeBase attr) {
            switch (attr.getDataKind()) {
        if (!CommonUtils.isEmpty(defValue)) {
        }
 * You may obtain a copy of the License at
    protected Collection<? extends DBSAttributeBase> getValueAttributes(DBRProgressMonitor monitor, OBJECT object, Collection<? extends DBSAttributeBase> keyAttributes) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import java.util.ArrayList;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    sql.append("?");
            }
                case CONTENT:
public abstract class SQLGeneratorBase<OBJECT> extends SQLGenerator<OBJECT> {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
}
            defValue = ((DBSEntityAttribute) attr).getDefaultValue();
                case NUMERIC:

 * Copyright (C) 2010-2024 DBeaver Corp and others
                case STRING:

/*
                case BOOLEAN:
        String defValue = null;
    protected abstract Collection<? extends DBSAttributeBase> getKeyAttributes(DBRProgressMonitor monitor, OBJECT object) throws DBException;
                    break;
        return valueAttributes;
import org.jkiss.dbeaver.DBException;
                    sql.append("''");
                default:
 *
 * See the License for the specific language governing permissions and
                    break;
        valueAttributes.removeIf(keyAttributes::contains);

        }
    protected abstract Collection<? extends DBSAttributeBase> getAllAttributes(DBRProgressMonitor monitor, OBJECT object) throws DBException;
            sql.append(defValue);
            return getAllAttributes(monitor, object);
