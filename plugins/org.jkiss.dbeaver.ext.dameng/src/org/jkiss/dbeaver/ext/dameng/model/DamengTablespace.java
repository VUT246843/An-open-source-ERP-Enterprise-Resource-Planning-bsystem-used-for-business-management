    private final Long usedSize;
    @Override

        return type;

        return copyNum;


    private final DamengDataSource dataSource;
        return usedSize;
        CORRUPT,

    public String getName() {
    }
        TEMPORARY,


                JDBCUtils.safeGetString(dbResult, "CACHE"),
        return this;

import java.util.Map;
    }
 *
    @Override

 * DBeaver - Universal Database Manager
    @Override
        protected DamengDataFile fetchObject(@NotNull JDBCSession session, @NotNull DamengTablespace damengTablespace, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        return encryptName;
    @Override
    private Type type;
    @Property(viewable = true)

    public Collection<DamengDataFile> getFiles(DBRProgressMonitor monitor) throws DBException {
    }
    @Property(viewable = true)
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
 * @author Shengkai Bai
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengTablespace damengTablespace) throws SQLException {
    public Long getMaxSize() {
        OFFLINE,
    static class FileCache extends JDBCObjectCache<DamengTablespace, DamengDataFile> {
    public boolean hasStatistics() {
    public DamengTablespace(DamengDataSource dataSource, JDBCResultSet dbResult) {
    public Integer getFileNum() {

import java.sql.SQLException;

    @Property(viewable = true)
        return DamengUtils.getDDL(monitor, this, DamengConstants.ObjectType.TABLESPACE, null);
        RES_OFFLINE,
    }
import org.jkiss.utils.CommonUtils;
 *
    public String getSizeMode() {
    @Override
    public Status getStatus() {
        this.sizeMode = JDBCUtils.safeGetString(dbResult, "SIZE_MODE");
    private Cache cache;
        this.maxSize = JDBCUtils.safeGetLong(dbResult, "MAX_SIZE");
    }
 */
        return usedSize;
    @Property(viewable = true, order = 1)
    public Type getType() {
    private Status status;

    @Override
    }
        return status;
    public enum Type {
    private long id;
        this.optNode = JDBCUtils.safeGetInteger(dbResult, "OPT_NODE");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
}
import org.jkiss.code.NotNull;
    }


        KEEP,
 * you may not use this file except in compliance with the License.
    public enum Cache {
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true)
import org.jkiss.dbeaver.model.DBPScriptObject;
    @NotNull
    }


                    "FROM V$TABLESPACE AS ts, V$DATAFILE AS df " +

    }
        this.type = Type.values()[typeValue - 1];
        @NotNull
    public Integer getOptNode() {
    @Property(viewable = true)
    public boolean isPersisted() {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @Override
    @Property(viewable = true)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        ONLINE,
 * limitations under the License.

    @Property(viewable = true)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return optNode;

        int statusValue = JDBCUtils.safeGetInt(dbResult, DamengConstants.STATUS$);

    @NotNull

        @Override
    @Override

        return dataSource;
            return dbStat;
                    "WHERE ts.ID = df.GROUP_ID AND ts.NAME = ?");
        return maxSize;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Unless required by applicable law or agreed to in writing, software
        this.dataSource = dataSource;
    }


        return usedSize != null;
                Cache.NORMAL);
    }
        this.copyNum = JDBCUtils.safeGetInteger(dbResult, "COPY_NUM");
    @Property(viewable = true)
    private Integer fileNum;

    }

        fileCache.clearCache();
    }
    public DamengDataSource getDataSource() {
    public long getStatObjectSize() {
        return fileCache.getAllObjects(monitor, this);
        this.encryptedKey = JDBCUtils.safeGetString(dbResult, "ENCRYPTED_KEY");

    public String getDescription() {
                Cache.class,
        return sizeMode;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private final String name;
    public Integer getCopyNum() {
    @Property(viewable = true)
        NORMAL,
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT df.* " +

        return null;
        this.status = Status.values()[statusValue];
    }


    @Property(viewable = true)
    final FileCache fileCache = new FileCache();
        this.name = JDBCUtils.safeGetString(dbResult, DamengConstants.NAME);
        }
    private String sizeMode;
        return id;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPObjectWithLongId;

    @Override
import org.jkiss.dbeaver.model.meta.Association;
            return new DamengDataFile(damengTablespace, resultSet);

    @Association
        this.id = JDBCUtils.safeGetInt(dbResult, DamengConstants.ID);
        return fileNum;
        this.totalSize = JDBCUtils.safeGetLong(dbResult, "TOTAL_SIZE");

    }
    }
        this.usedSize = JDBCUtils.safeGetLong(dbResult, "USED_SIZE");
    @Override
    }

    }

    public long getObjectId() {
        return name;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.dameng.model;
        return totalSize;
    public String getEncryptedKey() {
    private Integer copyNum;
    public Cache getCache() {
        int typeValue = JDBCUtils.safeGetInt(dbResult, DamengConstants.TYPE$);


    public String getEncryptName() {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    private String encryptName;

    private Long totalSize;
    }
    private String encryptedKey;
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.DBException;
        this.encryptName = JDBCUtils.safeGetString(dbResult, "ENCRYPT_NAME");
    public enum Status {
            dbStat.setString(1, damengTablespace.getName());
        return dataSource.getContainer();

        return encryptedKey;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    @Property(viewable = true)

        return true;

import org.jkiss.dbeaver.model.DBPRefreshableObject;
        return cache;
    public Long getTotalSize() {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

    public Long getUsedSize() {
/**
    }

 */
    private Integer optNode;
public class DamengTablespace implements DBPRefreshableObject, DBPObjectStatistics, DBPScriptObject, DBPObjectWithLongId {
        this.cache = CommonUtils.valueOf(
    private Long maxSize;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

        PERMANENT,
        }
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Property(viewable = true)
import org.jkiss.dbeaver.model.DBPObjectStatistics;
import java.util.Collection;

    }
 *
    @Property(viewable = true)

import org.jkiss.dbeaver.ext.dameng.DamengConstants;

        this.fileNum = JDBCUtils.safeGetInt(dbResult, "FILE_NUM");
