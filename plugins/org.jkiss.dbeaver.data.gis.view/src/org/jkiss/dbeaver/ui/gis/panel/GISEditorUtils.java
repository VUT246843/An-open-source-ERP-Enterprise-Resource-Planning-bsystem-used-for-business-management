 */
 *

package org.jkiss.dbeaver.ui.gis.panel;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;

            recentSRIDs.add(srid);
    private static final int MAX_RECENT_SRID_SIZE = 10;
    public static void curRecentSRIDs() {
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        if (!recentSRIDs.contains(srid)) {

    private static final List<Integer> recentSRIDs = new ArrayList<>();
/*

 */
 * DBeaver - Universal Database Manager
    }


 *     http://www.apache.org/licenses/LICENSE-2.0
public class GISEditorUtils {
        return recentSRIDs;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            recentSRIDs.remove(0);
}import java.util.ArrayList;
        if (recentSRIDs.size() > MAX_RECENT_SRID_SIZE) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        }
    }
    }
    public static List<Integer> getRecentSRIDs() {
 *
 * You may obtain a copy of the License at
    public static void addRecentSRID(int srid) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
 * Database select dialog
        }
