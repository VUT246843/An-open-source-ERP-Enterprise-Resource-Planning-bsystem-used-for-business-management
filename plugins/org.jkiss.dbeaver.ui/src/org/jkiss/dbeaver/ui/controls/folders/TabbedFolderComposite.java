    }

                newContent.getAccessible().addAccessibleControlListener(new AccessibleControlAdapter() {
        gl.verticalSpacing = 0;
*/
            if (!last) {
import org.eclipse.swt.layout.FillLayout;
            }
                    }
                        return true;


*/
        // Make all sub folders the same size

    @Override
                        if (shift > 0 && shift > getNextFolderPane(FolderPane.this).editorPane.getBounds().height - folderList.getTabHeight()) {
            this.folders = folders;
    @Override
            }
 * You may obtain a copy of the License at
            if (pane == folderPanes[i]) {

                public void controlResized(ControlEvent e) {
        if (shift < 0) {
            }

                    onFolderSwitch(folderList.getElementAt(folderList.getSelectionIndex()).getInfo());
                curGroup.add(folder);
            // Decrease self size and increase next pane's
        for (int i = 0; i < folderPanes.length; i++) {
    }
        private final Sash sash;
    @NotNull
            folderList.select(selectionIndex);
                            return;
        gl.horizontalSpacing = 0;

                if (curGroup == null) {
                }
        @Nullable
    public void setBackground(Color color) {

                    if (inLayoutUpdate) return;
                        // Resize folders
                        }

        }
            ITabbedFolder newFolder = folder.getContents();
        } finally {
    }
        addDisposeListener(e -> {
            Rectangle bounds = pane.editorPane.getBounds();
                    if (folderPane.folderList.getSelectionIndex() != i) {

*/
                @Override
        }
        }
        private Control curContent;
    }
            GridData gd = (GridData) folderPane.folderList.getLayoutData();
    }
        return folders;
            //gd.heightHint = 100;
                                shiftPane(FolderPane.this, shift);
            // Make actual hide/show
        List<List<TabbedFolderInfo>> groups = new ArrayList<>();
    }
            // Layout and notify listeners
            }


