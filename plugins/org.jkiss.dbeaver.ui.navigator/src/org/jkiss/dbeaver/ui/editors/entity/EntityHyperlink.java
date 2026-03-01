    public String getHyperlinkText()
    @Override
import org.jkiss.dbeaver.model.struct.DBSAlias;
                }
            } catch (DBException e) {
import org.jkiss.dbeaver.model.DBUtils;
public class EntityHyperlink implements IHyperlink
        this.site = site;
    private IWorkbenchSite site;

import org.jkiss.code.NotNull;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
/**
    @Override

    {
import org.eclipse.core.runtime.IStatus;
 * distributed under the License is distributed on an "AS IS" BASIS,
        protected ObjectFinder() {

 * You may obtain a copy of the License at
/*
import org.jkiss.dbeaver.utils.GeneralUtils;
 */
            super("Find object node by reference");
                        }
import org.eclipse.ui.IWorkbenchSite;

                    });
                        public void run() {
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull
                            NavigatorUtils.executeNodeAction(DBXTreeNodeHandler.Action.open, node, site);
 * See the License for the specific language governing permissions and
 *
    public EntityHyperlink(IWorkbenchSite site, DBSObjectReference reference, IRegion region)
        this.reference = reference;
        return DBUtils.getObjectFullName(reference, DBPEvaluationContext.UI);
import org.jkiss.dbeaver.DBException;
    {
        {
            monitor.beginTask("Resolve object " + reference.getName(), 1);
                return GeneralUtils.makeExceptionStatus(e);
    @Override
                }
            }
        public IStatus run(@NotNull DBRProgressMonitor monitor)
    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNodeHandler;

    public String getTypeLabel()
 * you may not use this file except in compliance with the License.
                if (object instanceof DBSAlias) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            return Status.OK_STATUS;
            try {
    }
{
        @Override
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
    public void open()
 * DBeaver - Universal Database Manager
    }
    @Override
 * EntityHyperlink

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                node = DBNUtils.getNodeByObject(monitor, object, true);
    }

import org.jkiss.dbeaver.model.struct.DBSObject;
    }
                    UIUtils.asyncExec(new Runnable() {
        this.region = region;
        return region;
 *     http://www.apache.org/licenses/LICENSE-2.0

                DBSObject object = reference.resolveObject(monitor);
                if (node != null) {
    {
        private DBNDatabaseNode node;
    private IRegion region;
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            } finally {
import org.eclipse.jface.text.IRegion;
                        @Override
 */

import org.jkiss.dbeaver.model.navigator.DBNUtils;
    private class ObjectFinder extends AbstractJob {

import org.jkiss.dbeaver.ui.UIUtils;
                    object = ((DBSAlias) object).getTargetObject(monitor);
                monitor.done();
import org.eclipse.core.runtime.Status;
 *

        new ObjectFinder().schedule();
        }
    private DBSObjectReference reference;
        }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.eclipse.jface.text.hyperlink.IHyperlink;


        return null;
    public IRegion getHyperlinkRegion()
    {
package org.jkiss.dbeaver.ui.editors.entity;
 * Licensed under the Apache License, Version 2.0 (the "License");
