 */

 * "License"); you may not use this file except in compliance
 *  http://www.apache.org/licenses/LICENSE-2.0
 * software distributed under the License is distributed on an
 * with the License.  You may obtain a copy of the License at
    extends Comparable<ArtifactVersion>
    void parseVersion(String version);
 *
public interface ArtifactVersion

    int getIncrementalVersion();
 * compares two versions.
    int getMinorVersion();
    String getQualifier();

 * Unless required by applicable law or agreed to in writing,
 * KIND, either express or implied.  See the License for the
    int getBuildNumber();
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
package org.jkiss.dbeaver.registry.maven.versioning;
 * distributed with this work for additional information

/*

{
 */
}
 * or more contributor license agreements.  See the NOTICE file
 * Licensed to the Apache Software Foundation (ASF) under one
 *
 * Describes an artifact version in terms of its components, converts it to/from a string and

/**
 * to you under the Apache License, Version 2.0 (the
 * specific language governing permissions and limitations
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 * regarding copyright ownership.  The ASF licenses this file
 * under the License.
 *

    int getMajorVersion();
