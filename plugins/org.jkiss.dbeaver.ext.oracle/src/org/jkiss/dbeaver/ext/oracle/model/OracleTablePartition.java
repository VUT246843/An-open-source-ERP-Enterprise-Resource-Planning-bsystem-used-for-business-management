    public boolean isView() {
    @Property(viewable = true, order = 30)
                default -> this.literalKind.literalFuncName + "(" + value + ", '" + this.unitKind.name() + "')";
        return partitionParent != null;
        public PartitionByIntervalKind getPartitionByIntervalKind() {
import org.jkiss.dbeaver.model.meta.Association;
        this.parent = parent;
    }
                Matcher m = exprPattern.matcher(expr);
        @NotNull
            subPartitions = new ArrayList<>();
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
        PartitionByIntervalLiteralKind(String literalFuncName, PartitionByIntervalUnitKind ... units) {
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            return PartitionByIntervalKind.values();
        public PartitionByIntervalUnitKind tryParseKnownUnit(String unitName) {
        public PartitionByIntervalKind getIntervalKind() {
 */
    }
        @Nullable DBDPseudoAttribute rowIdAttribute,
                }
                        if (CommonUtils.isEmpty(subpartitionName)) {
        }
        @Property(category = CAT_PARTITIONING, order = 124)

        public final Set<PartitionByIntervalUnitKind> units;
        private PartitionType partitionType;
                        }
/*
        public boolean allowCustomValue() {
    }
    @Nullable
        @Nullable OracleTablePartition partitionParent
        query.append(" ")
        @Nullable OracleTablePartition partitionParent
    public DBPImage getObjectImage() {

import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        }
            this.getIntervalKindSupplier = getIntervalKindSupplier;
     */
    @Property(viewable = true, order = 10)
        private Object partitionTablespace;
        return !CommonUtils.isEmpty(subPartitions);
        public Object getPartitionTablespace() {
        this.lastAnalyzed = JDBCUtils.safeGetTimestamp(dbResult, "LAST_ANALYZED");
        subPartitions = new ArrayList<>();
    public static class PartitionByIntervalKindListProvider implements IPropertyValueListProvider<OracleTablePhysical> {
            this.units = Set.of(units);
        PartitionByIntervalUnitKind(Supplier<PartitionByIntervalKind> getIntervalKindSupplier) {

            return partitionInterval;

        public long getPartitionCount() {

        }
            this.literalFuncName = literalFuncName;
        return false;
        @Property(editable = true, category = CAT_PARTITIONING, order = 121)
        return "TABLE PARTITION";
            } else {
        MINUTE(PartitionByIntervalLiteralKind.DAY_TO_SECOND, PartitionByIntervalUnitKind.MINUTE, "by interval of minutes"),
        HOUR(() -> PartitionByIntervalKind.HOUR),

        return super.refreshObject(monitor);
        PartitionByIntervalKind(PartitionByIntervalLiteralKind literalKind, PartitionByIntervalUnitKind unitKind, String title) {
    }


    public OracleTablePartition(
                "\nWHERE TABLE_OWNER=? AND TABLE_NAME=? AND PARTITION_NAME=? " +
                dbStat.setString(2, parent.getName());
    @Override
        public PartitionInfoBase(DBRProgressMonitor monitor, OracleDataSource dataSource, ResultSet dbResult) {
        public PartitionType getSubpartitionType() {
            return this.prepareExpression(switch (kindAndValue.getFirst()) {
    public String getHighValue() {
    protected String getTableName() {
    }
    @Override

    }
    }
        return DBIcon.TREE_PARTITION;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;

        return parent;
        public void setPartitionByIntervalKind(OracleTablePartition.PartitionByIntervalKind kind) {

        this.parent = parent;
            return partitionTablespace;
            };

    ) {
            return partitionCount;
        }
import java.util.stream.Collectors;
        @NotNull OracleTablePhysical parent,
        }
                "\nORDER BY SUBPARTITION_POSITION")) {
import org.jkiss.dbeaver.model.data.DBDDataFilter;
        LIST,
 * distributed under the License is distributed on an "AS IS" BASIS,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read subpartitions")) {
    public OracleTablePhysical getParent() {
                        PartitionByIntervalUnitKind unit = kind.tryParseKnownUnit(unitName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            .append(DBUtils.getQuotedIdentifier(this))
    @Override

        private final Supplier<PartitionByIntervalKind> getIntervalKindSupplier;
                }


import java.sql.ResultSet;
package org.jkiss.dbeaver.ext.oracle.model;
                            return Pair.of(unit.getIntervalKind(), m.group("value"));
 * limitations under the License.
    private static final String CAT_PARTITIONING = "Partitioning";
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }

        }
public class OracleTablePartition extends OracleTablePhysical implements DBSTablePartition, DBPImageProvider {
        return new TableAdditionalInfo();
        }

        @NotNull
            return this.title;
        if (subPartitions == null) {



import org.jkiss.code.NotNull;
            this.literalKind = literalKind;
 *
 */
    private String valuesForCreating;
        @Nullable

                if (m.matches()) {
            } catch (SQLException e) {
        }

        this.highValue = JDBCUtils.safeGetString(dbResult, "HIGH_VALUE");
                    log.debug("Can not find tablespace " + partitionTablespaceName, e);
        super(schema, name);
    }
            });
            return subpartitionType;

        return subPartitions;

                } catch (DBException e) {
    public boolean isUsable() {
    }
                        String unitName = m.group("unit");
    }
        return subPartitions;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.partitionParent = partitionParent;
    private boolean usable;
            .append(")");
    public enum PartitionByIntervalLiteralKind {

        this.position = partitionParent != null ?
    private List<OracleTablePartition> readSubPartitions(@NotNull DBRProgressMonitor monitor) throws DBException {

            return kindByName.get(kindName.toUpperCase());
        return subPartitions;
                        String subpartitionName = JDBCUtils.safeGetString(dbResult, "SUBPARTITION_NAME");

                dbStat.setString(3, getName());
        }
        if (partitionParent != null) {


            this.unitKind = unitKind;
    @Nullable
        }
        this.valuesForCreating = valuesForCreating;
        @Nullable
        YEAR(() -> PartitionByIntervalKind.YEAR),
                dbStat.setString(1, parent.getSchema().getName());
    @Property(viewable = true, order = 13)
    public boolean isSubPartition() {
        CUSTOM(null, null, "Use custom interval expression"),
            }
 *

                return Pair.of(PartitionByIntervalKind.CUSTOM, expr);
import org.jkiss.code.Nullable;
 * Oracle abstract partition
            readSubPartitions(monitor);
    }
    private long sampleSize;
    }
        @Property(category = CAT_PARTITIONING, order = 125, updatable = true)
                case CUSTOM -> "<enter custom expression>";
    protected String getTableTypeName() {
                JDBCUtils.safeGetStringTrimmed(dbResult, "PARTITIONING_TYPE"), PartitionType.RANGE);
        public final PartitionByIntervalLiteralKind literalKind;
        return highValue;
            this.partitionCount = JDBCUtils.safeGetLong(dbResult, "PARTITION_COUNT");
        @Override
        public void setPartitionTablespace(Object partitionTablespace) {
 * Unless required by applicable law or agreed to in writing, software
    @Override
                OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_TAB_SUBPARTITIONS " +
        @NotNull
    @Override
import org.jkiss.dbeaver.model.*;
        private static final Pattern exprPattern = Pattern.compile("^\\s*(?<kind>\\w+)\\s*\\((?<value>.+),\\s*'(?<unit>\\w+)'\\s*\\)\\s*$");
    public OracleTablePartition getPartitionParent() {

    }
        MONTH(() -> PartitionByIntervalKind.MONTH),
    public boolean isPartitioned() {
    @Override
                return !(object instanceof OracleTablePartition);
        DAY(PartitionByIntervalLiteralKind.DAY_TO_SECOND, PartitionByIntervalUnitKind.DAY, "by interval of days"),
        }
                try {

            this.partitionType = partitionType;
        private final Map<String, PartitionByIntervalUnitKind> unitsByName;

    @Override
            return recognizeAndExtractValue(expr).getFirst();
            partitionInterval = CommonUtils.notNull(kind, PartitionByIntervalKind.NONE).changeExpression(partitionInterval);
    }
    /**
    public enum PartitionByIntervalUnitKind {
import org.jkiss.dbeaver.model.meta.Property;
    }

            return this.unitsByName.get(unitName.toUpperCase());
            this.subpartitionType = CommonUtils.valueOf(PartitionType.class, JDBCUtils.safeGetStringTrimmed(dbResult, "SUBPARTITIONING_TYPE"));
            .append("PARTITION (")
        }
            this.partitionInterval = JDBCUtils.safeGetString(dbResult, "INTERVAL");
            return partitionType;
        return partitionParent;
    private int position;
                        if (unit != null) {
        if (partitionParent != null) {

    private OracleTablePhysical parent;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import java.sql.Timestamp;
        return usable;
                    if (kind != null) {
    }
            this.partitionTablespace = partitionTablespace;
            }
        }
    }
        @NotNull ResultSet dbResult,
        @Override
                    PartitionByIntervalLiteralKind kind = PartitionByIntervalLiteralKind.tryParse(kindName);
        @NotNull String name,
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
        public String getName() {
        }

    public void addSubPartition(@NotNull OracleTablePartition partition) {
            .append(partitionParent != null ? "SUB" : "")
            this.subpartitionType = PartitionType.RANGE;
    @NotNull

    public List<OracleTablePartition> getSubPartitions(DBRProgressMonitor monitor) throws DBException {
    }
            JDBCUtils.safeGetInt(dbResult, "SUBPARTITION_POSITION") :
        private long partitionCount;
    }
        }
    }
        return parent;
        return lastAnalyzed;
    private List<OracleTablePartition> subPartitions;
                    while (dbResult.next()) {
        public void setPartitionByIntervalExpr(String value) {

    protected boolean needAliasInSelect(

        public PartitionType getPartitionType() {
        super(parent.getSchema(), dbResult, name);
                    String kindName = m.group("kind");
                default -> kindAndValue.getSecond();
        }


                throw new DBDatabaseException(e, getDataSource());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.SQLException;

        NONE(null, null, "No partition by interval"),
            this.partitionType = CommonUtils.valueOf(
import org.jkiss.utils.CommonUtils;
    @NotNull
import java.util.regex.Matcher;
        subPartitions = null;
            return PartitionByIntervalKind.recognize(partitionInterval);
    public enum PartitionType {
        }
        public String getPartitionByIntervalExpr() {
    protected void appendExtraSelectParameters(@NotNull StringBuilder query) {
 * you may not use this file except in compliance with the License.
        @Property(category = CAT_PARTITIONING, viewable = true, editable = true, visibleIf = OraclePartitionIntervalValidator.class, listProvider = OracleTablePartition.PartitionByIntervalKindListProvider.class, order = 122)
        @NotNull DBPDataSource dataSource
        public final String literalFuncName;
        this.sampleSize = JDBCUtils.safeGetLong(dbResult, "SAMPLE_SIZE");

        @NotNull OracleSchema schema,
    public TableAdditionalInfo getAdditionalInfo() {
 * DBeaver - Universal Database Manager
import java.util.regex.Pattern;
        }


    public enum PartitionByIntervalKind implements DBPNamedObject {
    @Override
        }
    @Override
        @NotNull
    ) {
        }
        }
        HOUR(PartitionByIntervalLiteralKind.DAY_TO_SECOND, PartitionByIntervalUnitKind.HOUR, "by interval of hours"),
        public void setPartitionType(PartitionType partitionType) {
            partitionInterval = value;
    OracleTablePartition(
        public static PartitionByIntervalKind recognize(String expr) {
            if (CommonUtils.isEmpty(expr)) {
                PartitionType.class,
        }
        RANGE,
            this.unitsByName = this.units.stream().collect(Collectors.toMap(u -> u.name().toUpperCase(), u -> u));
            return this.getIntervalKindSupplier.get();
        public final String title;
    }
        }
            this.subpartitionType = subpartitionType;
        @NotNull
        DAY(() -> PartitionByIntervalKind.DAY),

    }
        public static Pair<PartitionByIntervalKind, String> recognizeAndExtractValue(String expr) {
            if (dataSource.isAdmin() && CommonUtils.isNotEmpty(partitionTablespaceName)) {
            this.partitionType = PartitionType.RANGE;
                        subPartitions.add(new OracleTablePartition(parent, subpartitionName, dbResult, this));

            }
        @NotNull String name,
            return Collections.emptyList();
import java.util.stream.Stream;
                case NONE, CUSTOM -> "1";

        this.usable = "USABLE".equals(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        NONE,
        public PartitionInfoBase() {
import org.jkiss.dbeaver.Log;

 * You may obtain a copy of the License at
    @Property(viewable = true, order = 11)

        if (subPartitions == null) {
    public DBSTable getParentTable() {
        return valuesForCreating;
/**
            this.title = title;
        public String prepareExpression(String value) {
        }
    @Property(viewable = true, order = 42)
        }
                    }
        }
            JDBCUtils.safeGetInt(dbResult, "PARTITION_POSITION");
    public String getValuesForCreating() {
import org.jkiss.dbeaver.model.struct.DBSObject;
        @Property(editable = true, category = CAT_PARTITIONING, order = 120)
    private String highValue;
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM " +
    public List<OracleTablePartition> getCachedSubPartitions() {

        private static final Map<String, PartitionByIntervalLiteralKind> kindByName = Stream.of(PartitionByIntervalLiteralKind.values())
                                                                                            .collect(Collectors.toMap(k -> k.literalFuncName, k -> k));
    }
        MONTH(PartitionByIntervalLiteralKind.YEAR_TO_MONTH, PartitionByIntervalUnitKind.MONTH, "by interval or months"),
 * Licensed under the Apache License, Version 2.0 (the "License");

    private static final Log log = Log.getLog(OracleTablePartition.class);
    }

    }
    }
 *
    @Override
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        HASH,
        return parent.getFullyQualifiedName(DBPEvaluationContext.DML);

        public static PartitionByIntervalLiteralKind tryParse(String kindName) {
            }
        SECOND(PartitionByIntervalLiteralKind.DAY_TO_SECOND, PartitionByIntervalUnitKind.SECOND, "by interval of seconds");
        @Nullable DBDDataFilter dataFilter,
 * See the License for the specific language governing permissions and


            String partitionTablespaceName = JDBCUtils.safeGetStringTrimmed(dbResult, "DEF_TABLESPACE_NAME");
        }
    }
        }
        MINUTE(() -> PartitionByIntervalKind.MINUTE),
                    this.partitionTablespace = dataSource.tablespaceCache.getObject(monitor, dataSource, partitionTablespaceName);
            @Override
    public int getPosition() {
        YEAR_TO_MONTH("NUMTOYMINTERVAL", PartitionByIntervalUnitKind.YEAR, PartitionByIntervalUnitKind.MONTH),
        return false;
        YEAR(PartitionByIntervalLiteralKind.YEAR_TO_MONTH, PartitionByIntervalUnitKind.YEAR, "by interval of years"),
        @NotNull OracleTablePhysical parent,

    public Timestamp getLastAnalyzed() {
        public Object[] getPossibleValues(OracleTablePhysical table) {
    private Timestamp lastAnalyzed;

                            return null;
    @Override
        // Creation constructor
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
import java.util.function.Supplier;
                return Pair.of(PartitionByIntervalKind.NONE, null);
        this.partitionParent = partitionParent;
        private PartitionType subpartitionType;

            return Collections.emptyList();
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) {

            return switch (this) {
        private String partitionInterval;
        public String changeExpression(String expr) {

        }
import java.util.*;
        return position;
        public final PartitionByIntervalUnitKind unitKind;
        public static class OraclePartitionIntervalValidator implements IPropertyValueValidator<OracleTableBase, Object> {
        }
                case NONE -> null;
    }
                        }
                    }
        }
        SECOND(() -> PartitionByIntervalKind.SECOND);
     * Returns list of already cached subpartitions. First of all - for newly created tables.
}
    public static class PartitionInfoBase {
        SYSTEM,

    public void setValuesForCreating(String valuesForCreating) {
            Pair<PartitionByIntervalKind, String> kindAndValue = recognizeAndExtractValue(expr);
        @Nullable
        return sampleSize;
    @Property(viewable = true, order = 41)

    public long getSampleSize() {
import org.jkiss.utils.Pair;

    }
        @Property(category = CAT_PARTITIONING, visibleIf = OraclePartitionIntervalValidator.class, viewable = true, editable = true, order = 123)
    }
        DAY_TO_SECOND("NUMTODSINTERVAL", PartitionByIntervalUnitKind.DAY, PartitionByIntervalUnitKind.HOUR, PartitionByIntervalUnitKind.MINUTE, PartitionByIntervalUnitKind.SECOND);

            public boolean isValidValue(@NotNull OracleTableBase object, @Nullable Object value) throws IllegalArgumentException {
import org.jkiss.dbeaver.DBDatabaseException;
            return false;
        subPartitions.add(partition);
    @Override
        public void setSubpartitionType(PartitionType subpartitionType) {


import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }


    private OracleTablePartition partitionParent;

import org.jkiss.dbeaver.DBException;
    @Association
