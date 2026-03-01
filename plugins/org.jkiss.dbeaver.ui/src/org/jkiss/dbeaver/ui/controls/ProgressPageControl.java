    private void cancelSearch(boolean hide) {
        }
            return pcp.getProgressControl();

        listInfoLabel.setImage(DBeaverIcons.getImage(UIIcon.SEPARATOR_V));



    }
                        }
        if (childPageControl != null) {
    private ProgressBar progressBar;
            UIMessages.controls_progress_page_toolbar_title,
    }
                    ToolBar toolbar = customToolbarManager.createControl(customControlsComposite);
import org.jkiss.dbeaver.ui.internal.UIMessages;
                        PlatformUI.getWorkbench(),
    public final void substituteProgressPanel(ProgressPageControl externalPageControl) {
import org.eclipse.jface.action.IContributionManager;
        if (searchToolbarManager != null) {
        UIUtils.updateContributionItems(customToolbarManager);
        ((GridLayout) searchControlsComposite.getLayout()).numColumns = 2;
            if (ProgressPageControl.this.isDisposed()) {
                    curStatus = name;
            UIIcon.SEARCH
    }
                public void keyPressed(KeyEvent e) {
import org.eclipse.ui.PlatformUI;
        return false;
        if (active) {
                if (loadCount > PROGRESS_MAX) {
            separator.addPaintListener(e -> {
                        case SWT.ESC:
                }
                e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));

        if (childPageControl != null) {
        return infoGroup;
                        stopButton.setImage(UIUtils.getShardImage(ISharedImages.IMG_ELCL_STOP_DISABLED));
                ToolBar defaultToolbar = defaultToolbarManager.createControl(searchControlsComposite);

        return container;
                            cancelSearch(true);
 *
        if (getProgressControl().progressBar == null) {
import org.eclipse.jface.action.ToolBarManager;
                defaultToolbarManager.removeAll();
        int progress;
    }
                }
    }
                @Override
    }
        }
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        final String name;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.events.KeyAdapter;
        if (searchControlsComposite.isDisposed()) {
                defaultBackgroundColor = searchText.getBackground();
                        if (!tasksRunning.isEmpty()) {
 * ProgressPageControl


            ownerPageControl.setInfo(info);
                searchText.setText(curSearchText);
            return;
            searchControlsComposite.getParent().layout();
            return;
            }
    }

                ((GridLayout) searchControlsComposite.getLayout()).numColumns = 2;
            for (int i = tasksRunning.size() - 1; i >= 0; i--) {

    }
            searchToolbarManager = null;
        stopButton.setImage(UIUtils.getShardImage(ISharedImages.IMG_ELCL_STOP));

 */
            if (showDefaultControls) {
        } else {
                @Override
            return;
        }
 * Unless required by applicable law or agreed to in writing, software
import java.util.Objects;
            });
                ((GridLayout) searchControlsComposite.getLayout()).marginTop = 2;
        if (this.ownerPageControl != null) {
        hideControls(false);
                                if (monitor.isCanceled()) {


     * Create search controls and perform search according to the searchType

 * Licensed under the Apache License, Version 2.0 (the "License");
    private ToolBarManager defaultToolbarManager;
        gl.marginHeight = 0;
    }
            defaultToolbarManager = null;
        stopButton.setToolTipText(UIMessages.controls_progress_page_progress_bar_cancel_tooltip);
            @Override
        listInfoLabel.setLayoutData(GridDataFactory.swtDefaults().minSize(100, SWT.DEFAULT).create());

        CSSUtils.markConnectionTypeColor(phToolBar);
    public void setInfo(String info) {
    private ProgressPageControl ownerPageControl = null;
            listInfoLabel.setVisible(!CommonUtils.isEmptyTrimmed(info));
                            if (childPageControl != null) {
                if (!customToolbarManager.isEmpty()) {
        try {

    public void activate(boolean active) {
            separator.setLayoutData(gd);
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.Log;
                }
        searchControlsComposite = new ConComposite(infoGroup);
            childPageControl.fillCustomActions(contributionManager);
    private final Color searchNotFoundColor;
        if (progressPageControl == this.childPageControl) {
 * DBeaver - Universal Database Manager
        } finally {
            int options = 0;
    public Text getSearchTextControl() {
        }
        gl.marginHeight = 0;
                        UIIcon.ARROW_UP
        ));
 *

        container.setLayoutData(gd);
            hideControls(true);
import org.jkiss.utils.CommonUtils;


            };
                }
                    }
        return createProgressPanel(this);
                UIUtils.disposeChildControls(customControlsComposite);


        progressBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return ownerPageControl != null ? ownerPageControl : this;

    }

            return new ProxyProgressMonitor(monitor) {
        customControlsComposite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                }
        try {


                Control phLabel = new Label(searchControlsComposite, SWT.NONE);
                        IWorkbenchActionDefinitionIds.FIND_NEXT,
        }
        searchControlsComposite.getParent().setRedraw(false);
    }
