        } else if (value instanceof DBDComposite struct) {
 */
                case ')':
        }

            return true;

    }
                    value = PostgreUtils.extractPGObjectValue(object, dataSource);
 * Licensed under the Apache License, Version 2.0 (the "License");
        PostgreDataType structType = PostgreUtils.findDataType(session, dataSource, type);
        }
        } catch (DBException e) {
    }
            final StringJoiner output = new StringJoiner(",", "(", ")");
    ) throws DBCException {
            log.debug("Can't resolve struct type '" + type.getTypeName() + "'");
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCompositeStatic;
     * @see <a href="https://www.postgresql.org/docs/current/rowtypes.html#ROWTYPES-IO-SYNTAX">8.16.6. Composite Type Input and Output Syntax</a>
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
     */
        if (value.startsWith("(") && value.endsWith(")")) {
        @Nullable Object value,
    @Override
    }
        if (!DBUtils.isNullValue(value) && value instanceof JDBCComposite composite) {
import java.sql.Struct;
        Iterator<PostgreDataTypeAttribute> attrIter = attributes.iterator();
public class PostgreStructValueHandler extends JDBCStructValueHandler {



import org.jkiss.dbeaver.model.data.DBDValueHandler;
                }
        }
                final String member = getStructMemberDisplayString(attribute, handler, item, format);
                output.add(member);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

        if (value.isEmpty()) {
        JDBCSession session,
 *
                if (isPgObject) {
        throws DBCException, SQLException
        if (value == null) {
        @NotNull DBCSession session,
            } else if (struct instanceof JDBCComposite) {
 *
            for (DBSAttributeBase attribute : composite.getAttributes()) {
import org.jkiss.utils.CommonUtils;
                statement.setObject(paramIndex, string, Types.OTHER);
        Object[] attrValues = new Object[attributes.size()];
        JDBCPreparedStatement statement,
            // Domains are just wrappers around underlying type.

            attrValues[i] = PostgreValueParser.convertStringToValue(session, itemAttr, parsedValues[i]);

import org.jkiss.dbeaver.model.DBUtils;
    }
            if (object == null) {
        } else {
        @NotNull DBSTypedObject type,

        }
    public Object getValueFromObject(
 */
        Object value)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTypeType;
    private static String getStructMemberDisplayString(
            }
                Object value;
            value = value.substring(1, value.length() - 1);
 * limitations under the License.
import java.util.StringJoiner;
import org.jkiss.dbeaver.Log;
        Struct contents = new JDBCStructImpl(compType.getTypeName(), attrValues, value);
import java.sql.SQLException;
        boolean copy,
        for (int index = 0; index < value.length(); index++) {
        int paramIndex,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataTypeAttribute;
            throw new DBCException("Struct parameter type '" + value.getClass().getName() + "' not supported");
        @NotNull DBDValueHandler handler,
        for (int i = 0; i < parsedValues.length && attrIter.hasNext(); i++) {
    protected void bindParameter(
}

                return convertStringToStruct(session, structType, CommonUtils.toString(value));
            if (struct.isNull()) {
            } else {
                case ',':

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCComposite;

 * DBeaver - Universal Database Manager
                } else {

                final Object item = composite.getAttributeValue(attribute);
                final String string = PostgreValueParser.generateObjectString(values);
/**
import java.util.Iterator;
            throw new DBException("Composite type '" + compType.getTypeName() + "' has no attributes");
            switch (value.charAt(index)) {
import org.jkiss.dbeaver.DBException;
            statement.setNull(paramIndex, Types.STRUCT);
            return output.toString();
            return "";
        return string;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    }
                statement.setNull(paramIndex, Types.STRUCT);
        if (structType == null) {
    private static final Log log = Log.getLog(PostgreStructValueHandler.class);
        @NotNull DBSTypedObject type,
        }
                boolean isPgObject = PostgreUtils.isPgObject(dataSource, object);
    private JDBCCompositeStatic convertStringToStruct(@NotNull DBCSession session, @NotNull PostgreDataType compType, @NotNull String value) throws DBException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
            }
        DBSTypedObject paramType,
import org.jkiss.dbeaver.model.exec.DBCException;
                    return true;
        final String string = handler.getValueDisplayString(type, value, DBDDisplayFormat.NATIVE);
    private static boolean isQuotingRequired(@NotNull String value) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @Override
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        if (DBUtils.isNullValue(value)) {
            final PostgreDataTypeAttribute itemAttr = attrIter.next();
            log.debug("Number of attributes (" + attributes.size() + ") doesn't match actual number of parsed strings (" + parsedValues.length + ")");
 * PostgreStructValueHandler
            } else if (object instanceof JDBCCompositeStatic jdbcCompositeStatic) {
            return '"' + string.replace("\"", "\"\"") + '"';
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
            }
import org.jkiss.dbeaver.model.exec.DBCSession;
 * You may obtain a copy of the License at
        }

                    value = object.toString();
    @NotNull
    {
    @NotNull
        if (attributes == null) {

                case '(':
        }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                final Object[] values = ((JDBCComposite) struct).getValues();


import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                return copy ? jdbcCompositeStatic.cloneValue(session.getProgressMonitor()) : object;
    public static final PostgreStructValueHandler INSTANCE = new PostgreStructValueHandler();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (parsedValues.length != attributes.size()) {
                    break;
        if (format == DBDDisplayFormat.NATIVE && isQuotingRequired(string)) {
        final Collection<PostgreDataTypeAttribute> attributes = compType.getAttributes(session.getProgressMonitor());
        boolean validateValue
        DBDDisplayFormat format) {

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;
 * See the License for the specific language governing permissions and
                final DBDValueHandler handler = DBUtils.findValueHandler(composite.getDataType().getDataSource(), attribute);
                case '"':
                case '\\':
/*
                default:
        return false;
import org.jkiss.dbeaver.model.data.DBDComposite;
import org.jkiss.code.NotNull;
        try {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructImpl;
 * you may not use this file except in compliance with the License.
        String[] parsedValues = PostgreValueParser.parseSingleObject(value);
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
        }

            return object;
        }
        return super.getValueDisplayString(column, value, format);
        }
                return new JDBCCompositeStatic(session, structType, null);
        PostgreDataSource dataSource = (PostgreDataSource) session.getDataSource();
            structType = structType.getBaseType(session.getProgressMonitor());
package org.jkiss.dbeaver.ext.postgresql.model.data;
    @Override
        }
        return new JDBCCompositeStatic(session, compType, contents);
        Object object,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
import org.jkiss.code.Nullable;
            throw new DBCException("Error converting string to composite type", e, session.getExecutionContext());

import org.jkiss.dbeaver.ext.postgresql.PostgreValueParser;
            }
    }
        }
    /**
        if (structType.getTypeType() == PostgreTypeType.d) {
import java.sql.Types;
