                }
        setTitleImage(firstPage.getImage());
        updateSize(getCurrentPage());
        return getCurrentPage();

                changePage();
    @Override
            if (pageName.equals(page.getName())) {
        @NotNull IDialogPage page,

            }
        if (rightButtonsComposite.getChildren().length == 0) {

        if (page instanceof ActiveWizardPage<?> awp) {
    }
                    pageCompSize.y = shellCompSize.y;
        if (!isShowTreeIcons()) {
        updatePageCompleteMark(null);

            awp.updatePageCompletion();

            return null;
                Point pageCompSize = page.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);

        TreeItem[] selection = pagesTree.getSelection();
        try {
        }


        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        if (ArrayUtils.isEmpty(selection)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.ListenerList;
            }
        createButton(parent, IDialogConstants.OK_ID, finishButtonLabel, getShell().getDefaultButton() == null);
                return canShowMark.test(PageCompletionMark.ERROR) ? DBIcon.SMALL_ERROR : null;
        }
//        if (size.x > 0) {
                    getShell(),
        IWizardPage currentPage = getCurrentPage();
    protected enum PageCompletionMark {
    @Override
        if (selection.length != 1) {
import java.util.Set;
            prevPage = page;
                            return;
    protected boolean isFullscreenPage(@NotNull IDialogPage page) {
                @Override
        };
        }
            }
            if (pageControl == null) {
        return true;
    }

                }
    }

    /**
        pageArea.setRedraw(false);
        IWizardPage[] pages = sizingWizard.getPages();

    @Override
        if (prevPage == newItem.getData()) {
    }
        Rectangle rect = pageArea.getClientArea();
                }
    public void updateButtons() {

        monitorPart = new ProgressMonitorPart(mainComposite, null, true) {
            }
    protected boolean isShowTreeIcons() {
    @Override
                        if (subPage == page) {
        //setTitleImage(getCurrentPage().getImage());
        UIUtils.createLabelSeparator(mainComposite, SWT.HORIZONTAL);
        var leftButtonsComposite = createButtonBarComposite(composite, SWT.LEAD);
        IWizardPage prevPage = wizard.getPreviousPage(currentPage);

import org.eclipse.jface.preference.IPreferencePageContainer;
                    selection = (IStructuredSelection) window.getSelectionService().getSelection();
    }
        TreeItem newItem = selection[0];
            }
        pageArea.layout();
    public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {
        IWizard wizard = getWizard();
        layout.marginHeight = 0;
                    {
                }
            monitorPart.attachToCancelComponent(null);
import org.eclipse.jface.viewers.IStructuredSelection;
    }
            public void setCanceled(boolean b) {
        // Set title and image from first page
        }
        if (isModalWizard() || UIUtils.isInDialog()) {
        }
    public IWizardPage getCurrentPage() {
            if (!(item.getData() instanceof IDialogPage page)) {
            if (nextButton != null) {
                if (pageControl != null) {
        return (IWizardPage) pagesTree.getItem(0).getData();
    }

    @NotNull
    }
            wizard.dispose();
            updatePageCompleteMark(null);
    private final Set<IWizardPage> resizedPages = new HashSet<>();
            monitorPart.setVisible(true);
                applyDialogFont(pageControl);
    }

            //getShell().setImage(getWizard().getDefaultPageImage());//DBeaverIcons.getImage(activeDataSource.getObjectImage()));

    }

    public MultiPageWizardDialog(IWorkbenchWindow window, IWizard wizard) {

    public void updateTitle() {
            @Override
        getButton(IDialogConstants.CANCEL_ID).setEnabled(false);


            if (page instanceof ActiveWizardPage<?> awp) {

            item.setForeground(computePageColor(page));
    protected Control createDialogArea(Composite parent) {
                showPage(page);

        updateSizeForPage(page);
        Shell shell = getShell();
        if (shell != null) {
            updatePageCompleteMark(item);
                pageEnableState.restore();

            runningOperations.decrementAndGet();
            }
                }
                            ((ICompositeDialogPageContainer) item.getData()).showSubPage(page);
            // increase the size of the shell


 *

    public void disableButtonsOnProgress() {

        return SWT.CLOSE | SWT.MAX | SWT.TITLE | SWT.BORDER | SWT.RESIZE | getDefaultOrientation();
        if (page instanceof IDialogPageProvider) {
            }
            }
        pagesTree = new Tree(leftPane, SWT.SINGLE | SWT.FULL_SELECTION);

                    pagesTree.select(item);
            if (prevPage != null && prevPage.getControl() != null) {
                    l.pageChanged(event);

    }
            delta.x = Math.max(delta.x, pageDelta.x);
        pageChangedListeners.remove(listener);
        return false;
    }
            if (buttonsEnableState != null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        pageArea = UIUtils.createPlaceholder(wizardSash, 1);
        }
                gd = (GridData) pageControl.getLayoutData();
        createButtonsForButtonBar(rightButtonsComposite);
        item.setData(page);
     * @param page the page to check
                    gd = (GridData) pageControl.getLayoutData();
        } finally {
        } else if (buttonId == IDialogConstants.OK_ID) {
            pagesTree.removeAll();
            if (monitorPart != null && !monitorPart.isDisposed()) {
                    //Point pageSize = pageControl.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                UIUtils.resizeShell(
        }
     *
            setMessage(message, provider.getMessageType());
                prevPage.setVisible(false);
        leftBottomPanel.getParent().layout(true, true);
        for (IPageChangedListener l : pageChangedListeners) {
        Button finishButton = getButton(IDialogConstants.OK_ID);
    }
        getButton(IDialogConstants.OK_ID).setEnabled(true);
                pageControl = page.getControl();
        wizardSash = new SashForm(mainComposite, SWT.HORIZONTAL);
        }
                        break;

                page.setVisible(true);
        ERROR
                    awp.deactivatePage();
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
            finishButton.setEnabled(wizard.canFinish());
    public IWizard getWizard() {

        super(window.getShell());
        }
                    changePage();


    public MultiPageWizardDialog(IWorkbenchWindow window, IWizard wizard, IStructuredSelection selection) {
        // Afterwards show the starting page
        Control pageControl = page.getControl();

 */
     * Checks if the page should occupy the whole dialog area without margins.
