 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isUserPasswordApplicable() {

 */
    public static final String ID = "google_spanner";
 * You may obtain a copy of the License at
    public boolean isUserNameApplicable() {
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * See the License for the specific language governing permissions and
}
        return false;
        return false;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
    }
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Override
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.ext.spanner.auth;
/*
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
public class SpannerAuthModel extends AuthModelDatabaseNative<AuthModelDatabaseNativeCredentials> {

