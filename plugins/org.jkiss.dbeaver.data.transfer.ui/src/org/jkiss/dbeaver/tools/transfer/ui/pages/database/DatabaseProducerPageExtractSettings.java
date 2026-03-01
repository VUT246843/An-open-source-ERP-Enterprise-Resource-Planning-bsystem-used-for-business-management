import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings;
                .enabled(UIObservables.and(enabled, canExportSelection))


            getWizard().createVariablesEditButton(buttonsPanel);
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
    }
            .row(buildAdvancedRow(useFetchedData));
                    .tooltip(DTUIMessages.database_producer_page_extract_settings_new_connection_checkbox_tooltip)
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
            case SINGLE_QUERY -> DTMessages.data_transfer_wizard_output_combo_extract_type_item_single_query;
                .enabled(enabled)

        Composite composite = UIUtils.createComposite(parent, 1);
                .radioButton("Query the database", bb -> bb.selected(queryDatabase))
    private Consumer<UIRowBuilder> buildAdvancedRow(@NotNull UIObservable<Boolean> queryDatabase) {
            .row(rb -> rb
                .checkBox(DTMessages.data_transfer_wizard_output_checkbox_new_connection, bb -> bb
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings.FetchedRowsPolicy;
        }
        var canExportFetchedOnly = canExportFetchedRows();

    private final UIObservable<Strategy> strategy = UIObservable.of(Strategy.QUERY_DATABASE);
        var settings = getWizard().getPageSettings(this, DatabaseProducerSettings.class);
                .enabled(UIObservables.and(enabled, canExportSelection))
                .panel(buildQueryDatabasePanel(queryDatabase))
            }
    public void createControl(@NotNull Composite parent) {
            .row(buildAdvancedRow(queryDatabase));
        settings.setQueryRowCount(fetchRowCount.get());
        super(DTUIMessages.database_producer_page_extract_settings_name_and_title);

            .row(DTMessages.data_transfer_wizard_output_label_max_threads, rb -> rb
    }
                return false;
    }
            .row(rb -> rb.panel(buildQueryDatabasePanel(useFetchedData)))

            ));
    @Override

            .row(DTUIMessages.database_producer_page_extract_settings_text_fetch_size_label, rb -> rb
            }
        setDescription(DTUIMessages.database_producer_page_extract_settings_description);
}            .row(DTMessages.data_transfer_wizard_output_label_extract_type, rb -> rb
            if (container instanceof DBSDocumentContainer) {
        }
import java.util.function.Consumer;

import org.jkiss.dbeaver.model.struct.DBSDocumentContainer;
    }
    private final UIObservable<Boolean> fetchRowCount = UIObservable.of(false);
    private final UIObservable<Integer> fetchSize = UIObservable.of(10000);
    }
                .align(UIAlignX.FILL).grow()
        return pb -> pb
    public void activatePage() {
    private final UIObservable<Boolean> openNewConnections = UIObservable.of(false);
    private Consumer<UIPanelBuilder> buildQueryDatabaseOrUseFetchedRowsPanel() {
import org.jkiss.dbeaver.model.struct.DBSObject;

        extractType.set(settings.getExtractType());

        } else {
        };
        // Query database
import org.jkiss.dbeaver.ui.forms.*;
        strategy.set(useFetchedRows != null ? Strategy.USE_FETCHED_ROWS : Strategy.QUERY_DATABASE);
        fetchSize.set(settings.getFetchSize());
    public void deactivatePage() {
            return buildQueryDatabaseOrUseFetchedRowsPanel();
    private final UIObservable<Boolean> selectedColumnsOnly = UIObservable.of(false);

            .row(rb -> rb
        // Advanced
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
            .row(rb -> rb
                return false;


                return false;
        var settings = getWizard().getPageSettings(this, DatabaseProducerSettings.class);
        if (getWizard().getCurrentTask() != null) {
            .expandableGroup("Advanced", false, pb -> pb
    }
                    .selected(fetchRowCount)));
        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    private Consumer<UIPanelBuilder> buildQueryDatabaseOnlyPanel() {
            if (!(object instanceof DBSDataContainer container)) {
            }
        settings.setExtractType(extractType.get());
    private Consumer<UIPanelBuilder> buildAdvancedPanel(@NotNull UIObservable<Boolean> queryDatabase) {
    @NotNull

        segmentSize.set(settings.getSegmentSize());
    @NotNull
        var useFetchedRows = settings.getFetchedRowsPolicy();
        getWizard().loadNodeSettings();
                .intTextField(segmentSize));
    @NotNull
    }
        var canChangeSegment = UIObservable.predicate(() -> extractType.get() == ExtractType.SEGMENTS);
        // Fetched rows
        return isProducerOfType(DatabaseTransferProducer.class);
                .group("Extraction", buildExtractionPanel())));
            .margins(0, 0)

            .row(rb -> rb
        // Query database
                .enabled(enabled)
    }

        List<DBSObject> objects = getWizard().getSettings().getSourceObjects();
    }
                    .tooltip(DTUIMessages.database_producer_page_extract_settings_text_fetch_size_tooltip)))
        return pb -> pb
            settings.setFetchedRowsPolicy(null);
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings.ExtractType;

        var useFetchedData = UIObservable.of(true);
        return switch (type) {
        for (DBSObject object : getWizard().getSettings().getSourceObjects()) {
    private final UIObservable<ExtractType> extractType = UIObservable.of(ExtractType.SINGLE_QUERY);
        fetchRowCount.set(settings.isQueryRowCount());
            DBSDataContainer container = GeneralUtils.adapt(object, DBSDataContainer.class);
                .enabled(queryDatabase)
import org.jkiss.dbeaver.utils.GeneralUtils;
                .comboBox(extractType, DatabaseProducerPageExtractSettings::getExtractTypeLabel))
        for (DBSObject object : objects) {
            }
    @NotNull

 */
        var useFetchedData = UIObservables.equals(strategy, Strategy.USE_FETCHED_ROWS);


    private Consumer<UIPanelBuilder> buildExtractionPanel() {
        setTitle(DTUIMessages.database_producer_page_extract_settings_name_and_title);
        if (canExportFetchedOnly) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private boolean canExportColumns() {
 * you may not use this file except in compliance with the License.
            .row(rb -> rb
        USE_FETCHED_ROWS
                .enabled(UIObservables.and(queryDatabase, canChangeThreads))
import org.jkiss.dbeaver.model.data.DBDCellValue;
        return pb -> pb
 *
                    .selected(openNewConnections)))
                .panel(buildUseFetchedRowsPanel(useFetchedData)))

 * Unless required by applicable law or agreed to in writing, software

    }
                .checkBox("Selected rows only", bb -> bb.selected(selectedRowsOnly)))
            settings.setFetchedRowsPolicy(new FetchedRowsPolicy(
    private final UIObservable<Integer> segmentSize = UIObservable.of(10000);
import java.util.List;
            .row(DTMessages.data_transfer_wizard_output_label_segment_size, rb -> rb
        QUERY_DATABASE,
        return true;
        selectedRowsOnly.set(useFetchedRows != null && useFetchedRows.selectedRowsOnly());
    public DatabaseProducerPageExtractSettings() {
 *
                .intTextField(fetchSize, tb -> tb
                    .tooltip(DTUIMessages.database_producer_page_extract_settings_threads_num_text_tooltip)))
        initializeDialogUnits(parent);
            return buildQueryDatabaseOnlyPanel();

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        UIPanelBuilder.build(composite, pb -> pb
        settings.setSegmentSize(segmentSize.get());
/*
            Composite buttonsPanel = UIUtils.createComposite(composite, 1);

                .enabled(UIObservables.and(queryDatabase, canChangeSegment))
    }
        openNewConnections.set(settings.isOpenNewConnections());
        var queryDatabase = UIObservables.equals(strategy, Strategy.QUERY_DATABASE);
            if (container != null && container.getDataSource().getInfo().isDynamicMetadata()) {
    }
 * You may obtain a copy of the License at
                .checkBox("Selected columns only", bb -> bb.selected(selectedColumnsOnly)));


        threadCount.set(getWizard().getSettings().getMaxJobCount());
                .intTextField(threadCount, tb -> tb
    private Consumer<UIPanelBuilder> buildUseFetchedRowsPanel(@NotNull UIObservable<Boolean> enabled) {
import org.jkiss.code.NotNull;
    @Override
 * limitations under the License.
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
                    .tooltip(DTUIMessages.database_producer_page_extract_settings_row_count_checkbox_tooltip)


                return false;
    @NotNull
        updatePageCompletion();
        return selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof DBDCellValue;
        // Fetched rows
        var canExportSelection = UIObservable.of(hasSelection() && canExportColumns());

        } else {
 *

    }

    // Advanced
        }
    private Consumer<UIPanelBuilder> buildQueryDatabasePanel(@NotNull UIObservable<Boolean> enabled) {
        var selection = getWizard().getCurrentSelection();
    @NotNull
            if (!container.isFeatureSupported(DBSDataContainer.FEATURE_DATA_READ_FETCHED)) {
            boolean canExportSelection = hasSelection() && canExportColumns();
        }
    private final UIObservable<Integer> threadCount = UIObservable.of(1);
 * See the License for the specific language governing permissions and
                canExportSelection && selectedColumnsOnly.get()
    // Fetched rows
        // Advanced

                .checkBox(DTMessages.data_transfer_wizard_output_checkbox_select_row_count, bb -> bb
        settings.setOpenNewConnections(openNewConnections.get());
        selectedColumnsOnly.set(useFetchedRows != null && useFetchedRows.selectedColumnsOnly());
import org.eclipse.swt.widgets.Composite;
                .enabled(queryDatabase)
    // Query database
    private boolean canExportFetchedRows() {
    }
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
                canExportSelection && selectedRowsOnly.get(),
            case SEGMENTS -> DTMessages.data_transfer_wizard_output_combo_extract_type_item_by_segments;
        setPageComplete(false);
        settings.setFetchSize(fetchSize.get());
 * Licensed under the Apache License, Version 2.0 (the "License");

        getWizard().getSettings().setMaxJobCount(threadCount.get());
        var canChangeThreads = UIObservable.predicate(() -> getWizard().getSettings().getDataPipes().size() > 2);
 * DBeaver - Universal Database Manager
    private enum Strategy {

        return pb -> pb
    private final UIObservable<Boolean> selectedRowsOnly = UIObservable.of(false);
    public boolean isPageApplicable() {
                .accept(buildAdvancedPanel(queryDatabase)));
        }
        return pb -> pb
    }
    private static String getExtractTypeLabel(@NotNull ExtractType type) {
        if (strategy.get() == Strategy.USE_FETCHED_ROWS && canExportFetchedRows()) {

                .radioButton("Use fetched rows", bb -> bb.selected(useFetchedData)))
            .row(rb -> rb
            .row(rb -> rb

    private boolean hasSelection() {
        return rb -> rb

public class DatabaseProducerPageExtractSettings extends DataTransferPageNodeSettings {


        setControl(composite);
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @NotNull
