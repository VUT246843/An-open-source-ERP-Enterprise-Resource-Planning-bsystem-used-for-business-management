        return subjectId;
    public void setSubjectId(@NotNull String subjectId) {
    public boolean equals(Object o) {
    @Nullable
    public String getUniqueId() {

    @NotNull
        return getId() + "_" + getSubjectId();
    // for serialization

            && Objects.equals(id, that.id)
    @NotNull
 * You may obtain a copy of the License at
    public DBSSecretValue(@NotNull String subjectId, @NotNull String id, @NotNull String displayName, @Nullable String value) {
    private String value;
    }
    }
    }
        this.displayName = displayName;
        if (getSubjectId() == null) {



            && Objects.equals(displayName, that.displayName)
    }

 *
 *
}
        this.id = id;
/*
        this.subjectId = subjectId;
 *
    private String id;


        DBSSecretValue that = (DBSSecretValue) o;

 * distributed under the License is distributed on an "AS IS" BASIS,
public class DBSSecretValue {
        this.value = value;
        this.displayName = displayName;
    @Override
    @NotNull
 * limitations under the License.
    @Override
        this.subjectId = subjectId;
        }
package org.jkiss.dbeaver.model.secret;
    }
        return Objects.equals(subjectId, that.subjectId)
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        this.value = value;

        if (o == null || getClass() != o.getClass()) return false;
    }
    @Nullable
        if (this == o) return true;
        return displayName;
    public String getSubjectId() {
    public String getId() {
    }
    }
    }
    public String getDisplayName() {
    public DBSSecretValue(@NotNull String id, @NotNull String displayName, @Nullable String value) {

 * See the License for the specific language governing permissions and


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return value;
        return Objects.hash(subjectId, id, displayName, value);
    private String displayName;
    }
    }
    }
            return getId();
    public DBSSecretValue() {
    @NotNull
import org.jkiss.code.Nullable;
        this.id = id;

        this.value = value;
    public void setId(@NotNull String id) {
    public void setDisplayName(@NotNull String displayName) {

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Objects;
    public String getValue() {

 * DBeaver - Universal Database Manager
        this.displayName = displayName;
    public void setValue(@Nullable String value) {

            && Objects.equals(value, that.value);
    private String subjectId;
    @NotNull
 */
 * you may not use this file except in compliance with the License.
        this.id = id;
    public int hashCode() {
        return id;
    }
