 * Licensed under the Apache License, Version 2.0 (the "License");
		super(ERDUIMessages.erd_editor_control_action_refresh_diagram, DBeaverIcons.getImageDescriptor(UIIcon.REFRESH));
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * Created on Jul 23, 2004
    public void run()
	}
package org.jkiss.dbeaver.ui.editors.erd.action;
import org.eclipse.jface.action.Action;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
 */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 *
 * Unless required by applicable law or agreed to in writing, software

		this.editor = editor;
 *
	{

 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 */
 * you may not use this file except in compliance with the License.

	public DiagramRefreshAction(ERDEditorPart editor)
public class DiagramRefreshAction extends Action
{
	@Override
/*
 *
} */
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
        //editor.get
	{
 * Action to toggle the layout between manual and automatic
 * You may obtain a copy of the License at
 * @author Serge Rider
        editor.refreshDiagram(true, true);
	private ERDEditorPart editor;
	}
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIIcon;
 * limitations under the License.
