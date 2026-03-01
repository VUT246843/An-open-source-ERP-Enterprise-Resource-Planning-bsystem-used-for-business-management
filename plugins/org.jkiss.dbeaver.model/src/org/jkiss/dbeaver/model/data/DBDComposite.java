

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * limitations under the License.
    DBSEntityAttribute[] EMPTY_ATTRIBUTE = new DBSEntityAttribute[0];
 * Unless required by applicable law or agreed to in writing, software
        return getAttributes().length;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    default int getAttributeCount() {

    Object[] EMPTY_VALUES = new Object[0];

}
public interface DBDComposite extends DBDComplexValue {
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
    DBSDataType getDataType();
/*

import org.jkiss.dbeaver.model.exec.DBCException;
 * Structured data record.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    Object getAttributeValue(@NotNull DBSAttributeBase attribute)
import org.jkiss.dbeaver.model.struct.DBSDataType;
 * Consists of primitive values or other records


 */

/**
import org.jkiss.code.NotNull;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull

 *
 * You may obtain a copy of the License at
        throws DBCException;
package org.jkiss.dbeaver.model.data;
    }
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    DBSAttributeBase[] getAttributes();
    void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) throws DBCException;
