    public void setShowOnMap(boolean showOnMap) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        if (this.targetValue != null) {
    }


    private final int sourceSRID;
        this.showOnMap = showOnMap;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

 * limitations under the License.
/**
    public GisTransformRequest(Geometry sourceValue, int sourceSRID, int targetSRID) {
    public int getTargetSRID() {
        return sourceSRID;
 * GisTransformRequest
 *
        return targetSRID;

 *
        return sourceValue;
    public Geometry getSourceValue() {
*/
    private int targetSRID;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private Geometry targetValue;
    }
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
        this.targetSRID = targetSRID;
import org.locationtech.jts.geom.Geometry;
    public void setTargetSRID(int targetSRID) {
}
        this.targetSRID = targetSRID;

public class GisTransformRequest {
    private boolean showOnMap;
        this.sourceValue = sourceValue;

        this.sourceSRID = sourceSRID;


        }
        return showOnMap;
        this.targetValue = targetValue;
    public int getSourceSRID() {
    public boolean isShowOnMap() {
package org.jkiss.dbeaver.model.gis;
        } else {

    }

    private final Geometry sourceValue;
            this.targetSRID = this.targetValue.getSRID();
/*
    }
        return targetValue;
            this.targetSRID = 0;
 */

 * Unless required by applicable law or agreed to in writing, software

    }
    public Geometry getTargetValue() {
    public void setTargetValue(Geometry targetValue) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
    }
    }
