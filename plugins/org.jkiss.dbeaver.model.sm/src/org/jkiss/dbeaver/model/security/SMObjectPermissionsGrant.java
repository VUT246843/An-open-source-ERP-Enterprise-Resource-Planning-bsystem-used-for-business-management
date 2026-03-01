        this.subjectType = subjectType;
            return new SMObjectPermissionsGrant(
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
            this.objectPermissions.add(permission);


        this.objectPermissions = objectPermissions;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            this.subjectId = subjectId;
            );
 *

    private final SMSubjectType subjectType;
 * You may obtain a copy of the License at

            this.objectId = objectId;
 * Unless required by applicable law or agreed to in writing, software
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return this;
        public Builder(String subjectId, SMSubjectType subjectType, String objectId) {
    }
        private final String subjectId;
        public Builder addPermission(String permission) {
        }

}
    public SMSubjectType getSubjectType() {
public class SMObjectPermissionsGrant {
    public static final class Builder {

        return new Builder(subjectId, subjectType, objectId);
 * See the License for the specific language governing permissions and

                subjectId, subjectType,
 *

    public String getSubjectId() {
import java.util.Set;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String subjectId;
        }
        return subjectId;

/*
 *
            this.subjectType = subjectType;

        return subjectType;
    }
        private final String objectId;
import org.jkiss.dbeaver.model.security.user.SMObjectPermissions;
 * you may not use this file except in compliance with the License.

    public static Builder builder(String subjectId, SMSubjectType subjectType, String objectId) {
        return objectPermissions;
        }
        private final Set<String> objectPermissions = new HashSet<>();
                new SMObjectPermissions(objectId, Set.copyOf(objectPermissions))
import java.util.HashSet;
package org.jkiss.dbeaver.model.security;
    }
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        private final SMSubjectType subjectType;
    private final SMObjectPermissions objectPermissions;
    }
        this.subjectId = subjectId;

        public SMObjectPermissionsGrant build() {
    public SMObjectPermissions getObjectPermissions() {
    }
    public SMObjectPermissionsGrant(String subjectId, SMSubjectType subjectType, SMObjectPermissions objectPermissions) {
