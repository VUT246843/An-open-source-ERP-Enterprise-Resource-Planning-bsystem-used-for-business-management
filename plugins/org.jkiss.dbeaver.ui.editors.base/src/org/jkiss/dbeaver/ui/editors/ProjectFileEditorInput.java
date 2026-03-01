 * limitations under the License.
/*
import org.eclipse.ui.IFileEditorInput;
public class ProjectFileEditorInput extends FileEditorInput implements IFileEditorInput, IPathEditorInput {
 * Unless required by applicable law or agreed to in writing, software


import org.eclipse.core.resources.IProject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IPathEditorInput;
    }
     */
import org.eclipse.ui.part.FileEditorInput;
import org.jkiss.dbeaver.model.DBIcon;

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
 */
import org.eclipse.jface.resource.ImageDescriptor;
        return super.getAdapter(adapter);
    }
 * You may obtain a copy of the License at
    public IProject getProject() {
 * Licensed under the Apache License, Version 2.0 (the "License");


    /**
        return getFile().getProject();

        if (getFile() == null || !getFile().exists()) {
 *
 * you may not use this file except in compliance with the License.
     * @param file the file resource
/**
        super(file);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return DBeaverIcons.getImageDescriptor(DBIcon.TYPE_UNKNOWN);
    public ProjectFileEditorInput(IFile file) {
}
    public <T> T getAdapter(Class<T> adapter) {
     * Creates an editor input based of the given file resource.
 */
    @Override
 * DBeaver - Universal Database Manager
    }
 * ProjectFileEditorInput
 *
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public ImageDescriptor getImageDescriptor() {

        }
     *
