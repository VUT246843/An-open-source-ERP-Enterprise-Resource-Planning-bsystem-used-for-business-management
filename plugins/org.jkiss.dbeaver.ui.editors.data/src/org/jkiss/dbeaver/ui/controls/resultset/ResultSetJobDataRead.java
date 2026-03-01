
                maxRows += offset;
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
        }
            visualizer.completeLoading(null);
    }
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
        final DBSDataContainer dataContainer = executionSource.getDataContainer();
                    visualizer.completeLoading(null);
                if (cancelTimeout > 0 && System.currentTimeMillis() - cancelTimestamp > cancelTimeout) {
    public void setMaxRows(int maxRows)
        if (!getDataSourceContainer().isExtraMetadataReadEnabled()) {
 */
    }
            fetchFlags |= DBSDataContainer.FLAG_FETCH_SEGMENT;
        this.progressControl = progressControl;
        error = null;
        PumpVisualizer(ProgressLoaderVisualizer<Object> visualizer) {
    {
            DBExecUtils.tryExecuteRecover(monitor, session.getDataSource(), monitor1 -> {
            monitor = new LocalCacheProgressMonitor(monitor);
            if (loadService != null && loadService.isCanceled()) {

        {
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 * Unless required by applicable law or agreed to in writing, software
                        executionSource.getUseDataFilter(),
    private Throwable error;
    @Override
                    loadService.forceDataReadCancel(new DBCException("Cancel operation timed out"));
                    // Something went wrong but we don't want to block UI
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
 * See the License for the specific language governing permissions and
            if (!visualizer.isCompleted()) {

            super(UIUtils.getDisplay(), "RSV Pump Visualizer");
    public Object getFamily() {
        final DBDDataFilter dataFilter = executionSource.getUseDataFilter();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        }
            setSystem(true);

    }
/*
    }

        this.error = error;
        super(ResultSetMessages.controls_rs_pump_job_name + " [" + dataContainer + "]", executionSource, executionContext);
        if (refresh) {
import org.jkiss.dbeaver.model.exec.*;
import org.jkiss.code.NotNull;
            });
                }

        new PumpVisualizer(visualizer).schedule(PROGRESS_VISUALIZE_PERIOD * 2);
            fetchFlags |= DBSDataContainer.FLAG_REFRESH;

    private class PumpVisualizer extends UIJob {
                schedule(PROGRESS_VISUALIZE_PERIOD);
    }

                    statistics = dataContainer.readData(
        if (offset > 0 && getExecutionContext().getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING)) {

        this.refresh = refresh;


 *
            this.visualizer = visualizer;
            monitor.subTask("Read data from container");
                } catch (Throwable e) {
            }
    @NotNull
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private int maxRows;
 *
    public Object evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getServiceName() {
        return statistics;
                visualizer.visualizeLoading();
        monitor.beginTask("Read data", 1);
 * You may obtain a copy of the License at
                        0);
        } finally {
    public void setOffset(int offset)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            final ResultSetViewer controller = executionSource.getExecutionController();
        @NotNull Composite progressControl
        }

                long cancelTimeout = controller.getPreferenceStore().getLong(ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT);
        this.maxRows = maxRows;
    }
                        maxRows,
        private ProgressLoaderVisualizer<Object> visualizer;


        long finalFlags = fetchFlags;
    private DBCStatistics statistics;
            error = e;

                long cancelTimestamp = loadService.getCancelTimestamp();
    }
                    // Connection was canceled then lets just finish the pump job.
    void setError(Throwable error) {
    {

                        executionSource,



import org.eclipse.osgi.util.NLS;
            }
    DBCStatistics getStatistics()
import java.lang.reflect.InvocationTargetException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!controller.getDataReceiver().isDataReceivePaused()) {
        @NotNull ResultSetExecutionSource executionSource,
import org.jkiss.dbeaver.ui.UIUtils;

        if (offset > 0) {
import org.eclipse.core.runtime.IProgressMonitor;
    @Override
        try (DBCSession session = getExecutionContext().openSession(
    }
        return null;

                visualizer.resetStartTime();
    @Override
    private boolean refresh;
    private final Composite progressControl;
        return error;
                    return Status.OK_STATUS;
        long fetchFlags = DBSDataContainer.FLAG_READ_PSEUDO;
import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;
            monitor,
            ResultSetJobDataRead loadService = (ResultSetJobDataRead) visualizer.getLoadService();
            if (maxRows > 0) {
package org.jkiss.dbeaver.ui.controls.resultset;
    ) {
        }
    ResultSetJobDataRead(
        return "ResultSet data pump";
        } catch (Throwable e) {
            }
        monitor = visualizer.overwriteMonitor(monitor);

        final ProgressLoaderVisualizer<Object> visualizer = new ProgressLoaderVisualizer<>(this, progressControl);
        this.offset = offset;

import org.jkiss.dbeaver.model.data.DBDDataFilter;

import org.eclipse.ui.progress.UIJob;

        // It is not a real service so just return nothing
 * limitations under the License.
            return Status.OK_STATUS;
                    controller.removeDataPump(loadService);
        }
            NLS.bind(ResultSetMessages.controls_rs_pump_job_context_name, dataContainer.toString())))

        return executionSource.getExecutionController();
abstract class ResultSetJobDataRead extends ResultSetJobAbstract implements ILoadService<Object>, IQueryExecuteController {
                        session,
import org.eclipse.core.runtime.IStatus;

                        executionSource.getExecutionController().getDataReceiver(),
import org.eclipse.swt.widgets.Composite;
        return Status.OK_STATUS;
}
    private static final int PROGRESS_VISUALIZE_PERIOD = 100;
            monitor.done();
    }
                    throw new InvocationTargetException(e);
    }

                    // Job was canceled but didn't end.
        @NotNull DBCExecutionContext executionContext,
                    visualizer.visualizeLoading();
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 *
        }
                        offset,
            dataFilter != null && dataFilter.hasFilters() ? DBCExecutionPurpose.USER_FILTERED : DBCExecutionPurpose.USER,

import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    {
    @Override
        @NotNull DBSDataContainer dataContainer,
                }
            } else {
                        finalFlags,
import org.jkiss.dbeaver.ModelPreferences;
    private int offset;
            offset = 0;
                try {
    public void setRefresh(boolean refresh) {
    public Throwable getError() {
    }
        public IStatus runInUIThread(IProgressMonitor monitor) {
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {

