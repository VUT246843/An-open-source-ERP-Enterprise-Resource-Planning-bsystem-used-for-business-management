 * limitations under the License.
        viewer = new ObjectListControl<>(parent, SWT.SHEET, new ListContentProvider()) {

            @NotNull
import java.util.List;
    }
            .toList();
        };
import java.util.Collection;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            UIUtils.asyncExec(() -> viewer.clearListData());
        if (updateJob != null) {
    }
 * DBeaver - Universal Database Manager
    }
    }
 * You may obtain a copy of the License at

            }
            viewer.getControl().setRedraw(true);

public class SSHTunnelView extends ViewPart {
    @Override

                return getClass().getName();
        }
import org.jkiss.dbeaver.model.app.DBPProject;
            if (viewer.getListData().isEmpty()) {
                return;
        });
/*
import org.jkiss.code.NotNull;
 */


import org.eclipse.swt.SWT;
                return Status.OK_STATUS;
        super.dispose();
            viewer.clearListData();

        viewer.getControl().addPaintListener(e -> {
package org.jkiss.dbeaver.ui.net.ssh;
        updateJob.schedule();
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.LoadingJob;
            return;

        final List<SSHSession> sessions = project.getDataSourceRegistry().getDataSources().stream()
        viewer.setFocus();
import org.jkiss.dbeaver.model.net.ssh.SSHSessionController;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                schedule(1000);
            }
        }
import org.eclipse.swt.widgets.Composite;
    private void refreshTunnels() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        updateJob = new AbstractJob("Refresh SSH tunnels") {
            @NotNull
            }
                UIUtils.drawMessageOverControl(viewer.getControl(), e, "No active SSH tunnels", 0);
import org.eclipse.core.runtime.IStatus;
    @Override
import org.jkiss.dbeaver.ui.navigator.itemlist.ObjectListControl;
import org.jkiss.dbeaver.ui.controls.ListContentProvider;

 * Unless required by applicable law or agreed to in writing, software
            .map(DBPDataSourceContainer::getActiveNetworkHandlers).flatMap(Stream::of)
 * you may not use this file except in compliance with the License.
    public void setFocus() {
            viewer.appendListData(sessions);
            .map(SSHSessionController::getSessions).flatMap(Stream::of)
 *
import java.util.stream.Stream;
                return null;
            updateJob = null;
    public void createPartControl(Composite parent) {
 *
            protected String getListConfigId(List<Class<?>> classList) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            .distinct()
            protected LoadingJob<Collection<SSHSession>> createLoadService(boolean forUpdate) {

        UIUtils.asyncExec(() -> {
            updateJob.cancel();
import org.jkiss.dbeaver.model.net.ssh.SSHSession;
        viewer.appendListData(List.of());
                refreshTunnels();
            .filter(handler -> handler instanceof SSHTunnelImpl)
    @Override
        final DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
            @Override
            .map(handler -> ((SSHTunnelImpl) handler).getController())
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        updateJob.setSystem(true);
import org.jkiss.dbeaver.ui.UIUtils;
        });
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
        if (project == null) {
 *
    private AbstractJob updateJob;
import java.util.Objects;
import org.jkiss.dbeaver.model.net.ssh.SSHTunnelImpl;
            if (viewer.getControl().isDisposed()) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and
            .filter(Objects::nonNull)
            }
            viewer.getControl().setRedraw(false);
    public void dispose() {
}
            }

import org.eclipse.ui.part.ViewPart;
        };
 * distributed under the License is distributed on an "AS IS" BASIS,

            @Override
        updateJob.setUser(false);
import org.eclipse.core.runtime.Status;
    private ObjectListControl<SSHSession> viewer;
