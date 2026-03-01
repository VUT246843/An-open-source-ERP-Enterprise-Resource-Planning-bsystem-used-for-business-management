import org.eclipse.core.commands.AbstractHandler;
    }
        if (dataContainer.getDataSource() == null) {

                    settings.setOutputFolder(tempDir.toAbsolutePath().toString());
                    producerSettings.setExtractType(DatabaseProducerSettings.ExtractType.SINGLE_QUERY);
        List<ResultSetRow> rsSelectedRows = rsSelection.getSelectedRows();
            }
import java.text.SimpleDateFormat;
        ResultSetDataContainer dataContainer = new ResultSetDataContainer(resultSet, options);
        AbstractJob exportJob = new AbstractJob("Open Excel") {
                    settings.setOutputFilePattern(tempFile.getFileName().toString());
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public class OpenSpreadsheetHandler extends AbstractHandler

import org.jkiss.dbeaver.ui.UIUtils;
            DBWorkbench.getPlatformUI().showError("Open Excel", ModelMessages.error_not_connected_to_database);

    @Override
 *
                        settings,

import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
    {
                    producerSettings.setFetchedRowsPolicy(new DatabaseProducerSettings.FetchedRowsPolicy(true, true));


            return null;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
/*
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.ShellUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                try {
                    consumer.initTransfer(
                        exporter,
                        CommonUtils.escapeFileName(CommonUtils.truncateString(dataContainer.getName(), 32)) +
import org.eclipse.core.runtime.Status;
                    settings.setOutputEncodingBOM(false);
                    DBWorkbench.getPlatformUI().showError("Error opening in Excel", null, e);
                        new IDataTransferConsumer.TransferParameters(true, false),
        IResultSetSelection rsSelection = resultSet.getSelection();

{
                    Path tempDir = DBWorkbench.getPlatform().getTempFolder(monitor, "office-files");
import org.eclipse.core.runtime.IStatus;
}
                selectedRows.add(selectedRow.getRowNumber());
 *
            options.setSelectedColumns(rsSelection.getSelectedAttributes());
            {

                    producerSettings.setQueryRowCount(false);
            for (ResultSetRow selectedRow : rsSelectedRows) {
            List<Integer> selectedRows = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


                    DatabaseProducerSettings producerSettings = new DatabaseProducerSettings();
import java.util.ArrayList;
                    Map<String, Object> properties = DataExporterXLSX.getDefaultProperties();
 */
                } catch (Exception e) {
                            DBWorkbench.getPlatformUI().showError("Open XLSX", "Can't open XLSX file '" + tempFile.toAbsolutePath() + "'");
import org.jkiss.utils.CommonUtils;
                setSystem(false);
    	IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));
        if (resultSet == null) {
            }

                    producer.transferData(monitor, consumer, null, producerSettings, null);
                }
import org.jkiss.dbeaver.data.office.export.DataExporterXLSX;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        dataContainer,

import java.util.List;
            @NotNull
        };
    public Object execute(ExecutionEvent event)
        }

                        null);
            @Override


                    tempFile.toFile().deleteOnExit();
            options.setSelectedRows(selectedRows);
                    DBDDataFilter dataFilter = resultSet.getModel().getDataFilter();
            return null;
                    Path tempFile = tempDir.resolve(
                    StreamTransferConsumer consumer = new StreamTransferConsumer();

import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerMain;
 * you may not use this file except in compliance with the License.
            }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ui.controls.resultset.*;
                    });
                setUser(true);


import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.tools.transfer.stream.exporter.StreamExporterAbstract;
import java.util.Map;
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDDataFilter;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
                    UIUtils.asyncExec(() -> {
                        properties,
                    StreamExporterAbstract exporter = new DataExporterXLSX();
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings;
                    DatabaseTransferProducer producer = new DatabaseTransferProducer(dataContainer, dataFilter);
import java.nio.file.Path;
import org.eclipse.core.commands.ExecutionEvent;
                return Status.OK_STATUS;

package org.jkiss.dbeaver.data.office.ui.handlers;
                    StreamConsumerSettings settings = new StreamConsumerSettings();
 *     http://www.apache.org/licenses/LICENSE-2.0
                        }
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.eclipse.ui.handlers.HandlerUtil;
        return null;
        }
                        if (!ShellUtils.launchProgram(tempFile.toAbsolutePath().toString())) {
                    consumer.finishTransfer(monitor, false);
        exportJob.schedule();
                            "." + new SimpleDateFormat("yyyyMMdd-HHmmss").format(System.currentTimeMillis()) + ".xlsx");

@Deprecated
        if (rsSelectedRows.size() > 1) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
            DBWorkbench.getPlatformUI().showError("Open Excel", "No active results viewer");
