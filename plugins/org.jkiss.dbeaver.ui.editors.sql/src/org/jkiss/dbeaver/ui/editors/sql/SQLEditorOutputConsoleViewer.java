            @Override

                textWidget.setFont(outputFont);
            }
    }
        menuMgr.addMenuListener(manager -> {
 * See the License for the specific language governing permissions and
            textWidget.setMenu(menuMgr.createContextMenu(textWidget));
    }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
import org.eclipse.jface.action.MenuManager;
        return getTextWidget();
    private MessageConsole console;
import java.io.OutputStream;
            } else {
    }
            if (textWidget != null && !textWidget.isDisposed()) {

import org.eclipse.ui.console.TextConsoleViewer;

                textWidget.setForeground(UIStyles.COLOR_WHITE);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
    public StyledText getText() {
    public PrintWriter getOutputWriter() {
            manager.add(new Separator());

    public void resetNewOutput() {
            }
    public void refreshStyles() {
                consoleOutputStream.write(buf, off, len);
            public void write(final byte[] buf, final int off, final int len) throws IOException {
 * You may obtain a copy of the License at

                consoleOutputStream.write(b);

                }
import java.io.PrintWriter;
    }
            if (outputFont != null) {
            @Override
    }
        return hasNewOutput;
                hasNewOutput = true;
 */

            }
            textWidget.addDisposeListener(e -> menuMgr.dispose());
    }
            public void close() throws IOException {
        this.console.setWaterMarks(1024*1024*10, 1024*1024*20);
    }
        });
import org.eclipse.swt.graphics.Font;
        OutputStream out = new OutputStream() {

import java.io.IOException;
        return writer;
            if (UIStyles.isDarkHighContrastTheme()) {
        }
    }
                textWidget.setBackground(UIStyles.getDefaultWidgetBackground());
 *
 * DBeaver - Universal Database Manager
        refreshStyles();
                @Override
        if (textWidget != null && !textWidget.isDisposed()) {
public class SQLEditorOutputConsoleViewer extends TextConsoleViewer {
 *     http://www.apache.org/licenses/LICENSE-2.0
            public void flush() throws IOException {
        return console;
    public void scrollToEnd() {

            }
                consoleOutputStream.flush();

import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.action.Separator;
        StyledText textWidget = getTextWidget();
        MenuManager menuMgr = new MenuManager();
        };
 * limitations under the License.
    }
            public void write(int b) throws IOException {
        OutputStream consoleOutputStream = console.newOutputStream();
            });
        return this.getControl().isDisposed();
import org.eclipse.ui.IWorkbenchPartSite;
    private PrintWriter writer;
        console.clearConsole();
        this.getControl().dispose();
    public void dispose() {

import org.eclipse.swt.custom.StyledText;
        this.console = console;
import org.eclipse.jface.action.Action;
            @Override

 * Unless required by applicable law or agreed to in writing, software
        if (textWidget != null && !textWidget.isDisposed()) {

        TextEditorUtils.enableHostEditorKeyBindingsSupport(site, this.getText());

        StyledText textWidget = getTextWidget();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;

    public void clearOutput() {
        this(site, parent, new MessageConsole("sql-output", null));
    }
/*
package org.jkiss.dbeaver.ui.editors.sql;
        Font outputFont = BaseThemeSettings.instance.monospaceFont;
    public boolean isDisposed() {
    }

                    clearOutput();
        this.getText().setMargins(5, 5, 5, 5);
 *
    }
    public boolean isVisible() {

                public void run() {
import org.jkiss.dbeaver.ui.BaseThemeSettings;
        return getControl().getVisible();
        menuMgr.setRemoveAllWhenShown(true);
                textWidget.setBackground(UIStyles.getDefaultTextBackground());
        setEditable(false);

        }
            manager.add(new Action(SQLEditorMessages.sql_editor_action_clear) {
            }
    @NotNull
    private void createContextMenu() {
        writer = new PrintWriter(out, true);
            @Override

}
    public SQLEditorOutputConsoleViewer(IWorkbenchPartSite site, Composite parent, int styles) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
import org.jkiss.dbeaver.ui.UIStyles;
        super(parent, console);
    }
 *
        hasNewOutput = false;
import org.eclipse.ui.console.MessageConsole;
        createContextMenu();
            StyledText textWidget = getTextWidget();
        revealEndOfDocument();
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean hasNewOutput;


    protected SQLEditorOutputConsoleViewer(IWorkbenchPartSite site, Composite parent, MessageConsole console) {

                textWidget.setForeground(UIStyles.getDefaultTextForeground());
    public MessageConsole getConsole() {
                consoleOutputStream.flush();
    public boolean isHasNewOutput() {
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
                StyledTextUtils.fillDefaultStyledTextContextMenu(manager, textWidget);
    }
 * you may not use this file except in compliance with the License.

            }
