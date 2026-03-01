 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.cli.model.option.AuthenticateOptions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 * Licensed under the Apache License, Version 2.0 (the "License");

public interface CommandLineAuthenticator {
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.model.cli.model;
import org.jkiss.dbeaver.model.cli.CLIContext;
 *
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    void authenticate(@Nullable AuthenticateOptions options, @NotNull CLIContext context) throws DBException;
 *
 */
 * limitations under the License.
 *
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;

 *     http://www.apache.org/licenses/LICENSE-2.0
