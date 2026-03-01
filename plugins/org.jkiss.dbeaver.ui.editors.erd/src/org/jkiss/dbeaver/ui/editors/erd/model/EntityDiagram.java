        return getVisualInfo(entity, false);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private ERDModelAdapter modelAdapter;
        NodeVisualInfo visualInfo = noteVisuals.get(erdObject);
        }
            this.modelAdapter = new ERDModelAdapterDefault();
        return visualInfo;
import org.jkiss.dbeaver.Log;
        this.attributeStyles = attributeStyles;
    

    public void setAttributeStyles(ERDViewStyle[] attributeStyles) {
 * DBeaver - Universal Database Manager
        return dirty;
import java.util.List;
 * Represents a Schema in the model. Note that this class also includes

    public void setAttributeStyle(ERDViewStyle style, boolean enable) {
        }
    public ERDAttributeVisibility getAttributeVisibility() {
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
    }
        return needsAutoLayout;
    private final ERDDecorator decorator;
    private boolean needsAutoLayout;
        return modelAdapter;
/**

    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * diagram specific information (layoutManualDesired and layoutManualAllowed fields)
    public void addVisualInfo(DBSEntity entity, NodeVisualInfo visualInfo) {
    public void addVisualInfo(ERDNote note, NodeVisualInfo visualInfo) {
import org.jkiss.code.NotNull;
    public void setDirty(boolean dirty) {
import org.jkiss.utils.ArrayUtils;
 */
            NodeVisualInfo vi2 = o2 instanceof ERDNote ? noteVisuals.get(o2) : entityVisuals.get(o2.getObject());
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
        ERDAttributeVisibility.setDefaultVisibility(ERDUIActivator.getDefault().getPreferences(), attributeVisibility);

    }
        if (enable) {
            visualInfo = new NodeVisualInfo();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return attributeVisibility;
    @Override
        this.modelAdapter = RuntimeUtils.getObjectAdapter(this, ERDModelAdapter.class, true);
    }
    private boolean dirty;
import org.jkiss.code.Nullable;
        copy.noteVisuals.putAll(this.noteVisuals);
    @NotNull


        NodeVisualInfo visualInfo = entityVisuals.get(entity);
    public boolean isNeedsAutoLayout() {

        this.attributeVisibility = ERDAttributeVisibility.getDefaultVisibility(store);
import org.jkiss.dbeaver.model.struct.DBSEntity;
            return vi1 != null && vi2 != null ? vi1.zOrder - vi2.zOrder : 0;
import java.util.Map;
    }
        super(container, name, contentProvider);
    public List<ERDObject<?>> getContents() {
    }

            noteVisuals.put(erdObject, visualInfo);
 * Created on Jul 13, 2004
    @Nullable

    }
            NodeVisualInfo vi1 = o1 instanceof ERDNote ? noteVisuals.get(o1) : entityVisuals.get(o1.getObject());
    public EntityDiagram(DBSObject container, String name, ERDContentProvider contentProvider, ERDDecorator decorator) {
    }
}
        if (visualInfo == null && create) {
    public NodeVisualInfo getVisualInfo(ERDNote erdObject, boolean create) {
    public void addInitRelationBends(ERDElement<?> sourceEntity, ERDElement<?> targetEntity, String relName, List<int[]> bends) {
    public void setNeedsAutoLayout(boolean needsAutoLayout) {
        this.dirty = dirty;
    }
 *
    @Override
        this.getNotes().clear();

        return getVisualInfo(erdObject, false);
    @Nullable
    public NodeVisualInfo getVisualInfo(DBSEntity entity, boolean create) {
        return decorator.supportsStructureEdit() && modelAdapter.supportsModelEdit();

    }
    @Override
        entityVisuals.put(entity, visualInfo);
    public ERDDecorator getDecorator() {
import org.jkiss.dbeaver.model.erd.*;

        return visualInfo;
            if (rel.getSourceEntity() == targetEntity && relName.equals(rel.getObject().getName())) {
    }
        copy.getEntities().addAll(this.getEntities());

                rel.setInitBends(bends);
public class EntityDiagram extends ERDDiagram implements ERDContainerDecorated {
        }
            visualInfo = new NodeVisualInfo();
    public boolean hasAttributeStyle(@NotNull ERDViewStyle style) {
 * You may obtain a copy of the License at

    }
    }
    public void clear() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    }

    }
 */
        children.sort((o1, o2) -> {

            attributeStyles = ArrayUtils.remove(ERDViewStyle.class, attributeStyles, style);
        noteVisuals.put(note, visualInfo);
 * limitations under the License.
            }
    @Nullable
    private ERDAttributeVisibility attributeVisibility;
        this.needsAutoLayout = needsAutoLayout;
    @NotNull
    public boolean isEditEnabled() {
    public void setAttributeVisibility(ERDAttributeVisibility attributeVisibility) {

    }

        if (visualInfo == null && create) {

    }
/*
        this.entityVisuals.clear();
    private ERDViewStyle[] attributeStyles;
        copy.getEntityMap().putAll(this.getEntityMap());
    public ERDModelAdapter getModelAdapter() {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        return ArrayUtils.contains(attributeStyles, style);
    private final Map<ERDNote, NodeVisualInfo> noteVisuals = new IdentityHashMap<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
        return copy;
        this.attributeStyles = ERDViewStyle.getDefaultStyles(store);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
 *
    public boolean isDirty() {
        } else {
        }
            entityVisuals.put(entity, visualInfo);
        ERDViewStyle.setDefaultStyles(ERDUIActivator.getDefault().getPreferences(), attributeStyles);

        super.clear();
        // Get model adapter (force adapter plugin activation if needed)
    }
import java.util.IdentityHashMap;
    }
    }
 * although ideally these should be in a separate model hierarchy
    }

import org.jkiss.dbeaver.utils.RuntimeUtils;

    }

        for (ERDAssociation rel : sourceEntity.getReferences()) {
    @Nullable
        EntityDiagram copy = new EntityDiagram(getObject(), getName(), getContentProvider(), decorator);
 */
            attributeStyles = ArrayUtils.add(ERDViewStyle.class, attributeStyles, style);
        }

package org.jkiss.dbeaver.ui.editors.erd.model;
    public EntityDiagram copy() {

        DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();

        List<ERDObject<?>> children = super.getContents();
        return children;
    public NodeVisualInfo getVisualInfo(DBSEntity entity) {
        this.noteVisuals.clear();
/*
        copy.entityVisuals.putAll(this.entityVisuals);
        this.decorator = decorator;
    }

    public NodeVisualInfo getVisualInfo(ERDNote erdObject) {
        this.attributeVisibility = attributeVisibility;
    private final Map<DBSEntity, NodeVisualInfo> entityVisuals = new IdentityHashMap<>();
 * you may not use this file except in compliance with the License.
        return decorator;
    private static final Log log = Log.getLog(EntityDiagram.class);
        });

        if (this.modelAdapter == null) {
