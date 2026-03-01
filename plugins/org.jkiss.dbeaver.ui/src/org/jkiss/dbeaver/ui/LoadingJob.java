        return showErrors;
        LoadFinisher(@NotNull RESULT innerResult, @Nullable Throwable innerError) {

        private final RESULT innerResult;
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
    public void setShowErrors(boolean showErrors) {
            monitor.done();

        if (this.loadingService instanceof AbstractLoadService<?> als) {
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        this.visualizer = visualizer;
    }
        public boolean belongsTo(Object family) {
    public static final Object LOADING_FAMILY = new Object();
                    log.debug(CommonUtils.getAllExceptionMessages(innerError));
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
    class LoadingUIJob<JOB_RESULT> extends AbstractUIJob {
package org.jkiss.dbeaver.ui;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    private class LoadFinisher implements Runnable {
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizerExt;
    @Override
                    DBWorkbench.getPlatformUI().showError(
            if (innerError != null && !(innerError instanceof DBInterruptedException)) {
        this.showErrors = showErrors;
        } catch (InterruptedException e) {
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        }
        setUser(false);
                visualizer.completeLoading(innerResult);
    }
    public boolean isShowErrors() {
            } catch (Throwable e) {

    }


        public void run() {
        }

        return visualizer;
    public void syncRun() {

            }
        Throwable error = null;
    }
                    );
    @Override

 *
    public ILoadVisualizer<RESULT> getVisualizer() {
            return family == LOADING_FAMILY;
    private boolean showErrors = true;
    }
public class LoadingJob<RESULT> extends AbstractJob {
        try {
            }
    @NotNull
    }



            super(loadingJob.getName());
            setSystem(true);
        LoadingUIJob<RESULT> updateUIJob = new LoadingUIJob<>(this);
        } catch (InvocationTargetException e) {
import org.jkiss.code.Nullable;
            result = this.loadingService.evaluate(monitor);

            //}
            }
import org.jkiss.dbeaver.runtime.DBInterruptedException;

            if (!visualizer.isCompleted() && !loadFinished) {
    }
            this.visualizer = loadingJob.getVisualizer();
            als.initService(monitor, this);
                if (showErrors) {
    }
import org.jkiss.utils.CommonUtils;


    private final ILoadService<RESULT> loadingService;
        @Override
 *
                visualizer.visualizeLoading();
        monitor = visualizer.overwriteMonitor(monitor);
        return loadingService.isForceCancel();
            UIUtils.asyncExec(new LoadFinisher(result, error));
        }
    private final ILoadVisualizer<RESULT> visualizer;
    @NotNull
                log.debug(e);
            this.innerError = innerError;
        run(new VoidProgressMonitor());
    ) {

/*
        @Override
            }
            super.canceling();
        @Override
            try {

        @NotNull ILoadVisualizer<RESULT> visualizer
        super(loadingService.getServiceName());
                }
        return loadingService;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return new LoadingJob<>(loadingService, visualizer);
        }


        } finally {
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public LoadingJob(@NotNull ILoadService<RESULT> loadingService, @NotNull ILoadVisualizer<RESULT> visualizer) {
import org.jkiss.dbeaver.Log;

    }
        return Status.OK_STATUS;

            return new Status(Status.CANCEL, UIActivator.PLUGIN_ID, "Loading interrupted");
                schedule(DELAY);

        monitor.beginTask(getName(), 1);
    private boolean loadFinished;

    }
    public boolean belongsTo(@NotNull Object family) {
                        null,
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
 * distributed under the License is distributed on an "AS IS" BASIS,
        RESULT result = null;
        private static final long DELAY = 100;

        @NotNull
        protected void canceling() {
        public IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
 * limitations under the License.
    public boolean isForceCancel() {
import org.jkiss.dbeaver.ui.internal.UIActivator;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IStatus;
    @Override
            this.innerResult = innerResult;
import org.jkiss.code.NotNull;
    private static final Log log = Log.getLog(LoadingJob.class);
    }
                        getName(),
import java.lang.reflect.InvocationTargetException;
        this.loadingService = loadingService;
            if (visualizer instanceof ILoadVisualizerExt lve) {

            error = e.getTargetException();
 * Unless required by applicable law or agreed to in writing, software
        updateUIJob.schedule();
        private final ILoadVisualizer<JOB_RESULT> visualizer;
    }

        private final Throwable innerError;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
                        innerError
        @NotNull ILoadService<RESULT> loadingService,
}            loadFinished = true;

        }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                lve.finalizeLoading();
                } else {
import org.eclipse.core.runtime.Status;
 */
            return Status.OK_STATUS;
    public ILoadService<RESULT> getLoadingService() {
        return family == loadingService.getFamily();
        LoadingUIJob(@NotNull LoadingJob<JOB_RESULT> loadingJob) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static <RESULT> LoadingJob<RESULT> createService(
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Override
