import java.util.List;
        final Object[][] values = new Object[1][1];
 * you may not use this file except in compliance with the License.
        }


            return null;
 *

        }
        return strValues;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.lang.reflect.InvocationTargetException;
    }
/*
        if (attribute instanceof DBSDataType) {
            log.debug("Can't read enum values from " + dataType.getFullTypeName());
import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
        final DBSTypedObject attribute = valueController.getValueType();
 * PostgreSQL ENUM value manager
        if (dataType == null) {
import org.jkiss.dbeaver.ui.data.IValueController;
    @Override

 */
        } else if (attribute instanceof DBSTypedObjectEx) {
        return false;

import org.jkiss.dbeaver.Log;

 * distributed under the License is distributed on an "AS IS" BASIS,
    protected boolean isMultiValue(IValueController valueController) {
import org.jkiss.dbeaver.ui.data.managers.EnumValueManager;
 *
        if (values[0] == null) {
        List<String> strValues = new ArrayList<>(values[0].length);
            return null;
 *
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
        }

    protected List<String> getSetValues(IValueController valueController, Object value) {
 * See the License for the specific language governing permissions and
        PostgreDataType finalDataType = dataType;
    protected List<String> getEnumValues(IValueController valueController) {
        } catch (InvocationTargetException | InterruptedException e) {
 */
        for (Object value : values[0]) {
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            dataType = (PostgreDataType) ((DBSTypedObjectEx) attribute).getDataType();
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.struct.DBSDataType;
/**
public class PostgreEnumValueManager extends EnumValueManager {
import java.util.ArrayList;
            dataType = (PostgreDataType) attribute;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
import org.jkiss.dbeaver.model.DBValueFormatting;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
            strValues.add(DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.UI));
    private static final Log log = Log.getLog(PostgreEnumValueManager.class);
    @Override
        }

 * DBeaver - Universal Database Manager
        PostgreDataType dataType = null;
package org.jkiss.dbeaver.ext.postgresql.ui.config;
    @Override
 * limitations under the License.
} * Unless required by applicable law or agreed to in writing, software
            UIUtils.runInProgressService(monitor -> values[0] = finalDataType.getEnumValues(monitor));
        }
