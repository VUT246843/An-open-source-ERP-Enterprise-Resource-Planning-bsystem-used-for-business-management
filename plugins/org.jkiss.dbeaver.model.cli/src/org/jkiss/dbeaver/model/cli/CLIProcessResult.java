 *
        ERROR(CLIConstants.EXIT_CODE_ERROR),
    public CLIProcessResult(@NotNull PostAction postAction, @Nullable String output) {
    }
        return output;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public CLIProcessResult(@NotNull PostAction postAction, @Nullable List<String> output, short exitCode) {

        this(postAction, output, postAction.defaultExitCode);

    }


        PostAction(short exitCode) {
    public CLIProcessResult(@NotNull PostAction postAction, short exitCode) {
        }
 * DBeaver - Universal Database Manager
        this(postAction, output == null ? null : List.of(output), postAction.defaultExitCode);
        this(postAction, null, postAction.defaultExitCode);
    }
        START_INSTANCE(CLIConstants.EXIT_CODE_CONTINUE),
        return postAction;
    @NotNull
    @NotNull
        return exitCode;

    public CLIProcessResult(@NotNull PostAction postAction, @Nullable List<String> output) {
 * you may not use this file except in compliance with the License.
    public short getExitCode() {


            this.defaultExitCode = exitCode;
 * See the License for the specific language governing permissions and
    public PostAction getPostAction() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,


        private final short defaultExitCode;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
    private final PostAction postAction;
 *
        this.exitCode = exitCode;
    }
/*
        this.output = output;
    public enum PostAction {
 */

    public List<String> getOutput() {

 *
public class CLIProcessResult {

    private final List<String> output;
        this(postAction, null, exitCode);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

import java.util.List;
}

    }
 * You may obtain a copy of the License at
    public CLIProcessResult(@NotNull PostAction postAction) {
    private final short exitCode;
        UNKNOWN_COMMAND(CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
        SHUTDOWN(CLIConstants.EXIT_CODE_OK),
package org.jkiss.dbeaver.model.cli;
    @Nullable
 * limitations under the License.
    @Nullable
        this.postAction = postAction;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
