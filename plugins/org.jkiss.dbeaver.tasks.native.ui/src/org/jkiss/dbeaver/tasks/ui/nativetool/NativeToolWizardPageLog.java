
    {
            }
            if (oldDocument != null) {
    private MessageConsole console;
            // Dump command line
            super(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_log_reader, task));
            }
 */
import org.jkiss.dbeaver.Log;
            this.input = stream;
        }
                byte[] buffer = new byte[1000];
    public void startNullReader(InputStream stream)
        public void run()
        UIUtils.syncExec(() -> {
                            appendLog(buf.toString());
        Composite composite = new Composite(parent, SWT.BORDER);
        }
import org.eclipse.swt.layout.GridData;
 * you may not use this file except in compliance with the License.
            }
 * Unless required by applicable law or agreed to in writing, software
        private final InputStream input;
        @Override
            } finally {
        new NullReaderJob(stream).start();
    }
    public boolean isPageApplicable() {
    }
        }
import org.eclipse.jface.text.IDocument;
                        buf.append((char) b);
import org.eclipse.ui.console.MessageConsole;

                if (cmdString.length() > 0) cmdString.append(' ');
                }
    }
        {

        appendLog(line, false);
            appendLog(cmdString.toString());
            for (String cmd : command) {
            return;
    public NativeToolWizardPageLog(String task)
    public void createControl(Composite parent)

import org.jkiss.dbeaver.ui.UIUtils;
        }
        }
package org.jkiss.dbeaver.tasks.ui.nativetool;
        }
        writer.print(line);
            synchronized (NativeToolWizardPageLog.this) {

            AbstractNativeToolWizard<?,?,?> wizard = (AbstractNativeToolWizard) getWizard();
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        writer = new PrintStream(console.newMessageStream(), true, StandardCharsets.UTF_8);
        public void documentChanged(DocumentEvent event) {



        private final ProcessBuilder processBuilder;

    private class LogReaderJob extends Thread {
            try {

        return true;
            if (document != null) {
    public void clearLog()
        public void setDocument(IDocument document) {

        if (getShell().isDisposed()) {
    {
        public void run()

        return false;
import org.eclipse.swt.custom.StyledText;
        }
                        }
                        //int avail = input.available();
        }

        composite.setLayout(new FillLayout());
        @Override
            cmdString.append(lf);
import org.jkiss.dbeaver.tasks.nativetool.NativeToolUtils;
import org.eclipse.swt.SWT;
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                    int count = input.read(buffer);
                }
    {

            }
        @Override
                for (;;) {
            List<String> command = processBuilder.command();
        {
                        if (b == -1) {
import org.eclipse.jface.wizard.WizardPage;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            try {
    private TextConsoleViewer consoleViewer;
    private final String task;
 * Licensed under the Apache License, Version 2.0 (the "License");
        protected void createControl(Composite parent, int styles) {
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
                console.clearConsole();
        new LogReaderJob(processBuilder, stream).start();
        LogReaderJob(ProcessBuilder processBuilder, InputStream stream)
                appendLog(e.getMessage() + lf);
            super(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_log_reader, task));
import org.eclipse.ui.console.TextConsoleViewer;
    private static final Log log = Log.getLog(NativeToolWizardPageLog.class);

                // just skip
        public void documentAboutToBeChanged(DocumentEvent event) {


    public boolean isPageNavigable() {

            revealEndOfDocument();
 *
    @Override
                document.addDocumentListener(this);
import org.jkiss.dbeaver.utils.GeneralUtils;
            } catch (IOException e) {

 * distributed under the License is distributed on an "AS IS" BASIS,

    {
        {
    public void appendLog(final String line, final boolean error)
        setControl(composite);
                    for (; ; ) {

    }
    }
        LogConsoleViewer(Composite composite) {
    {
    {
        });
                        break;
                    cmd = "******";

import org.eclipse.jface.text.DocumentEvent;
import java.util.List;
        if (getShell().isDisposed()) {
    public void appendLog(final String line)

            appendLog(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_started_at, task, new Date()) + lf);
        setDescription(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_progress_log, task));
    }
import org.eclipse.swt.layout.FillLayout;
 * limitations under the License.
                            break;
            super(composite, NativeToolWizardPageLog.this.console);
        this.task = task;
                if (NativeToolUtils.isSecureString(wizard.getSettings(), cmd)) {
    public PrintStream getLogWriter() {
        protected NullReaderJob(InputStream stream)
            } catch (IOException e) {
                    StringBuilder buf = new StringBuilder();
        return writer;
        console.setWaterMarks(1024*1024*3, 1024*1024*4);
    }
        console = new MessageConsole("tool-log-console", null);
        private final InputStream input;
import java.io.*;
    private class LogConsoleViewer extends TextConsoleViewer implements IDocumentListener {
import java.nio.charset.StandardCharsets;
            return;
        @Override
            StyledText textWidget = getTextWidget();
                oldDocument.removeDocumentListener(this);
        @Override

                    }
import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
    private class NullReaderJob extends Thread {
    }

        setTitle(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_progress, task));
            IDocument oldDocument= getDocument();
    }
        }
                }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
import java.util.Date;

                // just skip
                    }
        @Override
 *
    @Override
    }

import org.eclipse.osgi.util.NLS;
            StringBuilder cmdString = new StringBuilder();
            super.createControl(parent, styles);
                            buf.setLength(0);

        }
            }
                cmdString.append(cmd);
                try (Reader reader = new InputStreamReader(input, GeneralUtils.getDefaultConsoleEncoding())) {
                appendLog(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_finished, task, new Date()) + lf);
    public void startLogReader(ProcessBuilder processBuilder, InputStream stream)
public class NativeToolWizardPageLog extends WizardPage implements IWizardPageNavigable {
 *
 * DBeaver - Universal Database Manager
/*
                        int b = reader.read();
}
 * See the License for the specific language governing permissions and

        {
                    if (count <= 0) {
            this.input = stream;
import org.eclipse.jface.text.IDocumentListener;
            super.setDocument(document);
            String lf = GeneralUtils.getDefaultLineSeparator();
    private PrintStream writer;




            this.processBuilder = processBuilder;

 * You may obtain a copy of the License at
        super(NLS.bind(TaskNativeUIMessages.tools_wizard_page_log_task_progress, task));
                        if (b == '\n') {
            textWidget.setWordWrap(true);
            }
        consoleViewer = new LogConsoleViewer(composite);
    @Override
                        }
