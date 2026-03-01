
    public int getRelativeIndex() {

 * limitations under the License.
 */
        return level;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return parent;
        this.element = element;
class GridRowNested implements IGridRow {
 *
    private final int index;
        return position;

    public GridRowNested(IGridRow parent, int position, int index, int level, Object element) {
 * you may not use this file except in compliance with the License.
    }
        final String[] parts = new String[getLevel() + 1];
}    @Override


    @Override
 * Nested grid row
    public int getLevel() {
 * You may obtain a copy of the License at
    private final IGridRow parent;
    @Override
    }
        this.index = index;
 * See the License for the specific language governing permissions and
    private final Object element;
 * Unless required by applicable law or agreed to in writing, software
/**
    public String toString() {
    @Override
        return index;
    }
    private final int level;
        return String.join(".", parts);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    private final int position;
    }
package org.jkiss.dbeaver.ui.controls.lightgrid;
        this.parent = parent;
    public int getVisualPosition() {
        return element;
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        for (IGridRow r = this; r != null; r = r.getParent()) {
    public Object getElement() {
 *
    }
        this.level = level;
        this.position = position;
    public IGridRow getParent() {
 * DBeaver - Universal Database Manager
/*
 *
            parts[r.getLevel()] = String.valueOf(r.getRelativeIndex() + 1);
    }

