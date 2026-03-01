    public Insets getDefaultEntityInsets() {
    public static final ImageDescriptor CONNECT_IMAGE = DBeaverIcons.getImageDescriptor(DBIcon.TREE_ASSOCIATION);
        controls.add(moveTool);

    }
                    }
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.SelectionToolEntry;
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterRegistry;
        return connectionRouterRegistry.getActiveRouter();
 * limitations under the License.

    public ERDDecoratorDefault() {

import org.eclipse.draw2d.geometry.Dimension;
    @Override
            return new Insets(40, 40, 30, 30);
    @Override

 * You may obtain a copy of the License at
                ERDUIMessages.erd_tool_create_note_tip,
                null,
                store.getInt(ERDUIConstants.PREF_GRID_WIDTH),


package org.jkiss.dbeaver.ui.editors.erd.model;

    public EditPartFactory createPartFactory() {
        if (getConnectionRouterDescriptor().supportedAttributeAssociation()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                new CreationFactory() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.DBeaverIcons;
    }
        PaletteDrawer controls = new PaletteDrawer("Tools", DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
                ERDUIMessages.erd_tool_create_note,
    public boolean supportsAttributeVisibility() {

    @Override
    public void fillPalette(@NotNull PaletteRoot paletteRoot, boolean readOnly) {
    protected ERDConnectionRouterDescriptor getConnectionRouterDescriptor() {
    @NotNull

 */
import org.jkiss.dbeaver.ui.UIIcon;
            controls.add(separator);
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override

import org.jkiss.dbeaver.model.DBIcon;
import org.eclipse.gef.requests.CreationFactory;
        // a group of default control tools

        ToolEntry selectionTool = new SelectionToolEntry();
        ToolEntry moveTool = new HandToolEntry();
        return null;
        }

                NOTE_IMAGE,
        paletteRoot.setDefaultEntry(selectionTool);
    public Dimension getEntitySnapSize() {
        controls.add(selectionTool);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            controls.add(new CreationToolEntry(
                },
        // use selection tool as default entry
}
    public boolean supportsStructureEdit() {

        return controls;
        return true;

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditPartFactory;
            controls.add(new ConnectionCreationToolEntry(
    @Override

        } else {
    private static final Log log = Log.getLog(ERDDecoratorDefault.class);

                    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public boolean showCheckboxes() {
    @Override
        // the hand tool
                    {
 * you may not use this file except in compliance with the License.
                NOTE_IMAGE));
/*
 *
    public static final ImageDescriptor FOREIGN_KEY_IMAGE = DBeaverIcons.getImageDescriptor(DBIcon.TREE_FOREIGN_KEY);
import org.eclipse.gef.palette.*;
                        return RequestConstants.REQ_CREATE;
            // separator
 */
    }
        return new ERDEditPartFactory();
    }
                    {
    @Override
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    public static final ImageDescriptor NOTE_IMAGE = DBeaverIcons.getImageDescriptor(ERDIcon.NOTE);
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;

    }
import org.eclipse.jface.resource.ImageDescriptor;
        if (!readOnly) {
import org.jkiss.dbeaver.Log;
            return new Dimension(
    private ERDConnectionRouterRegistry connectionRouterRegistry = ERDConnectionRouterRegistry.getInstance();
 * distributed under the License is distributed on an "AS IS" BASIS,

                ERDUIMessages.erd_tool_create_connection,
    }
                    public Object getObjectType()
                    }

    @Override
        paletteRoot.add(controls);
 * DBeaver - Universal Database Manager
        }
            return new Insets(50, 50, 50, 50);
    private DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();

        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.HandToolEntry;
        return true;
    @NotNull
    }
                CONNECT_IMAGE));
    }
        if (store.getBoolean(ERDUIConstants.PREF_GRID_ENABLED)) {
        PaletteDrawer controls = createToolsDrawer(paletteRoot);
import org.eclipse.gef.RequestConstants;
    @Nullable
                    @Override
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
 *
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;

            separator.setUserModificationPermission(PaletteEntry.PERMISSION_NO_MODIFICATION);
/**
import org.eclipse.draw2d.geometry.Insets;
    }
        return false;
import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
                    public Object getNewObject()
import org.eclipse.gef.EditPartFactory;
            );
 * ERD object adapter
        return true;
        // the selection tool
                        return new ERDNote(ERDUIMessages.erd_tool_create_default);
import org.jkiss.dbeaver.model.erd.ERDNote;
            PaletteSeparator separator = new PaletteSeparator("tools");
import org.jkiss.code.Nullable;
    protected PaletteDrawer createToolsDrawer(PaletteRoot paletteRoot) {
    public boolean supportsAttributeStyle(@NotNull ERDViewStyle style) {
                ERDUIMessages.erd_tool_create_connection_tip,
                CONNECT_IMAGE,
public class ERDDecoratorDefault implements ERDDecorator {
                store.getInt(ERDUIConstants.PREF_GRID_HEIGHT)
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
