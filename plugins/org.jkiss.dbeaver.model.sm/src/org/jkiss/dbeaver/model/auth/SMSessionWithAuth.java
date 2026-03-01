 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*

 *
}
 */
public interface SMSessionWithAuth extends SMSession {
 *
 * Session which contain current user authentication information

 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
/**
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    List<SMAuthInfo> getAuthInfos();
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.auth;
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * you may not use this file except in compliance with the License.
 *
