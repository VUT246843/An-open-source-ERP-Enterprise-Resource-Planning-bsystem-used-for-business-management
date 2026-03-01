
    private ComparableVersion comparable;
    }
            return this.comparable.compareTo(((DefaultArtifactVersion) otherVersion).comparable);
    public final void parseVersion(String version) {
            throw new NumberFormatException("Number is invalid");
        return qualifier;
                } else {
                if (tok.hasMoreTokens()) {

    private Integer buildNumber;
            boolean fallback = false;
        return majorVersion != null ? majorVersion : 0;
        } catch (NoSuchElementException e) {
                minorVersion = null;
            }
        return buildNumber != null ? buildNumber : 0;
/*
 * to you under the Apache License, Version 2.0 (the
import java.util.StringTokenizer;
    }
            }
        if ((!part1.contains(".")) && !part1.startsWith("0")) {
        return 11 + comparable.hashCode();
 * KIND, either express or implied.  See the License for the
        } else {
            part1 = version;
                throw new NumberFormatException("Number part has a leading 0: '" + s + "'");
                }
                if ((part2.length() == 1) || !part2.startsWith("0")) {
    }
            if ((s.length() > 1) && s.startsWith("0")) {
 * regarding copyright ownership.  The ASF licenses this file
/**
                majorVersion = Integer.valueOf(part1);
        return incrementalVersion != null ? incrementalVersion : 0;

    }
}
        }
                // qualifier is the whole version, including "-"
        }
            try {
            }
            String s = tok.nextToken();
 * Unless required by applicable law or agreed to in writing,
                }
    @Override




                incrementalVersion = null;
    implements ArtifactVersion {
            return true;
                // string tokenzier won't detect these and ignores them
    @Override
    public String getQualifier() {
                // qualifier is the whole version, including "-"
    }
 * under the License.
                buildNumber = null;

    }
            part2 = version.substring(index + 1);


    public String toString() {
                if (part1.contains("..") || part1.startsWith(".") || part1.endsWith(".")) {

        comparable = new ComparableVersion(version);
 * distributed with this work for additional information
                    fallback = true;

        try {
 * Licensed to the Apache Software Foundation (ASF) under one
                    minorVersion = getNextIntegerToken(tok);
                    qualifier = part2;


    }

    public DefaultArtifactVersion(String version) {
        if (this == other) {
    private static Integer getNextIntegerToken(StringTokenizer tok) {


import java.util.NoSuchElementException;
 */
                }

        if (otherVersion instanceof DefaultArtifactVersion) {
            return Integer.valueOf(s);
        } else {
            } catch (NumberFormatException e) {
        return minorVersion != null ? minorVersion : 0;
                buildNumber = null;
            return false;
        parseVersion(version);
 *
                if (tok.hasMoreTokens()) {
                fallback = true;

            try {
        } else {
                    fallback = Pattern.compile("\\d+").matcher(qualifier).matches();
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    }
            return compareTo(new DefaultArtifactVersion(otherVersion.toString()));
 *
        }
    @Override
            StringTokenizer tok = new StringTokenizer(part1, ".");

                    buildNumber = Integer.valueOf(part2);
package org.jkiss.dbeaver.registry.maven.versioning;
                qualifier = version;
        if (index < 0) {
    public int getBuildNumber() {
            part1 = version.substring(0, index);
 * or more contributor license agreements.  See the NOTICE file

                if (tok.hasMoreTokens()) {
        return compareTo((ArtifactVersion) other) == 0;
        String part1;

            } catch (NumberFormatException e) {
    public int getMajorVersion() {
    private Integer minorVersion;
    }
            try {
    public int getIncrementalVersion() {

                majorVersion = getNextIntegerToken(tok);
            }
    private String qualifier;
 * software distributed under the License is distributed on an
        String part2 = null;
            if (fallback) {
    public int hashCode() {
 * "License"); you may not use this file except in compliance
                qualifier = version;
 * Default implementation of artifact versioning.
 *
 * with the License.  You may obtain a copy of the License at
        if (part2 != null) {

import java.util.regex.Pattern;
                majorVersion = null;

            } catch (NumberFormatException e) {
 */
                qualifier = part2;
    }
            }
 * specific language governing permissions and limitations

        int index = version.indexOf("-");
    public int compareTo(ArtifactVersion otherVersion) {
public class DefaultArtifactVersion
                }
        }

                }
        }
    private Integer incrementalVersion;

    }
    private Integer majorVersion;
    public int getMinorVersion() {
                    qualifier = tok.nextToken();
        return comparable.toString();

 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
        }
    public boolean equals(Object other) {
        if (!(other instanceof ArtifactVersion)) {


 *  http://www.apache.org/licenses/LICENSE-2.0
                    incrementalVersion = getNextIntegerToken(tok);
        }
    }
