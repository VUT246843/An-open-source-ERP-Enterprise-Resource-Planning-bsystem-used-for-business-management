    @Nullable
        if (context().getContextParameter(CLIConstants.CONTEXT_PARAM_AUTHENTICATOR) != null) {
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.cli.CLIConstants;
    }
import picocli.CommandLine;
import org.jkiss.dbeaver.model.cli.CLIAbstractSubcommand;
public abstract class CommandLineWithAuth extends CLIAbstractSubcommand {
    @CommandLine.Mixin
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * limitations under the License.
            }
                ((CommandLineAuthenticator) context().getContextParameter(CLIConstants.CONTEXT_PARAM_AUTHENTICATOR))
            } catch (DBException e) {
            try {
import org.jkiss.dbeaver.DBException;
}
package org.jkiss.dbeaver.model.cli.model;
        }
    public void run() throws CLIException {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 *
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.model.cli.model.option.AuthenticateOptions;
                    .authenticate(authenticateOptions, context());
    private AuthenticateOptions authenticateOptions;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 *

import org.jkiss.dbeaver.model.cli.CLIException;
 */
                throw new CLIException("Authentication failed: " + e.getMessage(), e, CLIConstants.EXIT_CODE_ERROR);
import org.jkiss.code.Nullable;
