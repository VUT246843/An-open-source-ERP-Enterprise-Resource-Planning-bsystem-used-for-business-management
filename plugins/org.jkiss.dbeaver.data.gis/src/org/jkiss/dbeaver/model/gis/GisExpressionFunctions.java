 * See the License for the specific language governing permissions and

            // Zeroes
            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
/**
import org.jkiss.utils.CommonUtils;
    private static final Log log = Log.getLog(GisExpressionFunctions.class);
 * you may not use this file except in compliance with the License.
        }
            latitude instanceof Number && ((Number) latitude).doubleValue() == 0.0)
 * limitations under the License.
    public static Object wktPoint(Object longitude, Object latitude, Object srid) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
 *
        return wktPoint(longitude, latitude, GisConstants.SRID_4326);

}

import org.jkiss.dbeaver.Log;
        }
 * You may obtain a copy of the License at


 */
    }
 *
 * GisExpressionFunctions
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
            return null;
 *
    public static Object wktPoint(Object longitude, Object latitude) {
        if (longitude == null || latitude == null) {
/*
 */

public class GisExpressionFunctions {
        if (longitude instanceof Number && ((Number) longitude).doubleValue() == 0.0 &&
        return new DBGeometry(strValue, CommonUtils.toInt(srid, GisConstants.SRID_4326));
package org.jkiss.dbeaver.model.gis;
        String strValue = "POINT(" + longitude + " " + latitude + ")";
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
