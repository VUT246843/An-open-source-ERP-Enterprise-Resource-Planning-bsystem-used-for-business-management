
    {
        UIUtils.setHelp(group, IHelpContextIds.CTX_QUERY_MANAGER);
        {
    {
    {

    private static int viewId = 0;
import org.jkiss.code.NotNull;

            }
    }
        }
                } finally {
    }
        {
    public void dispose()
        terminateProcess();

        group.setLayout(new FillLayout());

        Composite group = UIUtils.createPlaceholder(parent, 1);
        }
        setPartName(processDescriptor.getName());
                    final InputStream execOut = process.getInputStream();
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.UIUtils;
        }

    {
            }

import java.io.BufferedReader;


 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRProcessController;
    }
        processLogText = new StyledText(group, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.READ_ONLY);
                    for (;;) {
        return processDescriptor;
    }
            processLogText.append(logLine);
            return Status.OK_STATUS;
    {
            } catch (Exception e) {
        if (processLogText != null && !processLogText.isDisposed()) {
    {
                    setPartName(processDescriptor.getName() + " (destroyed: " + processDescriptor.getExitValue() + ")"));
        @NotNull
    @Override
{
    @Override
                try {
import org.eclipse.swt.widgets.Composite;
                        final String line = reader.readLine();

        super.dispose();
            try {
        this.processDescriptor = processDescriptor;
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.shellProcess";
        });
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        if (line.isEmpty()) {
                    processDescriptor.terminate();
                if (process == null) {
        if (processDescriptor != null) {
        protected IStatus run(@NotNull DBRProgressMonitor monitor)

    {
            return;
    {
 *
 * limitations under the License.
        final String logLine = line + GeneralUtils.getDefaultLineSeparator();
import org.eclipse.core.runtime.IStatus;
                    );
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        new ProcessLogger().schedule();
                        writeProcessLog(line);
    public void setFocus()
                            break;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.eclipse.core.runtime.Status;
    private class ProcessLogger extends AbstractJob {
import org.jkiss.dbeaver.model.runtime.DBRProcessDescriptor;
        viewId++;
/*

public class ShellProcessView extends ViewPart implements DBRProcessController
            processLogText.setFocus();
                    return Status.OK_STATUS;
                        if (line == null) {
                        }
import java.io.InputStream;
    public synchronized static String getNextId()
        return String.valueOf(viewId);
        @Override
 *
                }
    @Override
            if (processDescriptor.isRunning()) {

    public void initProcess(DBRProcessDescriptor processDescriptor)
        }
 * You may obtain a copy of the License at
                return GeneralUtils.makeExceptionStatus(e);
                    final BufferedReader reader = new BufferedReader(
                processDescriptor.terminate();
import java.io.InputStreamReader;

    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.part.ViewPart;
            }
}
                return;
    }
                    }
import org.jkiss.dbeaver.ui.IHelpContextIds;
package org.jkiss.dbeaver.ui.views.process;

    public void terminateProcess()
                Process process = processDescriptor.getProcess();
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.swt.custom.StyledText;
        }
import org.eclipse.swt.layout.FillLayout;
                UIUtils.asyncExec(() ->
 *

                }


 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
 * you may not use this file except in compliance with the License.
    private DBRProcessDescriptor processDescriptor;

    private void writeProcessLog(final String line)
                        new InputStreamReader(execOut, GeneralUtils.getDefaultConsoleEncoding())
        ProcessLogger()
    }
    public DBRProcessDescriptor getProcessDescriptor()

        UIUtils.asyncExec(() -> {
    }
            if (processLogText == null || processLogText.isDisposed()) {
 * DBeaver - Universal Database Manager
    public void createPartControl(Composite parent)
    }
    private StyledText processLogText;
            super(processDescriptor.getName());
