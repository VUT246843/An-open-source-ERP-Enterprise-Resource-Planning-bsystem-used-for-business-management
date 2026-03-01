    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
    @NotNull
            return new String((byte[]) value);
 *
            if (format == DBDDisplayFormat.NATIVE || format == DBDDisplayFormat.EDIT) {

                    try {
                        numberFormatter = formatSettings.getDataFormatterProfile().createFormatter(DBDDataFormatter.TYPE_NAME_NUMBER, column);
    @Override
            }
    private DBDDataFormatter timestampFormatter;
                return DBValueFormatting.convertNumberToNativeString(
                    timestampFormatter = formatSettings.getDataFormatterProfile().createFormatter(DBDDataFormatter.TYPE_NAME_TIMESTAMP, type);
 * limitations under the License.
                    break;
 * DBeaver - Universal Database Manager
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format)

        if (object instanceof String && (type.getTypeID() == Types.REAL || type.getTypeID() == Types.DOUBLE)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
                }
        }
                    return Double.NaN;
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
import org.jkiss.dbeaver.model.data.DBDValueHandlerConfigurable;

    @Override
        this.numberFormatter = null;
                    log.error("Can't create timestampFormatter for timestamp value handler", e); //$NON-NLS-1$
                    (Number) value,
                case "-infinity":
            } else {

                case "+inf":
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
                case "infinity":
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SQLiteValueHandler extends JDBCAbstractValueHandler implements DBDValueHandlerConfigurable {
import org.jkiss.dbeaver.model.DBPDataKind;
        Object object = resultSet.getObject(index);
 */
    private static final Log log = Log.getLog(SQLiteValueHandler.class);
    private final DBDFormatSettings formatSettings;
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                    return Double.NEGATIVE_INFINITY;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        } else if (value instanceof Date) {
                case "nan":
    {
    }
    private DBDDataFormatter numberFormatter;
                if (numberFormatter == null) {
import org.jkiss.dbeaver.model.exec.DBCException;
        this.formatSettings = formatSettings;
            return timestampFormatter.formatValue(value);
 * You may obtain a copy of the License at
import java.sql.SQLException;
    public SQLiteValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings)
 * Copyright (C) 2010-2024 DBeaver Corp and others

                        numberFormatter = DefaultDataFormatter.INSTANCE;
/*
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        if (value instanceof Number) {

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Unless required by applicable law or agreed to in writing, software
}
import org.jkiss.code.NotNull;
    {
                case "+infinity":
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
                return numberFormatter.formatValue(value);
                    } catch (Exception e) {
        } else if (value instanceof byte[] && column.getDataKind() == DBPDataKind.STRING) {

                default:
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.sqlite.model.data;
    }
        this.type = type;
        statement.setObject(paramIndex, value);
    private final DBSTypedObject type;

import java.util.Locale;
/**
                    formatSettings.isUseScientificNumericFormat());
import org.jkiss.dbeaver.Log;


            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
import org.jkiss.dbeaver.model.impl.data.formatters.DefaultDataFormatter;
        return Object.class;
            if (format == DBDDisplayFormat.NATIVE && !string.startsWith("'") && !string.endsWith("'")) {
            }
 */
        return object;
import java.sql.Types;
 * you may not use this file except in compliance with the License.
    @NotNull
        return getValueFromObject(session, type, object, false, false);
                try {
import org.jkiss.dbeaver.model.DBValueFormatting;
            switch (((String) object).toLowerCase(Locale.ROOT)) {
                    return Double.POSITIVE_INFINITY;
                    }

    @Override
                } catch (Exception e) {
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {
                return "'" + value + "'";
        } else if (value instanceof String string && column.getDataKind() == DBPDataKind.DATETIME) {
    public void refreshValueHandlerConfiguration(DBSTypedObject type) {
                }
    @Nullable
        this.timestampFormatter = null;
    }
            if (timestampFormatter == null) {

    }
                    timestampFormatter = DefaultDataFormatter.INSTANCE;
import org.jkiss.code.Nullable;
        return super.getValueDisplayString(column, value, format);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
                case "inf":

    @Override
 * SQLiteValueHandler
    @Nullable
    }

                case "-inf":
                        log.error("Can't create numberFormatter for number value handler", e); //$NON-NLS-1$
import java.util.Date;
 *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
