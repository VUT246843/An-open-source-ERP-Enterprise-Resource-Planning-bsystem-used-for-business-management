 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ", responseBody='" + responseBody + '\'' +
import org.jkiss.dbeaver.DBException;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public String toString() {
 *
            '}';
    public AIHttpTransportException(int statusCode, String responseBody) {
 * Unless required by applicable law or agreed to in writing, software
    private final String responseBody;
    @Override
}
    }
package org.jkiss.dbeaver.model.ai.utils;
            "statusCode=" + statusCode +
 * you may not use this file except in compliance with the License.
    }
        return statusCode;
    public int getStatusCode() {
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
public class AIHttpTransportException extends DBException {
 * See the License for the specific language governing permissions and


 *
        super("HTTP error: " + statusCode + " " + responseBody);
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.responseBody = responseBody;
    private final int statusCode;
 *
        return responseBody;
/*
 */
        this.statusCode = statusCode;
 * limitations under the License.
    public String getResponseBody() {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at

        return "HttpException{" +

