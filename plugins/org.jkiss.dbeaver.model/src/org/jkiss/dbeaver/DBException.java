            return false;
            while (ex1 != null) {
    public boolean equals(Object obj) {

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 */
 *
        }
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBException(String message, Throwable cause) {
            Throwable ex2 = this;
 * limitations under the License.
    public static final int ERROR_CODE_NONE = -1;
                if (!CommonUtils.equalObjects(ex1.getMessage(), ex2.getMessage())) {
import org.jkiss.utils.CommonUtils;
 * DBException
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                ex1 = ex1.getCause();
                }
            return true;
    public DBException(String message) {

package org.jkiss.dbeaver;


                    return false;
/**
public class DBException extends Exception {
                if ((ex1 == null && ex2 != null) || (ex2 == null && ex1 != null)) {
 * You may obtain a copy of the License at
 */
/*
    @Override
    }

            }
        super(message, cause);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        } else {
    }
            }
    private static final long serialVersionUID = 1L;
            if (obj == this) {
    }
        super(message);
 * you may not use this file except in compliance with the License.

                ex2 = ex2.getCause();

            Throwable ex1 = dbe;
                    return false;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                return true;
}
 * DBeaver - Universal Database Manager
        if (obj instanceof DBException dbe) {