import org.eclipse.jface.action.ContributionManager;
    private void setChildControl(ProgressPageControl progressPageControl) {
                            e.doit = false;
        }
    public final Composite createProgressPanel() {
 *
        defaultToolbarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
    private static final Log log = Log.getLog(ProgressPageControl.class);
            boolean success = getSearchRunner().performSearch(getProgressControl().curSearchText, options);
    }
    ) {

            searchToolbarManager.dispose();
            return success;

            searchRunner.cancelSearch();
                        null,
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;

    }
import org.eclipse.swt.widgets.*;
    }
                CSSUtils.markConnectionTypeColor(phLabel);
        return (GridLayout) super.getLayout();
        }

    public boolean isSearchPossible() {



        public void completeLoading(RESULT result) {
        progressBar.setSize(300, 16);
                if (isSearchPossible() && isSearchEnabled()) {
                            tasksRunning.removeLast();
                    super.subTask(name);

        gl = new GridLayout(1, false);
     * Default search action (standard Eclipse EDIT_FIND_AND_REPLACE command)
                return;
import org.eclipse.swt.events.SelectionAdapter;
                    curStatus = ""; //$NON-NLS-1$
        searchNotFoundColor = UIStyles.getDefaultWidgetBackground();
import org.eclipse.ui.part.MultiPageEditorSite;
        getProgressControl().hideControls(true);
                                performSearch(SearchType.NEXT);

                progressControl.searchText.setBackground(progressControl.defaultBackgroundColor);
            progressBar = null;
        ((GridLayout) searchControlsComposite.getLayout()).numColumns = 2;
            // Delete all controls created in searchControlsComposite
    private String curSearchText;
    private volatile Job curSearchJob;
    private ConComposite searchControlsComposite;
                phLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                }
        }
        progressBar.setMaximum(PROGRESS_MAX);

            getProgressControl().searchText.setFocus();
                    CSSUtils.markConnectionTypeColor(toolbar);
        customToolbarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
                    populateCustomActions(customToolbarManager);
    public void fillCustomActions(IContributionManager contributionManager) {
     */
            }
import org.eclipse.ui.texteditor.IWorkbenchActionDefinitionIds;
        public void visualizeLoading() {

 * See the License for the specific language governing permissions and
        customControlsComposite.setBackgroundMode(SWT.INHERIT_FORCE);
                if (curStatus != null) {
            IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE,
                        UIIcon.ARROW_DOWN
import org.eclipse.swt.SWT;
    private void createProgressControls() {
                        @Override
            return true;
                    ) {
            listInfoLabel.getParent().layout(true, true);
    private static final int PROGRESS_MAX = 20;
        ToolBar progressTools = new ToolBar(searchControlsComposite, SWT.HORIZONTAL);
                    synchronized (tasksRunning) {

import org.eclipse.jface.action.Action;
import org.eclipse.swt.events.KeyEvent;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    super.worked(work);
        private boolean completed = false;
     * @param searchType             is a type of search
import org.eclipse.core.runtime.IStatus;
                    super.beginTask(name, totalWork);
            public void widgetSelected(SelectionEvent e) {
    }
                    searchToolbarManager.add(ActionUtils.makeCommandContribution(
        }
                            progressBar.setSelection(loadCount);
                    return tasksRunning.get(i);
        return searchText;
                                return Status.OK_STATUS;
        hideControls(true);
                        case SWT.ARROW_DOWN:
import org.eclipse.swt.layout.GridLayout;
            }

                // Cancel current job
    private void hideControls(boolean showDefaultControls) {
    public void refreshActions() {

     *
        progressBar.setState(SWT.NORMAL);
            // Nullify all controls
        }
    private Label listInfoLabel;

                    curStatus = name;
            PlatformUI.getWorkbench(),
                            //performSearch(SearchType.NEXT);

    protected void populateCustomActions(ContributionManager contributionManager) {
        this.ownerPageControl = externalPageControl;
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    searchToolbarManager.add(ActionUtils.makeCommandContribution(
                            tasksRunning.getLast().progress += work;
                    ));
            setInfo(Objects.requireNonNullElse(curInfo, ""));

                                }
    }
    private Color defaultBackgroundColor;
            UIUtils.disposeChildControls(searchControlsComposite);
        } else {
     */
        if (!CommonUtils.isEmpty(getProgressControl().curSearchText)) {
    @Override
        }
        Composite container = new ConComposite(this, (getStyle() & SWT.SHEET) == SWT.SHEET ? SWT.NONE : SWT.BORDER);
        if (progressControl != null) {
                progressBar.setState(SWT.PAUSED);
                            cancelSearch(true);
    protected ISearchExecutor getSearchRunner() {
                CSSUtils.markConnectionTypeColor(defaultToolbar);

                @Override
    }
        container.setLayout(new FillLayout());

        infoGroup.setBackgroundMode(SWT.INHERIT_FORCE);
                    TaskInfo taskInfo = getCurTaskInfo();
            return null;
    public void updateActions() {

                        if (taskInfo != null) {
                            progressBar.setSelection(taskInfo.progress);
            searchControlsComposite.getParent().setRedraw(true);
        return getProgressControl().progressBar == null;
        }
                @Override
                fillCustomActions(customToolbarManager);
                if (searchToolbarManager == null) {
            searchControlsComposite.getParent().setRedraw(true);
    private Text searchText;
                    }
    }
    private static final int PROGRESS_MIN = 0;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        if (customToolbarManager != null) {
            searchText = null;
                        UIMessages.controls_progress_page_action_close,
            }
        final int totalWork;
            this.name = name;
    public GridLayout getLayout() {
        infoGroup.setLayout(gl);
    private static class TaskInfo {
        if (ownerPageControl != null) {
                    addSearchAction(defaultToolbarManager);
    public void createOrSubstituteProgressPanel(IWorkbenchPartSite site) {
                    setInfo(curStatus);
        customControlsComposite = new ConComposite(infoGroup, SWT.NONE);
                // Recreate custom controls
        }
                        IWorkbenchActionDefinitionIds.FIND_PREVIOUS,
            curSearchJob = null;
                }
                synchronized (this) {
                    ));

        @Override
 */
                }
                        case SWT.CR:
        if (site instanceof INestedEditorSite nes && nes.getFolderEditor() instanceof IProgressControlProvider pcp) {
            //searchText.setBackground(searchNotFoundColor);
        int style
    public ProgressPageControl(
                    searchToolbarManager.add(new Action(
            }
        searchControlsComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    });
                        stopButton.setEnabled(false);
        CSSUtils.markConnectionTypeColor(listInfoLabel);

    public Composite createProgressPanel(Composite container) {
    private ToolBarManager customToolbarManager;
        } finally {
                        }
        if ((style & SWT.SHEET) != 0) {
                e.gc.drawLine(e.x, e.y, e.x + e.width, e.y);
            throw new IllegalStateException("Can't create page control while substitution control already set"); //$NON-NLS-1$
        ProgressPageControl progressControl = findOwnerPageControl(site);
public class ProgressPageControl extends ConComposite implements ISearchContextProvider, ICustomActionsProvider {
    public Composite createContentContainer() {
    protected boolean cancelProgress() {
        private String curStatus;
    }
            // Create default controls toolbar
            if (!UIUtils.isInDialog(getShell())) {
            loadCount = 0;
            }
        if (curSearchJob != null) {

    public boolean performSearch(SearchType searchType) {
        }
            this.curInfo = info;

                if (cancelProgress()) {
    }
            cancelSearch(false);
        }
                            break;

    }
        return null;
            customToolbarManager.dispose();
        GridLayout layout = new GridLayout(1, false);
                }
        }
        }
                options |= ISearchExecutor.SEARCH_PREVIOUS;

    private ProgressPageControl findOwnerPageControl(IWorkbenchPartSite site) {
                curSearchText = searchText.getText();
        this.childPageControl = progressPageControl;
                    }
                    if (progressBar != null) {
                customToolbarManager.removeAll();
            layout.marginWidth = 0;
        getProgressControl().createSearchControls();
        if (hide) {
package org.jkiss.dbeaver.ui.controls;
    public void setShowDivider(boolean showDivider) {
            }

                this.ownerPageControl.setChildControl(this);
        public DBRProgressMonitor overwriteMonitor(final DBRProgressMonitor monitor) {
        }
                                    return Status.CANCEL_STATUS;
    }

}        }
            }
            layout.horizontalSpacing = 0;
 * You may obtain a copy of the License at
        stopButton.addSelectionListener(new SelectionAdapter() {
            return pcp.getProgressControl();
import org.eclipse.core.runtime.IProgressMonitor;
                    searchToolbarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL);
                }
/*
        @Override

        GridData gd = new GridData(GridData.FILL_BOTH);
        }
        listInfoLabel = new Label(infoGroup, SWT.NONE);
            return null;
        Composite infoGroup = new ConComposite(container, SWT.NONE);
    private String curInfo;
                    loadCount = PROGRESS_MIN;

 *     http://www.apache.org/licenses/LICENSE-2.0
        CSSUtils.markConnectionTypeColor(infoGroup);
                        UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_REMOVE)
/**
    private ToolBarManager searchToolbarManager;
 * you may not use this file except in compliance with the License.

            return completed;
    }
    /**
                public void done() {
                loadCount++;
    }
                public void subTask(@NotNull String name) {
        } else {
        searchControlsComposite.getParent().setRedraw(false);
            UIUtils.addDefaultEditActionsSupport(UIUtils.getActiveWorkbenchWindow(), this.searchText);
            customToolbarManager = null;
        progressBar = new ProgressBar(searchControlsComposite, SWT.SMOOTH | SWT.HORIZONTAL);
    }

                        }
            if (this.ownerPageControl != null) {
            }
            ProgressPageControl progressControl = getProgressControl();
import org.eclipse.ui.IWorkbenchCommandConstants;
                            /* fall-through */
            defaultToolbarManager.dispose();
            searchText.addKeyListener(new KeyAdapter() {
        }

        if (progressBar != null || customControlsComposite == null) {
                            progressBar.setMaximum(taskInfo.totalWork);
 * limitations under the License.

        this.showDivider = showDivider;
                defaultToolbar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END));
import org.eclipse.ui.progress.UIJob;
        }


                            }
        contributionManager.add(ActionUtils.makeCommandContribution(

import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
    protected void createSearchControls() {
            });
    private Composite customControlsComposite;
                    synchronized (tasksRunning) {
    @Override
            gd.heightHint = 1;
        private TaskInfo(String name, int totalWork) {
                }
                                curSearchJob = null;
    }
        } else if (site instanceof MultiPageEditorSite mpe && mpe.getMultiPageEditor() instanceof IProgressControlProvider pcp) {
import org.eclipse.ui.ISharedImages;
import java.util.ArrayList;
            return;
        public boolean isCompleted() {
        return performSearch(searchType, true);
     * @param isSetFocusToSearchText defines if focus should be set to the search text area if searchType is {@link SearchType#NONE}
                        PlatformUI.getWorkbench(),
                    }
import org.jkiss.dbeaver.ui.css.CSSUtils;
            visualizeLoading();
            getProgressControl().searchText.setBackground(success ? getProgressControl().defaultBackgroundColor : searchNotFoundColor);

                        public void run() {
    protected void addSearchAction(IContributionManager contributionManager) {
        gl.marginWidth = 0;
                    if (curSearchJob == null) {
import org.eclipse.ui.IWorkbenchPartSite;
            searchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private boolean showDivider;
                synchronized (tasksRunning) {
import org.jkiss.dbeaver.ui.*;

                    super.done();
        }
        super(parent, style);
                    switch (e.keyCode) {
     * @return operation success indicator
            searchControlsComposite.getParent().layout();
        }
            }
            return;
                        tasksRunning.add(new TaskInfo(name, totalWork));

                public void worked(int work) {
        addDisposeListener(e -> disposeControl());
    private int loadCount = 0;
import org.eclipse.core.runtime.Status;
        }
        }
        if (!CommonUtils.isEmpty(info)) {
        gl.marginWidth = 0;
        if (searchType == SearchType.NONE && isSetFocusToSearchText) {
import org.eclipse.swt.layout.GridData;
    @Override
                    toolbar.setFont(BaseThemeSettings.instance.baseFont);
                        if (tasksRunning.isEmpty()) {
        private final java.util.List<TaskInfo> tasksRunning = new ArrayList<>();
                    synchronized (tasksRunning) {
                    }
            searchText = new Text(searchControlsComposite, SWT.BORDER);


                options |= ISearchExecutor.SEARCH_NEXT;
import org.jkiss.code.NotNull;
            if (!getProgressControl().isDisposed()) {
        }
            if (!progressControl.isDisposed()) {
                                childPageControl.setFocus();
            layout.marginHeight = 0;
            if (progressBar != null && !progressBar.isDisposed()) {

        final ToolItem stopButton = new ToolItem(progressTools, SWT.PUSH);
            createProgressPanel();
            } else {
    }
        });
        if (searchControlsComposite == null || searchControlsComposite.isDisposed()) {

    }
            if (curSearchText != null) {
            });
        searchControlsComposite.getParent().layout();

                    UIUtils.populateToolItemCommandIds(customToolbarManager);
        }
        CSSUtils.markConnectionTypeColor(customControlsComposite);
        gd.horizontalIndent = 0;
        customControlsComposite.setLayout(gl);
                            break;
        progressBar.setMinimum(PROGRESS_MIN);
        gd.verticalIndent = 0;
            //customControlsComposite.layout();

            ProgressBar progressBar = getProgressControl().progressBar;
            return childPageControl.getSearchRunner();
                        } else {
    public void disposeControl() {
            this.totalWork = totalWork;
                searchToolbarManager.createControl(searchControlsComposite);
    public boolean isSearchEnabled() {
        }
    }
            this.ownerPageControl.setChildControl(this);
        UIUtils.updateContributionItems(defaultToolbarManager);
        @Override
                        case SWT.ARROW_UP:
            listInfoLabel.setText(info);
        searchControlsComposite.setBackgroundMode(SWT.INHERIT_FORCE);
        progressBar.setToolTipText(UIMessages.controls_progress_page_progress_bar_loading_tooltip);
                public void beginTask(@NotNull final String name, int totalWork) {

            layout.verticalSpacing = 0;
                            performSearch(SearchType.NEXT);
    private ProgressPageControl childPageControl = null;
        return getSearchRunner() != null;
        hideControls(false);
                    toolbar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END));

        GridLayout gl = new GridLayout(3, false);
            hideControls(true);
                        };
            completed = true;

    private ProgressPageControl getProgressControl() {
                    }
                getProgressControl().createProgressControls();
        } else {
        this.setLayout(layout);
                        }
                        } else {
    /**
                        curSearchJob.schedule(200);
    public boolean performSearch(SearchType searchType, boolean isSetFocusToSearchText) {

                            log.warn("Task end when no tasks are running"); //$NON-NLS-1$
                searchText.setSelection(curSearchText.length());
                        null,
        if (searchRunner != null) {
import org.eclipse.swt.layout.FillLayout;
        private TaskInfo getCurTaskInfo() {
                            progressBar.setMaximum(PROGRESS_MAX);
        ToolBar phToolBar = new ToolBar(searchControlsComposite, SWT.NONE);
        }
        @Override
                getProgressControl().hideControls(true);
                @Override
        Composite parent,
        } else if (listInfoLabel != null && !listInfoLabel.isDisposed()) {
    @Override
    }
        if (this.ownerPageControl != null) {
                if (tasksRunning.get(i).totalWork > 1) {
            searchText.addModifyListener(e -> {
            substituteProgressPanel(progressControl);
                            @Override
                        curSearchJob = new UIJob(UIMessages.controls_progress_page_job_search) {
        searchControlsComposite.setGridLayout(1);
        if (showDivider) {

    public class ProgressVisualizer<RESULT> implements ILoadVisualizer<RESULT> {
        // Placeholder toolbar (need to set initial height of search composite)
        infoGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.core.runtime.jobs.Job;
            curSearchJob.cancel();
    }
        }
                }
        ISearchExecutor searchRunner = getSearchRunner();
                            }
                            public IStatus runInUIThread(IProgressMonitor monitor) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (defaultToolbarManager != null) {
            }
            Label separator = new Label(container, SWT.NONE);
    }
                }

            if (searchType == SearchType.PREVIOUS) {
import org.eclipse.swt.graphics.Color;
    @Override
                    if (!stopButton.isDisposed()) {

                }
                    }
                    ProgressBar progressBar = getProgressControl().progressBar;
        if (searchText != null) {
