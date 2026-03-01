
	}

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
		fWindow= window;
 *
public class OpenMetadataSearchPageAction implements IWorkbenchWindowActionDelegate {
	public void init(IWorkbenchWindow window) {
	}
			return;
	}
 * you may not use this file except in compliance with the License.
	public void run(IAction action) {
		fWindow= null;
	public void dispose() {

	public void selectionChanged(IAction action, ISelection selection) {

		// do nothing since the action isn't selection dependent.
 * DBeaver - Universal Database Manager
 * Opens the data search dialog.
	public OpenMetadataSearchPageAction() {
 *
import org.eclipse.search.ui.NewSearchUI;
}
import org.eclipse.ui.IWorkbenchWindow;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
		NewSearchUI.openSearchDialog(fWindow, DATA_SEARCH_PAGE_ID);

		}
 */
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
	@Override
	@Override
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
import org.eclipse.jface.viewers.ISelection;
	@Override

 * limitations under the License.
	}
 * Licensed under the Apache License, Version 2.0 (the "License");

	private IWorkbenchWindow fWindow;

	@Override
package org.jkiss.dbeaver.ui.search.metadata;
 */
	private static final String DATA_SEARCH_PAGE_ID = SearchMetadataPage.class.getName();
/*
		if (fWindow == null || fWindow.getActivePage() == null) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.action.IAction;
	}

 * You may obtain a copy of the License at
