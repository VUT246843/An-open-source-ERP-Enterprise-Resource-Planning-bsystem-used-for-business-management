            new SQLNavigatorContext(),
            super.openResource(resource);
import org.jkiss.dbeaver.model.DBPImage;
    @Override
            }
            new StructuredSelection(folder));
        }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
    @Override
            return DBIcon.TREE_SCRIPT;
    }
             return super.getFeatures(resource) | FEATURE_CREATE_FILE;
    }
    {
    public int getFeatures(IResource resource)
                return DBIcon.TREE_SCRIPT_FOLDER;
 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and

            return "script folder"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;
 *
import org.jkiss.dbeaver.ui.editors.EditorUtils;
    @NotNull
import org.jkiss.dbeaver.model.fs.DBFFileStoreProvider;
        if (resource instanceof IFolder) {
    @NotNull
import org.jkiss.dbeaver.model.navigator.DBNResource;
            } else {
import org.eclipse.jface.viewers.StructuredSelection;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.eclipse.core.runtime.CoreException;
            DBPDataSourceContainer dataSource = EditorUtils.getFileDataSource((IFile) resource.getResource());

        if (resource instanceof IFolder) {
        } else {
    @Override
    @Override
    }

    public void openResource(@NotNull IResource resource) throws CoreException, DBException

 * You may obtain a copy of the License at
import org.eclipse.core.resources.IFolder;
        } else {
            input = new FileEditorInput((IFile) resource);
    public String getResourceDescription(@NotNull IResource resource)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else if (resource instanceof IFile) {
 *
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
        if (resource instanceof IFile) {
                return DBIcon.TREE_FOLDER;
        }
        if (resource.getResource() instanceof IFile) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        }

        }
    public String getTypeName(@NotNull IResource resource)

        } else {
import org.eclipse.ui.ide.FileStoreEditorInput;
            int matchFlags = IWorkbenchPage.MATCH_INPUT | IWorkbenchPage.MATCH_IGNORE_SIZE;
    @Override
        if (resource instanceof DBFFileStoreProvider) {
public class ScriptsHandlerImpl extends AbstractResourceHandler implements DBPResourceCreator {
    }
import org.eclipse.core.resources.IProject;
    public static final String RESOURCE_TYPE_ID_SQL_SCRIPT = "sql-script";
        IEditorInput input = null;
        return null;
import org.jkiss.dbeaver.ui.UIUtils;
    }
            return "script"; //$NON-NLS-1$
            UIUtils.getActiveWorkbenchWindow().getActivePage().openEditor(input, SQLEditor.class.getName(), true, matchFlags);
 * limitations under the License.
        return SQLEditorHandlerOpenEditor.openNewEditor(
import org.eclipse.ui.IWorkbenchPage;
/*
/**

 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.model.DBIcon;
        }
    @Nullable
 */
            input = new FileStoreEditorInput(((DBFFileStoreProvider) resource).getFileStore());
        return SQLEditorUtils.getResourceDescription(resource);
 * Scripts handler
    {
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;
    public DBPImage getResourceIcon(@NotNull IResource resource) {
        } else {
        if (input != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
    {
import org.jkiss.code.NotNull;
    {
    public IResource createResource(@NotNull IFolder folder) throws CoreException, DBException {
import org.eclipse.core.resources.IFile;
 *
        }
package org.jkiss.dbeaver.ui.editors.sql.scripts;
            if (resource.getParent() instanceof IProject) {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            return dataSource == null ? null : Collections.singletonList(dataSource);
import org.eclipse.ui.part.FileEditorInput;

    public List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource)
    @Override

    {
import org.jkiss.code.Nullable;
    @Nullable
import org.jkiss.dbeaver.model.app.DBPResourceCreator;
    @Override
import java.util.Collections;
