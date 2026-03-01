import org.jkiss.code.NotNull;
                attributeLabel += NLS.bind(ERDUIMessages.erd_accessibility_attribute_part_type, attribute.getObject().getFullTypeName());
        return getFullAttributeLabel(diagram, attribute, includeType, false);
import org.eclipse.osgi.util.NLS;

            String comment = attribute.getObject().getDescription();
            if (accessible) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.erd.ERDObject;
     *
import org.jkiss.dbeaver.Log;
        return null;
     * @param includeType is type included in the label
        }
	}

        if (includeType && diagram.hasAttributeStyle(ERDViewStyle.NULLABILITY)) {
                return findPaletteEntry((PaletteContainer) child, id);
        EntityDiagram diagram,
 * DBeaver - Universal Database Manager
                    attributeLabel += NLS.bind(ERDUIMessages.erd_accessibility_attribute_part_comments, comment);
                    );
                return (PaletteEntry) child;
    /**
        ERDEntityAttribute attribute,
                        monitor,
    }
public class ERDUIUtils {
        if (includeType && diagram.hasAttributeStyle(ERDViewStyle.TYPES)) {
     * @param accessible is accessibility text needed
            IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
    }
    public static PaletteEntry findPaletteEntry(@NotNull PaletteContainer container, @NotNull String id) {
    public static final boolean OPEN_OBJECT_PROPERTIES = true;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                        NavigatorUtils.openNavigatorNode(node, UIUtils.getActiveWorkbenchWindow());
                }
            if (child instanceof PaletteEntry && id.equals(((PaletteEntry) child).getId())) {
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
        try {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

        }
            if (!CommonUtils.isEmpty(comment)) {
            DBWorkbench.getPlatformUI().showError("Object open", "Can't open outline view", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (propsView != null) {
            }
        boolean includeType,
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    public static void openObjectEditor(@NotNull ERDObject object) {
                    if (node != null) {
        }
                } else {
            IViewPart propsView = activePage.showView(IPageLayout.ID_OUTLINE);
import org.eclipse.ui.IWorkbenchPage;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        String attributeLabel = attribute.getName();
    }
    public static void openOutline() {
 *

        } catch (PartInitException e) {
import org.eclipse.gef.palette.PaletteContainer;
                propsView.setFocus();
import org.eclipse.gef.palette.PaletteEntry;
            }
    @Nullable
     * @return attribute label

            }
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            String type = "";
    private static final Log log = Log.getLog(ERDUIUtils.class);
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
        }
                } else {
                    openProperties();
                        true

        boolean accessible
            IViewPart propsView = activePage.showView(IPageLayout.ID_PROP_SHEET);
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
        for (Object child : container.getChildren()) {
    public static String getFullAttributeLabel(
            }
            IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
        } catch (PartInitException e) {
            if (accessible) {
                type += " CAN BE NULL";
    public static void openObjectEditor(@Nullable EntityDiagram diagram, @NotNull ERDObject object) {
     * @param diagram diagram
import org.jkiss.code.Nullable;

            if (attribute.getObject().isRequired()) {
 */
                attributeLabel += type;
    public static void openProperties() {
        return attributeLabel;
    }
            }
                        (DBSObject) dbObject,
                    attributeLabel += " - " + comment;
            UIUtils.runUIJob("Open object editor", monitor -> {
 * See the License for the specific language governing permissions and
            }
            } else {
        }
     */
                    DBNDatabaseNode node = DBNUtils.getNodeByObject(
        openObjectEditor(object);
            } else if (accessible) {
            });
            }
        if (diagram.hasAttributeStyle(ERDViewStyle.COMMENTS)) {
            if (child instanceof PaletteContainer) {
                attributeLabel += NLS.bind(ERDUIMessages.erd_accessibility_attribute_part_nullability, type);
import org.eclipse.ui.IPageLayout;

            if (propsView != null) {
            } else {
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.IViewPart;
 *
     * @param attribute attribute to provide label from
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;
import org.eclipse.ui.PartInitException;
/*
                if (!(dbObject instanceof DBSEntity) && OPEN_OBJECT_PROPERTIES) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        if (dbObject instanceof DBSObject) {
                if (accessible) {
                }
package org.jkiss.dbeaver.ui.editors.erd;
            }
                attributeLabel += ": " + attribute.getObject().getFullTypeName();

        Object dbObject = object.getObject();

        }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
    public static String getFullAttributeLabel(EntityDiagram diagram, ERDEntityAttribute attribute, boolean includeType) {
    }
                    }
                propsView.setFocus();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    ) {
 * You may obtain a copy of the License at
            DBWorkbench.getPlatformUI().showError("Object open", "Can't open property view", e);
        return;
                type += " NOT NULL";
