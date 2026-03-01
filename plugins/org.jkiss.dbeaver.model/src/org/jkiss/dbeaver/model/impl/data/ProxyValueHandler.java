    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
 *
    }
}import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {


    }

    @NotNull
    }
        return target.getSupportedOperators(attribute);
    public ProxyValueHandler(DBDValueHandler target) {
    @Override
    protected final DBDValueHandler target;
public class ProxyValueHandler implements DBDValueHandler {
    @Override
/**

import org.jkiss.code.NotNull;
    public Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index) throws DBCException {
    }
    @Override
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
    @Override
        return target.fetchValueObject(session, resultSet, type, index);
        return target.getValueDisplayString(column, value, format);
        return target.getValueFromObject(session, type, object, copy, false);
 * See the License for the specific language governing permissions and
 * Proxy value handler
    }
 * Unless required by applicable law or agreed to in writing, software


        return target.getValueObjectType(attribute);
    @Override
import org.jkiss.dbeaver.model.exec.*;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @NotNull
    }
    @Override
 * you may not use this file except in compliance with the License.
 */
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others


    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
    @NotNull
    public Object createNewValueObject(@NotNull DBCSession session, @NotNull DBSTypedObject type) throws DBCException {
    }
 * You may obtain a copy of the License at
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        return target.createNewValueObject(session, type);
package org.jkiss.dbeaver.model.impl.data;
        this.target = target;

 * limitations under the License.
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {
        target.bindValueObject(session, statement, type, index, value);
    @Nullable
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    @Override
    @Nullable



        target.releaseValueObject(value);
        return target.getValueContentType(attribute);
    public String getValueContentType(@NotNull DBSTypedObject attribute) {

    @Override
    }
    public void releaseValueObject(@Nullable Object value) {
    @Override
