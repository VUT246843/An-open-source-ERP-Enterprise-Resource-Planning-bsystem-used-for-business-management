 * See the License for the specific language governing permissions and
    {
import org.jkiss.dbeaver.model.exec.DBCException;
 *
    @Override
    public void bindValueObject(
import org.jkiss.dbeaver.model.DBPNamedObject;
 * Unless required by applicable law or agreed to in writing, software

    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

        int index) throws DBCException
public class DefaultValueHandler extends BaseValueHandler {
    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
    public Object fetchValueObject(
        throw new DBCException("Parameter [" + objectName + "] value [" + DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.UI) + "] binding not supported");
        return object;
import org.jkiss.dbeaver.model.exec.DBCSession;
        @NotNull DBCSession session,
 * Licensed under the Apache License, Version 2.0 (the "License");
 */


 *
import org.jkiss.dbeaver.model.DBValueFormatting;
        int index,
import org.jkiss.dbeaver.model.exec.DBCResultSet;
import org.jkiss.code.NotNull;
        @NotNull DBCSession session,
/*
        @NotNull DBSTypedObject type,
import org.jkiss.dbeaver.model.DBUtils;
    }
        @NotNull DBCStatement statement,
    public Class<Object> getValueObjectType(@NotNull DBSTypedObject attribute)

    @Override
 */
/**
package org.jkiss.dbeaver.model.impl.data;
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * You may obtain a copy of the License at
        return Object.class;
        return resultSet.getAttributeValue(index);
    @NotNull
    {
 * Default value handler
    {
        Object value) throws DBCException
        String objectName = type instanceof DBPNamedObject namedObject ? DBUtils.getObjectFullName(namedObject, DBPEvaluationContext.UI) : type.getTypeName();
 * limitations under the License.
    }

    }
}
import org.jkiss.dbeaver.model.exec.DBCStatement;
    public static final DefaultValueHandler INSTANCE = new DefaultValueHandler();
        @NotNull DBSTypedObject type,
 * you may not use this file except in compliance with the License.
        @NotNull DBCResultSet resultSet,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    {
 * DBeaver - Universal Database Manager
 *
    @Override
