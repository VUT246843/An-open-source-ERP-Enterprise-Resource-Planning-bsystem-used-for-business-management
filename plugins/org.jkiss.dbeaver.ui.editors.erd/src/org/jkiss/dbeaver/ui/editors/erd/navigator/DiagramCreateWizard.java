            if (element != null) {

        }
    }
import org.eclipse.ui.INewWizard;
        catch (InterruptedException ex) {
                ex = ite.getTargetException();
import java.util.List;
    	super.setContainer(wizardContainer);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            if (ex instanceof InvocationTargetException ite) {
            }
                if (node instanceof DBNDatabaseNode) {
	@Override
                ex);
        try {
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
	        	try {
import org.eclipse.core.resources.IFolder;


import org.eclipse.jface.wizard.IWizardContainer;
                Collection<DBSEntity> tables = DiagramObjectCollector.collectTables(
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecoratorDefault;

        addPage(pageContent);
			}
					errorMessage = e.getMessage();
            if (handler != null) {
                    true);
            try {
    @Override
            DBWorkbench.getPlatformUI().showError(
    	if (pageContent != null) {
                "Cannot create diagram",
import org.eclipse.core.runtime.Platform;
}
                handler.openResource(creator.diagramFile);
    private class DiagramCreator implements DBRRunnableWithProgress {
        setNeedsProgressMonitor(true);
            for (DBNNode node : initialContent) {
            this.folder = diagramFolder;
        	    if (Platform.getAdapterManager().getAdapter(selection.getFirstElement(), DBSEntity.class) != null) {
    private DiagramCreateWizardPage pageContent;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    private DBPProject project;
    private IStructuredSelection entitySelection;
package org.jkiss.dbeaver.ui.editors.erd.navigator;
        	if (activeProject == null) {

        }


    }
                    new DiagramCollectSettingsDefault(),
import org.eclipse.jface.viewers.IStructuredSelection;
            this.project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(diagramFolder.getProject());
        {
        @Override
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
				} catch (CoreException e) {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            //WizardDialog call
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.navigator.DBNNode;
            DBPResourceHandler handler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(creator.diagramFile);
import org.jkiss.dbeaver.model.erd.DiagramObjectCollector;
import org.jkiss.dbeaver.model.struct.DBSObject;
        super.addPages();
    private EntityDiagram diagram = new EntityDiagram(null, "", new ERDContentProviderDecorated(), new ERDDecoratorDefault());
            return false;
    public void init(IWorkbench workbench, IStructuredSelection selection) {
            return false;
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramCollectSettingsDefault;

            }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    public DiagramCreateWizard() {
 * See the License for the specific language governing permissions and
	}
					diagramFolder = ERDResourceHandler.getDiagramsFolder(activeProject, true);
        setWindowTitle(ERDUIMessages.wizard_diagram_create_title);

            this.roots = roots;
			} else {
import org.eclipse.ui.IWorkbench;
            pageContent.setErrorMessage(errorMessage);
                    monitor,
        private DiagramCreator(Collection<DBSObject> roots)
    public void addPages() {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
                diagramFolder = Platform.getAdapterManager().getAdapter(element, IFolder.class);
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.code.Nullable;
                diagramFile = ERDResourceHandler.createDiagram(diagram, diagram.getName(), folder, monitor);
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        catch (Throwable ex) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.app.DBPProject;
        }
	private String errorMessage;
		}

    
            } catch (Exception e) {
            UIUtils.run(getContainer(), true, true, creator);
        if (selection != null) {
		}
			// Check for entity selection
            }
        pageContent = new DiagramCreateWizardPage(diagram, entitySelection, project);
 * limitations under the License.
import org.jkiss.dbeaver.ui.editors.erd.model.ERDContentProviderDecorated;
        	        entitySelection = selection;

				errorMessage = "Can't create diagram without active project";
            DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        if (getContainer() != null) {
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
            if (selection != null && !selection.isEmpty()) {
    
                    "Create error",
            }
            DiagramCreator creator = new DiagramCreator(rootObjects);
        Collection<DBSObject> roots;
import org.eclipse.jface.wizard.Wizard;

	public boolean performFinish() {
            List<DBSObject> rootObjects = new ArrayList<>();
                }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                diagram.fillEntities(monitor, tables, null);
    @Nullable
	@Override
                throw new InvocationTargetException(e);
				}
    public void setContainer(IWizardContainer wizardContainer) {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
            }
    
/*
 * you may not use this file except in compliance with the License.
import org.eclipse.core.resources.IFile;
            Object element = selection.getFirstElement();
 * You may obtain a copy of the License at
        IFile diagramFile;
    		//New Wizard call
 *
	}
    private IFolder folder;
            pageContent.setErrorMessage(errorMessage);
                    roots,
        IFolder diagramFolder = null;
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    }
            Collection<DBNNode> initialContent = pageContent.getInitialContent();
                    rootObjects.add(((DBNDatabaseNode) node).getObject());
        if (diagramFolder == null) {
import org.eclipse.core.runtime.CoreException;
                }
 */
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
			}
        return true;
 *
public class DiagramCreateWizard extends Wizard implements INewWizard {
        if (diagramFolder != null) {
