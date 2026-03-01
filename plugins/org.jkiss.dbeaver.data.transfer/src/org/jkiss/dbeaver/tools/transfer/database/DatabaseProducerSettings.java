import org.jkiss.dbeaver.tools.transfer.IDataTransferSettings;
package org.jkiss.dbeaver.tools.transfer.database;
        boolean selectedRowsOnly = CommonUtils.toBoolean(settings.get("selectedRowsOnly"));
    private int segmentSize = DEFAULT_SEGMENT_SIZE;

/*
    @Override
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_checkbox_select_row_count, queryRowCount);


            summary,
 * Licensed under the Apache License, Version 2.0 (the "License");


            fetchedRowsPolicy = new FetchedRowsPolicy(selectedRowsOnly, selectedColumnsOnly);
    public void setOpenNewConnections(boolean openNewConnections) {
    }
        settings.put("queryRowCount", queryRowCount);
 * DatabaseProducerSettings

    }
        boolean selectedColumnsOnly = CommonUtils.toBoolean(settings.get("selectedColumnsOnly"));
    @NotNull

    }
    @Nullable
    }

        }
    }
    }

        this.openNewConnections = openNewConnections;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_checkbox_new_connection, openNewConnections);

    }
    public ExtractType getExtractType() {
        extractType = CommonUtils.valueOf(ExtractType.class, (String) settings.get("extractType"), extractType);
    private boolean queryRowCount = true;
 * You may obtain a copy of the License at
            fetchedRowsPolicy != null && fetchedRowsPolicy.selectedColumnsOnly()

        return summary.toString();
    public int getFetchSize() {
    public record FetchedRowsPolicy(boolean selectedRowsOnly, boolean selectedColumnsOnly) {}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isQueryRowCount() {

    private static final int DEFAULT_FETCH_SIZE = 10000;
        this.fetchedRowsPolicy = fetchedRowsPolicy;
        settings.put("selectedColumnsOnly", fetchedRowsPolicy != null && fetchedRowsPolicy.selectedColumnsOnly());
import org.jkiss.code.NotNull;
 *
 *
    }
            fetchedRowsPolicy != null && fetchedRowsPolicy.selectedRowsOnly()
        );
            fetchedRowsPolicy = null;

    public void setFetchedRowsPolicy(@Nullable FetchedRowsPolicy fetchedRowsPolicy) {
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_extract_type, extractType.name());
        return queryRowCount;

    private boolean openNewConnections = true;
}
        }
    public void setQueryRowCount(boolean queryRowCount) {
    }
public class DatabaseProducerSettings implements IDataTransferSettings {
        return fetchSize;
        } else {
        segmentSize = CommonUtils.toInt(settings.get("segmentSize"), DEFAULT_SEGMENT_SIZE);

        this.fetchSize = fetchSize;
 */
            this.segmentSize = segmentSize;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
     * Get fetched rows policy.
        this.queryRowCount = queryRowCount;
     * If {@code null}, then all rows should are extracted. Otherwise,
        return openNewConnections;
import java.util.Map;
        if (fetchedRowsOnly || selectedRowsOnly || selectedColumnsOnly) {
        queryRowCount = CommonUtils.toBoolean(settings.get("queryRowCount"));
     * only fetched rows those are selected according to the policy are extracted.
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_checkbox_fetched_rows_only, fetchedRowsPolicy != null);
    public void setFetchSize(int fetchSize) {
            DTMessages.data_transfer_wizard_output_checkbox_selected_rows_only,
        openNewConnections = CommonUtils.toBoolean(settings.get("openNewConnections"));

    private int fetchSize = DEFAULT_FETCH_SIZE;
    public int getSegmentSize() {
    public DatabaseProducerSettings() {
    }

    public boolean isOpenNewConnections() {
        StringBuilder summary = new StringBuilder();
        SINGLE_QUERY,
        );
    }


import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
        DTUtils.addSummary(
/**
 */
    @Override
    public void loadSettings(DBRRunnableContext runnableContext, DataTransferSettings dataTransferSettings, Map<String, Object> settings) {
import org.jkiss.dbeaver.tools.transfer.DTUtils;
    @Override
        this.extractType = extractType;
        SEGMENTS
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        settings.put("fetchSize", fetchSize);
        settings.put("fetchedRowsOnly", fetchedRowsPolicy != null);

 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
            summary,
        if (segmentSize > 0) {
import org.jkiss.utils.CommonUtils;
    }
        return segmentSize;
    private static final int DEFAULT_SEGMENT_SIZE = 100000;
        settings.put("extractType", extractType.name());
    public void setSegmentSize(int segmentSize) {
        settings.put("openNewConnections", openNewConnections);
    /**
        DTUtils.addSummary(

        boolean fetchedRowsOnly = CommonUtils.toBoolean(settings.get("fetchedRowsOnly"));
     * <p>
    }
 *
    public enum ExtractType {
 * you may not use this file except in compliance with the License.
    public void saveSettings(Map<String, Object> settings) {
    private FetchedRowsPolicy fetchedRowsPolicy;
        settings.put("selectedRowsOnly", fetchedRowsPolicy != null && fetchedRowsPolicy.selectedRowsOnly());
    }
        return extractType;


     */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
 * limitations under the License.
    public void setExtractType(@NotNull ExtractType extractType) {
    private ExtractType extractType = ExtractType.SINGLE_QUERY;
    }


    }
        fetchSize = CommonUtils.toInt(settings.get("fetchSize"), fetchSize);
    public FetchedRowsPolicy getFetchedRowsPolicy() {
    public String getSettingsSummary() {
        return fetchedRowsPolicy;

            DTMessages.data_transfer_wizard_output_checkbox_selected_columns_only,

        settings.put("segmentSize", segmentSize);

