 * Unless required by applicable law or agreed to in writing, software
	@Override
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
	public void dispose() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
	@Override
	@Override
	}
 * limitations under the License.
/**
	public OpenQuickSearchAction() {
 */

 * You may obtain a copy of the License at
}
import org.eclipse.ui.IWorkbenchWindow;
	private IWorkbenchWindow fWindow;
		fWindow= null;
 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.viewers.ISelection;

	public void run(IAction action) {
 * you may not use this file except in compliance with the License.
	public void selectionChanged(IAction action, ISelection selection) {
	}

/*
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
		// do nothing since the action isn't selection dependent.
	}


 * distributed under the License is distributed on an "AS IS" BASIS,
		fWindow= window;

 * Opens quick search dialog
 *
import org.eclipse.jface.action.IAction;
import org.jkiss.dbeaver.ui.ActionUtils;
 */
package org.jkiss.dbeaver.ui.search;
	public void init(IWorkbenchWindow window) {

 * DBeaver - Universal Database Manager
 *
public class OpenQuickSearchAction implements IWorkbenchWindowActionDelegate {
	@Override
		ActionUtils.runCommand("org.eclipse.text.quicksearch.commands.quicksearchCommand", fWindow);


