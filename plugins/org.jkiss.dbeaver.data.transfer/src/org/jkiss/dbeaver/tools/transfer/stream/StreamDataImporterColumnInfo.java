        while (result < value) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private final StreamEntityMapping entityMapping;
    public boolean isMappingMetadataPresent() {
        }

public class StreamDataImporterColumnInfo extends AbstractAttribute implements DBSEntityAttribute {
        if (dataSource != null) {
            case "INTEGER" -> 1;

     *
     * @param maxLengthFromData the required length for correct data storing from foreign sources for this data type
        this.entityMapping = entity;
    }
        };


        DBPPreferenceStore globalPreferenceStore = DTActivator.getDefault().getPreferences();
            // Also change if global settings have max data type value

    @NotNull
        long maxLength = getMaxLength();
import org.jkiss.code.NotNull;
     */
        }

 *
        return kind == DBPDataKind.NUMERIC && numericRank(newName) > numericRank(curName);
            setMaxLength(roundToNextPowerOf2(maxLengthFromData));
}
    }

    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    @Override
 * You may obtain a copy of the License at
    @Override
        } else if (maxLength < maxLengthFromData) {
        }
    }
            // First check data source settings for max data type length

            return;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private DBPDataKind dataKind;
    private static int numericRank(@NotNull String typeName) {
     * Updates current data type max length if needed

    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean mappingMetadataPresent;
        this.dataKind = dataKind;
    @Override
        int result = 1;
    }
     * @param dataSource to search data source specific options
        return mappingMetadataPresent;

    public DBPDataKind getDataKind() {
    public String getDefaultValue() {
        return switch (typeName) {
            setDataKind(newKind);
    @Override
    }


            case "BIGINT" -> 2;
    @NotNull

        if (globalPreferenceStore.contains(DTConstants.PREF_MAX_TYPE_LENGTH) &&
            setTypeName(newName);
    }
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
 *
    public void updateType(@NotNull DBPDataKind newKind, @NotNull String newName) {
            case "REAL" -> 3;

        final DBPDataKind curKind = getDataKind();
        return dataKind;
        this.typeName = typeName;
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            }
            maxLength > globalPreferenceStore.getInt(DTConstants.PREF_MAX_TYPE_LENGTH)
    }
    public void setTypeName(@NotNull String typeName) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
    public void updateMaxLength(@Nullable DBPDataSource dataSource, long maxLengthFromData) {

            result <<= 1;
        if (newC > curC || (newC == curC && isWiderNumeric(newKind, newName, getTypeName()))) {
        this.dataKind = dataKind;
package org.jkiss.dbeaver.tools.transfer.stream;
    @NotNull
import org.jkiss.dbeaver.tools.transfer.DTConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        this.mappingMetadataPresent = mappingMetadataPresent;
                setMaxLength(maxTypeLengthFromPref);
            setMaxLength(globalPreferenceStore.getInt(DTConstants.PREF_MAX_TYPE_LENGTH));
        return entityMapping.getDataSource();

    // such as the column name, is present or not.
    public StreamDataImporterColumnInfo(StreamEntityMapping entity, int columnIndex, @NotNull String columnName, @NotNull String typeName, int maxLength, DBPDataKind dataKind) {
    public void setMappingMetadataPresent(boolean mappingMetadataPresent) {
            if (dataSourcePreferenceStore.contains(DTConstants.PREF_MAX_TYPE_LENGTH) && maxLength > maxTypeLengthFromPref) {

import org.jkiss.dbeaver.model.DBPDataSource;
        final int newC = newKind.getCommonality();
    @Nullable
            int maxTypeLengthFromPref = dataSourcePreferenceStore.getInt(DTConstants.PREF_MAX_TYPE_LENGTH);
    // Determines whether the mapping metadata,

import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;
    }
        ) {
        return entityMapping;
        }


import org.jkiss.dbeaver.model.DBPDataKind;
    public void setDataKind(DBPDataKind dataKind) {
 *
    @Override
        final int curC = curKind.getCommonality();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public DBPDataSource getDataSource() {
 * limitations under the License.
        if (newKind == getDataKind() && newName.equals(getTypeName())) {
 */
        return null;
            DBPPreferenceStore dataSourcePreferenceStore = dataSource.getContainer().getPreferenceStore();
    public StreamEntityMapping getParentObject() {
 * See the License for the specific language governing permissions and
    private static long roundToNextPowerOf2(long value) {
                return;
    private static boolean isWiderNumeric(@NotNull DBPDataKind kind, @NotNull String newName, @NotNull String curName) {
    }
/*
            default -> 0;
        super(columnName, typeName, -1, columnIndex, maxLength, null, null, false, false);
        }
        return result;
     *