/*
    private void reLayout() {
            return lastActiveFolder;
    public void addFolderListener(ITabbedFolderListener listener) {
            this.folderList = new TabbedFolderList(parent, !last);
        return false;
                listener.folderSelected(folder.getId());
        for (FolderPane folderPane : folderPanes) {
                ((GridData)curContent.getLayoutData()).exclude = true;
                }

            Composite newContent = contentsMap.get(folder);
        TabbedFolderList folderList;
        return folderState;
                    public void getRole(AccessibleControlEvent e) {


        gl.verticalSpacing = 0;

                        int shift = e.y - sashBounds.y;
    private TabbedFolderInfo[] folders;
import org.eclipse.swt.graphics.Rectangle;

                newContent.setLayoutData(new GridData(GridData.FILL_BOTH));
            newFolder.aboutToBeShown();
//                    }
            if (UIUtils.isParent(folderPane.editorPane, focusControl)) {

    private FolderPane getNextFolderPane(FolderPane pane) {
    @Nullable
            if (width > maxWidth) {
public class TabbedFolderComposite extends ConComposite implements ITabbedFolderContainer {

    }
                sash = new Sash(parent, SWT.NONE);
    @Nullable
        private void onFolderSwitch(TabbedFolderInfo folder) {

        reLayout();
//                    public void getName(AccessibleEvent e) {
        super(parent, style);
            ((GridData)newContent.getLayoutData()).exclude = false;
                lastActiveFolder = folderPane;
                newContent.setLayout(new FillLayout());
    public ITabbedFolder getActiveFolder() {
import org.eclipse.swt.widgets.Control;
        TabbedFolderInfo[] folders;

    }
        // Set current height to heightHint

        try {
    public TabbedFolderComposite(Composite parent, int style) {
                            return;
        compositePane.setLayoutData(new GridData(GridData.FILL_BOTH));
                newFolder.createControl(newContent);
 * distributed under the License is distributed on an "AS IS" BASIS,
                @Override
            gd.minimumHeight = folderPane.folderList.getTabHeight();
            newContent.setVisible(true);
        return null;
        for (FolderPane folderPane : folderPanes) {

        for (FolderPane pane : folderPanes) {
        }

            }
                            try {
        reLayout();



            // Try to get height info from first folder tab state
                        Rectangle sashBounds = sash.getBounds();

        for (TabbedFolderInfo folder : folders) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                folderDescription.getContents().dispose();
        private ITabbedFolder curFolder;
        }
                        lastActiveFolder = folderPane;
            this.folderList.setLayoutData(gd);
            for (TabbedFolderInfo folderDescription : contentsMap.keySet()) {
        }
            gd.widthHint = maxWidth;
                if (folderId == null || folderPane.folderList.getElementAt(i).getInfo().getId().equals(folderId)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
/*
                return folderPane;
        }

import java.util.ArrayList;
            editorPane.layout();
        }
        FolderPane pane = getActiveFolderPane();
                    return false;
                    TabbedFoldersRegistry.getInstance().saveConfig();
        return pane == null ? 0 : pane.folderList.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
    }
    public TabbedFolderInfo[] getFolders() {
            }
                        if (Math.abs(shift) > 0) {
import org.jkiss.dbeaver.ui.UIUtils;
        }
        super.setBackground(color);
                }
        addTraverseListener(e -> {
//                        e.result = folder.getTooltip();
        for (int i = 0; i < groups.size(); i++) {
                        folderPane.folderList.select(i, setFocus);
                    }
        gl = new GridLayout(2, false);


    private FolderPane getActiveFolderPane() {
        if (selectionIndex < 0) {
                            TabbedFolderComposite.this.setRedraw(false);
        gl.horizontalSpacing = 0;
                    e.gc.setForeground(folderList.widgetNormalShadow);

                maxWidth = width;
    private FolderPane lastActiveFolder = null;
        }
                    }
import org.eclipse.swt.widgets.Sash;
            return getActiveFolder(pane, activate);
    public void removeFolderListener(ITabbedFolderListener listener) {
                    public void widgetSelected(SelectionEvent e) {
            gd.heightHint = folderList.getTabHeight();

            }
                return null;
            }
        TabbedFolderList folderList = folderPane.folderList;
    }
 *
            final TabbedFolderState.TabState tabState = folderState.getTabState(folderPane.folders[0].getId(), true);
                this.sash = null;
        int maxWidth = 0;
            // Notify part about hide/show
        public void setFolders(TabbedFolderInfo[] folders) {
        return null;
    @NotNull
            CSSUtils.markConnectionTypeColor(this.folderList);
        compositePane = new ConComposite(this, SWT.NONE);
        ((GridData) nextPane.editorPane.getLayoutData()).heightHint -= shift;
            if (tabState.height > 0) {
    @Override
            });
 * Folders composite.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        setLayout(gl);
        gl.marginWidth = 0;
            }
        }
/*
    }
            //nextPane.editorPane.
                    e.gc.fillRectangle(0, 1, e.width, e.height - 2);
/*
            if (curContent != null && curFolder != null) {
                    tabState.height = folderPane.folderList.getSize().y;
            FolderPane folderPane = new FolderPane(compositePane, i >= groups.size() - 1);
    }
            editorPane.setLayoutData(gd);
            int width = folderPane.folderList.computeSize(-1, -1, false).x;

                public void widgetSelected(SelectionEvent e) {

                        }
        return null;
        }
        return switchFolder(folderId, true);
                    e.gc.drawLine(0, 0, e.width - 1, 0);
    public boolean switchFolder(@Nullable String folderId, boolean setFocus) {
        });
        if (lastActiveFolder != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                });
        return getActiveFolder(true);
        FolderPane nextPane = getNextFolderPane(curPane);


                gd.heightHint = tabState.height;
                gd.heightHint = TabbedFolderList.SECTION_DIV_HEIGHT;
        folderPanes = new FolderPane[groups.size()];
        }
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridLayout;
//                });
    public boolean switchFolder(@Nullable String folderId) {
            compositePane.layout();


    public void setFolders(@NotNull final String objectId, @NotNull final TabbedFolderInfo[] folders) {
/*
        FolderPane pane = getActiveFolderPane();
                            e.doit = false;
    private final Map<TabbedFolderInfo, Composite> contentsMap = new HashMap<>();
    private TabbedFolderState folderState;
            if (pane != null) {
            this.folderList.setFolders(this.folders);
                return folderPanes[i + 1];
        Composite editorPane;
 *
import org.jkiss.code.Nullable;
//                    @Override
                        if (shift < 0 && Math.abs(shift) > editorPane.getBounds().height - folderList.getTabHeight()) {
            curContent = newContent;
import org.eclipse.swt.graphics.Color;
 * Unless required by applicable law or agreed to in writing, software
            inLayoutUpdate = false;
    }

        gl.marginWidth = 0;
 */
            });
            }
        ((GridData) curPane.editorPane.getLayoutData()).heightHint += shift;
            }
