                break;
                case Types.INTEGER:
import org.jkiss.dbeaver.model.DBValueFormatting;
    @Override
                    }
import org.jkiss.code.NotNull;
                        // Last chance - get it as string. Sometimes columns marked as numbers are actually not numbers
                // String wasn't empty, but it can't be p[arsed as number
                    }
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

            case Types.SMALLINT:
                    if (number instanceof BigDecimal) {
        if (object == null) {
                    if (CommonUtils.toInt(paramType.getScale()) > 0) {
                return Integer.class;
                    break;
                        }
        switch (type.getTypeID()) {
            case Types.TINYINT:
                        // Always read as double to avoid precision loose (#7214)
    @NotNull
            case Types.REAL:
                    break;
                    if (resultSet.wasNull()) {
                        value = resultSet.getByte(index);
                        statement.setInt(paramIndex, number.intValue());
                        statement.setInt(paramIndex, number.intValue());
    private static final Log log = Log.getLog(JDBCNumberValueHandler.class);
                        statement.setBigDecimal(paramIndex, (BigDecimal) number);
            }
                    }
    private DBDDataFormatter formatter;
                        statement.setBigDecimal(paramIndex, (BigDecimal) number);
            case Types.DOUBLE:
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
            try {
                if (CommonUtils.toInt(type.getScale()) > 0) {
                    } else {
            return null;
                break;
     * NumberFormat is not thread safe thus this method is synchronized.
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 */
                try {
    public Object generateDefaultValue(DBCSession session, DBSTypedObject type) {
                        statement.setByte(paramIndex, number.byteValue());
                try {
        }
                    } else {
            Number number = (Number) value;
                return BigDecimal.class;
                case Types.NUMERIC:
                case Types.FLOAT:
                if (CommonUtils.toInt(type.getScale()) > 0) {
                }
            return null;
            case Types.FLOAT:
            if (useScientificNotation < 0) {
                case Types.DECIMAL:
            }
                    log.debug(e);
public class JDBCNumberValueHandler extends JDBCAbstractValueHandler implements DBDValueHandlerConfigurable, DBDValueDefaultGenerator {
            case Types.INTEGER:
                    value = resultSet.getObject(index);
                    break;
        }
                    return Double.class;
    @Override
                    }
                boolean gotValue = false;
                return;
                    break;
                    if (CommonUtils.toInt(paramType.getPrecision()) <= 1) {
                        statement.setInt(paramIndex, number.intValue());
                    return Byte.class;
    protected Object fetchColumnValue(
     */
                    } else if (number instanceof Integer) {
                    }
                    formatSettings.isUseScientificNumericFormat() ? 1 : 0;
                }
                    } catch (SQLException | NumberFormatException e) {
                return new BigDecimal(0);
            if (strValue.isEmpty()) {
                    if (number instanceof Long) {
    @Override
            //Workaround for MySQL Unsigned SMALLINT #10239
        return false;
                    // Read value with maximum precision. Some drivers reports INTEGER but means long [JDBC:SQLite]
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                // Empty string means NULL value
        }
                case Types.DOUBLE:
import org.jkiss.dbeaver.Log;
                log.error("Can't create formatter for number value handler", e); //$NON-NLS-1$
        Object value;
                        statement.setDouble(paramIndex, number.doubleValue());
                    } else {
    @Override
                        statement.setBigDecimal(paramIndex, new BigDecimal((BigInteger) number));
import org.jkiss.code.Nullable;
                        statement.setDouble(paramIndex, number.doubleValue());
        throws DBCException, SQLException
        JDBCResultSet resultSet,
                    break;
                return 0;
                }
        } else if (object instanceof String) {
                        statement.setLong(paramIndex, number.longValue());
 * Unless required by applicable law or agreed to in writing, software
                    } catch (SQLException | ClassCastException | NumberFormatException e) {
                // Here may be any numeric value. float, double, BigDecimal or BigInteger for example
                    return Float.class;
                    value = resultSet.getInt(index);
                }
        if (value instanceof String) {

            log.warn("Unrecognized type '" + object.getClass().getName() + "' - can't convert to numeric");
                } catch (SQLException | ClassCastException | NumberFormatException e) {
                        value = resultSet.getDouble(index);
        switch (type.getTypeID()) {
        if (resultSet.wasNull()) {
    @Override
                    } else {
                    return (long)0;
            case Types.SMALLINT:
                        if (CommonUtils.toInt(type.getScale()) > 0) {
import org.jkiss.dbeaver.model.exec.DBCException;
                }
                        statement.setLong(paramIndex, number.longValue());
            case Types.REAL:
                    }
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
                        statement.setLong(paramIndex, number.longValue());
                if (CommonUtils.toInt(type.getPrecision()) <= 1) {
        int index)
                    break;
    @Nullable
            case Types.FLOAT:
            case Types.SMALLINT:
                } else {
                }
        DBSTypedObject type,
    protected boolean isReadDecimalsAsDouble() {

                        statement.setLong(paramIndex, number.longValue());
                        statement.setFloat(paramIndex, number.floatValue());
        }
                formatter = DefaultDataFormatter.INSTANCE;
                        value = resultSet.getObject(index);
                try {
 */
            switch (paramType.getTypeID()) {

                    return 0D;
                    return (byte)0;
                    } else if (number instanceof Float) {
        } else {
                            try {
                statement.setString(paramIndex, strValue);
                }
    }
            }
            case Types.DECIMAL:
 * JDBC number value handler
                    value = resultSet.getLong(index);
                    } else {
        this.useScientificNotation = -1;
            case Types.BIT:
    }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
                    return Double.class;
import java.sql.SQLException;
                        statement.setBigDecimal(paramIndex, new BigDecimal((BigInteger) number));
                    return 0D;
                    }
                if (CommonUtils.toInt(type.getScale()) > 0) {
                    if (number instanceof BigDecimal) {
import java.sql.Types;
                        statement.setDouble(paramIndex, number.doubleValue());

            return null;
        if (value == null) {
        }
                    } else {
                    value = resultSet.getObject(index);
                    }
import org.jkiss.utils.CommonUtils;
            case Types.REAL:
                    return 0L;
        } else if (object instanceof Date) {
                        statement.setLong(paramIndex, number.longValue());
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                value = number;
                default:
                if (CommonUtils.toInt(type.getPrecision()) <= 1) {
    {
            case Types.NUMERIC:
            return DBValueFormatting.convertStringToNumber(strValue, getNumberType(type), getFormatter(type), validateValue);
                break;
                    } else {
            case Types.TINYINT:
                                value = resultSet.getDouble(index);
                return new BigDecimal(0);
/*
import java.util.Date;
                    } else {
                }
                this.useScientificNotation =
                        statement.setLong(paramIndex, number.longValue());
                        statement.setDouble(paramIndex, number.doubleValue());
                        return bitString;
    @Override
            //Workaround for MySQL Unsigned INTEGER #8786
            }
            Object number = DBValueFormatting.convertStringToNumber(strValue, getNumberType(paramType), getFormatter(paramType), true);
    }

                    // Workaround for Oracle #3062
            case Types.DECIMAL:
                    } else if (number instanceof Long) {
                            value = resultSet.getDouble(index);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    break;
                }

                        } else {
            default:
        }
                // Let's save as string then

        DBCSession session,

        }
import java.math.BigInteger;
                formatter = formatSettings.getDataFormatterProfile().createFormatter(DBDDataFormatter.TYPE_NAME_NUMBER, column);
            } else if (!strValue.isEmpty()) {
        if (value instanceof Number && (format == DBDDisplayFormat.NATIVE || format == DBDDisplayFormat.EDIT)) {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                case Types.BIT:
                } catch (SQLException | ClassCastException | NumberFormatException e) {
            return value;
            String strValue = (String) value;
            return DBValueFormatting.convertNumberToNativeString((Number) value, useScientificNotation > 0);
import java.math.BigDecimal;
                return BigDecimal.class;
                statement.setNull(paramIndex, paramType.getTypeID());
                        statement.setFloat(paramIndex, number.floatValue());
            case Types.INTEGER:
                    // Read short in case of unsigned byte
                        return resultSet.getString(index);
                        return null;
                return Short.class;
            case Types.TINYINT:

            // Some number. Actually we shouldn't be here
                        }
        return getFormatter(column).formatValue(value);
                    }
            // Binary string
 * limitations under the License.
        if (value == null) {
                    try {
                case Types.SMALLINT:
            return DBValueFormatting.convertDateToNumber(((Date) object), getNumberType(type), getFormatter(type), validateValue);
            } catch (Exception e) {
    @Override
    {

                    // Workaround for Oracle #3062
                    value = resultSet.getShort(index);
    public void refreshValueHandlerConfiguration(DBSTypedObject type) {
                    return Long.class;
                                 int paramIndex, Object value) throws SQLException, DBCException {
                if (value == null && !gotValue) {
        } else if (value instanceof Number) {
                        statement.setFloat(paramIndex, number.floatValue());
                    } else if (number instanceof BigInteger) {
                if (CommonUtils.toInt(type.getScale()) > 0) {
                if (CommonUtils.toInt(type.getPrecision()) <= 1) {
        }
    }
                    value = resultSet.getObject(index);
            default:
                    try {
                            throw e;
                    try {
                    } catch (NumberFormatException e) {

    /**
                    } else if (number instanceof BigDecimal) {
                if (CommonUtils.toInt(type.getScale()) > 0) {
    }
                        // Maybe it is boolean? (#1604)
                    } else if (number instanceof Double) {
                    // Workaround for Oracle #3062
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    // bit string (hopefully long is enough)
    {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.exec.DBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        value = objectValue;
                        statement.setShort(paramIndex, number.shortValue());
    }
 * You may obtain a copy of the License at
            return DBValueFormatting.getDefaultValueDisplayString(null, format);
                return new BigDecimal(0);
            case Types.BIT:
import org.jkiss.dbeaver.model.impl.data.formatters.DefaultDataFormatter;
    }
                    return 0F;
                value = null;

 *
    public JDBCNumberValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings) {

            default:

import org.jkiss.dbeaver.model.data.DBDValueDefaultGenerator;
                        gotValue = true;
    }
        }
                return BigDecimal.class;
                        try {
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
        this.formatSettings = formatSettings;
            case Types.INTEGER:
    private final DBDFormatSettings formatSettings;
                    }
                    String bitString = CommonUtils.toBinaryString(resultSet.getLong(index), CommonUtils.toInt(type.getPrecision()));
                    // bit string (hopefully long is enough)
    @NotNull
                case Types.BIGINT:
        switch (type.getTypeID()) {
                return Long.class;
    public Class<? extends Number> getNumberType(DBSTypedObject type) {
                    // Read int in case of unsigned shorts
            } else {
            case Types.NUMERIC:
                return null;
                    // bit string
            case Types.DOUBLE:
                            }
 *
            return object;
                    } else if (number instanceof Float) {
                    }
                        statement.setBigDecimal(paramIndex, (BigDecimal) number);
            case Types.BIGINT:
        }
    @Nullable
        } else if (object instanceof Boolean) {
                            boolean bValue = resultSet.getBoolean(index);
    }
                            value = bValue ? (byte)1 : (byte)0;
                            // No, it is not - rethrow original error
            throw new SQLException("Numeric value type '" + value.getClass().getName() + "' is not supported");
                }
 * See the License for the specific language governing permissions and
        return "Zero";
                    if (number instanceof BigInteger) {
                        // single bit
                return 0L;
        if (formatter == null) {
                case Types.TINYINT:
            case Types.DOUBLE:
import org.jkiss.dbeaver.model.data.DBDValueHandlerConfigurable;
                }
            if (number != null) {
            String strValue = (String) object;
                        statement.setByte(paramIndex, number.byteValue());
        } else {
                break;
                } catch (SQLException | ClassCastException | NumberFormatException e) {
            return (Boolean) object ? 1 : 0;
                break;
                } else {
}
                } else {
                    // Workaround for Oracle #3062
        }
        return getNumberType(attribute);
/**
            return (String)value;
                try {
                    if (number instanceof Integer) {
    public String getDefaultValueLabel() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private DBDDataFormatter getFormatter(@NotNull DBSTypedObject column) {
                return;
            case Types.FLOAT:
        } else {
        return formatter;

 *
                }
                }
                    return Long.class;
        if (value instanceof String) {
                }
    }
                } else {
                                // Something went wrong. E.g. #5147
                    } else if (number instanceof Short) {
                if (isReadDecimalsAsDouble()) {
    }

                return Long.class;
                case Types.REAL:
            case Types.BIGINT:
    private int useScientificNotation = -1;
                } else {
                } catch (SQLException e) {
                                value = resultSet.getLong(index);
                        statement.setShort(paramIndex, number.shortValue());
            }
    public Class<? extends Number> getValueObjectType(@NotNull DBSTypedObject attribute)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                        } catch (Throwable e1) {
            statement.setNull(paramIndex, paramType.getTypeID());
                if (CommonUtils.toInt(type.getScale()) > 0) {
                return (short)0;
                    if (number instanceof Long) {
                    break;
                    break;
                    } else {
            case Types.BIT:
        this.formatter = null;
                    }

    }
                    } else if (number instanceof Byte) {
                    Object objectValue = resultSet.getObject(index);
                    if (objectValue == null || objectValue instanceof Number) {
    @Override
        } else if (object instanceof Number) {
                            } catch (NumberFormatException e) {
