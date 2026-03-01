
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;

import org.jkiss.dbeaver.Log;

            }
 * See the License for the specific language governing permissions and
    @Override
        if (consumer instanceof DatabaseTransferConsumer) {

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

 */
                log.error("Wrong timestamp format: " + tsFormatPattern, e);
            String zoneId = CommonUtils.toString(properties.get(zoneIdPropName));
            resultSet.setDateTimeFormat(tsFormat, tsZoneId);
}                            if (targetAttr != null) {
    }
    public IStreamDataImporterSite getSite()
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 */
                            }
 *
                    if (cm.targetAttr.getMappingType().isValid()) {
                    }
            Object targetObject = consumer.getTargetObject();
 * Abstract stream importer

    public void dispose()
            for (DatabaseTransferConsumer.ColumnMapping cm : ((DatabaseTransferConsumer) consumer).getColumnMappings()) {

                if (cm == null) {
/**
    protected void applyTransformHints(StreamTransferResultSet resultSet, IDataTransferConsumer consumer, Map<String, Object> properties, String formatPropName, String zoneIdPropName) throws DBException {

                                        break;
 * Unless required by applicable law or agreed to in writing, software
        String tsFormatPattern = CommonUtils.toString(properties.get(formatPropName));
import org.jkiss.dbeaver.tools.transfer.stream.StreamDataImporterColumnInfo;
    protected static final String PROP_COLUMN_TYPE_LENGTH = "columnTypeMinimalLength";

            try {
import java.time.ZoneId;
    protected static final String PROP_TIMESTAMP_FORMAT = "timestampFormat";
    protected static final String PROP_TIMESTAMP_ZONE = "timestampZone";
        DateTimeFormatter tsFormat = null;
        return site;
                tsZoneId = ZoneId.of(zoneId);
                        }
            } catch (Exception e) {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
        }
import org.jkiss.dbeaver.model.struct.DBSEntity;
    @Override
package org.jkiss.dbeaver.tools.transfer.stream.importer;
        return tsFormat;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataImporterSite;
    {
                }


            if (!CommonUtils.isEmpty(zoneId)) {
                                    case BOOLEAN:
            }
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Try to find source/target attributes
    @Nullable
    {
            }
    private static final Log log = Log.getLog(StreamImporterAbstract.class);
    protected static final String STRING_DATA_TYPE = "String";
        if (tsFormat != null) {
    }
import org.jkiss.code.NotNull;

    {


                                }
 * DBeaver - Universal Database Manager
                                    case DATETIME:
        if (!CommonUtils.isEmpty(tsFormatPattern)) {
                }
 * limitations under the License.
        ZoneId tsZoneId = null;
        // do nothing
public abstract class StreamImporterAbstract implements IStreamDataImporter {
    public void init(@NotNull IStreamDataImporterSite site) throws DBException
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataImporter;
    protected static final String PROP_COLUMN_TYPE_SAMPLES = "columnTypeSamplesCount";
import java.util.Map;
                                    case NUMERIC:
        }
            if (targetObject instanceof DBSEntity) {
                            // Gotcha
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferResultSet;
        DateTimeFormatter tsFormat = formatPropName == null ? null : getTimeStampFormat(properties, formatPropName);
                                switch (targetAttr.getDataKind()) {
        // Modify source data type and data kind for timestamps and numerics
    protected DateTimeFormatter getTimeStampFormat(Map<String, Object> properties, String formatPropName) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.time.format.DateTimeFormatter;
 *

 * Copyright (C) 2010-2025 DBeaver Corp and others
    private IStreamDataImporterSite site;

 *
                                        attributeMapping.setDataKind(targetAttr.getDataKind());
    }
    protected static final String PROP_COLUMN_IS_BYTE_LENGTH = "columnTypeIsByteLength";
                tsFormat = DateTimeFormatter.ofPattern(tsFormatPattern);
                    continue;
 * You may obtain a copy of the License at
                            DBSEntityAttribute targetAttr = cm.targetAttr.getTarget();
                for (StreamDataImporterColumnInfo attributeMapping : resultSet.getAttributeMappings()) {
        // Do it only for valid String mappings
                        if (cm.sourceAttr.getDataKind() == DBPDataKind.STRING && cm.sourceAttr.getName().equals(attributeMapping.getName())) {
/*
        this.site = site;
    }
            }
        if (zoneIdPropName != null) {
        }
        }
    }
