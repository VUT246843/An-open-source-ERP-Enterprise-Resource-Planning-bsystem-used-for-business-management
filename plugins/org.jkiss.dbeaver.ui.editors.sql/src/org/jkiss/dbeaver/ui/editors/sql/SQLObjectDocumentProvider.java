                            });
 * you may not use this file except in compliance with the License.

    protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
                        sourceText = "/* ERROR WHILE READING SOURCE:\n\n" + e.getMessage() + "\n*/";
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                                sourceText = loadSourceText(monitor);
    private boolean sourceLoaded;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            DBExecUtils.tryExecuteRecover(monitor, dataSource, param -> {
        DBSObject databaseObject = getProviderObject();
    protected IAnnotationModel createAnnotationModel(Object element) throws CoreException {
        sourceLoaded = true;
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        } finally {
                    }
        // Set text
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
public abstract class SQLObjectDocumentProvider extends BaseTextDocumentProvider {
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                @Override
        pm.beginTask("Save nested editor", 1);
    }
            DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(databaseObject);
            IResource resource = node == null || !(node.getOwnerProject() instanceof RCPProject rcpProject) ? null : rcpProject.getEclipseProject();
        document.set(sourceText);
                            sourceText = loadSourceText(monitor);
                        if (dataSource != null) {

    }
        }
    }
    }
        DBRProgressMonitor pm = RuntimeUtils.makeMonitor(monitor);
    @Override
        return document;
                @Override
import org.eclipse.core.runtime.IProgressMonitor;

        }
    @Override
        return false;
 * limitations under the License.
            }
    public boolean isModifiable(Object element) {
                sourceText = SQLUtils.generateCommentLine(editor.getDataSource(), "Loading '" + editor.getEditorInput().getName() + "' source...");
        this.editor = editor;
        if (sourceText == null) {
                        monitor.done();
        final Document document = new Document();
        return null;
import org.eclipse.jface.text.source.IAnnotationModel;
                {
            }

    }
                    super.done(event);
            });
    protected abstract String loadSourceText(DBRProgressMonitor monitor) throws DBException;
    public boolean isReadOnly(Object element) {
                        SQLEditorBase.log.error(e);
import org.jkiss.dbeaver.model.rcp.RCPProject;
            AbstractJob job = new AbstractJob("Load SQL source") {

                                if (sourceText == null) {
            saveSourceText(pm, document.get());
        } catch (DBException e) {

    protected DBSObject getProviderObject() {
                return new DatabaseMarkerAnnotationModel(databaseObject, node, resource);
 *
import org.jkiss.dbeaver.ui.UIUtils;
                                    sourceText = SQLUtils.generateCommentLine(dataSource, "Empty source");
    public boolean isSourceLoaded() {
 */
            DBPDataSource dataSource = editor.getDataSource();
            job.addJobChangeListener(new JobChangeAdapter() {
                        editor.reloadSyntaxRules();
        if (databaseObject != null) {

import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.utils.RuntimeUtils;
            sourceText = ((StringEditorInput) element).getBuffer().toString();
        if (element instanceof StringEditorInput) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.ui.editors.text.BaseTextDocumentProvider;
            pm.done();
                }
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    public void setSourceText(String sourceText) {
                    try {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
package org.jkiss.dbeaver.ui.editors.sql;
        }
import org.eclipse.core.resources.IResource;

                }

        this.sourceText = sourceText;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    @Override
                public void done(IJobChangeEvent event) {
            if (resource != null) {
        }
    public SQLObjectDocumentProvider(SQLEditorBase editor) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
                    } finally {
    }
import org.eclipse.jface.text.IDocument;

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final SQLEditorBase editor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
/*
                document.set(sourceText);
import org.eclipse.core.runtime.CoreException;
                    });
        return super.createAnnotationModel(element);
                    monitor.beginTask(getName(), 1);
        return sourceLoaded;
}
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.text.Document;

            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
            };
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager
    private String sourceText;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.Status;
        try {
    protected abstract void saveSourceText(DBRProgressMonitor monitor, String text) throws DBException;
                        } else {
                        editor.setInput(editor.getEditorInput());
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
                    setUser(true);
                    } catch (Exception e) {
    protected IDocument createDocument(Object element) {
                        }

            if (dataSource != null) {
                        return Status.OK_STATUS;

        return !editor.isReadOnly();
import org.jkiss.dbeaver.utils.GeneralUtils;
            job.schedule();
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    }
                        return Status.CANCEL_STATUS;
                                }
                @NotNull
 *
import org.jkiss.dbeaver.ui.editors.text.DatabaseMarkerAnnotationModel;

                }
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

    }
