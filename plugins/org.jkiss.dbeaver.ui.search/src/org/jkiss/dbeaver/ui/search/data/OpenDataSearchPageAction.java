 * You may obtain a copy of the License at

import org.eclipse.ui.IWorkbenchWindowActionDelegate;

		// do nothing since the action isn't selection dependent.
	}

 * Unless required by applicable law or agreed to in writing, software



 * DBeaver - Universal Database Manager
		fWindow= null;
	}
	private IWorkbenchWindow fWindow;
import org.eclipse.search.ui.NewSearchUI;
 */
package org.jkiss.dbeaver.ui.search.data;
	public OpenDataSearchPageAction() {

	public void run(IAction action) {
import org.eclipse.ui.IWorkbenchWindow;
}
	}
 * limitations under the License.

	}
 * Copyright (C) 2010-2024 DBeaver Corp and others
	@Override
public class OpenDataSearchPageAction implements IWorkbenchWindowActionDelegate {
 * you may not use this file except in compliance with the License.
		fWindow= window;
/**
	@Override
 * Opens the data search dialog.
	public void selectionChanged(IAction action, ISelection selection) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	@Override
	}
		if (fWindow == null || fWindow.getActivePage() == null) {
	private static final String DATA_SEARCH_PAGE_ID = SearchDataPage.class.getName();
	public void init(IWorkbenchWindow window) {
import org.eclipse.jface.viewers.ISelection;
			return;
	public void dispose() {
import org.eclipse.jface.action.IAction;

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

		NewSearchUI.openSearchDialog(fWindow, DATA_SEARCH_PAGE_ID);
		}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
/*
 * See the License for the specific language governing permissions and
 *
	@Override
