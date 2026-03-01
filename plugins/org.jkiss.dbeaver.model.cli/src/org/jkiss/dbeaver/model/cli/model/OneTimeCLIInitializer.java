/*
 *
import org.jkiss.dbeaver.model.cli.CLIException;
 *
package org.jkiss.dbeaver.model.cli.model;
import org.jkiss.dbeaver.model.cli.CLIContext;
 */

 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * You may obtain a copy of the License at

    public void initialize(@NotNull CLIContext context) throws CLIException {
    private boolean initialized = false;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
            doInitialization(context);
 * Unless required by applicable law or agreed to in writing, software
}


    }

public abstract class OneTimeCLIInitializer implements CLIInitializer {

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            initialized = true;
        if (!initialized) {
    protected abstract void doInitialization(@NotNull CLIContext context) throws CLIException;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
