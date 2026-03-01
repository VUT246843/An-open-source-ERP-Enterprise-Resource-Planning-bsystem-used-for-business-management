 * Licensed under the Apache License, Version 2.0 (the "License");
    public static long parseDuration(String duration, long defValue) {
        };
    private static final Log log = Log.getLog(DashboardUIUtils.class);
        if (!duration.startsWith("PT")) duration = "PT" + duration;
 */
import org.jkiss.dbeaver.model.dashboard.DBDashboardValueType;
public class DashboardUIUtils {
 *
import org.jkiss.dbeaver.Log;
/**
import org.jfree.chart.axis.TickUnitSource;
}
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 */



/*
            case decimal -> new NumberTickUnitSource(false);
import org.jfree.chart.axis.NumberTickUnitSource;
        } catch (Exception e1) {
            // Ignore
 * DBeaver - Universal Database Manager

        return Duration.ofMillis(duration).toString().substring(2);
            return newDuration.toMillis();
import org.jfree.chart.axis.StandardTickUnitSource;
    }
 * You may obtain a copy of the License at
import org.jkiss.utils.ByteNumberFormat;
 * limitations under the License.
        return switch (valueType) {

    public static String formatDuration(long duration) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            default -> new StandardTickUnitSource();
            case bytes -> new NumberTickUnitSource(true, new ByteNumberFormat());
            Duration newDuration = Duration.parse(duration);
 *
    }
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
            case integer, percent -> new NumberTickUnitSource(true);
        duration = duration.replace(" ", "");
    public static TickUnitSource getTickUnitsSource(DBDashboardValueType valueType) {

package org.jkiss.dbeaver.ui.dashboard;
 * DashboardUtils
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
            return defValue;
import java.time.Duration;
 *
