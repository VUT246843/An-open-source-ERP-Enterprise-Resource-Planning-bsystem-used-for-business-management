 * Unless required by applicable law or agreed to in writing, software
        // Get a handle to the IFile...which can be a handle
                } catch (CoreException e) {
                }

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                try {
        // Get the file name.
            if (!file.exists()) {

                    return null;
            return new FileEditorInput(file);
public class SQLEditorInputFactory implements IElementFactory
    }
/*
 * SQL editor input factory.
 *     http://www.apache.org/licenses/LICENSE-2.0
                    log.error("Can't create new file", e);
        // Make sure that core is initialized
 * It is left for backward compatibility (for old DBeaver versions and SQL editors saved with this factory).
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.core.runtime.CoreException;
        if (file != null) {
        String fileName = memento.getString(TAG_PATH);
        IFile file = input.getFile();
package org.jkiss.dbeaver.ui.editors.sql;
    private static final String ID_FACTORY = SQLEditorInputFactory.class.getName(); //$NON-NLS-1$

    {
import org.eclipse.ui.IMemento;
    public static String getFactoryId()
        }
            return null;
 *
{
import org.eclipse.core.runtime.IAdaptable;
    {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 */
        // to a resource that does not exist in workspace

    }
import org.eclipse.core.resources.IFile;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.part.FileEditorInput;

import org.jkiss.dbeaver.runtime.DBWorkbench;
    public IAdaptable createElement(IMemento memento)
        if (fileName == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
import org.eclipse.ui.IElementFactory;
    public SQLEditorInputFactory()
    private static final String TAG_PATH = "path"; //$NON-NLS-1$
import org.jkiss.dbeaver.Log;
        }
/**
    static final Log log = Log.getLog(SQLEditorInputFactory.class);
 */
 * DBeaver - Universal Database Manager
        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(fileName));



            }

        memento.putString(TAG_PATH, file.getFullPath().toString());
 * TODO: remove it at some moment
        return ID_FACTORY;
 * See the License for the specific language governing permissions and
        DBWorkbench.getPlatform().getEditorsRegistry();
        return null;
 * You may obtain a copy of the License at


import org.eclipse.core.resources.ResourcesPlugin;
 *
    }
import java.io.ByteArrayInputStream;
}    {
    public static void saveState(IMemento memento, IFileEditorInput input)
 * limitations under the License.
                    file.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
 *
