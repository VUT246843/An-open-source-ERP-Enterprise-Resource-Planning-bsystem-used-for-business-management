    @NotNull

    protected void initialize() throws CLIException {
        return null;
}
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
        run();


 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull

        initialize();
import picocli.CommandLine;
 * DBeaver - Universal Database Manager
                    if (mixin.userObject() == null) {
        }
    public abstract void run() throws CLIException;
/*

 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Void call() throws CLIException {
            }
        List<CLIInitializer> initializers = findMixins(CLIInitializer.class);
        List<T> updaters = new ArrayList<>();
 * See the License for the specific language governing permissions and
            if (!CommonUtils.isEmpty(curSpec.mixins())) {
                    }
                        continue;
        while (curSpec != null) {
            curSpec = curSpec.parent();

            initializer.initialize(context());

                        updaters.add(implClass.cast(mixin.userObject()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
public abstract class CLIAbstractCommand implements Callable<Void> {
                for (CommandLine.Model.CommandSpec mixin : curSpec.mixins().values()) {
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected CommandLine.Model.CommandSpec spec;
    }
                }
package org.jkiss.dbeaver.model.cli;
                    }
    protected abstract CLIContext context();
    @Override
 *
import java.util.concurrent.Callable;
import org.jkiss.dbeaver.model.cli.model.CLIInitializer;
    }
import org.jkiss.utils.CommonUtils;

    @CommandLine.Spec
                    if (implClass.isAssignableFrom(mixin.userObject().getClass())) {
    }
 *
 *
 * You may obtain a copy of the License at
    protected <T> List<T> findMixins(@NotNull Class<T> implClass) {
        return updaters;
        for (CLIInitializer initializer : initializers) {

import java.util.List;
        var curSpec = spec;
        }
 * limitations under the License.
