                description = "";
            this.isTempTable = JDBCUtils.safeGetBoolean(dbResult, "is_temp_table");
    private Date createTime;
    private String description;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
    }
    public boolean isSystem() {
    public boolean isTempTable() {
import org.jkiss.dbeaver.ext.vertica.VerticaUtils;
    public String getDescription() {
import org.jkiss.dbeaver.DBException;
            this.isSystemTable = JDBCUtils.safeGetBoolean(dbResult, "is_system_table");
        if (description == null) {
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
        this.description = description;
import org.jkiss.dbeaver.model.DBPSystemObject;
import org.jkiss.code.NotNull;
    }
    }
    private boolean isTempTable;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
            if (description == null) {

package org.jkiss.dbeaver.ext.vertica.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPObjectWithLazyDescription;
    @Override
/**
            }
    }

    public static class CommentsValidator implements IPropertyCacheValidator<VerticaView> {
    public VerticaView(VerticaSchema container, String tableName, String tableType, JDBCResultSet dbResult) {
    @Override
    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                VerticaUtils.readTableAndColumnsDescriptions(monitor, getDataSource(), this, true);

public class VerticaView extends GenericView implements DBPSystemObject, DBPObjectWithLazyDescription {
        if (dbResult != null) {
 * See the License for the specific language governing permissions and
        return isSystemTable;
    private boolean isSystemTable;
 *
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
    }
        public boolean isPropertyCached(@NotNull VerticaView object, @NotNull Object propertyId) {

 * DBeaver - Universal Database Manager


    public String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException {
    public void setDescription(String description) {
        return isTempTable;
    public Date getCreateTime() {
        return createTime;
            }
        return description;
    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(container, tableName, tableType, dbResult);
    @Property(viewable = true, order = 4)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.LazyProperty;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return description;
/*
            this.createTime = JDBCUtils.safeGetDate(dbResult, "create_time");
        }
import java.util.Date;
 * limitations under the License.
    @Property(viewable = true, order = 3)
 *     http://www.apache.org/licenses/LICENSE-2.0


    @LazyProperty(cacheValidator = CommentsValidator.class)

        @Override
import org.jkiss.dbeaver.model.meta.Property;
            if (!((VerticaDataSource) getDataSource()).avoidCommentsReading()) {
            return object.description != null;

 */
    @Nullable
    }
        }
    }
 * VerticaView
        }
    @Nullable
