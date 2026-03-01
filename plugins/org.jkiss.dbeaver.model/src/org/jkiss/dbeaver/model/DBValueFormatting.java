        if (className.startsWith("java.lang") || className.startsWith("java.util")) {
        return getDefaultTypeImage(typedObject);
    }
            } else if (hintType == BigInteger.class) {
    }
    {
        }
        return fileEncoding;
 *
                }
            } catch (ParseException e1) {
                String string = CommonUtils.toHexString(bytes, 0, length);
    private static final Log log = Log.getLog(DBValueFormatting.class);
            } else {
        }
                        image = DBIcon.TREE_TABLE;
                    image = DBIcon.TREE_DATABASE;
        if (format == DBDDisplayFormat.NATIVE) {
                    str.append(getDefaultValueDisplayString(attributeValue, format));
import java.math.BigDecimal;
    public static DBPImage getObjectImage(DBPObject object)
                return formatter;

    {
                    if (DBUtils.isView((DBSEntity) object)) {
                return formatter.parseValue(text, hintType);
                    return Long.valueOf(text);
                }
        } catch (Throwable e) {
            return "[" + value.getClass().getSimpleName() + "]";
                    if (!first) str.append(", ");

                log.debug("Can't parse numeric value [" + date + "] using formatter: " + e.getMessage());
import org.jkiss.code.Nullable;
            if (length > maxLength) {
                return new BigInteger(text);
                    yield DBIcon.TYPE_JSON;
                }
    public static DBPImage getTypeImage(@NotNull DBSTypedObject typedObject)
 * distributed under the License is distributed on an "AS IS" BASIS,
                return scientificNotation ?
        }
    @Nullable
        DBPPreferenceStore preferenceStore = dataSource.getContainer().getPreferenceStore();
        } else if (value instanceof DBPNamedObject) {
        } else if (value.getClass().isArray()) {
            case DOCUMENT -> DBIcon.TYPE_DOCUMENT;
        // Convert bytes to string
                }
            } else if (hintType == Float.class) {
                return bytes.length > 2000 ? string + "..." : string;
/*
            case ROWID -> DBIcon.TYPE_ROWID;
        return typeName != null &&
        } else if (value instanceof CharSequence) {
            int maxLength = dataSource.getContainer().getPreferenceStore().getInt(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN);
        int length = data.length;
    }

                } catch (NumberFormatException e) {
        }
            boolean first = true;
                DBPImage image = ((DBPImageProvider) dataType).getObjectImage();
        }
    {
            } else {
import java.text.ParseException;
            case DATETIME -> DBIcon.TYPE_DATETIME;
                    ((BigDecimal) value).toPlainString();
            }
            } else {
        return DBConstants.BINARY_FORMATS[0];
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static boolean typeNameContains(String typeName, String patternLC, String patternUC) {
                // We don't want exponential view
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
import java.util.Locale;
    @Nullable
                }

            formatter = getBinaryPresentation(dataSource);
        } catch (Exception e) {
                        image = DBIcon.TREE_VIEW;
                    image = DBIcon.TREE_PACKAGE;
        return image;

        String fileEncoding = preferenceStore.getString(ModelPreferences.CONTENT_HEX_ENCODING);
            }
    public static DBDBinaryFormatter getBinaryPresentation(String id)
            }
            if (value instanceof BigDecimal) {
                    value.toString() :
import org.jkiss.dbeaver.utils.GeneralUtils;
            return null;
                yield DBIcon.TYPE_OBJECT;
                return Short.valueOf(text);
            if (formatter != null) {
        } else {
                return (int) (date.getTime()/1000);
                return new BigDecimal(text);
                return text;
            } else if (hintType == Double.class) {

        String string = formatter.toString(data, 0, length);
            return string;
    }
                return DBConstants.NULL_VALUE_LABEL;
            if (hintType == Long.class) {
package org.jkiss.dbeaver.model;
 * you may not use this file except in compliance with the License.
import java.math.BigInteger;
            }
            if (hintType == Long.class) {
                boolean first = true;
 *
        }

                for (DBSAttributeBase item : attributes) {
            case ARRAY -> DBIcon.TYPE_ARRAY;
import org.jkiss.dbeaver.Log;
            return str.toString();
            }
                return Float.valueOf(text);
 * Unless required by applicable law or agreed to in writing, software
                } else if (object instanceof DBSSchema s) {
        if (image == null) {
        return string + "...";
                } catch (NumberFormatException e) {
        // Unknown types print their class name
                    yield DBIcon.TYPE_XML;
            return null;

    public static final DecimalFormat NATIVE_DOUBLE_FORMATTER = new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        for (DBDBinaryFormatter formatter : DBConstants.BINARY_FORMATS) {
                byte[] bytes = (byte[]) value;
                } else {
            } else if (hintType == Integer.class) {

}
        if (date == null) {
        if (typedObject instanceof DBSTypedObjectEx) {

                    yield DBIcon.TYPE_UUID;
                if (validateValue) {
            case BOOLEAN -> DBIcon.TYPE_BOOLEAN;
                } else if (typeNameContains(typeName, DBConstants.TYPE_NAME_JSON, DBConstants.TYPE_NAME_JSON2)) {
                log.debug("Can't parse numeric value [" + text + "] using formatter: " + e.getMessage());
                if (image != null) {
                if (!first) str.append(", ");
                int length = Array.getLength(value);
                StringBuilder str = new StringBuilder("[");
 * limitations under the License.
            case STRUCT -> DBIcon.TYPE_STRUCT;
                } else if (object instanceof DBSPackage) {
        } catch (NumberFormatException e) {
            // Standard types just use toString
                if (value instanceof Float) {
            }
        try {
            log.debug("Error converting number to string: " + e.getMessage());
            if (formatter.getId().equals(id)) {
        try {
                if (typeNameContains(typeName, DBConstants.TYPE_NAME_UUID, DBConstants.TYPE_NAME_UUID2)) {
    @NotNull
    public static Object convertDateToNumber(Date date, Class<?> hintType, @NotNull DBDDataFormatter formatter, boolean validateValue) throws DBCException
            if (object instanceof DBSTypedObject) {
                length = maxLength;
                    } else {
        }
            }
        }
    {
            try {
            if (dataType instanceof DBPImageProvider) {
                return new BigDecimal(date.getTime());
 */
            log.debug(e);
                } else if (object instanceof DBSProcedure) {
            case CONTENT -> {
    {
    static {

                    yield DBIcon.TYPE_TEXT;

                    throw new DBCException("Can't parse numeric value [" + text + "] using formatter", e);
        if (DBUtils.isNullValue(value)) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

        return value.toString();
            return value.toString();
                return Byte.valueOf(text);
                    image = DBIcon.TREE_ASSOCIATION;
    }
        if (CommonUtils.isEmpty(fileEncoding)) {
                for (int i = 0; i < length; i++) {
                return Integer.valueOf(text);
    {
                    return NATIVE_FLOAT_FORMATTER.format(value);
    }
        DBDBinaryFormatter formatter;
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        if (object instanceof DBPImageProvider) {
        //NATIVE_FLOAT_FORMATTER.setMaximumFractionDigits(NumberDataFormatter.MAX_FLOAT_FRACTION_DIGITS);
    public static DBPImage getObjectImage(DBPObject object, boolean useDefault)
            StringBuilder str = new StringBuilder("{");
                str.append(e.getMessage());
    @NotNull

        } catch (NumberFormatException e) {
                } else if (object instanceof DBSCatalog) {
    public static String getDefaultBinaryFileEncoding(@NotNull DBPDataSource dataSource)
    public static DBDBinaryFormatter getBinaryPresentation(@NotNull DBPDataSource dataSource)
import org.jkiss.code.NotNull;
import java.lang.reflect.Array;
                str.append("]");
                        image = DBIcon.TREE_SCHEMA;
            return value.toString();
            }
        return switch (typedObject.getDataKind()) {
        }
 * DB value formatting utilities
import org.jkiss.dbeaver.model.struct.*;
        }
    public static String getDefaultValueDisplayString(@Nullable Object value, @NotNull DBDDisplayFormat format)
    {
import java.util.Collection;
                (typeName.contains(patternLC) || typeName.contains(patternUC));
        NATIVE_DOUBLE_FORMATTER.setDecimalSeparatorAlwaysShown(false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case STRING -> DBIcon.TYPE_STRING;
        //NATIVE_DOUBLE_FORMATTER.setRoundingMode(RoundingMode.UNNECESSARY);
                String strValue = value.toString();
                    first = false;
        String typeName = typedObject.getTypeName();

        };
                    image = DBIcon.TREE_PROCEDURE;
            }
                    image = DBIcon.TREE_TRIGGER;
                    return date.getTime();
        NATIVE_FLOAT_FORMATTER.setDecimalSeparatorAlwaysShown(false);
    {
import org.jkiss.dbeaver.model.data.DBDComposite;
/**
    public static Object convertStringToNumber(String text, Class<?> hintType, @NotNull DBDDataFormatter formatter, boolean validateValue) throws DBCException
                    }
            fileEncoding = GeneralUtils.getDefaultFileEncoding();

            } else {
            }
            } else {
    public static final DecimalFormat NATIVE_FLOAT_FORMATTER = new DecimalFormat("#.########", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            } else if (hintType == Short.class) {
            str.append("}");
    }
        return getObjectImage(object, true);
            }
        return formatBinaryString(dataSource, data, format, false);
                    return image;
                if (validateValue) {
                    if (i > 0) str.append(", ");
        } else if (value instanceof DBDComposite composite) {
                try {
            } else if (hintType == Float.class) {

            // Do not append ... for native formatter - it may contain expressions
                } else if (value instanceof Double) {
    @Nullable
    }
import java.text.DecimalFormat;
                return date;
        return null;
import org.jkiss.utils.CommonUtils;
            return ((DBPNamedObject) value).getName();
    public static String formatBinaryString(@NotNull DBPDataSource dataSource, @NotNull byte[] data, @NotNull DBDDisplayFormat format) {
                yield DBIcon.TYPE_LOB;
            } else if (hintType == Byte.class) {
            case NUMERIC -> DBIcon.TYPE_NUMBER;
        if (format == DBDDisplayFormat.UI || forceLimit) {
                    return new BigInteger(text);
    }
        if (hasToString) {
                }
                return "";
        }
    @NotNull
            }
                return Long.valueOf(date.getTime()).doubleValue();
            try {
            return str.toString();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ModelPreferences;
                    str.append(item.getName()).append(":");
            } catch (DBCException e) {

                }
                first = false;
        }
        try {
                    return NATIVE_DOUBLE_FORMATTER.format(value);
            str.append("]");
    public static DBPImage getDefaultTypeImage(DBSTypedObject typedObject) {
                return formatter.parseValue(date.toString(), hintType);
        String id = dataSource.getContainer().getPreferenceStore().getString(ModelPreferences.RESULT_SET_BINARY_PRESENTATION);
public final class DBValueFormatting {
                if (object instanceof DBSEntity) {
 * DBeaver - Universal Database Manager
            if (image == null && useDefault) {
            case ANY -> DBIcon.TYPE_ANY;
                return str.toString();
                }
 */
        String className = value.getClass().getName();
                str.append(getDefaultValueDisplayString(item, format));
    public static String formatBinaryString(@NotNull DBPDataSource dataSource, @NotNull byte[] data, @NotNull DBDDisplayFormat format, boolean forceLimit) {
        //NATIVE_DOUBLE_FORMATTER.setMaximumFractionDigits(340);
import org.jkiss.dbeaver.model.struct.rdb.*;
    @NotNull
            }
            DBDBinaryFormatter formatter = getBinaryPresentation(id);
    }
            StringBuilder str = new StringBuilder("[");
            }
                    str.append(getDefaultValueDisplayString(Array.get(value, i), format));
            } else if (hintType == Double.class) {
                if (length > 2000) length = 2000;
    }
                    } else {
                }
                }

