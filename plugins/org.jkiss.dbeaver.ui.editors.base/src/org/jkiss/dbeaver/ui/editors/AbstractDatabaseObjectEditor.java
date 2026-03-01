    {
    @Nullable
        return false;
        return getEditorInput().getCommandContext();
        return (OBJECT_TYPE) getEditorInput().getDatabaseObject();
    {
    {
 *
        getObjectCommander().removeCommand(command);
 * DBeaver - Universal Database Manager

    @Override
        DBECommandReflector<OBJECT_TYPE, ? extends DBECommand<OBJECT_TYPE>> reflector)
    }
    {
    /*
        return getEditorInput().getCommandContext().isDirty();
    }
    public boolean isActiveTask() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    @Override
    }
    }

import org.eclipse.ui.PartInitException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    public boolean isDirty()
        return getEditorInput().getExecutionContext();
    }
*/
    {
public abstract class AbstractDatabaseObjectEditor<OBJECT_TYPE extends DBSObject>
    public void recreateEditorControl() {

import org.jkiss.dbeaver.model.edit.DBECommandContext;
    public void doSave(IProgressMonitor monitor)
    {
    public void activatePart()
    @Nullable

    extends EditorPart implements IDatabaseEditor, IActiveWorkbenchPart
    @Override
    }
        // do nothing by default
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.Nullable;
    @Override
 * limitations under the License.

    @Override
    public void updateChangeCommand(DBECommand<OBJECT_TYPE> command,

}    }
        throws PartInitException
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
 */
        DBECommandReflector<OBJECT_TYPE, ? extends DBECommand<OBJECT_TYPE>> reflector)
/*
        super.setSite(site);

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }

        return false;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    public void init(IEditorSite site, IEditorInput input)
    }
    protected void addChangeCommand(DBECommand<OBJECT_TYPE> command)
        return (IDatabaseEditorInput)super.getEditorInput();
        firePropertyChange(PROP_DIRTY);

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IEditorSite;
    public DBCExecutionContext getExecutionContext() {

        DBECommand<OBJECT_TYPE> command,
package org.jkiss.dbeaver.ui.editors;
import org.eclipse.ui.IEditorInput;
    }

        super.setInput(input);
        // Not supported
    {
    }
 */
/**
        // do nothing by default
 * AbstractDatabaseObjectEditor
import org.eclipse.ui.part.EditorPart;
import org.jkiss.dbeaver.model.edit.DBECommand;
import org.eclipse.core.runtime.IProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void removeChangeCommand(DBECommand<OBJECT_TYPE> command)
        getObjectCommander().updateCommand(command, reflector);
 *
    }
import org.jkiss.dbeaver.ui.IActiveWorkbenchPart;

    private DBECommandContext getObjectCommander()
{
    @Override

    }
    public void deactivatePart() {
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        getObjectCommander().addCommand(command, reflector);
    @Override
    public OBJECT_TYPE getDatabaseObject() {

 * See the License for the specific language governing permissions and
    @Override
        this.objectManager.addCommand(command, null);
 * You may obtain a copy of the License at
    }
 *
    public IDatabaseEditorInput getEditorInput()
    public void addChangeCommand(
    @Override
    public boolean isSaveAsAllowed()
    {
    public void doSaveAs()

    {
    }
    {


    }
