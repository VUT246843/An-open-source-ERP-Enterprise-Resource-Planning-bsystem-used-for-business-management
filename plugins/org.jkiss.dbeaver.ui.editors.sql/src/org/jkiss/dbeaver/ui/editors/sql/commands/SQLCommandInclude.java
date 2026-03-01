            this.result.complete(result == SqlJobResult.SUCCESS ? SQLControlResult.success() : SQLControlResult.failure());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (isShouldCloseIncludedScript(hasErrors)) {
        if (CommonUtils.isEmpty(fileName)) {
 *
    private void verifyNoRecursiveInclusionIsPresent(


    @NotNull
        }
            CompletableFuture<SQLControlResult> result = getSqlControlResultCompletableFuture(
        if (!Files.exists(incFile)) {
 * you may not use this file except in compliance with the License.
    }
        private final SQLEditor editor;
        @NotNull Path includedFile,
    private void closeDuplicatedEditors(@NotNull Path includedScriptFile) throws PartInitException {
            this.result = result;


        @NotNull IEditorReference editorReference,
import org.jkiss.dbeaver.model.sql.eval.ScriptVariablesResolver;

        return result;
            @NotNull IWorkbenchWindow workbenchWindow,
            incFile = Path.of(fileName);
    }
        }
        }
        Path includedFile = identifyIncludedScriptFile(fileName, scriptContext);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        ) {
    @NotNull
    }
    private CompletableFuture<SQLControlResult> getSqlControlResultCompletableFuture(
        public void onEndScript(DBCStatistics statistics, boolean hasErrors) {
        IncludeScriptListener(
        public void onEndSqlJob(DBCSession session, SqlJobResult result) {
                result.complete(SQLControlResult.failure());
/**
                IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
        return sqlEditor;
                    workbenchWindow,
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (!Files.exists(incFile)) {
        CompletableFuture<SQLControlResult> result = new CompletableFuture<>();

        @Override
    ) {
        @NotNull Path includedScriptFile
    ) {
                throw new DBException("File '" + fileName + "' recursive inclusion");
import org.jkiss.dbeaver.model.DBUtils;

            }

 *

    ) throws DBException {
                editorInput
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

        IncludedScriptFileEditorInput input = new IncludedScriptFileEditorInput(fileStore, pathToFile);
                UIUtils.syncExec(() -> workbenchWindow.getActivePage().closeEditor(editor, false));
 *
import java.nio.file.Files;
        @NotNull SQLScriptContext scriptContext,
import org.jkiss.utils.CommonUtils;
    private static class IncludeScriptListener implements SQLQueryListener {
        public void onStartQuery(DBCSession session, SQLQuery query) {
            throw new DBException("Exception while included script execution", e.getCause());
        } catch (ExecutionException e) {
    ) throws DBException {
                    result.complete(SQLControlResult.failure());
            }
        @NotNull SQLScriptContext scriptContext
    @NotNull
                    result
            } catch (Throwable e) {
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
            if (sc.getSourceFile() != null && sc.getSourceFile().equals(includedFile)) {
            try {
import org.eclipse.core.filesystem.EFS;
                closeDuplicatedEditors(input.getIncludedScriptFile());
    private boolean isEditorForSameIncludedScript(
        @NotNull SQLScriptContext scriptContext,
import org.eclipse.core.filesystem.IFileStore;
        @Override
 */
                            UIUtils.syncExec(
import java.nio.file.Path;
        public void onEndQuery(DBCSession session, SQLQueryResult result, DBCStatistics statistics) {
                SQLEditor sqlEditor = getSqlEditor(scriptContext, input, workbenchWindow);
            this.editor = editor;

        UIUtils.syncExec(() -> {
import org.jkiss.dbeaver.model.exec.DBCSession;
    @NotNull
 * Control command handler
        verifyNoRecursiveInclusionIsPresent(scriptContext, includedFile, fileName);
        }
 * DBeaver - Universal Database Manager
        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
 */
import org.eclipse.ui.*;
        }
import org.jkiss.dbeaver.model.sql.*;

 * You may obtain a copy of the License at
            return !hasErrors && editor.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION);
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Path identifyIncludedScriptFile(
public class SQLCommandInclude implements SQLControlCommandHandler {


        @NotNull IWorkbenchWindow workbenchWindow
        for (SQLScriptContext sc = scriptContext; sc != null; sc = sc.getParentContext()) {
        }
        private final CompletableFuture<SQLControlResult> result;


import java.util.concurrent.ExecutionException;
                if (!execResult) {
                scriptContext,
        }
            }
            new SQLNavigatorContext(scriptContext, true),
        public void onStartScript() {
            return result.get();
            }
 * limitations under the License.
    public SQLControlResult handleCommand(
        return getSqlControlResult(



        }
    private SQLEditor getSqlEditor(
    }
            throw new DBException("Empty input file");
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
                for (IEditorReference editorReference : page.getEditorReferences()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        private boolean isShouldCloseIncludedScript(boolean hasErrors) {
            @NotNull CompletableFuture<SQLControlResult> result
        @NotNull String fileName,
        private final IWorkbenchWindow workbenchWindow;
        );
import org.jkiss.dbeaver.DBException;
        return editorReference.getEditorInput() instanceof IncludedScriptFileEditorInput includeInput
        @NotNull IncludedScriptFileEditorInput input
    }
        return input;
        String fileName = command.getParameter();
        @NotNull SQLScriptContext scriptContext,
        fileName = GeneralUtils.replaceVariables(fileName, new ScriptVariablesResolver(scriptContext), true).trim();
import org.jkiss.dbeaver.ui.editors.IncludedScriptFileEditorInput;
    private IncludedScriptFileEditorInput getInputForEditor(@NotNull Path pathToFile) {
    @NotNull
    }

        IncludedScriptFileEditorInput editorInput = getInputForEditor(includedScriptFile);
                    if (isEditorForSameIncludedScript(editorReference, includedScriptFile)) {
            );
        @Override
import org.jkiss.code.NotNull;
                );
    }
        @NotNull SQLScriptContext scriptContext,
import org.jkiss.dbeaver.model.exec.DBCStatistics;
            return SQLControlResult.failure();
            includedFile
import org.jkiss.dbeaver.utils.GeneralUtils;
        @NotNull Path includedScriptFile
                boolean execResult = sqlEditor.processSQL(false, true, null, scriptListener);
                    sqlEditor,
    ) throws DBException {
        return incFile;
package org.jkiss.dbeaver.ui.editors.sql.commands;
        }

import org.jkiss.dbeaver.ui.UIUtils;

 * Unless required by applicable law or agreed to in writing, software
                IncludeScriptListener scriptListener = new IncludeScriptListener(
                                () -> page.closeEditor(editorReference.getEditor(false), false));
            this.workbenchWindow = workbenchWindow;
        @Override
    private static final Log log = Log.getLog(SQLCommandInclude.class);
        fileName = DBUtils.getUnQuotedIdentifier(scriptContext.getExecutionContext().getDataSource(), fileName);
            throw new DBException("File '" + fileName + "' not found");
        );

        @Override
        @NotNull DBRProgressMonitor monitor,
        }
            @NotNull SQLEditor editor,
        }
        IFileStore fileStore = EFS.getLocalFileSystem().getStore(pathToFile.toUri());
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
        @NotNull String fileName
        @NotNull SQLScriptContext scriptContext
    ) throws PartInitException {
            input
            scriptContext,
import java.util.concurrent.CompletableFuture;
            && includeInput.getIncludedScriptFile().toAbsolutePath().toString().equals(includedScriptFile.toAbsolutePath().toString());
            for (IWorkbenchPage page : window.getPages()) {
                }
/*
    @NotNull
    private SQLControlResult getSqlControlResult(
                }

        @NotNull SQLControlCommand command,

            workbenchWindow,
        Path curFile = scriptContext.getSourceFile();
        try {
        sqlEditor.reloadSyntaxRules();
                    }

    ) throws DBException {
        Path incFile = curFile == null ? Path.of(fileName) : curFile.getParent().resolve(fileName);
        SQLEditor sqlEditor = SQLEditorHandlerOpenEditor.openNewSQLConsole(
        @NotNull IncludedScriptFileEditorInput input,
        } catch (InterruptedException e) {
        });
    }
    }
    }

                log.error(e);
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;

        }

import org.jkiss.dbeaver.Log;
