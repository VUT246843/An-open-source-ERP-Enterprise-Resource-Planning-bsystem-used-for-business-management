        samplePercent = JSONUtils.getInteger(config, "sample_percent"); //$NON-NLS-1$

    }
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
    }
        return columnStat;
            return 0 <= i && i <= 100;
        @Override
        @Nullable
    @Property(viewable = true, editable = true, updatable = true, order = 3)
import org.jkiss.dbeaver.model.app.DBPProject;
    }
}
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    public void setColumnStat(String columnStat) {
            columnStat = DB2RunstatsOptions.getOption(columnStats[0]).getDesc();
        public Object[] getPossibleValues(DB2RunstatsToolSettings object) {
        this.samplePercent = samplePercent;
    }
        }


        config.put("is_table_sampling", isTableSampling); //$NON-NLS-1$
        return samplePercent;
    }
    private boolean isTableSampling;
 * distributed under the License is distributed on an "AS IS" BASIS,
                i = Integer.parseInt((String) value);
        indexStat = JSONUtils.getString(config, "index_stat"); //$NON-NLS-1$
        }
    @Override
    @Override
package org.jkiss.dbeaver.ext.db2.tasks;
 * you may not use this file except in compliance with the License.
    public void setSamplePercent(int samplePercent) {
        @Override
        config.put("column_stat", columnStat); //$NON-NLS-1$
        if (columnStat == null) {
        public boolean isValidValue(@NotNull DB2RunstatsToolSettings object, @Nullable Object value) throws IllegalArgumentException {

    public void setIndexStat(String storageOption) {

    }

public class DB2RunstatsToolSettings extends SQLToolExecuteSettings<DB2TableBase> {
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        config.put("sample_percent", samplePercent); //$NON-NLS-1$
 *
    public boolean isTableSampling() {
import static org.jkiss.dbeaver.ext.db2.tasks.DB2RunstatsOptions.*;
    private final static String[] columnStats = new String[] {colsAll.getDesc(), colsAllAndDistribution.getDesc(), colsNo.getDesc()};
    public void setTableSampling(boolean tableSampling) {
    }
            }
        @Override
            int i = -1;
    }
 * limitations under the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getIndexStat() {
        @Override
 *
        @Override

import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
    private int samplePercent;
    }

    private final static String[] indexStats = new String[] {indexesDetailed.getDesc(), indexesAll.getDesc(), indexesNo.getDesc()};
        @Nullable

    public void saveConfiguration(Map<String, Object> config) {
 * See the License for the specific language governing permissions and
    }

            indexStat = DB2RunstatsOptions.getOption(indexStats[0]).getDesc();
        public boolean allowCustomValue() {

        public boolean allowCustomValue() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 *
        public Object[] getPossibleValues(DB2RunstatsToolSettings object) {
    public int getSamplePercent() {
        this.columnStat = columnStat;

        }
            return indexStats;
            return false;
import org.jkiss.code.Nullable;
            if (value instanceof String) {
    public static class CheckStorageOptionListProvider implements IPropertyValueListProvider<DB2RunstatsToolSettings> {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
 * You may obtain a copy of the License at
        return isTableSampling;
            return columnStats;
    }



        config.put("index_stat", indexStat); //$NON-NLS-1$
        super.loadConfiguration(runnableContext, config, project);
        }
        columnStat = JSONUtils.getString(config, "column_stat"); //$NON-NLS-1$
    @Property(viewable = true, editable = true, updatable = true, order = 2, listProvider = DB2RunstatsToolSettings.CheckTriggersOptionListProvider.class)
            return false;
        }
        }
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        this.indexStat = storageOption;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

 */
import org.jkiss.code.NotNull;
        isTableSampling = tableSampling;
    public String getColumnStat() {
    private String columnStat;
    private String indexStat;
        isTableSampling = JSONUtils.getBoolean(config, "is_table_sampling"); //$NON-NLS-1$
    public static class CheckTriggersOptionListProvider implements IPropertyValueListProvider<DB2RunstatsToolSettings> {

        return indexStat;

    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
import java.util.Map;
    }

/*
    public static class DB2StatisticPercentLimiter implements IPropertyValueValidator<DB2RunstatsToolSettings, Object> {
        super.saveConfiguration(config);
import org.jkiss.dbeaver.model.meta.Property;
        if (indexStat == null) {

    @Property(viewable = true, editable = true, updatable = true, order = 1, listProvider = DB2RunstatsToolSettings.CheckStorageOptionListProvider.class)
    @Property(viewable = true, editable = true, updatable = true, order = 4, valueValidator = DB2StatisticPercentLimiter.class)

