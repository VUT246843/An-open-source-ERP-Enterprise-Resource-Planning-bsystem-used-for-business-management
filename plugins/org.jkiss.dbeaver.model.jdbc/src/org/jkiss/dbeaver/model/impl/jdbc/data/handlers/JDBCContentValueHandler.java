            final DBPPreferenceStore preferenceStore = session.getDataSource().getContainer().getPreferenceStore();
                    return new JDBCContentChars(session.getExecutionContext(), (String) object);
                    value = resultSet.getSQLXML(index);
            statement.setNull(paramIndex, paramType.getTypeID(), paramType.getTypeName());
            // We need to convert only in case of some value transformations, not when getting it from DB
import org.jkiss.dbeaver.ModelPreferences;
                case java.sql.Types.LONGNVARCHAR:
            if (result == null) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        return MimeTypes.OCTET_STREAM;
        if (object == null) {
                String strValue = ContentUtils.getContentStringValue(monitor, object);
        JDBCResultSet resultSet,
            } else {
            if (preferenceStore.getBoolean(ModelPreferences.CONTENT_CACHE_BLOB) &&
    ) throws DBCException, SQLException {
                // Precache content
            content.bindParameter(session, statement, paramType, paramIndex);
                case java.sql.Types.BINARY:
    protected void bindParameter(
import org.jkiss.dbeaver.model.exec.DBCSession;
                clob.getContents(session.getProgressMonitor());
            StringWriter buffer = new StringWriter();
                case Types.SQLXML:
        int paramIndex,
            return clob;
                        if (typeName.contains(DBConstants.TYPE_NAME_XML) || typeName.contains(DBConstants.TYPE_NAME_XML2)) {
            switch (type.getTypeID()) {
                    }
            return new JDBCContentXML(session.getExecutionContext(), (SQLXML) object);
        return super.getValueDisplayString(column, value, format);
    @Override
            return new JDBCContentBytes(session.getExecutionContext(), buffer.toByteArray());
                    final String binaryString = binaryFormatter.toString(bytes, 0, bytes.length);
            try {
        }
            switch (type.getTypeID()) {
import org.jkiss.dbeaver.model.exec.DBCException;
            final DBPPreferenceStore preferenceStore = session.getDataSource().getContainer().getPreferenceStore();
 * JDBC Content value handler.
        DBDContentStorage cs = object.getContents(monitor);
                    }
    public void writeStreamValue(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull DBSTypedObject type, @NotNull DBDContent object, @NotNull Writer writer) throws DBCException, IOException {
        } else if (object instanceof Blob) {
            }
import org.jkiss.code.Nullable;
                writer.write("'");
                case java.sql.Types.VARCHAR:
import java.io.*;
 * See the License for the specific language governing permissions and
                case java.sql.Types.SQLXML:
            }
import java.sql.*;
    public DBDContent getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
        if (DBUtils.isNullValue(value)) {

 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (value instanceof String) {
                    break;
    {
                        } else {
            }
            //throw new DBCException(ModelMessages.model_jdbc_unsupported_value_type_ + object.getClass().getName());
                writer.write(strValue);
        } else if (object instanceof Reader) {
 * Unless required by applicable law or agreed to in writing, software
                case java.sql.Types.LONGVARCHAR:

                {
                    return new JDBCContentXML(session.getExecutionContext(), null);
                    final byte[] bytes = buffer.toByteArray();
            } catch (Exception e) {
            String result = ((DBDContent) value).getDisplayString(format);
        } else if (object instanceof byte[]) {
        if (attribute.getTypeID() == Types.SQLXML) {
                IOUtils.copyText(reader, buffer);
        @NotNull JDBCPreparedStatement statement,
                case java.sql.Types.BINARY:
                case java.sql.Types.BLOB:
    private static final Log log = Log.getLog(JDBCContentValueHandler.class);
    @Override
                            //log.debug(ModelMessages.model_jdbc_unsupported_column_type_ + type.getTypeName());

                return result;
            return new JDBCContentChars(session.getExecutionContext(), (String) value);
 *
            return blob;
        } else if (object instanceof InputStream) {
            if (copy && object instanceof DBDValueCloneable) {
            return new JDBCContentChars(session.getExecutionContext(), buffer.toString());
                    ByteArrayOutputStream buffer = new ByteArrayOutputStream((int) cs.getContentLength());
                case java.sql.Types.NCLOB:
import org.jkiss.dbeaver.utils.ContentUtils;
        }
                throw new DBCException("Error reading content stream", e);
                case java.sql.Types.BLOB:
            switch (type.getTypeID()) {
import org.jkiss.utils.CommonUtils;
                case java.sql.Types.VARBINARY:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

 * Licensed under the Apache License, Version 2.0 (the "License");
                default:
                    return new JDBCContentChars(session.getExecutionContext(), null);
                    // String by default
import org.jkiss.code.NotNull;
            final Reader reader = (Reader) object;
public class JDBCContentValueHandler extends JDBCAbstractValueHandler implements DBDContentValueHandler {
import org.jkiss.dbeaver.model.impl.jdbc.data.*;
                case java.sql.Types.NVARCHAR:
                    value = resultSet.getString(index);
    {
                        }
import org.jkiss.utils.IOUtils;
import org.jkiss.dbeaver.Log;
    }
                case java.sql.Types.CHAR:
            // Copy reader to string
    }
import org.jkiss.dbeaver.model.DBPDataSource;
/**
        }

 * You may obtain a copy of the License at
                case java.sql.Types.LONGVARBINARY:
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        } else {
            }
            // Some weird drivers returns InputStream instead of Xlob.
 */
            throw new DBCException(ModelMessages.model_jdbc_unsupported_value_type_ + value);
            writer.write("NULL");
    }
        return DBDContent.class;
        }
                case java.sql.Types.NCLOB:
                            return new JDBCContentXML(session.getExecutionContext(), null);
            }
 * limitations under the License.
 */

            final JDBCContentBLOB blob = new JDBCContentBLOB(session.getExecutionContext(), (Blob) object);
                default:
        @NotNull JDBCSession session,
    }
            if (preferenceStore.getBoolean(ModelPreferences.CONTENT_CACHE_CLOB) &&
 *
                case java.sql.Types.BINARY:
    {
                        context,
            return new JDBCContentChars(session.getExecutionContext(), CommonUtils.toString(object));
            } else {
 *
                clob.getLOBLength() < preferenceStore.getLong(ModelPreferences.CONTENT_CACHE_MAX_SIZE))
    @Override
            // This may happen in some bad drivers like ODBC bridge
}        } else {
                        IOUtils.copyStream(contentStream, buffer);
                    try (InputStream contentStream = cs.getContentStream()) {
    public String getValueContentType(@NotNull DBSTypedObject attribute) {
                    DBCExecutionContext context = session.getExecutionContext();
        }
            // Give up. Let's show string value
            if (ContentUtils.isTextContent(object)) {
        DBSTypedObject type,
 * you may not use this file except in compliance with the License.
            return new JDBCContentBytes(session.getExecutionContext(), object.toString());
            }
import org.jkiss.dbeaver.model.data.*;
        if (!object.isNull() && cs != null) {
 * @author Serge Rider
                    break;
    @NotNull
                        new JDBCSQLXMLImpl(new JDBCContentChars(context, (String) object))

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBUtils;
                // Precache content

            JDBCContentCLOB clob = new JDBCContentCLOB(session.getExecutionContext(), (Clob) object);
        int index)
            // So it is possible that real object type isn't string
                    break;
        } else {
            // Create wrapper using column type

                    );

    @NotNull
    public static final JDBCContentValueHandler INSTANCE = new JDBCContentValueHandler();
                case java.sql.Types.VARBINARY:
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
                }
    @Override
                case java.sql.Types.NVARCHAR:
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            // String is a default format in many cases (like clipboard transfer)
import org.jkiss.dbeaver.model.messages.ModelMessages;
                    return new JDBCContentXML(
            try {
/*

            IOUtils.close(stream);
                        } else if (typeName.contains(DBConstants.TYPE_NAME_JSON) || typeName.contains(DBConstants.TYPE_NAME_JSON2)) {
    @Override
                IOUtils.copyStream(stream, buffer);
                    return new JDBCContentBLOB(session.getExecutionContext(), null);
                default:
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        if (value == null && !resultSet.wasNull()) {
                return (DBDContent) ((DBDValueCloneable)object).cloneValue(session.getProgressMonitor());
                blob.getContents(session.getProgressMonitor());
        DBCSession session,
        Object value = resultSet.getObject(index);
                return super.getValueDisplayString(column, null, format);
    }
                strValue = dataSource.getSQLDialect().escapeString(strValue);
            IOUtils.close(reader);
 *
                        String typeName = type.getTypeName();

        return getValueFromObject(session, type, value, false, false);
                case java.sql.Types.CLOB:
            }
            {
 * DBeaver - Universal Database Manager
                            return new JDBCContentChars(session.getExecutionContext(), null);
            return MimeTypes.TEXT_XML;
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

import org.jkiss.dbeaver.utils.MimeTypes;
        }
                    value = resultSet.getObject(index);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
            } catch (Exception e) {
    }
                case java.sql.Types.CLOB:
            {
        }
            final InputStream stream = (InputStream) object;
        } else if (object instanceof Clob) {
                case java.sql.Types.VARCHAR:
        } else if (object instanceof SQLXML) {
                    DBDBinaryFormatter binaryFormatter = dataSource.getSQLDialect().getNativeBinaryFormatter();
                writer.write("'");
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (value instanceof DBDContent) {
            }
                case java.sql.Types.LONGNVARCHAR:
                case java.sql.Types.VARBINARY:
    public Class<DBDContent> getValueObjectType(@NotNull DBSTypedObject attribute)
    public static final int MAX_CACHED_CLOB_LENGTH = 10000;
        @NotNull DBSTypedObject paramType,
                    writer.write(binaryString);
    protected DBDContent fetchColumnValue(

    }
    {
        } else if (value instanceof JDBCContentAbstract content) {
            // Copy stream to byte array
                    {
                blob.getLOBLength() < preferenceStore.getLong(ModelPreferences.CONTENT_CACHE_MAX_SIZE))
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
                    break;
            return new JDBCContentBytes(session.getExecutionContext(), (byte[]) object);
                case java.sql.Types.SQLXML:
import org.jkiss.dbeaver.model.DBConstants;
    @Override
        } else if (object instanceof DBDContent) {
                throw new DBCException("Error reading content reader", e);
        throws DBCException, SQLException
                case java.sql.Types.LONGVARBINARY:
 * Handle LOBs, LONGs and BINARY types.
        } else if (object instanceof String) {
                    value = resultSet.getBytes(index);
                    return new JDBCContentBytes(session.getExecutionContext(), (String) object);
            // If we have a string - do not try to convert it to a binary representation (#494)
                    return new JDBCContentBytes(session.getExecutionContext());
                case java.sql.Types.CHAR:
                case java.sql.Types.LONGVARBINARY:
            return (DBDContent) object;
                case java.sql.Types.LONGVARCHAR:
                            return new JDBCContentBytes(session.getExecutionContext());
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else if (object instanceof Number) {
                    return new JDBCContentCLOB(session.getExecutionContext(), null);
            }
        @Nullable Object value

    @NotNull
