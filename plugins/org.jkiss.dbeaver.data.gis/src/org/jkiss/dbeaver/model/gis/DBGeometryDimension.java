    XYM(3, false, true),
 *
    public int getCoordinates() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 */
        return coordinates;
    private final int coordinates;
    }
public enum DBGeometryDimension {

        this.coordinates = coordinates;
    DBGeometryDimension(int coordinates, boolean z, boolean m) {
    XY(2, false, false),
        this.m = m;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final boolean z;
    public boolean hasZ() {
    }
}
 * You may obtain a copy of the License at
    private final boolean m;
        return z;

 * Licensed under the Apache License, Version 2.0 (the "License");

        return m;
    XYZ(3, true, false),
 * See the License for the specific language governing permissions and
        this.z = z;

 * you may not use this file except in compliance with the License.
    }
    public boolean hasM() {
    XYZM(4, true, true);
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.gis;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
