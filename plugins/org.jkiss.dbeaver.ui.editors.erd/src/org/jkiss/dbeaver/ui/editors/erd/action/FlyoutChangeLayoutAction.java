import org.eclipse.jface.action.Action;

	public FlyoutChangeLayoutAction(IEditorPart editor)

 * You may obtain a copy of the License at
		}

			EntityDiagram entityDiagram = schemaEditor.getDiagram();
	/**
			EntityDiagram entityDiagram = erdEditor.getDiagram();

} * @author Serge Rider
 * See the License for the specific language governing permissions and
			boolean checkTrue = entityDiagram.isLayoutManualDesired();
	{
 */
			firePropertyChange(CHECKED, Boolean.TRUE, Boolean.FALSE);
		boolean localChecked = isChecked(editor);
 * Action to toggle the layout between manual and automatic
		//there appears to be a bug in the framework which necessitates this
		{
	@Override
		{
		super("Automatic Layout", Action.AS_CHECK_BOX);
	private boolean checked;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
		this.editor = editor;
		else
/*
 * DBeaver - Universal Database Manager
			return isChecked(editor);
	{
 *
            erdEditor.getDiagramPart().changeLayout();
/**
 * Created on Jul 23, 2004
public class FlyoutChangeLayoutAction extends Action
		if (editor instanceof ERDEditorPart)

			return false;
	}
			return super.isChecked();
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IEditorPart;
	private IEditorPart editor;
		{
 */
 *
	 * @see org.eclipse.jface.action.IAction#isChecked()
 *
		this.editor = editor;
	public boolean isChecked(IEditorPart editor)
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
 * Copyright (C) 2010-2025 DBeaver Corp and others
		if (editor != null)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			boolean isManual = entityDiagram.isLayoutManualDesired();
			ERDEditorPart erdEditor = (ERDEditorPart) editor;
			ERDEditorPart schemaEditor = (ERDEditorPart) editor;
		}
/*
	}
	{
 * 
	}

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
	@Override
{
	}
			return (!checkTrue);
			setChecked(checked);
 * Licensed under the Apache License, Version 2.0 (the "License");
		if (localChecked)
		else
			entityDiagram.setLayoutManualDesired(!isManual);

	 */

			checked = !isManual;
	{
		if (editor instanceof ERDEditorPart)

			firePropertyChange(CHECKED, Boolean.FALSE, Boolean.TRUE);


		

	}
    public boolean isChecked()
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.erd.action;
		else
	{
 * you may not use this file except in compliance with the License.
		}
    public void run()
 */
	public void setActiveEditor(IEditorPart editor)
