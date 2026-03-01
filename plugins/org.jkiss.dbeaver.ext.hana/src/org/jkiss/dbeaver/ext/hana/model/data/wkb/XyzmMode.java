 * Contributors:
/*
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    }
 * DBeaver - Universal Database Manager
 *
 * limitations under the License.
    private boolean hasZ;

    private boolean hasM;
 *
}

 * See the License for the specific language governing permissions and
    XyzmMode(int coordinatesPerPoint, boolean hasZ, boolean hasM) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    private int coordinatesPerPoint;

 *
 *    Stefan Uhrig - initial implementation
 * Unless required by applicable law or agreed to in writing, software
    }


 */
    XY(2, false, false), XYZ(3, true, false), XYM(3, false, true), XYZM(4, true, true);
    public int getCoordinatesPerPoint() {
    }
        return hasZ;
        this.hasM = hasM;
 * The dimension modes supported by HANA.
        return coordinatesPerPoint;
        this.hasZ = hasZ;
        this.coordinatesPerPoint = coordinatesPerPoint;

        return hasM;
 *
/**
public enum XyzmMode {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean hasM() {
    }
package org.jkiss.dbeaver.ext.hana.model.data.wkb;

    public boolean hasZ() {
