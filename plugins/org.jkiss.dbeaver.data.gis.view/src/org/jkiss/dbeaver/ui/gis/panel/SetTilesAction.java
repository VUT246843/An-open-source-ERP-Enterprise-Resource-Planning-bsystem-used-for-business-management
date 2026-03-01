
        super(tiles.getLabel(), AS_CHECK_BOX);

        this.tiles = tiles;
        GeometryViewerRegistry.getInstance().setDefaultLeafletTiles(tiles);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

 * You may obtain a copy of the License at
    private final LeafletTilesDescriptor tiles;
    public SetTilesAction(IGeometryValueEditor valueEditor, LeafletTilesDescriptor tiles) {
import org.eclipse.jface.action.Action;
 *
        valueEditor.refresh();
    public boolean isChecked() {
    public void run() {
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;
    @Override
 * See the License for the specific language governing permissions and
}
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return tiles == GeometryViewerRegistry.getInstance().getDefaultLeafletTiles();

    }
        this.valueEditor = valueEditor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.ui.gis.registry.LeafletTilesDescriptor;
 */
/*
    private final IGeometryValueEditor valueEditor;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software

class SetTilesAction extends Action {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.gis.panel;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerRegistry;
