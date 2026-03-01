    // [JDBC: GBase 8s - VARCHAR2]

    public static final int NVARCHAR2 = 64;
    public GBase8sDataType(GenericStructContainer owner, int valueType, String name, String remarks, boolean unsigned,


 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Log log = Log.getLog(GBase8sDataType.class);
 * limitations under the License.
    // [JDBC: GBase 8s - NVARCHAR2]
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

    }
 */
/*
            boolean searchable, int precision, int minScale, int maxScale) {
import org.jkiss.dbeaver.Log;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author Chao Tian


            setTypeID(Types.VARCHAR);
        }

 *
 * you may not use this file except in compliance with the License.
import java.sql.Types;
 *
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
            log.warn("Inconsistent string data type name/id: " + name + "(" + valueType + "). Setting to "
    public static final int VARCHAR2 = 63;
}
/**
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(owner, valueType, name, remarks, unsigned, searchable, precision, minScale, maxScale);
package org.jkiss.dbeaver.ext.gbase8s.model;
public class GBase8sDataType extends GenericDataType {
                    + Types.VARCHAR);
        if (valueType == VARCHAR2 || valueType == NVARCHAR2) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        // Check for VARCHAR2/NVARCHAR2 type for strings
 *
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 */

