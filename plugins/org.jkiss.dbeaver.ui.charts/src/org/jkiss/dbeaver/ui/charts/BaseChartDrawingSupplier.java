 *
            // Something went wrong - no color constants
public class BaseChartDrawingSupplier extends DefaultDrawingSupplier {
import org.eclipse.jface.resource.ColorRegistry;
    }
        ColorRegistry colorRegistry = UIUtils.getCurrentTheme().getColorRegistry();
        }
 *
 * you may not use this file except in compliance with the License.
    public static final String COLOR_PREF_ID_PREFIX = "org.jkiss.dbeaver.ui.data.chart.color.";
    public BaseChartDrawingSupplier() {
import org.jfree.chart.plot.DefaultDrawingSupplier;
import java.util.List;
        super(getChartColorsDefinitions(),
                break;
            Collections.addAll(result, BaseChartConstants.DBEAVER_DEFAULT_COLOR_SERIES);
        return result.toArray(new Paint[0]);
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
            if (swtColor == null) {


            DEFAULT_SHAPE_SEQUENCE);
import org.eclipse.swt.graphics.Color;
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
 */
            DEFAULT_OUTLINE_STROKE_SEQUENCE,


 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (int i = 1; ; i++) {
/*
import org.jkiss.dbeaver.ui.UIUtils;
            DEFAULT_FILL_PAINT_SEQUENCE,
    private static Paint[] getChartColorsDefinitions() {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private static final Log log = Log.getLog(BaseChartDrawingSupplier.class);
    }
 * See the License for the specific language governing permissions and
 *
}
        List<Paint> result = new ArrayList<>();
            DEFAULT_OUTLINE_PAINT_SEQUENCE,

package org.jkiss.dbeaver.ui.charts;
import java.awt.*;

/**
import org.jkiss.dbeaver.Log;
        if (result.isEmpty()) {
            Color swtColor = colorRegistry.get(COLOR_PREF_ID_PREFIX + i);
            }
        }

            result.add(new java.awt.Color(swtColor.getRed(), swtColor.getGreen(), swtColor.getBlue()));

import java.util.Collections;
            log.warn("Chart colors configuration not found");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Base chart composite
 * limitations under the License.
            DEFAULT_STROKE_SEQUENCE,
