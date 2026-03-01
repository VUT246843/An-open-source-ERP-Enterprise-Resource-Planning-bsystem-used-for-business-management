    {
            }
            visualizer.addLoadListener(listener);



                return false;
import org.eclipse.ui.IEditorInput;
 *

            public boolean performSearch(String searchString, int options) {
            listeners.add(listener);
        service.addJobChangeListener(new JobChangeAdapter() {
    {
            return searchRunner;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            return ((MultiPageEditorSite)site).getMultiPageEditor();
import java.util.List;

        return false;
import org.jkiss.dbeaver.ui.UIUtils;
        IEditorInput editorInput = getEditorPart().getEditorInput();
        super.disposeControl();
    private IDatabaseEditor workbenchPart;
import org.eclipse.ui.IEditorPart;
            DBSObject databaseObject = ((IDatabaseEditorInput) editorInput).getDatabaseObject();
        if (curService != null) {
    }

            }
                for (DBRRunnableParametrized<OBJECT_TYPE> listener : listeners) {
    }
        if (editorInput instanceof IDatabaseEditorInput) {
            for (IContributionItem item : extToolBar.getItems()) {
        final IMenuService menuService = UIUtils.getActiveWorkbenchWindow().getService(IMenuService.class);
            return true;
            listeners.clear();

import org.eclipse.ui.menus.IMenuService;
        service.schedule();
    }
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
        }
        }
            DBCExecutionContext context = ((IDatabaseEditorInput) editorInput).getExecutionContext();
            contributionManager.update(true);
            getMainEditorPart().removePropertyListener(propertyListener);
                    } catch (Exception e) {
import java.util.ArrayList;
                }
    protected void populateCustomActions(ContributionManager contributionManager) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
            public void cancelSearch() {

                        listener.run(result);
    public ObjectEditorPageControl(Composite parent, int style, IDatabaseEditor workbenchPart)
        public void completeLoading(OBJECT_TYPE result) {

        if (menuService != null) {
 * limitations under the License.
import org.jkiss.dbeaver.Log;
    @Override
            if (!listeners.isEmpty()) {
        }
                        // ignore
    }
    public class ObjectsLoadVisualizer<OBJECT_TYPE> extends ProgressVisualizer<OBJECT_TYPE> {
                    } catch (InterruptedException e) {
            }
            }
        private List<DBRRunnableParametrized<OBJECT_TYPE>> listeners = new ArrayList<>();
        }

 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.ISearchExecutor;
    protected ISearchExecutor getSearchRunner() {
        public ObjectsLoadVisualizer() {
        return new ISearchExecutor() {
        super(parent, style);
                return false;
    }
            menuService.populateContributionManager(extToolBar, "toolbar:object.editor.toolbar");
    public synchronized <OBJECT_TYPE> void runService(LoadingJob<OBJECT_TYPE> service) {
        return visualizer;
            if (context == null) {
    @Override


import org.jkiss.dbeaver.ui.LoadingJob;
        // Add dynamic toolbar contributions
    }
                    }
        IWorkbenchPartSite site = workbenchPart.getSite();

import org.eclipse.jface.action.IContributionItem;
import java.lang.reflect.InvocationTargetException;
                        log.error(e);
    public void disposeControl()
        return workbenchPart;
import org.eclipse.ui.IPropertyListener;
public class ObjectEditorPageControl extends ProgressPageControl {
 * you may not use this file except in compliance with the License.
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private IEditorPart getMainEditorPart()
        if (searchRunner != null) {
        });
            curService.cancel();
 *     http://www.apache.org/licenses/LICENSE-2.0
            propertyListener = null;
                synchronized(ObjectEditorPageControl.this) {
            }

 */
        @Override
            @Override
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;

        };
        ISearchExecutor searchRunner = super.getSearchRunner();
        this.workbenchPart = workbenchPart;
import org.eclipse.jface.action.ContributionManager;
            return databaseObject != null && DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(databaseObject.getClass(), DBEObjectManager.class) != null;
    public <OBJECT_TYPE> ObjectsLoadVisualizer<OBJECT_TYPE>  createDefaultLoadVisualizer(DBRRunnableParametrized<OBJECT_TYPE> listener) {
            }
            }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
    protected synchronized boolean cancelProgress() {
            super.completeLoading(result);
    @Override
                        break;
                    try {


import org.jkiss.dbeaver.runtime.DBWorkbench;

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        }
            @Override
    }
                    curService = null;
    public IDatabaseEditor getEditorPart()
        }
        ToolBarManager extToolBar = new ToolBarManager();
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
    }
            public void done(IJobChangeEvent event) {
        if (listener != null) {
        public void addLoadListener(DBRRunnableParametrized<OBJECT_TYPE> listener) {
                return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                }
            if (context.getDataSource().getInfo().isReadOnlyMetaData()) {
/*
    {
                contributionManager.add(item);
import org.eclipse.ui.IWorkbenchPartSite;
        }
import org.eclipse.jface.action.ToolBarManager;
    private IPropertyListener propertyListener;
        curService = service;
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.ui.part.MultiPageEditorSite;
    public boolean isObjectEditable()
        return false;
        if (!extToolBar.isEmpty()) {
        }
        if (site instanceof MultiPageEditorSite) {
        } else {
    {

            return workbenchPart;
    private static final Log log = Log.getLog(ObjectEditorPageControl.class);
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
        }
    }
        }
 * DBeaver - Universal Database Manager


        if (propertyListener != null) {


                    } catch (InvocationTargetException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
    }
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
 *

                        log.error(e.getTargetException());
    private volatile LoadingJob curService = null;
        ObjectsLoadVisualizer<OBJECT_TYPE> visualizer = new ObjectsLoadVisualizer<>();
            @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

