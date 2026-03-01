    }
        this.length = length;
 * you may not use this file except in compliance with the License.
 *
        return properties == null ? Map.of() : properties;

    public Map<String, Object> getProperties() {
    public void setLength(long length) {
    }
        return lastModified;
    public List<RMResourceChange> getChanges() {
    private Long lastModified;
        this.changes = changes;


 */

 *
        super(name);



 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Resource manager API
        this.folder = folder;
    @Property
        this.length = length;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    @Property

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.folder = folder;
        this.lastModified = lastModified;


    private Map<String, Object> properties;
    }
    public void setLastModified(Long lastModified) {

    private long length;
        return length;
    }
import org.jkiss.dbeaver.model.meta.Property;
    }
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.rm;
    public Long getLastModified() {
    }

    public void setProperties(Map<String, Object> properties) {
    public long getLength() {
import java.util.Map;
/**
    public void setFolder(boolean folder) {
 * See the License for the specific language governing permissions and
    }
        this.properties = properties;
    }
import java.util.List;
    public RMResource(String name) {
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property
 */
    }
 * You may obtain a copy of the License at
        return changes;
public class RMResource extends RMObject {
    private List<RMResourceChange> changes;
    public void setChanges(List<RMResourceChange> changes) {
        super(name);
    public RMResource(@NotNull String name, boolean folder, long length) {
}
        return folder;
    private boolean folder;

    }
    public RMResource() {
    }
    }
/*

    @Override

    public boolean isFolder() {
 *


    }
