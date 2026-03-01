                        }


import org.jkiss.dbeaver.model.navigator.DBNNode;
            if (!params.isLikeCondition() && !objectNameMask.endsWith("%")) { //$NON-NLS-1$
    }
                if (monitor.isCanceled()) {
                            searchResult.addObjects(Collections.singletonList(node));
import org.jkiss.dbeaver.model.navigator.DBNModel;
 * You may obtain a copy of the License at
                } catch (DBException e) {
    }
            searchResult.fireChange(new AbstractSearchResult.DatabaseSearchFinishEvent(searchResult, totalObjects));
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
            log.debug(e);
import org.jkiss.code.NotNull;
                        @NotNull DBSStructureAssistant.ObjectsSearchParams params) {

            Collection<DBSObjectReference> objects = structureAssistant.findObjectsByMask(localMonitor, executionContext, params);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        this.structureAssistant = structureAssistant;
 *
import org.jkiss.dbeaver.DBException;
    public boolean canRerun() {
                try {
                    DBSObject object = reference.resolveObject(localMonitor);
    @Override
    }
    private SearchMetadataResult searchResult;
    private static final Log log = Log.getLog(SearchMetadataQuery.class);
import org.jkiss.dbeaver.utils.GeneralUtils;
package org.jkiss.dbeaver.ui.search.metadata;
    @Override
    public ISearchResult getSearchResult() {
    }
    public IStatus run(IProgressMonitor monitor) throws OperationCanceledException {
import java.util.Collection;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                objectNameMask = objectNameMask + "%"; //$NON-NLS-1$
    @Override
        return true;
                        DBNNode node = navigatorModel.getNodeByObject(localMonitor, object, false);
                    break;
            return GeneralUtils.makeExceptionStatus(e);
    @NotNull
    private final DBSStructureAssistant structureAssistant;
                }
    @Override
    SearchMetadataQuery(@NotNull DBPDataSource dataSource, @NotNull DBSStructureAssistant<?> structureAssistant,
    public String getLabel() {
                        if (node != null) {
                            totalObjects++;
import org.eclipse.search.ui.ISearchResult;
    private final DBCExecutionContext executionContext;
import org.eclipse.core.runtime.OperationCanceledException;
}
        if (searchResult == null) {
            searchResult = new SearchMetadataResult(this);
 * See the License for the specific language governing permissions and
                    log.error(e);
        this.params = params;
                    if (object != null) {
import org.jkiss.dbeaver.model.struct.DBSObject;

        return params.getMask();
        return true;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (DBException e) {
 *
import java.util.Collections;
 *

            int totalObjects = 0;

            String objectNameMask = params.getMask();
 */
                }
    @Override
    }
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
/*
                params.setMask(objectNameMask);

    private final DBSStructureAssistant.ObjectsSearchParams params;
    public boolean canRunInBackground() {
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.model.DBUtils;
import org.eclipse.core.runtime.Status;


 * distributed under the License is distributed on an "AS IS" BASIS,
            DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
                    }
        }
        return searchResult;
import org.eclipse.search.ui.ISearchQuery;
            return Status.OK_STATUS;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
        try {
import org.jkiss.dbeaver.Log;

public class SearchMetadataQuery implements ISearchQuery {

        this.executionContext = DBUtils.getDefaultContext(dataSource, true);
 * Unless required by applicable law or agreed to in writing, software

            for (DBSObjectReference reference : objects) {
import org.jkiss.dbeaver.ui.search.AbstractSearchResult;
import org.eclipse.core.runtime.IProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            DBRProgressMonitor localMonitor = RuntimeUtils.makeMonitor(monitor);
 * DBeaver - Universal Database Manager
