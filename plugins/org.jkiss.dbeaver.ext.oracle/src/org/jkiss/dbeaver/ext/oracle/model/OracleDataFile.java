        this.available = "AVAILABLE".equals(JDBCUtils.safeGetStringTrimmed(dbResult, OracleConstants.COLUMN_STATUS));
    private long id;
        SYSTEM,
    public BigDecimal getMaxBytes()

    public OracleTablespace getTablespace()
    }
    private BigDecimal userBlocks;
 * Unless required by applicable law or agreed to in writing, software
    {
    public long getId()
    @Property(viewable = true, order = 11)

 * DBeaver - Universal Database Manager


        return name;

        ONLINE,
import org.jkiss.code.NotNull;
        return tablespace;
            JDBCUtils.safeGetString(dbResult, "FILE_NAME"),
    public boolean isAutoExtensible()
    {
 * limitations under the License.
    {


    // New created tablespace
        return onlineStatus;
        return userBytes;
        this.bytes = BigDecimal.valueOf(1000000); // Minimum value
    @Property(viewable = true, editable = true, order = 1)

public class OracleDataFile extends OracleObject<OracleTablespace> {
    @Property(viewable = true, order = 14)
        super(
        this.tablespace = tablespace;

/*

    private BigDecimal blocks;
 */
    public BigDecimal getUserBytes()
        }
    private OnlineStatus onlineStatus;
    public boolean isTemporary()
    }
    public boolean isAvailable()
    private BigDecimal maxBlocks;
        return userBlocks;
import java.math.BigDecimal;

    public void setBytes(BigDecimal bytes) {
 * See the License for the specific language governing permissions and
    @Property(viewable = true, editable = true, order = 4)
    protected OracleDataFile(OracleTablespace tablespace, ResultSet dbResult, boolean temporary)

        return relativeNo;
            true);
    }
    @Property(viewable = true, order = 10)
        this.maxBytes = JDBCUtils.safeGetBigDecimal(dbResult, "MAXBYTES");
 * Oracle tablespace file
        return maxBytes;
    public String getName()
        this.temporary = temporary;
    public OnlineStatus getOnlineStatus()
    public BigDecimal getBlocks()
    private boolean temporary;
    public BigDecimal getUserBlocks()
    public enum OnlineStatus {

    }
    }
    }


        this.autoExtensible = autoExtensible;
    {
    public BigDecimal getBytes()
    {
        return maxBlocks;
 *

    }
    private BigDecimal bytes;
    {
    private BigDecimal maxBytes;
            tablespace,
    @Property(order = 3)
        RECOVER,
        this.blocks = JDBCUtils.safeGetBigDecimal(dbResult, "BLOCKS");
    }
    public void setMaxBytes(BigDecimal maxBytes) {
    private BigDecimal userBytes;
package org.jkiss.dbeaver.ext.oracle.model;
        OFFLINE,
    public long getIncrementBy()
    {
        this.autoExtensible = JDBCUtils.safeGetBoolean(dbResult, "AUTOEXTENSIBLE", OracleConstants.RESULT_YES_VALUE);

    {
}
    private final OracleTablespace tablespace;
import org.jkiss.dbeaver.model.meta.Property;
    }
    {
    @Property(order = 2)
import java.sql.ResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return id;
    @Property(viewable = true, editable = true, order = 6)
        this.relativeNo = JDBCUtils.safeGetLong(dbResult, "RELATIVE_FNO");
        return bytes;
    }
 * you may not use this file except in compliance with the License.
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.bytes = JDBCUtils.safeGetBigDecimal(dbResult, "BYTES");
    {
    public OracleDataFile(@NotNull OracleTablespace tablespace, @NotNull String name) {
    public long getRelativeNo()
 * distributed under the License is distributed on an "AS IS" BASIS,
        return incrementBy;
    {
 */

/**
    @Property(viewable = true, order = 9)
        this.userBlocks = JDBCUtils.safeGetBigDecimal(dbResult, "USER_BLOCKS");
 *
    public void setAutoExtensible(boolean autoExtensible) {
    }
    private long incrementBy;

    {
        this.maxBlocks = JDBCUtils.safeGetBigDecimal(dbResult, "MAXBLOCKS");
    }
    }
    private long relativeNo;

        super(tablespace, name, false);
            this.onlineStatus = CommonUtils.valueOf(OnlineStatus.class, JDBCUtils.safeGetStringTrimmed(dbResult, "ONLINE_STATUS"));
    {
        this.bytes = bytes;
        return autoExtensible;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        return temporary;
        this.maxBytes = maxBytes;



    @Property(viewable = true, order = 5)
        return available;
    }
    @Override
    }
    @Property(viewable = true, editable = true, order = 12)


    private boolean available;
    private boolean autoExtensible;
 * You may obtain a copy of the License at
        this.tablespace = tablespace;
        if (!this.temporary) {

    }
    @Property(viewable = true, order = 13)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
    }
        this.userBytes = JDBCUtils.safeGetBigDecimal(dbResult, "USER_BYTES");

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public BigDecimal getMaxBlocks()
    }
    @Property(viewable = true, order = 8)

import org.jkiss.utils.CommonUtils;
    }
    {
        SYSOFF,
        this.incrementBy = JDBCUtils.safeGetLong(dbResult, "INCREMENT_BY");
        this.temporary = tablespace.getContents() == OracleTablespace.Contents.TEMPORARY;
        return blocks;
    }
    {
    }
        this.id = JDBCUtils.safeGetLong(dbResult, "FILE_ID");
    @Property(viewable = true, order = 7)
