 *
package org.jkiss.dbeaver.model.lsp;
import org.jkiss.code.NotNull;
    private final String uri;
    @Override
    @NotNull
        return uri;
 * Unless required by applicable law or agreed to in writing, software
    public String getValue() {
        return uri;

            throw new IllegalArgumentException(
    public String getResourcePath() {
                String.format("Invalid URI format: %s, expected lsp://{projectId}/{resourcePath}", uri)
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    @NotNull
        this.resourcePath = matcher.group(2);
    public DocumentURI(@NotNull String uri) {
 */
    public String getProjectId() {

import java.util.regex.Matcher;
    }

 * you may not use this file except in compliance with the License.

    @NotNull
    @NotNull
}
    public String toString() {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!matcher.matches()) {
        return resourcePath;
        this.uri = uri;
    private static final Pattern URI_PATTERN = Pattern.compile("^lsp://([A-Za-z0-9_-]+)/(\\S.*)$");
        this.projectId = matcher.group(1);
    }
    private final String resourcePath;


    }
    private final String projectId;
 * DBeaver - Universal Database Manager
public class DocumentURI {
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
import java.util.regex.Pattern;

/*
 *
        return projectId;
    @NotNull

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            );
 * See the License for the specific language governing permissions and
        Matcher matcher = URI_PATTERN.matcher(uri);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
