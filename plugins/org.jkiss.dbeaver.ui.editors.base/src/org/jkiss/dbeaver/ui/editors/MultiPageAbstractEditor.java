            }
                        }
import org.jkiss.utils.CommonUtils;
 */
            if (topRight != null) {
            Control topRight = createTopRightControl(tabFolder);
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.layout.GridDataFactory;
package org.jkiss.dbeaver.ui.editors;

                if (activePageIndex != -1) {
            super.init(site, input);
import org.jkiss.dbeaver.ui.screenreaders.ScreenReader;
            int tabHeight = getDefaultTabHeight(tabFolder);
    protected IEditorPart getEditor(int pageIndex) {
 *
        return size.y;
        for (Image img : oldImages) {
    private static int getDefaultTabHeight(@NotNull CTabFolder tabFolder) {
 * DBeaver - Universal Database Manager

                    if (tabItem != null && !tabItem.isDisposed()) {
    @Override
import org.eclipse.ui.part.MultiPageEditorPart;
    public void doSave(IProgressMonitor monitor) {
    protected final void activateEditor() {
import org.eclipse.swt.custom.CTabFolder;
            s -> container.setFont(BaseThemeSettings.instance.partTitleFont),
        // nothing
        oldImages.clear();
        ScreenReader screenReader = ScreenReader.getScreenReader(storedScreenReader);

 *
        createPages();
        if (!(getContainer() instanceof CTabFolder folder) || folder.isDisposed()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                    CTabItem tabItem = tabsList.get(activePageIndex);
    private final List<Image> oldImages = new ArrayList<>();

            }

 * Licensed under the Apache License, Version 2.0 (the "License");
                tabHeight = Math.max(tabHeight, topRight.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
        this.setContainerStyles();
            // Pages re-initialization. Do not call init because it recreates selection provider
        Image editorImage = titleImage.createImage();
        item.getControl().getAccessible().addAccessibleListener(new EditorAccessibleAdapter(item.getControl())); 
                super.setFocus();

 * You may obtain a copy of the License at
            container
        if (pageContainer instanceof CTabFolder tabFolder && !pageContainer.isDisposed()) {
        if (CommonUtils.equalObjects(curTitleImage, titleImage)) {
     */
    protected CTabItem createItem(int index, Control control) {
            firePropertyChange(PROP_INPUT);
                            Control control = tabItem.getControl();
        for (int i = pageCount; i > 0; i--) {
                    }
    }
    public void doSaveAs() {
        }
        }
    protected int getEditorCount() {
    protected void setContainerStyles() {
        if (pageContainer instanceof CTabFolder tabFolder) {
import org.jkiss.dbeaver.Log;
    /**
        setTitleImage(input.getImageDescriptor());

    public void dispose() {
        CSSUtils.markConnectionTypeColor(pageContainer);
        }
/**
        try {
    @Override
    protected void createPages() {
                tabFolder.getItem(index).setToolTipText(toolTip);
            removePage(i - 1);
            tabFolder.setMRUVisible(true);
import org.eclipse.swt.widgets.*;
            case JAWS -> {
    }
        }

    }
        toolBar.dispose();
        } else {
    protected void setPageToolTip(int index, String toolTip) {
import org.eclipse.core.runtime.IProgressMonitor;
    protected void updateTopRightControl() {

                }
        Point size = toolBar.computeSize(SWT.DEFAULT, SWT.DEFAULT);
import java.util.List;
    }
            log.error("Error updating CTabFolder top right control", e);

import org.jkiss.dbeaver.runtime.DBWorkbench;
            tabFolder.setFont(BaseThemeSettings.instance.partTitleFont);
import org.eclipse.swt.graphics.Point;

public abstract class MultiPageAbstractEditor extends MultiPageEditorPart {
        // nothing
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                if (activePageIndex != -1) {
 * See the License for the specific language governing permissions and
        }
        int pageCount = getPageCount();
        return item;
 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    if (tabItem != null && !tabItem.isDisposed()) {
        }

    }
                        if (tabItem != null && !tabItem.isDisposed()) {
    }
        Composite pageContainer = getContainer();
import org.eclipse.ui.*;
    }
import java.lang.reflect.Method;
            updateFolder.setAccessible(true);
    protected final void deactivateEditor() {
    @Override
        parent.setLayout(GridLayoutFactory.fillDefaults().extendedMargins(0, 0, 2, 0).create());
    }
        BaseThemeSettings.instance.addPropertyListener(
        if (part instanceof IActiveWorkbenchPart) {
    private int activePageIndex = -1;
        return ((CTabFolder) getContainer()).getItemCount();
        Item item = ((CTabFolder) getContainer()).getItem(pageIndex);
            return;
        ToolItem item = new ToolItem(toolBar, SWT.PUSH);
                    CTabItem tabItem = tabsList.get(activePageIndex);
            case NARRATOR, NVDA, OTHER -> {
                            }
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
            return;
                return (IEditorPart) data;
    protected Control createTopRightControl(Composite composite) {
        }
    }
        container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

            if (index < tabFolder.getItemCount()) {
                tabFolder.setTopRight(topRight, SWT.RIGHT | SWT.WRAP);
        }
        // Sample toolbar's height as it fits quite nicely.
                    }
import org.jkiss.dbeaver.ui.*;
                ((IActiveWorkbenchPart) part).deactivatePart();
            setSite(site);
                }
     * The method do save as
    @Override
            }

        } catch (ReflectiveOperationException e) {
        CTabItem item = super.createItem(index, control);
import java.util.ArrayList;
    @Override
     */
        return container;
        if (getContainer() != null && getContainer().isDisposed()) {


    public void setFocus() {
    }
        }
            }
import org.jkiss.dbeaver.ui.screenreaders.ScreenReaderPreferences;
/*
        oldImages.add(editorImage);
            return null;

                                control.forceFocus();
        }
                        if (tabItem.getControl() != null && !tabItem.getControl().isDisposed()) {
import org.jkiss.dbeaver.ui.css.CSSUtils;

    }


        }
        }
        }
        return false;
    public void recreatePages() {
            setInput(input);
import org.eclipse.swt.graphics.Image;


 */
        curTitleImage = titleImage;
            case DEFAULT -> {
 * you may not use this file except in compliance with the License.
}    }
        Composite pageContainer = getContainer();
            final IWorkbenchPart part = getEditor(activePageIndex);
    protected void pageChange(int newPageIndex) {
                            if (control != null && !control.isDisposed()) {
    public IEditorPart getActiveEditor() {
    }
    }
        if (item != null && !item.isDisposed()) {
        return super.getActiveEditor();

            updateFolder.invoke(folder, 10 /*UPDATE_TAB_HEIGHT | REDRAW*/);
        setPartName(input.getName());
        // Add small margin on top so part's tab doesn't touch editor's tabs
        return null;
            UIUtils.dispose(img);
        return null;
import org.eclipse.jface.layout.GridLayoutFactory;
        final IWorkbenchPart part = getEditor(pageIndex);
    /**

        tabsList.add(item);
    @Override
        final int pageIndex = getActivePage();
        if (activePageIndex >= 0 && getEditorCount() > activePageIndex) {
            ((IActiveWorkbenchPart) part).activatePart();
        String storedScreenReader = store.getString(ScreenReaderPreferences.PREF_SCREEN_READER_ACCESSIBILITY);
            return;
    }
        switch (screenReader) {
            tabFolder.setTabPosition(SWT.TOP);
    }
                            tabItem.getParent().forceFocus();
        this.activePageIndex = newPageIndex;
    }
        CTabFolder container = super.createContainer(parent);
     */

import org.eclipse.swt.SWT;
        // Deactivate the nested services from the last active service locator.
    protected void setTitleImage(ImageDescriptor titleImage) {
    }
    protected CTabFolder createContainer(Composite parent) {


            if (data instanceof IEditorPart) {
     * Causes the top right control to be updated.
    @Override
        deactivateEditor();
            if (part instanceof IActiveWorkbenchPart) {
        ToolBar toolBar = new ToolBar(tabFolder, SWT.FLAT | SWT.RIGHT);
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.setTitleImage(editorImage);
        if (getEditorInput() == null) {
        }
 * Unless required by applicable law or agreed to in writing, software
    /**
            }
    @Override

        if (getContainer().isDisposed()) {
            Object data = item.getData();
                            tabItem.getControl().setFocus();
        super.pageChange(newPageIndex);
    private static final Log log = Log.getLog(MultiPageAbstractEditor.class);
    @Override
 * MultiPageAbstractEditor
                        }

        item.setImage(DBeaverIcons.getImage(UIIcon.SEPARATOR_V));
    private final List<CTabItem> tabsList = new ArrayList<>();
     * The method do save
        // Add a dummy item as empty toolbars are considered {0, 0} on some platforms
        super.dispose();


    }

 * limitations under the License.
    public boolean isSaveAsAllowed() {
            UIFonts.Eclipse.PART_TITLE_FONT,
            Method updateFolder = CTabFolder.class.getDeclaredMethod("updateFolder", int.class);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            tabFolder.setSimple(true);
import org.eclipse.swt.custom.CTabItem;
        );
import org.jkiss.code.NotNull;

    }
    @Override
        activateEditor();
    private ImageDescriptor curTitleImage;
            tabFolder.setTabHeight(tabHeight);
