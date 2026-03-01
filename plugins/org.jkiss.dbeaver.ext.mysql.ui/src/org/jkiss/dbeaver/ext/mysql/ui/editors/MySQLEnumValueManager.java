        if (valueType instanceof MySQLTableColumn) {
    protected boolean isMultiValue(IValueController valueController) {
    @Override
        return setValues;
 *
 * Unless required by applicable law or agreed to in writing, software
/*
 */
 * MySQL ENUM value manager
}            StringTokenizer st = new StringTokenizer(setString, ",");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        String setString = DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.UI);
        return valueController.getValueType().getTypeName().equalsIgnoreCase(MySQLConstants.TYPE_NAME_SET);

import org.jkiss.dbeaver.ui.data.managers.EnumValueManager;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import java.util.ArrayList;
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSTypedObject valueType = valueController.getValueType();
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

    public MySQLEnumValueManager() {
            while (st.hasMoreTokens()) {
    @Override
import org.jkiss.dbeaver.ui.data.IValueController;
 *
public class MySQLEnumValueManager extends EnumValueManager {
 * DBeaver - Universal Database Manager
    }
package org.jkiss.dbeaver.ext.mysql.ui.editors;
    protected List<String> getSetValues(IValueController valueController, Object value) {
        List<String> setValues = new ArrayList<String>();
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.DBValueFormatting;
/**
            }
 * you may not use this file except in compliance with the License.
            return ((MySQLTableColumn) valueType).getEnumValues();
        }
            return null;
        if (!CommonUtils.isEmpty(setString)) {
                setValues.add(st.nextToken());

import java.util.StringTokenizer;
    }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    protected List<String> getEnumValues(IValueController valueController) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableColumn;
 *
        }

import org.jkiss.utils.CommonUtils;
        } else {
 * You may obtain a copy of the License at

