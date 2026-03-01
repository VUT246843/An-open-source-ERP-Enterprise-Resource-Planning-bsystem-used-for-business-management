
        super(message, cause, enableSuppression, writableStackTrace);


    public LSMException(@NotNull String message) {
package org.jkiss.dbeaver.model.lsm;

    }
    public LSMException() {
 */
 *
        super(message);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * DBeaver - Universal Database Manager
        super(message, cause);

    public LSMException(@NotNull Throwable cause) {
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    }
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    public LSMException(@NotNull String message, @NotNull Throwable cause) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public LSMException(@NotNull String message, @NotNull Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    }
        super(cause);
}
 *
 * limitations under the License.
    }
public class LSMException extends Exception {
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
