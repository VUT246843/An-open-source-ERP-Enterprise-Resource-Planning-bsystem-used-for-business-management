    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
            return super.supportsDrop(otherNode);
    }
}
            } else if (node instanceof DBNBookmark) {
    }
import org.jkiss.dbeaver.model.navigator.DBNResource;

        }
 * DBeaver - Universal Database Manager
 */
 * Unless required by applicable law or agreed to in writing, software
                    node.getNodeDisplayName(),
/**
    public void pasteNodes(@NotNull Collection<DBNNode> nodes) throws DBException {
    }
 *
        } else {
        if (otherNode instanceof DBNDatabaseNode || otherNode instanceof DBNBookmark) {
package org.jkiss.dbeaver.ui.resources.bookmarks;
    @Override
 *
        }
            }

    public DBNBookmarkFolder(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException {
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;

        return super.getResourceNodeIcon();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    public boolean supportsPaste(@NotNull DBNNode other) {
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            return true;
        }
 * See the License for the specific language governing permissions and
import java.util.Collection;
import org.eclipse.core.runtime.CoreException;
    }
 *
        for (DBNNode node : nodes) {
import org.jkiss.dbeaver.model.DBPImage;
 * Licensed under the Apache License, Version 2.0 (the "License");
                BookmarksHandlerImpl.createBookmark((DBNDatabaseNode) node,
        IResource resource = getResource();
            }
public class DBNBookmarkFolder extends DBNResource {
        if (NavigatorResources.isRootResource(getOwnerProject(), resource)) {
import org.jkiss.dbeaver.DBException;
 * DBNBookmarkFolder
                    (IFolder) getResource());
    }
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBPImage getResourceNodeIcon() {
    @Override
            if (node instanceof DBNDatabaseNode) {

                    (IFolder) getResource());
                BookmarksHandlerImpl.createBookmark((DBNDatabaseNode) node,
 * limitations under the License.
    @Override
    @Override
 * You may obtain a copy of the License at
        super(parentNode, resource, handler);


import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNNode;
import java.util.Collections;


import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.code.Nullable;
    @Override
        for (DBNNode node : nodes) {
            return UIIcon.BOOKMARK_FOLDER;
import org.jkiss.dbeaver.ui.UIIcon;
            if (node instanceof DBNDatabaseNode) {
                super.dropNodes(monitor, Collections.singleton(node));
        return other instanceof DBNDatabaseNode;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                    node.getNodeDisplayName(),
