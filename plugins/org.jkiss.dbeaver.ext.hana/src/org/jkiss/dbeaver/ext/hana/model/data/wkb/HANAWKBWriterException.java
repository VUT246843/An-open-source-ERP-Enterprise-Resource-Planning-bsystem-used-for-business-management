 */
    }
        super(message);



    public HANAWKBWriterException(String message) {
 * Unless required by applicable law or agreed to in writing, software

 *
 *
    }
    private static final long serialVersionUID = 1L;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    }
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

        super(message, cause);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
package org.jkiss.dbeaver.ext.hana.model.data.wkb;
        super(cause);
 *    Stefan Uhrig - initial implementation
 * DBeaver - Universal Database Manager
 * Contributors:
 * you may not use this file except in compliance with the License.
public class HANAWKBWriterException extends Exception {
}
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * Exception thrown if WKB writing fails.
    public HANAWKBWriterException(String message, Throwable cause) {
 * You may obtain a copy of the License at
    public HANAWKBWriterException(Throwable cause) {
