                working = false;
    @Override
import org.eclipse.swt.layout.GridData;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

                browser.setUrl(location.getText());
            public void widgetDefaultSelected(SelectionEvent e) {
    private Browser createBrowser(Composite parent, final IActionBars actionBars) {
     * Constructs a new <code>BaseBrowserView</code>.

    private static final Log log = Log.getLog(BaseBrowserView.class);
        actionBars.setGlobalActionHandler("refresh", refreshAction); //$NON-NLS-1$
    public void init(IViewSite site, IMemento memento) throws PartInitException {
            @Override
    private void close() {
            }
    private Action refreshAction = new Action("Refresh", DBeaverIcons.getImageDescriptor(UIIcon.REFRESH)) {
            @Override
            public void completed(ProgressEvent event) {

        browser.addProgressListener(new ProgressAdapter() {
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (browser != null && !browser.isDisposed()) {

        });
 * DBeaver - Universal Database Manager

    }
 * You may obtain a copy of the License at
        browser.addOpenWindowListener(new OpenWindowListener() {
                BaseBrowserView.this.close();
        browser.addTitleListener(new TitleListener() {
        });
            boolean working = false;
        page.hideView(this);
        }
    private Action backAction = new Action("Back", DBeaverIcons.getImageDescriptor(UIIcon.RS_BACK)) {
public class BaseBrowserView extends ViewPart {
        memento.putString(MEMENTO_URL, browser.getUrl());
    @Override
import org.eclipse.swt.browser.*;
                initialUrl = u;
                setPartName(event.title);
                    working = true;
            @Override
        actionBars.setGlobalActionHandler("back", backAction); //$NON-NLS-1$
            browser.stop();
        data.grabExcessHorizontalSpace = true;
            IProgressMonitor monitor = actionBars.getStatusLineManager().getProgressMonitor();
 * Base Browser view.


    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        GridLayout gridLayout = new GridLayout();
                forwardAction.setEnabled(browser.isForwardEnabled());
            @Override
 * limitations under the License.
*/
        IToolBarManager toolBarManager = actionBars.getToolBarManager();
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    private Action stopAction = new Action("Stop", DBeaverIcons.getImageDescriptor(UIIcon.REJECT)) {
        toolBarManager.add(backAction);
import org.eclipse.jface.action.Action;
            }
    };
        browser.addLocationListener(new LocationAdapter() {
                monitor.worked(event.current - workedSoFar);
     */
        toolBarManager.add(stopAction);
        browser.setLayoutData(data);
    private String initialUrl;
        toolBarManager.add(refreshAction);
        browser = createBrowser(parent, getViewSite().getActionBars());
            }
     */
            browser.back();


                if (!working) {
            }
import org.eclipse.core.runtime.IProgressMonitor;
    private Action forwardAction = new Action("Forward", DBeaverIcons.getImageDescriptor(UIIcon.RS_FORWARD)) {


        @Override
        public void run() {
        }


            public void changed(TitleEvent event) {
            }
    public void setFocus() {
        @Override
    public static final String MEMENTO_URL = "url"; //$NON-NLS-1$
        if (memento != null) {

        data.horizontalAlignment = GridData.FILL;
    /**
    }
            public void close(WindowEvent event) {

        });
            }
        super.init(site);
    }
    /**
     * Closes this browser view.
    public Browser getBrowser()
        });
 * See the License for the specific language governing permissions and
        @Override
/*
        actionBars.setGlobalActionHandler("stop", stopAction); //$NON-NLS-1$
    };
        }
        // Hook the navigation actions as handlers for the retargetable actions
        // TODO: should handle VisibilityWindowListener.show and .hide events
*/

        gridLayout.numColumns = 1;
        forwardAction.setEnabled(false);
package org.jkiss.dbeaver.ui.views;
        actionBars.setGlobalActionHandler("forward", forwardAction); //$NON-NLS-1$
/**
    };
        });
 * you may not use this file except in compliance with the License.
/*
 * Unless required by applicable law or agreed to in writing, software
        toolBarManager.add(forwardAction);
            public void open(WindowEvent event) {
import org.eclipse.ui.part.ViewPart;
            public void changed(StatusTextEvent event) {
                backAction.setEnabled(browser.isBackEnabled());
        initialUrl = "about:blank";
            int workedSoFar;
import org.eclipse.swt.SWT;
        browser.setUrl(initialUrl);
                }
    private Browser browser;
/*

import org.jkiss.dbeaver.Log;

                monitor.done();
 */
//                    location.setText(event.location);
        location.addSelectionListener(new SelectionAdapter() {
                    workedSoFar = 0;
            IStatusLineManager status = actionBars.getStatusLineManager();

 *
            public void changed(LocationEvent event) {
        browser.addStatusTextListener(new StatusTextListener() {
        public void run() {
    }
        data.verticalAlignment = GridData.FILL;
            }
            public void changed(ProgressEvent event) {

            browser.forward();
        browser.addCloseWindowListener(new CloseWindowListener() {
                if (event.total == 0) return;
        });
            browser.refresh();

        }
            @Override
        parent.setLayout(gridLayout);

                    monitor.beginTask("", event.total); //$NON-NLS-1$
        return browser;
        public void run() {
                workedSoFar = event.current;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridLayout;
    }
        data.grabExcessVerticalSpace = true;
import org.jkiss.dbeaver.ui.UIIcon;
                BaseBrowserView.this.openWindow(event);
    @Override
    public void saveState(IMemento memento) {
            browser.setFocus();
 *
        }
    }
        IWorkbenchWindow window = page.getWorkbenchWindow();
        @Override

        browser = new Browser(parent, SWT.NONE);
}

        backAction.setEnabled(false);
import org.eclipse.jface.action.IToolBarManager;
            }
            String u = memento.getString(MEMENTO_URL);
import org.eclipse.jface.action.IStatusLineManager;
        IWorkbenchPage page = getSite().getPage();
            }
    };
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        });
        public void run() {

    public void createPartControl(Composite parent) {
import org.eclipse.swt.widgets.Composite;
 */
                status.setMessage(event.text);
        return browser;
                    if (event.current == event.total) return;
import org.eclipse.ui.*;
            if (u != null) {
        // defined in BrowserActionBuilder.
            @Override
 *

    public BaseBrowserView() {
//                if (event.top)
        GridData data = new GridData();
