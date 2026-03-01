import java.util.ArrayList;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
            String host = uri.getHost();
            if (!CommonUtils.isEmpty(host)) {
        String path = uri.getPath();
import java.util.List;
            if (!CommonUtils.isEmpty(authority) && !authority.equals(host)) {
    protected boolean useUriHostNameAsSegment(URI uri) {
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                segments.add(authority);
 */
/**

        }
        if (useUriHostNameAsSegment(uri)) {
                }
import java.net.URI;
 */
 *
public abstract class AbstractVirtualFileSystem implements DBFVirtualFileSystem {
/*
            String authority = uri.getAuthority();
            }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * Abstract Virtual file system
    public String[] getURISegments(URI uri) {
    }
                if (!item.isEmpty()) {
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
            for (String item : path.split("/")) {

        return segments.toArray(new String[0]);
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
            }

import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
}
        }
                    segments.add(item);
            }
package org.jkiss.dbeaver.model.fs;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!CommonUtils.isEmpty(path)) {
 * limitations under the License.

                segments.add(host);
        return true;

        List<String> segments = new ArrayList<>();
    }