/*

    private boolean inLayoutUpdate;
package org.jkiss.dbeaver.ui.controls.folders;
            folderPane.folderList.addControlListener(new ControlAdapter() {
                    @Override
            }
                }

        listeners.remove(listener);
    private final Composite compositePane;
            }
                });
            GridData gd = (GridData) pane.editorPane.getLayoutData();
                });
                sash.addSelectionListener(new SelectionAdapter() {
        } else {
                curGroup.add(folder);
            // If no folder was activated - do it now
        }
    @Override

import org.eclipse.swt.SWT;
    }
        @Nullable
 * limitations under the License.

import org.eclipse.swt.events.SelectionAdapter;
    }
                sash.addPaintListener(e -> {
                gd.verticalSpan = 2;
        }
 * See the License for the specific language governing permissions and
import java.util.HashMap;
        int selectionIndex = folderList.getSelectionIndex();
        compositePane.setLayout(gl);
        @Nullable
        public FolderPane(Composite parent, boolean last) {
            folderList.addSelectionListener(new SelectionAdapter() {
import java.util.List;
                curFolder.aboutToBeHidden();
        }
    public int getTabsWidth() {
    private final List<ITabbedFolderListener> listeners = new ArrayList<>();
     */
*/
            selectionIndex = 0;
                    groups.add(curGroup = new ArrayList<>());
                    e.gc.drawLine(0, e.height - 1, e.width - 1, e.height - 1);
                        }

     * @param objectId ID used to save/load folders state
        List<TabbedFolderInfo> curGroup = null;
                gd = new GridData(GridData.FILL_HORIZONTAL);
 * SWT.LEFT, SWT.RIGHT - tabs orientation
    private ITabbedFolder getActiveFolder(FolderPane folderPane, boolean activate) {
            if (folder.isEmbeddable()) {
}
                curGroup = null;
    /**
            for (ITabbedFolderListener listener : listeners) {
                // Set height for all tabs but last
            editorPane = UIUtils.createPlaceholder(parent, 1);
    public TabbedFolderState getFolderState() {
        }
            gd.heightHint = bounds.height;
            folderPanes[i] = folderPane;
 */
            }
            if (!last) {
                    e.gc.setForeground(folderList.widgetForeground);
        if (folderPanes.length == 1) {
                pane.folderList.handleTraverse(e);
     * @param folders  list of folders
                            e.doit = false;
            if (newContent == null) {
            GridData gd = new GridData(GridData.FILL_VERTICAL);
import org.eclipse.swt.widgets.Composite;
            }
        for (FolderPane folderPane : folderPanes) {

        GridLayout gl = new GridLayout(2, false);
 * DBeaver - Universal Database Manager
            List<TabbedFolderInfo> group = groups.get(i);
                                TabbedFolderComposite.this.setRedraw(true);
/**
            return folderPanes[0];
import org.eclipse.swt.layout.GridData;
        // Re-layout
            folderPane.setFolders(group.toArray(new TabbedFolderInfo[group.size()]));
                    @Override
*/
    @Override
    }
                            }

        gl.marginHeight = 0;
import java.util.Map;
                curContent.setVisible(false);
            for (int i = 0; i < folderPane.folderList.getNumberOfElements(); i++) {
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.css.CSSUtils;
            gd = new GridData(GridData.FILL_BOTH);
        return folderList.getElementAt(selectionIndex).getInfo().getContents();
        listeners.add(listener);
        gl.marginHeight = 0;
            // Increase self size and decrease next pane's
                groups.add(curGroup = new ArrayList<>());
        for (int i = 0; i < folderPanes.length - 1; i++) {
        this.folders = folders;
            if (curContent != null && curFolder != null) {
    }
        });
            curFolder = newFolder;


        inLayoutUpdate = true;
                newContent = new Composite(editorPane, SWT.NONE);
    private void shiftPane(FolderPane curPane, int shift) {
                sash.setLayoutData(gd);
                        e.detail = ACC.ROLE_TABITEM;
            if (!activate) {
        if (pane != null) {


import org.jkiss.dbeaver.ui.ConComposite;
            FolderPane folderPane = folderPanes[i];
            FolderPane pane = getActiveFolderPane();
            } else {
    private class FolderPane {
                            } finally {

                contentsMap.put(folder, newContent);
    private FolderPane[] folderPanes;
        Control focusControl = getDisplay().getFocusControl();
    public ITabbedFolder getActiveFolder(boolean activate) {
//                newContent.getAccessible().addAccessibleListener(new AccessibleAdapter() {
        folderState = TabbedFoldersRegistry.getInstance().getFolderState(objectId);
 *
