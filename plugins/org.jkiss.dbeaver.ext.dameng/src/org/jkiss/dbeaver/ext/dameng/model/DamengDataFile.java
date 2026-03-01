    private Timestamp createTime;
    public Integer getPageSize() {

    }
    public Long getRealFreeSize() {
    }
    @Override
    @Property(viewable = true, formatter = ByteNumberFormat.class)
    public enum Status {
 * Unless required by applicable law or agreed to in writing, software
    }

    private Long nextSize;

        this.mirrorPath = JDBCUtils.safeGetString(dbResult, "MIRROR_PATH");
public class DamengDataFile implements DBSObject {
        return createTime;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
        this.tablespace = tablespace;
        return status;
    private Boolean autoExtend;




        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATE_TIME");

        return freeSize;
        return nextSize;
    private Integer pageSize;
        this.nextSize = JDBCUtils.safeGetInt(dbResult, "NEXT_SIZE") * 1024L * 1024L;
        this.maxSize = JDBCUtils.safeGetInt(dbResult, "MAX_SIZE") * 1024L * 1024L;


 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.utils.ByteNumberFormat;


    @Override
    public Long getFreeSize() {
    private Long freeSize;
    private Status status;
        return mirrorPath;
 */
}
    @Property(viewable = true, order = 1)
        OFFLINE,
 * See the License for the specific language governing permissions and
 */
        return maxSize;
    private Long maxSize;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");

    public DamengDataFile(DamengTablespace tablespace, ResultSet dbResult) {
    @NotNull

    public Status getStatus() {
    @Override
 * @author Shengkai Bai
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.pageSize = JDBCUtils.safeGetInt(dbResult, "PAGE_SIZE");
 * DBeaver - Universal Database Manager

    public Long getMaxSize() {
        return pageSize;


    public Long getNextSize() {
package org.jkiss.dbeaver.ext.dameng.model;
    }

    public String getMirrorPath() {

        return totalSize;
        this.autoExtend = JDBCUtils.safeGetInt(dbResult, "AUTO_EXTEND") == 1;
        return true;
        return tablespace.getDataSource();
 * limitations under the License.
    @Property(viewable = true)
    }
    }


    }
    private String mirrorPath;
 *
    public DBSObject getParentObject() {
    public DBPDataSource getDataSource() {

 *
import java.sql.Timestamp;
    }
/*
    }

        this.realFreeSize = JDBCUtils.safeGetLong(dbResult, "REAL_FREE_SIZE") * pageSize;
import java.sql.ResultSet;

    public Long getTotalSize() {
    private String name;
 * You may obtain a copy of the License at
    }
    @Property(viewable = true, formatter = ByteNumberFormat.class)
        return null;
        this.totalSize = JDBCUtils.safeGetLong(dbResult, "TOTAL_SIZE") * pageSize;
import org.jkiss.code.NotNull;
    public boolean isPersisted() {

    @Property(viewable = true)
    public Boolean getAutoExtend() {
        ONLINE,
    public String getName() {
    @Property(viewable = true, formatter = ByteNumberFormat.class)
        return autoExtend;
        this.status = JDBCUtils.safeGetInt(dbResult, DamengConstants.STATUS$) == 1 ? Status.ONLINE : Status.OFFLINE;
    }
    @Property(viewable = true, formatter = ByteNumberFormat.class)
    public Timestamp getCreateTime() {
 * you may not use this file except in compliance with the License.
    }
    private final DamengTablespace tablespace;
    private Long realFreeSize;

import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, formatter = ByteNumberFormat.class)

/**
    @Override
    public String getDescription() {
        this.name = JDBCUtils.safeGetString(dbResult, "PATH");
    @Property(viewable = true, formatter = ByteNumberFormat.class)
import org.jkiss.dbeaver.model.DBPDataSource;
    }
        return realFreeSize;

    @Property(viewable = true)
    }
    @Property(viewable = true)
        return name;

    private Long totalSize;
        this.freeSize = JDBCUtils.safeGetLong(dbResult, "FREE_SIZE") * pageSize;
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
    }
        return tablespace;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
    }

