    public SQLContentAssistant(SQLEditorBase editor) {
            if (showStyle == 1 && !(SQLEditorUtils.isSQLSyntaxParserApplied(editor.getEditorInput())
            super.verifyKey(event);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                SQLCompletionProcessor.setSimpleMode(false);
    public void setSorter(SQLCompletionSorterUI sorter) {
            ) && editor.getTextViewer() != null) {
        protected void showAssist(int showStyle) {
 *
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
        this.lastCompletionOffset = lastCompletionOffset;
    }
import org.eclipse.jface.text.contentassist.ContentAssistEvent;
    }
        @Override
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            ) {
                    restartRequested = true;

                    return;
        public void verifyKey(VerifyEvent event) {
 * Unless required by applicable law or agreed to in writing, software
        SQLCompletionProcessor.setLookupTemplates(true);
 * SQL Completion proposal
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
 * You may obtain a copy of the License at
        @Override
    public String showContextInformation() {
        if (lastCompletionOffset == -1 && restartRequested) {

        this.sorter = sorter;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
        super(); // Sync. Maybe we should make it async
            try {
        }
        enableColoredLabels(true);
 * limitations under the License.

 *
    }
                && editor.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION))
import org.eclipse.swt.events.VerifyEvent;
    protected AutoAssistListener createAutoAssistListener() {
    }
        if (this.sorter != null) {
                    hide();
                event.character == SWT.BS ||
    private int lastCompletionOffset = - 1;
            }
    private SQLCompletionSorterUI sorter;
            SQLCompletionProcessor.setSimpleMode(true);
}

            SQLCompletionProcessor.setLookupTemplates(false);
            } finally {
    }
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,


 * See the License for the specific language governing permissions and


import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            if (lastCompletionOffset >= 0 && (
/*
    }
                }
        }
    }
 */
                if ((pos - 1) < lastCompletionOffset) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final SQLEditorBase editor;
 *     http://www.apache.org/licenses/LICENSE-2.0
        } finally {

public class SQLContentAssistant extends ContentAssistant {
    private class SQLAutoAssistListener extends AutoAssistListener {
/**
            UIUtils.asyncExec(() -> showPossibleCompletions());
import org.eclipse.swt.SWT;
    @Override
        super.setSorter(sorter);

    private volatile boolean restartRequested = false;
import org.eclipse.jface.text.contentassist.ContentAssistant;
            return super.showPossibleCompletions();
            restartRequested = false;
 */

            }
    public void setLastCompletionOffset(int lastCompletionOffset) {
            this.sorter.refreshSettings();
        }
            }
        return new SQLAutoAssistListener();
        }
        try {

                super.showAssist(showStyle);
    public void assistSessionStarted(ContentAssistEvent event) {
        this.editor = editor;

import org.jkiss.dbeaver.ui.UIUtils;
 * you may not use this file except in compliance with the License.
    @Override
                return;
                (event.character == 0 && event.keyCode == SWT.ARROW_LEFT)
                int pos = editor.getTextViewer().getSelectedRange().x;

