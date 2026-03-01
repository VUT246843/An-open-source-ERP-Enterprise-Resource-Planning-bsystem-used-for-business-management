                    return cmp;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        for (String version : allVersions) {
            // Now use beta versions too
            return 0;
            return 1;

                    return cmp;
/*
 * VersionUtils
    }
    public static boolean isVersionLessThan(@NotNull String v1, @NotNull String v2) {
            }
        StringTokenizer st2 = new StringTokenizer(v2, ".-_");
            }
                latest = version;
            }
    public static int compareVersions(@NotNull String v1, @NotNull String v2) {
        return latest;
 * DBeaver - Universal Database Manager

 *
        return compareResult < 0;
            String t1 = st1.nextToken();
import java.util.StringTokenizer;
                // Non-numeric versions - use lexicographical compare
        int compareResult = compareVersions(v1, v2);
 * you may not use this file except in compliance with the License.

        String latest = null;
            if (isBetaVersion(version)) {
        if (latest == null) {
        if (st1.hasMoreTokens()) {
        }


import org.jkiss.code.Nullable;
                continue;
                int cmp = Integer.parseInt(t1) - Integer.parseInt(t2);

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        StringTokenizer st1 = new StringTokenizer(v1, ".-_");
 */
            String t2 = st2.nextToken();
                if (latest == null || compareVersions(version, latest) > 0) {
                }
                }
            try {
        }
                if (cmp != 0) {
            } catch (NumberFormatException e) {
package org.jkiss.dbeaver.utils;
    }
    }
public class VersionUtils {
 * limitations under the License.
        return versionInfo.contains("beta") || versionInfo.contains("alpha");
        }
        }
            for (String version : allVersions) {
                if (cmp != 0) {
}
/**
        } else if (st2.hasMoreTokens()) {
 * Unless required by applicable law or agreed to in writing, software
                }
                int cmp = t1.compareTo(t2);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
            if (latest == null || compareVersions(version, latest) > 0) {
        } else {
                    latest = version;

 *
        while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
    public static String findLatestVersion(@NotNull Collection<String> allVersions) {
            return -1;
            }
    public static boolean isBetaVersion(@NotNull String versionInfo) {
