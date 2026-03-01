 *
 * Represents data grid node (column or row).
 * DBeaver - Universal Database Manager
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
     */
 * distributed under the License is distributed on an "AS IS" BASIS,

    int getRelativeIndex();
    int getLevel();
public interface IGridItem {

 *
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.ui.controls.lightgrid;

     * App-specific element associated with column
    IGridItem getParent();
}
 */


 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

    /**
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    Object getElement();
