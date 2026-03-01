
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        bottomRight.addPlaceholder(ShellProcessView.VIEW_ID); //$NON-NLS-1$
        // Bottom left.
            editorArea);
        IPlaceholderFolderLayout rightMiddle = layout.createPlaceholderFolder(
    public void createInitialLayout(IPageLayout layout)

 *

        bottomRight.addPlaceholder(IPageLayout.ID_BOOKMARKS);
}
public class DBeaverPerspective implements IPerspectiveFactory


        // Bottom right.
    public static final String FOLDER_NAVIGATION = "navigation"; //$NON-NLS-1$
        layout.addShowViewShortcut(ProjectNavigatorView.VIEW_ID);
        rightTop.addPlaceholder(IPageLayout.ID_OUTLINE);
            FOLDER_RIGHT_TOP,
import org.jkiss.dbeaver.ui.navigator.database.DatabaseBrowserView;
    public static final String FOLDER_BOTTOM_RIGHT = "bottomRight"; //$NON-NLS-1$
 *
 * you may not use this file except in compliance with the License.
        IFolderLayout bottomLeft = layout.createFolder(
 *
            FOLDER_RIGHT);
        layout.addShowViewShortcut(ProjectExplorerView.VIEW_ID);
            BOTTOM_BOTTOM_LEFT,
        bottomRight.addPlaceholder(QueryManagerView.VIEW_ID);

            0.8f,
        bottomLeft.addView(ProjectExplorerView.VIEW_ID);
            editorArea);
        rightTop.addPlaceholder(IPageLayout.ID_PROP_SHEET);
        treeFolder.addPlaceholder(TemplatesView.ID);
        treeFolder.addView(DatabaseNavigatorView.VIEW_ID);
            0.5f,
            0.7f,
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;
        layout.addShowViewShortcut(QueryManagerView.VIEW_ID);
            FOLDER_NAVIGATION,
    @Override
            editorArea);
        IFolderLayout treeFolder = layout.createFolder(
        layout.addShowViewShortcut(DatabaseNavigatorView.VIEW_ID);
import org.eclipse.ui.IPlaceholderFolderLayout;
        //rightMiddle.addPlaceholder(IPageLayout.ID_OUTLINE);
            FOLDER_RIGHT,
    }
            FOLDER_RIGHT_TOP,
            IPageLayout.LEFT,
        IPlaceholderFolderLayout right = layout.createPlaceholderFolder(
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Navigator
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        // Right - properties, help and outline
            0.5f,
        IPlaceholderFolderLayout bottomRight = layout.createPlaceholderFolder(
    {
        IPlaceholderFolderLayout rightTop = layout.createPlaceholderFolder(
        rightTop.addPlaceholder(IActionConstants.HELP_VIEW_ID);

        bottomRight.addPlaceholder(IPageLayout.ID_PROGRESS_VIEW);
        //layout.setEditorAreaVisible(false);
            IPageLayout.BOTTOM,
        bottomRight.addPlaceholder("org.eclipse.search.ui.views.SearchView"); //$NON-NLS-1$
import org.jkiss.dbeaver.ui.navigator.project.ProjectExplorerView;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.views.process.ShellProcessView;
import org.eclipse.ui.texteditor.templates.TemplatesView;
            0.7f,

        layout.addShowViewShortcut(IActionConstants.LOG_VIEW_ID);

import org.jkiss.dbeaver.ui.IActionConstants;
import org.eclipse.ui.IPerspectiveFactory;
            IPageLayout.TOP,
    public static final String PERSPECTIVE_ID = "org.jkiss.dbeaver.core.perspective"; //$NON-NLS-1$
            FOLDER_NAVIGATION);
        bottomRight.addPlaceholder(IActionConstants.LOG_VIEW_ID);

 * See the License for the specific language governing permissions and
        treeFolder.addView(ProjectNavigatorView.VIEW_ID);
        // Search views
    public static final String BOTTOM_BOTTOM_LEFT = "bottomLeft"; //$NON-NLS-1$
    public static final String FOLDER_RIGHT = "right"; //$NON-NLS-1$
package org.jkiss.dbeaver.ui.perspective;
            0.30f,
/*
import org.jkiss.dbeaver.ui.views.qm.QueryManagerView;
 * You may obtain a copy of the License at
            FOLDER_RIGHT);
        bottomLeft.addPlaceholder(DatabaseBrowserView.VIEW_ID);
        //IPlaceholderFolderLayout bottomLeft = layout.createPlaceholderFolder(
        String editorArea = layout.getEditorArea();

    public static final String FOLDER_RIGHT_TOP = "rightTop"; //$NON-NLS-1$
import org.eclipse.ui.IFolderLayout;
    public static final String FOLDER_RIGHT_MIDDLE = "rightMiddle"; //$NON-NLS-1$
        // Add view shortcuts
 * limitations under the License.
            IPageLayout.RIGHT,
            FOLDER_BOTTOM_RIGHT,

 * Unless required by applicable law or agreed to in writing, software
            IPageLayout.BOTTOM,
import org.jkiss.dbeaver.ui.navigator.project.ProjectNavigatorView;
            IPageLayout.BOTTOM,
{
        bottomRight.addPlaceholder(ShellProcessView.VIEW_ID);
        bottomRight.addPlaceholder(IPageLayout.ID_TASK_LIST);
import org.eclipse.ui.IPageLayout;
 */
