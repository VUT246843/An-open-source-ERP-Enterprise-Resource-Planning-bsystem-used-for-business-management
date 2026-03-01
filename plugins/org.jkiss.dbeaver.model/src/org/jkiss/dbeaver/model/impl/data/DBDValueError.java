 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isModified() {
    @Override
import org.jkiss.dbeaver.model.data.DBDValueSurrogate;


        return buf.toString();
 * You may obtain a copy of the License at
        error.printStackTrace(new PrintWriter(buf, true));
    }
 *
        return error;
import org.jkiss.dbeaver.DBException;

    }
 */
 *

    @Override
import java.io.PrintWriter;
 */
    @Override
        this.error = error;

    public DBDValueError(Throwable error) {
import java.io.StringWriter;
package org.jkiss.dbeaver.model.impl.data;
    public String getErrorTitle() {
        return false;
    public String toString() {

        }
 * limitations under the License.
    }
/*
    public void release() {



        return error.getClass().getSimpleName() + ": " + CommonUtils.notEmpty(error.getMessage());
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            return error.getMessage();
        StringWriter buf = new StringWriter();
        if (error instanceof DBException) {
 * See the License for the specific language governing permissions and
}
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
 *
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    public Object getRawValue() {
    public boolean isNull() {
    private final Throwable error;
    }
        return false;
 * DBDValueError

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
public final class DBDValueError implements DBDValueSurrogate {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
/**

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