import java.util.Date;
        if (text == null || text.isEmpty()) {
        }
            }
                    return (int) (date.getTime()/1000);
                        image = DBIcon.TREE_SCHEMA_SYSTEM;

                    return strValue;
        //NATIVE_FLOAT_FORMATTER.setRoundingMode(RoundingMode.UNNECESSARY);
    @Nullable
                }
        }
            } else if (hintType == Integer.class) {
 *
    @NotNull
                if (scientificNotation || strValue.indexOf('E') == -1) {
                } else if (object instanceof DBSEntityAssociation) {
                try {
            image = ((DBPImageProvider)object).getObjectImage();
                    throw new DBCException("Can't parse numeric value [" + date + "] using formatter", e);
                if (typeNameContains(typeName, DBConstants.TYPE_NAME_XML, DBConstants.TYPE_NAME_XML2)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            default -> DBIcon.TYPE_UNKNOWN;
                image = getTypeImage((DBSTypedObject) object);
            if (value.getClass().getComponentType() == Byte.TYPE) {
 * See the License for the specific language governing permissions and
            try {
                } else if (typeNameContains(typeName, DBConstants.TYPE_NAME_CHAR, DBConstants.TYPE_NAME_CHAR2)) {
 * You may obtain a copy of the License at
        DBPImage image = null;
        if (format == DBDDisplayFormat.NATIVE || length == data.length) {
    {
        }
            hasToString = false;
                    image = DBIcon.TYPE_OBJECT;
    public static String convertNumberToNativeString(Number value, boolean scientificNotation) {
    }
            }
        }
            formatter = dataSource.getSQLDialect().getNativeBinaryFormatter();
            case REFERENCE -> DBIcon.TYPE_REFERENCE;
    }
                return Double.valueOf(text);
            return value.toString();
            case OBJECT -> {

import org.jkiss.dbeaver.model.data.DBDDataFormatter;

            } catch (ParseException e1) {
            }
        } else if (value instanceof Collection) {
        boolean hasToString;
            hasToString = value.getClass().getMethod("toString").getDeclaringClass() != Object.class;
import org.jkiss.dbeaver.model.exec.DBCException;
            if (format == DBDDisplayFormat.UI) {
                return formatter;
                }
                    Object attributeValue = composite.getAttributeValue(item);
            case BINARY -> DBIcon.TYPE_BINARY;
            DBSDataType dataType = ((DBSTypedObjectEx) typedObject).getDataType();
        }
                return Long.valueOf(date.getTime()).floatValue();
                int length = bytes.length;
            for (Object item : (Collection<?>)value) {
                } else if (object instanceof DBSTrigger) {
            DBSAttributeBase[] attributes = composite.getAttributes();
                    if (s instanceof DBPSystemObject so && so.isSystem()) {
                    }
        }
        if (id != null) {
import java.text.DecimalFormatSymbols;
        try {
