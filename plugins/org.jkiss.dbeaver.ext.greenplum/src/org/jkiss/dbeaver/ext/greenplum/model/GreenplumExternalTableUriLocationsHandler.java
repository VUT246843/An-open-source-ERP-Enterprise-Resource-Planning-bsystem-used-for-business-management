        this.uriLocations = CommonUtils.splitString(uriLocationsString, separator);
    private final List<String> uriLocations;
    }
    }
    public String getCommaSeparatedList() {
 * you may not use this file except in compliance with the License.
    public Stream<String> stream() {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        return CommonUtils.joinStrings("\n", this.uriLocations);
 * Unless required by applicable law or agreed to in writing, software
import java.util.stream.Stream;

 */

import org.jkiss.utils.CommonUtils;
public class GreenplumExternalTableUriLocationsHandler {

 * limitations under the License.
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return CommonUtils.joinStrings(",", this.uriLocations);
 *
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.greenplum.model;
        return this.uriLocations.stream();
/*
import java.util.List;


}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getLineFeedSeparatedList() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public GreenplumExternalTableUriLocationsHandler(String uriLocationsString, char separator) {

