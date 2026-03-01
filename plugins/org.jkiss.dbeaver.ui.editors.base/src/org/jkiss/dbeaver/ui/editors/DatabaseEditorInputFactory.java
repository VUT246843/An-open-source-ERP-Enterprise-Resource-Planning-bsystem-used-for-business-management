 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 *
    static final String TAG_ACTIVE_FOLDER = "folder"; //$NON-NLS-1$
 *
    public DatabaseEditorInputFactory()
        return new DatabaseLazyEditorInput(memento);

 * Copyright (C) 2010-2025 DBeaver Corp and others
public class DatabaseEditorInputFactory implements IElementFactory
package org.jkiss.dbeaver.ui.editors;
    @Override
    static final String TAG_ACTIVE_PAGE = "page"; //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IMemento;

import org.eclipse.core.runtime.IAdaptable;
    static final String TAG_PROJECT = "project"; //$NON-NLS-1$
 *

    private static volatile boolean lookupEditor;
    public IAdaptable createElement(IMemento memento) {
    static final String TAG_NODE_NAME = "node-name"; //$NON-NLS-1$

    public static void setLookupEditor(boolean lookupEditor) {
    }
        DatabaseEditorInputFactory.lookupEditor = lookupEditor;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public static final String ID_FACTORY = DatabaseEditorInputFactory.class.getName(); //$NON-NLS-1$
 * See the License for the specific language governing permissions and
    {
    static final String TAG_NODE = "node"; //$NON-NLS-1$
}    static final String TAG_DATA_SOURCE = "data-source"; //$NON-NLS-1$

 * limitations under the License.

/*
    static final String TAG_CLASS = "class"; //$NON-NLS-1$
 */

    static final String TAG_CONNECTION_COLOR = "connection-color"; //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
{
import org.eclipse.ui.IElementFactory;
 * DBeaver - Universal Database Manager
