                }
        public void setChecked(boolean value) {
            SWT.BORDER | SWT.UNDERLINE_SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION | SWT.CHECK

                return false;
    }
        });
        });
            }
 * limitations under the License.
    public final boolean performOk() {
        public String toString() {
        treeViewer.refresh();
     * Tree node with checkbox
        });
    }
        treeViewer.setContentProvider(new TreeNodeContentProvider());
        cmdSvc = PlatformUI.getWorkbench().getService(ICommandService.class);
    
    private static final Log log = Log.getLog(PrefPageToolbarCustomization.class);
                return imageDesc.createImage();
            return name;
        
        IPreferenceStore prefs = DBeaverActivator.getInstance().getPreferenceStore();
    private Image getItemIcon(@NotNull ToolBarConfigurationDescriptor.Item item) {
        treeViewer = new CheckboxTreeViewer(
        }
    private abstract class CheckableNode extends TreeNode {
    private String getItemName(@NotNull ToolBarConfigurationDescriptor.Item item) {
            setChecked(item.isVisibleByDefault());
        } else if (node instanceof ToolBarNode) {
                    commandImages.put(item.getCommandId(), image);
        
        forEachToolItem(ToolItemNode::restore);
        node.setChecked(newValue);
 *     http://www.apache.org/licenses/LICENSE-2.0
        synchronized (syncRoot) {
            ((ToolItemNode) node).owner.update();
            return toolbar.getName();
            protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
        @Override
    @Nullable
        
        // do nothing
import org.eclipse.ui.IWorkbench;

            this.owner = owner;
import org.eclipse.swt.SWT;
        treeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(SWT.DEFAULT, 100).create());
            ImageDescriptor imageDesc = ImageDescriptor.createFromURLSupplier(true, () -> FileLocator.find(bundle, new Path(bundlePath)));
    @Override
    }
    @Nullable


    @Override
        return true;

 *
        }
        
        public boolean isGrayed() {
        public void restore() {
            isChecked = value;

        public void setGrayed(boolean value) {
                Image image = commandImages.get(item.getCommandId());
            } catch (IOException e) {
                } else {
            toolBarImage.dispose();
    
    }
        }
import org.jkiss.dbeaver.Log;
    public void dispose() {
            Object node = event.getElement();
        List<ToolItemNode> subnodes;
        treeViewer.setLabelProvider(new LabelProvider() {
            commandImages.clear();
        }
        
            if (node instanceof CheckableNode) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
public class PrefPageToolbarCustomization extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
            this.icon = getItemIcon(item);
    }
            super(value.getName());
 */
                log.error("Error saving toolbar configuration", e);
        private boolean isChecked;
    }
        
import java.util.List;
        for (ToolBarNode toolBar : toolBarNodes) {
import org.eclipse.core.runtime.FileLocator;
        
        final Image icon;
 * See the License for the specific language governing permissions and
import org.eclipse.jface.preference.IPersistentPreferenceStore;
                    return null;
            @Override
            super.setChecked(value);
    
        // do nothing
            synchronized (syncRoot) {
import org.eclipse.jface.viewers.*;
            if (checkedCount == 0) {
        if (node instanceof ToolItemNode) {
        }
            treeViewer.refresh();
                super.setChecked(false);
                }
            super(value);
        if (item.getCommandId() != null && knownCommands.contains(item.getCommandId())) {
    }
            if (imageDesc != null) {
import org.jkiss.code.NotNull;
                }
    private final HashMap<String, Image> commandImages = new HashMap<>();
        }
    @NotNull
    @Override
        Bundle bundle = Platform.getBundle(pluginId);
    
                if (element instanceof CheckableNode) {
        if (prefs.needsSaving() && prefs instanceof IPersistentPreferenceStore) {
        return null;
                    image = imageDesc.createImage();
        protected Image getImage() {
        protected Image getImage() {
import org.eclipse.jface.layout.GridDataFactory;
    public PrefPageToolbarCustomization() {
        }
    

            setChecked(item.isVisible());
import org.eclipse.ui.IWorkbenchPropertyPage;
        public void update() {
                super.setChecked(true);
            return toolBarImage;
import java.util.Comparator;
        }
/*
    
    
import org.eclipse.swt.widgets.Composite;
    
        }
            item.setVisible(isChecked());
import java.util.HashMap;
                ((IPersistentPreferenceStore) prefs).save();
        if (item.getCommandId() != null && knownCommands.contains(item.getCommandId())) {
        }

import org.jkiss.dbeaver.ui.actions.ToolBarConfigurationPropertyTester;
    }
        }
            }
    private void onNodeCheckChange(CheckableNode node, boolean newValue) {
import org.eclipse.swt.graphics.Resource;
    @Override
        }
        
            return item.getName();
            .collect(Collectors.toList());
        final ToolBarConfigurationDescriptor.Item item;

import org.jkiss.dbeaver.core.DBeaverActivator;
            setChildren(subnodes.toArray(ToolItemNode[]::new));
    
    
import org.eclipse.jface.resource.ImageDescriptor;
            }
        });
                    return ((CheckableNode) element).isGrayed();
        }
        return item.getKey();
    
        }
            setChecked(item.isVisible());
                }
        final ToolBarNode owner;
        Composite composite = UIUtils.createPlaceholder(parent, 1);
     */
            }
        }
            }
        
    
    private Image findBundleImage(@NotNull String pluginId, @NotNull String bundlePath) {
            } catch (NotDefinedException e) {
                return false;
import org.eclipse.jface.preference.IPreferenceStore;
                if (element instanceof CheckableNode) {
    }
    private final ICommandService cmdSvc;
            treeViewer.refresh();
    private class ToolItemNode extends CheckableNode {
        @Override
            this.name = getItemName(item);
            for (ToolItemNode item : toolBar.subnodes) {
        public String toString() {
            }
        }
import org.eclipse.swt.graphics.Image;
        
            @Override
    @Override
    }
        
                    return image;
                    return ((CheckableNode) element).isChecked();

}
                ImageDescriptor imageDesc = cmdImageSvc.getImageDescriptor(item.getCommandId());
                TreeSelection selection = (TreeSelection) event.getSelection();
                    CheckableNode node = (CheckableNode) selection.getFirstElement();
            }   
        treeViewer.expandAll();
import java.util.stream.Collectors;
package org.jkiss.dbeaver.ui.preferences;
            return isChecked;

        treeViewer.setCheckStateProvider(new ICheckStateProvider() {
        knownCommands = cmdSvc.getDefinedCommandIds();
        public ToolBarNode(@NotNull ToolBarConfigurationDescriptor value) {
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.item = item;
        @Override
    }
    private class ToolBarNode extends CheckableNode {
 * Copyright (C) 2010-2024 DBeaver Corp and others

        forEachToolItem(ToolItemNode::apply);
        }
            }
            composite,
    private final Image toolBarImage;
        return null;
import org.eclipse.ui.commands.ICommandImageService;
            subnodes.forEach(n -> n.setChecked(value));

                super.setGrayed(true);
            this.toolbar = value;
    @Override
                    onNodeCheckChange(node, !node.isChecked());
            try {
        }
            if (event.getSelection() instanceof TreeSelection) {
    @Override
            toolBar.update();
        public void apply() {
                    return image;
import org.eclipse.core.commands.common.NotDefinedException;
                return cmdSvc.getCommand(item.getCommandId()).getName();
        }
 *

            }
    public IAdaptable getElement() {
        
        protected abstract Image getImage();
            } else if (toolbar.getItems().size() == checkedCount) {
                log.debug(e);
            
        @Override
                    return ((CheckableNode) element).getImage();
import org.jkiss.code.Nullable;
    private final Object syncRoot = new Object();
import org.eclipse.core.runtime.Platform;
import java.io.IOException;
            commandImages.values().forEach(Resource::dispose);
        
        ToolBarConfigurationPropertyTester.fireVisibilityPropertyChange();
        cmdImageSvc = PlatformUI.getWorkbench().getService(ICommandImageService.class);
        }
        toolBarImage = findBundleImage(PlatformUI.PLUGIN_ID, "$nl$/icons/full/obj16/toolbar.png"); //$NON-NLS-1$
        

    }
                action.accept(item);
import org.jkiss.dbeaver.ui.actions.ToolBarConfigurationRegistry;
            super(item);
        if (bundle != null) {
        );
            return icon;
        
        
            }
            long checkedCount = subnodes.stream().filter(CheckableNode::isChecked).count();
        super.dispose();
        }
    }
