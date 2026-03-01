    }
        if (line <= 0) {
    {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        return message;
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    @Override
    {
}
        return error;
        return line;
            return message;
 * Copyright (C) 2010-2024 DBeaver Corp and others


 *     http://www.apache.org/licenses/LICENSE-2.0


        this.message = message;
 * Unless required by applicable law or agreed to in writing, software
        } else {
    {
    public boolean isError()
    }
package org.jkiss.dbeaver.model.exec.compile;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String toString()
    {
    public int getPosition()
 *
    }
        this.error = error;

 * Compile error
    private int line;

    }
/**
    {
        return position;

    public int getLine()
    private boolean error;
        this.line = line;
    private String message;
 * DBeaver - Universal Database Manager
/*
 * See the License for the specific language governing permissions and
 * limitations under the License.
    public String getMessage()
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 *
            return message + "\nCompile error at line " + line + ", column " + position;
public class DBCCompileError {
    }
        }
    private int position;
    public DBCCompileError(boolean error, String message, int line, int position)
 */
        this.position = position;

