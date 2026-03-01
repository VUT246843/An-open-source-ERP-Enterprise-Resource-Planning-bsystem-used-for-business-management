    @Override
import org.jkiss.code.Nullable;
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.model.navigator.DBNNode;
package org.jkiss.dbeaver.ui.resources.bookmarks;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 */
        return storage.getDescription() + dsInfo;
    {
        Collection<DBPDataSourceContainer> dataSources = getAssociatedDataSources();
                InputStream data = storage.serialize();
    @Nullable
                throw new DBException("Can't rename bookmark", e);
import org.jkiss.dbeaver.utils.RuntimeUtils;
        return CommonUtils.isEmpty(dsPath) ? super.getNodeDisplayName() : dsPath.get(dsPath.size() - 1);
    }
    }
    {
    @Override
        }
import org.jkiss.dbeaver.model.DBPImage;


 * Copyright (C) 2010-2025 DBeaver Corp and others
            }


            } catch (Exception e) {
    @Override
import org.eclipse.core.resources.IResource;
import java.io.InputStream;
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;
                storage.setTitle(newName);

    @Override
 *
    {
    public String getNodeDescription()
        storage = new BookmarkStorage((IFile)resource, true);

    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
public class DBNBookmark extends DBNResource
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final BookmarkStorage storage;

                file.setContents(data, true, false, RuntimeUtils.getNestedMonitor(monitor));
{
            dsInfo = " ('" + dataSource.getName() + "' - " + dataSource.getDriver().getName() + ")";
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
    public String getNodeTargetName() {
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException
 */
        return storage.getTitle();
        String dsInfo = "";
 * You may obtain a copy of the License at
    {
 * you may not use this file except in compliance with the License.
        storage.dispose();
/*
import org.eclipse.core.resources.IFile;
import org.jkiss.dbeaver.model.navigator.DBNResource;
/**
 * limitations under the License.
        if (!CommonUtils.isEmpty(dataSources)) {
    public DBPImage getResourceNodeIcon() {
    }
            DBPDataSourceContainer dataSource = dataSources.iterator().next();
    protected void dispose(boolean reflect)
    }
    }
        List<String> dsPath = storage.getDataSourcePath();
    }
 *
        return storage;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }

        return storage.getImage();
            try {
 * DBNBookmark
    @NotNull
import org.jkiss.dbeaver.DBException;

    @NotNull

    }
 *     http://www.apache.org/licenses/LICENSE-2.0

        IFile file = (IFile) getResource();
import java.util.List;
        super.dispose(reflect);
        if (file != null) {
    public BookmarkStorage getStorage() {
    {
    @NotNull
    DBNBookmark(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getNodeDisplayName()

        }
        super(parentNode, resource, handler);
import java.util.Collection;