public class MultiPageWizardDialog extends TitleAreaDialog implements IWizardContainer, IWizardContainer2, IPageChangeProvider, IPreferencePageContainer {
    public void setWizard(IWizard newWizard) {
import org.jkiss.dbeaver.ui.*;
    public void showPage(IWizardPage page) {
    public IPreferenceStore getPreferenceStore() {

                        (newPage instanceof IWizardPageNavigable && !((IWizardPageNavigable) newPage).isPageNavigable()))
    }
    @Nullable
                gd.exclude = false;
                return;
        }
    public void setCompleteMarkAfterProgress() {
    }
    }
                if (!ArrayUtils.isEmpty(subPages)) {
    protected void createBottomLeftArea(Composite pane) {
        pagesTree.setLayoutData(new GridData(GridData.FILL_BOTH));
        wizard.addPages();

    protected boolean isModalWizard() {
            leftButtonsComposite.dispose();
                monitorPart.done();
                if (item.getData() == selectedPage) {
        gd.verticalIndent = 0;
    }
            ((IWorkbenchWizard) wizard).init(window.getWorkbench(), selection);
        size.width = width;
    private void updateSize(IWizardPage page) {
            return canShowMark.test(PageCompletionMark.COMPLETE) ? UIIcon.RS_FORWARD : null;
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    private void setShellSize(int width, int height) {
     * Computes the correct dialog size for the given wizard and resizes its shell if necessary.
    protected boolean isAutoLayoutAvailable() {
        }

            return;
        UIUtils.createLabelSeparator(mainComposite, SWT.HORIZONTAL);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        TreeItem selectedItem = selection[0];
    }
        monitorPart.setLayoutData(gd);
    }

            for (IWizardPage page : pages) {
    }
//        }

    private TreeItem addNavigationItem(TreeItem parentItem, IDialogPage page) {
    @Override
    }
    }

     * Computes the correct dialog size for the given page and resizes its shell if necessary.
        GridLayout layout = new GridLayout();
        updateNavigationTree();
import org.jkiss.utils.CommonUtils;
        Point minSize = new Point(700, 500);
        pageChangedListeners.add(listener);
    private Composite pageArea;
        createBottomLeftArea(leftBottomPanel);
    }
                //item.setExpanded(true);

        // Code copied from WizardDialog
        for (TreeItem item : parent == null ? pagesTree.getItems() : parent.getItems()) {
        createButton(parent, IDialogConstants.CANCEL_ID, closeButtonLabel, false);
import org.eclipse.swt.graphics.Color;

        this(window, wizard, null);
            setMessage(currentPage.getDescription());
        TreeItem[] selection = pagesTree.getSelection();
        var rightButtonsComposite = createButtonBarComposite(composite, SWT.TRAIL);
            Point pageDelta = calculatePageSizeDelta(page);
                item.setImage(itemImage == null ? null : DBeaverIcons.getImage(itemImage));
    ) {
    @Override
        // Horizontal separator
        IWizardPage firstPage = getStartingPage();
    }
            showPage(prevPage);
import org.eclipse.jface.preference.IPreferenceStore;
 * See the License for the specific language governing permissions and
        if (currentPage != null) {
        pageArea.setLayout(new GridLayout(1, true));
        if (!currentPage.isPageComplete()) {
        IWizardPage nextPage = wizard.getNextPage(currentPage);
    }

            SafeRunnable.run(new SafeRunnable() {
        }
        Point delta = new Point(0, 0);

        setTitle(firstPage.getTitle());

        return new Point(Math.max(minSize.x, suggestedSize.x), Math.max(minSize.y, suggestedSize.y));
                    gd.exclude = false;
        return true;
import java.util.function.Predicate;
            return null;


        this.wizard = newWizard;
        getShell().setBounds(getConstrainedShellBounds(size));
        }
import org.eclipse.jface.util.SafeRunnable;
        ControlEnableState buttonsEnableState = isDisableControlsOnRun ? ControlEnableState.disable(getButtonBar()) : null;
        createBottomLeftArea(leftBottomPanel);

                    if (parent instanceof SashForm) {
                awp.updatePageCompletion();
    }
        monitorPart.setVisible(false);
        } else if (buttonId == IDialogConstants.BACK_ID) {

     * @return {@code true} if the page is a fullscreen page and should not have margins, {@code false} otherwise
        Point suggestedSize = super.getInitialSize();
    private Point calculatePageSizeDelta(IWizardPage page) {
    private SashForm wizardSash;

package org.jkiss.dbeaver.ui.dialogs;
        this.wizard.setContainer(this);

        showPage(firstPage);
//            ((GridData) wizardSash.getLayoutData()).widthHint = size.x * 6;
 */
        size.height = height;
            }
                buttonsEnableState.restore();
     * @param sizingWizard the wizard
            IWizardPage[] pages = wizard.getPages();
    }
                    if (gd == null) {
                }
}
            });
        updateWindowTitle();
    }
            return;
        if (wizard != null) {
        /** If a page is complete, a green check will be shown next to it */
            setMessage(message);
    }
     *
    public Object getSelectedPage() {

        wizardSash.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
        } else {
            pagesTree.setRedraw(true);
        if (delta.x > 0 || delta.y > 0) {
            }
import org.jkiss.dbeaver.model.DBIcon;
    protected void finishPressed() {
    }
        }
        super.buttonPressed(buttonId);
        return true;
 * you may not use this file except in compliance with the License.
        } else if (page instanceof IWizardPage wizardPage) {
    protected void setFinishButtonLabel(String finishButtonLabel) {
                    // If we are in long operation or target page is not navigable - flip back
            if (item.getData() instanceof ICompositeDialogPageContainer) {
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.jface.wizard.*;
        Point containerSize = new Point(rect.width, rect.height);
        } else if (buttonId == IDialogConstants.FINISH_ID) {
        TreeItem item = parentItem == null ?
        if (selection.length != 1) {
        if (currentPage == null) {
        /** If a page is incomplete, a red cross will be shown next to it */
            return;
    }
        setErrorMessage(currentPage.getErrorMessage());
     */
    private final AtomicInteger runningOperations = new AtomicInteger();

import org.eclipse.jface.dialogs.*;
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import java.util.concurrent.atomic.AtomicInteger;
            getWizard().performCancel();
        if (nextPage != null) {
                return;
import org.jkiss.utils.ArrayUtils;
                break;
        return mainComposite;
        IDialogPage page = (IDialogPage) selection[0].getData();

                TreeItem[] selection = pagesTree.getSelection();
    protected IWizardPage getStartingPage() {
        } else if (page.getControl() == null) {
                    }

    protected void createButtonsForButtonBar(@NotNull Composite parent) {
    public void updateMessage() {
                if (window.getSelectionService().getSelection() instanceof IStructuredSelection) {
        }
                                pagesTree.select(prevItem);
    protected void cancelCurrentOperation() {
        }
            updateMessage();
            Button nextButton = getButton(IDialogConstants.NEXT_ID);
        }
                gd.exclude = true;
import org.eclipse.jface.operation.IRunnableWithProgress;

    public void nextPressed() {
import org.eclipse.ui.IWorkbenchWindow;
                }
            return;
    private void updateSizeForPage(IWizardPage page) {
                changePage();
        GridData data = new GridData(alignment, SWT.CENTER, true, false);

        return new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore());
        }
import org.eclipse.swt.graphics.Point;
        } else {


    private IDialogPage prevPage;
    @Override
                        }
        showPage((IWizardPage) pagesTree.getItem(0).getData());
        @NotNull IWizardPage currentPage,
    public void updateSize() {
        }
                    return;

        // Progress monitor
                pagesTree.setSelection(item);
    }
            if (!ArrayUtils.isEmpty(subPages)) {
        IWizardPage currentPage = getCurrentPage();
    private void firePageChanged(final PageChangedEvent event) {
    }
        try {
                    }
            }
    }

            if (prevButton != null) {
            IDialogPage page = (IDialogPage) newItem.getData();
        }
        });

            if (prevPage.getControl() != null) {
        return composite;
                return canShowMark.test(PageCompletionMark.COMPLETE) ? UIIcon.OK_MARK : null;

        resizedPages.add(page);
            finishPressed();
        pagesTree.setRedraw(false);
                for (IDialogPage subPage : subPages) {
                if (selection.length > 0) {
    protected boolean isResizable() {
    @Override
    }

        for (IWizardPage page : pages) {
        return super.close();
                        pageCompSize = parent.computeSize(SWT.DEFAULT, SWT.DEFAULT);
            ModalContext.run(runnable, true, monitorPart, getShell().getDisplay());

    private void changePage() {
    @Override
        TreeItem[] selection = pagesTree.getSelection();
                }
                    for (IDialogPage subPage : subPages) {
                        return;
        // Ad sub pages
    }

            ((GridLayout) composite.getLayout()).numColumns -= 1;
        IWizardPage currentPage = getCurrentPage();
        IWizardPage page = getCurrentPage();
    private void updatePageCompleteMark(TreeItem parent) {
            Control pageControl = page.getControl();
        pagesTree.addSelectionListener(new SelectionAdapter() {
            }
                gd = (GridData) prevPage.getControl().getLayoutData();
            }
                    pageCompSize);
            showPage(nextPage);
import org.eclipse.jface.operation.ModalContext;
     */
        // do nothing by default

        }
                if (shellCompSize.y > pageCompSize.y) {
        if (page == null || page.getControl() == null || resizedPages.contains(page)) {
        updateButtons();
import org.jkiss.code.Nullable;
    protected Set<PageCompletionMark> getShownCompletionMarks() {
        @NotNull Predicate<PageCompletionMark> canShowMark
    public boolean close() {

    @Override
    @Override
 * limitations under the License.
                        if (prevPage != null) {

    }
        return page.getControl() instanceof CTabFolder;

 * DBeaver - Universal Database Manager
    public void updateTitleBar() {
        createButtonsForLeftButtonBar(leftButtonsComposite);
            return;
        boolean isDisableControlsOnRun = isDisableControlsOnRun();
    protected Composite createButtonBarComposite(@NotNull Composite parent, int alignment) {

    @NotNull

/**
 * You may obtain a copy of the License at
        }
            }
            return;
        gd.grabExcessHorizontalSpace = true;
        mainComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
            nextPressed();
        item.setForeground(computePageColor(page));
        getButton(IDialogConstants.CANCEL_ID).setEnabled(true);
                    //if (pageSize.x > maxSize.x) maxSize.x = pageSize.x;
            setTitle(page.getTitle());
        ControlEnableState pageEnableState = isDisableControlsOnRun ? ControlEnableState.disable(wizardSash) : null;
        } finally {


//        Point size = leftPane.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        if (monitorPart != null) {
     */
import java.util.HashSet;
    private void updateSizeForWizard(IWizard sizingWizard) {
    }
        for (TreeItem item : pagesTree.getItems()) {

        if (runningOperations.get() > 0) {
import org.eclipse.swt.widgets.*;
        }
            ((GridLayout) composite.getLayout()).numColumns -= 1;
        }
            // ensure the page container is large enough
        return wizard;

        }
import java.util.EnumSet;
        var composite = new Composite(parent, SWT.NONE);
            for (TreeItem child : item.getItems()) {
        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
    public void addPageChangedListener(IPageChangedListener listener) {
    }
            }
                nextButton.setEnabled(getCurrentPage().isPageComplete() && wizard.getNextPage(currentPage) != null);
    protected Control createButtonBar(@NotNull Composite parent) {


    @Override

import org.eclipse.swt.events.SelectionEvent;
    /**
    protected void showPage(String pageName) {

                prevButton.setEnabled(wizard.getPreviousPage(currentPage) != null);
                    //if (pageSize.y > maxSize.y) maxSize.y = pageSize.y;

    public void enableButtonsAfterProgress() {
        }
    }
    @NotNull
    @Override
            //monitorPart.layout();
                    Object newPage = selection[0].getData();
            return;
        applyDialogFont(contents);
            for (TreeItem item : pagesTree.getItems()) {
 
                for (Control parent = page.getControl().getParent(); parent != null; parent = parent.getParent()) {
            new TreeItem(pagesTree, SWT.NONE) :
        Composite composite = new Composite(parent, SWT.NONE);

            // Do not update dialog icon. It can be disposed in the page and this will break connection dialog
        layout.verticalSpacing = 0;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
                        gd = new GridData(GridData.FILL_BOTH);
            setMessage(page.getDescription());
                if (prevPage instanceof ActiveWizardPage<?> awp) {
            }
        }
    }
        if (leftButtonsComposite.getChildren().length == 0) {
            if (pageEnableState != null) {
        this.wizard.setContainer(this);
    }
            }
            Object selectedPage = getSelectedPage();
                    addNavigationItem(item, subPage);
                            TreeItem prevItem = UIUtils.getTreeItem(pagesTree, prevPage);
            (!(page instanceof  ActiveWizardPage<?> awp) || awp.isAutoResizeEnabled())) {
            public void widgetSelected(SelectionEvent e) {
        COMPLETE,

        mainComposite.setFont(parent.getFont());
import org.eclipse.swt.layout.GridLayout;
    }
            return null;
        } else if (buttonId == IDialogConstants.NEXT_ID) {
    private String finishButtonLabel = IDialogConstants.OK_LABEL;
        return null;
                        pageControl.setLayoutData(gd);

    }
        if (page == currentPage) {
    protected Point getInitialSize() {
                }
            if (pageControl != null) {
    }
import org.eclipse.swt.layout.GridData;

    }
        // Show the first page first - it may initialize state required later
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
                    cancelCurrentOperation();
        }
                }
        if (buttonId == IDialogConstants.CANCEL_ID) {
    private static DBPImage computePageIcon(
        }
                //prevPage.getControl().setFocus();

        wizardSash.setWeights(220, 780);

    }
     *
            true);
    }
import org.eclipse.jface.layout.GridLayoutFactory;
    public void updateNavigationTree() {
        leftBottomPanel = UIUtils.createComposite(leftPane, 1);
     * @param page the wizard page
                monitorPart.setVisible(false);

        if (prevPage != null) {
                // Create page contents
        }
    public int getShellStyle() {

        item.setText(CommonUtils.toString(page.getTitle(), page.getClass().getSimpleName()));
        return pagesTree;
                IDialogPage[] subPages = ((ICompositeDialogPageContainer) item.getData()).getDialogPages(false, false);

            Shell shell = getShell();
    private final String closeButtonLabel = IDialogConstants.CLOSE_LABEL;

        composite.setLayoutData(data);
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
        }
            pageArea.setRedraw(true);

        layout.horizontalSpacing = 0;
            backPressed();

    private Composite leftBottomPanel;
                page.createControl(pageArea);


        return page instanceof IWizardPage ? (IWizardPage) page : null;
import org.eclipse.swt.graphics.Rectangle;
            }
        } finally {
            .max(0, contentSize.y - containerSize.y));
        this.wizard = wizard;
        updateButtons();
            } else {
    protected void buttonPressed(int buttonId) {
        final Set<PageCompletionMark> shownCompletionMarks = getShownCompletionMarks();

 *
            GridData gd;
                DBPImage itemImage = computePageIcon(page, currentPage, shownCompletionMarks::contains);
        updateNavigationTree();

            return false;
                addNavigationItem(null, page);
        getButton(IDialogConstants.OK_ID).setEnabled(false);
        mainComposite.setLayout(layout);
    protected Tree getPagesTree() {
        }
        composite.setFont(parent.getFont());
                    pagesTree.setSelection(child);
    }
            }
            Point shellSize = shell.getSize();
        GridLayout layout = new GridLayout(0, true);
                }
        }
        IWizard wizard = getWizard();
        updateWindowTitle();
    }
        updatePageCompleteMark(null);
            pageArea.layout();

        }
        } else if (currentPage instanceof IMessageProvider provider) {
            UIUtils.asyncExec(() -> {
    /**
        // Initialize wizard
            // control not created yet
        composite.setFont(parent.getFont());
        return EnumSet.of(PageCompletionMark.ERROR);
        pageArea.setLayoutData(gd);
    protected void updatePageCompletion() {
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
    public void updateWindowTitle() {
        return true;
            delta.y = Math.max(delta.y, pageDelta.y);
    @Override
import java.lang.reflect.InvocationTargetException;
    public void backPressed() {
        gd.horizontalIndent = 20;
        this.finishButtonLabel = finishButtonLabel;
        }
        final String message = currentPage.getMessage();


            return display.getSystemColor(UIStyles.isDarkTheme() ? SWT.COLOR_WIDGET_NORMAL_SHADOW : SWT.COLOR_WIDGET_DARK_SHADOW);
    @Override
            if (selection == null) {

    protected boolean isDisableControlsOnRun() {
        for (IWizardPage page : getWizard().getPages()) {
        if (message == null) {
        composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
        } catch (Throwable e) {
        return contents;
        layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
            }
        layout.marginWidth = 0;
            IDialogPage[] subPages = ((IDialogPageProvider) page).getDialogPages(true, resizeHasOccurred);
    }
    private ProgressMonitorPart monitorPart;
    }
 * MultiPageWizardDialog
 * distributed under the License is distributed on an "AS IS" BASIS,
        updateSize();

            return new Point(0, 0);
                    break;
import org.eclipse.swt.custom.CTabFolder;
        }
            runningOperations.incrementAndGet();
        if (page instanceof IWizardPageNavigable pageNavigable && !pageNavigable.isPageNavigable()) {
    private Tree pagesTree;
        if (isAutoLayoutAvailable() &&
            shell.setText(getWizard().getWindowTitle());
        if (finishButton != null && !finishButton.isDisposed()) {


            @Override
        composite.setLayout(layout);
import org.eclipse.swt.events.SelectionAdapter;
                            }
        if (wizard instanceof IWorkbenchWizard) {
        layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
                if (child.getData() == page) {
    private Color computePageColor(@NotNull IDialogPage page) {

        for (TreeItem item : pagesTree.getItems()) {
            if (isShowTreeIcons()) {
                Point shellCompSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
    private final ListenerList<IPageChangedListener> pageChangedListeners = new ListenerList<>();
    public void removePageChangedListener(IPageChangedListener listener) {
            DBWorkbench.getPlatformUI().showError("Page switch", "Error switching active page", e);
        firePageChanged(new PageChangedEvent(this, getCurrentPage()));
    }
        return composite;
        return new Point(Math.max(0, contentSize.x - containerSize.x), Math
    }
        }
        UIUtils.disposeChildControls(leftBottomPanel);
    private IWizard wizard;

                super.setCanceled(b);
 *
            });
            new TreeItem(parentItem, SWT.NONE);
        final IWizardPage currentPage = getCurrentPage();

            if (wizardPage.isPageComplete()) {
            }
    }
            setShellSize(shellSize.x + delta.x, shellSize.y + delta.y);
            if (item.getData() == page) {
            rightButtonsComposite.dispose();
            return SWT.TITLE | SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL;
        if (page instanceof IWizardPageNavigable && !((IWizardPageNavigable) page).isPageApplicable()) {
        Control contents = super.createContents(parent);
    }
                }
            Button prevButton = getButton(IDialogConstants.BACK_ID);
                            pagesTree.setSelection(item);
import org.jkiss.dbeaver.model.DBPImage;
                            changePage();
            Display display = getShell().getDisplay();
                    }
    @Override
        Composite leftPane = UIUtils.createPlaceholder(wizardSash, 1);
            if (!getWizard().performFinish()) {
            }
    }
        IWizardPage currentPage = getCurrentPage();

    }
                    }
        }
    protected Control createContents(Composite parent) {
    @Override

        try {
                if (b) {
import org.jkiss.code.NotNull;
        return item;
        Composite mainComposite = new Composite(parent, SWT.NONE);
        selectedItem.setImage(DBeaverIcons.getImage(UIIcon.OK_MARK));

            return canShowMark.test(PageCompletionMark.COMPLETE) ? UIIcon.DOTS_BUTTON : null;
import org.eclipse.swt.SWT;
        Rectangle size = getShell().getBounds();
/*
        setMessage(firstPage.getDescription());

                            if (prevItem != null) {
                    if (runningOperations.get() > 0 ||
                        }
                continue;
        Point contentSize = pageControl.computeSize(SWT.DEFAULT, SWT.DEFAULT,


                public void run() {
        if (pageControl == null) {
            }
    }
        GridData gd = new GridData(GridData.FILL_BOTH);