import org.eclipse.ui.commands.ICommandService;
        final String name;
        ToolBarConfigurationDescriptor toolbar;
import org.eclipse.core.runtime.IAdaptable;
            .sorted(Comparator.comparing(ToolBarConfigurationDescriptor::getName))
        if (toolBarImage != null) {
                super.setGrayed(false);
                if (selection.size() == 1 && selection.getFirstElement() instanceof ToolItemNode) {
            @Override
            } else {
import org.eclipse.ui.IWorkbenchPreferencePage;
        }, 0);
    /**
        
        forEachToolItem(ToolItemNode::reset);
                super.setChecked(false);
            public boolean isChecked(Object element) {
        
        public ToolItemNode(@NotNull ToolBarNode owner, @NotNull ToolBarConfigurationDescriptor.Item item) {
import java.util.function.Consumer;
            public Image getImage(Object element) {
    private final ICommandImageService cmdImageSvc;
        }
    private CheckboxTreeViewer treeViewer;
            ((ToolBarNode) node).update();
        public CheckableNode(@NotNull Object value) {
 *
        if (item.getName() != null) {
        TreeViewerEditor.create(treeViewer, new ColumnViewerEditorActivationStrategy(treeViewer) { 
import org.osgi.framework.Bundle;
    protected void performDefaults() {
            isGrayed = value;
                if (imageDesc != null) {
        treeViewer.addCheckStateListener(event -> {

    }
import org.eclipse.ui.PlatformUI;
        toolBarNodes = ToolBarConfigurationRegistry.getInstance().getKnownToolBars().stream()
        public void reset() {
            }
        treeViewer.addDoubleClickListener(event -> {
        private boolean isGrayed;
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (element instanceof CheckableNode) {
        }

        public void setChecked(boolean value) {
    private final List<ToolBarNode> toolBarNodes;
    }
        }
            }
import org.jkiss.dbeaver.ui.UIUtils;
    private void forEachToolItem(@NotNull Consumer<ToolItemNode> action) {
            try {
import org.jkiss.dbeaver.ui.actions.ToolBarConfigurationDescriptor;
                }
        return composite;
                onNodeCheckChange((CheckableNode) node, event.getChecked());
        return null;
            return isGrayed;
        }
            this.subnodes = toolbar.getItems().stream().map(t -> new ToolItemNode(this, t)).collect(Collectors.toList());
                if (image != null) {
        public boolean isChecked() {
 * You may obtain a copy of the License at
        treeViewer.setInput(toolBarNodes.toArray(ToolBarNode[]::new));
        treeViewer.refresh();
 * DBeaver - Universal Database Manager
            update();
    private final Collection<String> knownCommands;
            public boolean isGrayed(Object element) { 
    @NotNull
import org.eclipse.swt.widgets.Control;
    public void init(IWorkbench workbench) {
    public void setElement(IAdaptable element) {
                return false;
        @Override
                }
        
 * Unless required by applicable law or agreed to in writing, software
    protected Control createPreferenceContent(@NotNull Composite parent) {
 * you may not use this file except in compliance with the License.
            .map(ToolBarNode::new)
                super.setGrayed(false);
import java.util.Collection;
import org.eclipse.core.runtime.Path;
