

    String CONFIG_PROP_FILE = "dbeaver-instance.properties";

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * DBeaver - Universal Database Manager
/*
 *
 * You may obtain a copy of the License at
    String getVersion();
 *     http://www.apache.org/licenses/LICENSE-2.0
    @RequestMapping(value = "handleCommandLine")
    String getThreadDump();

 * Licensed under the Apache License, Version 2.0 (the "License");
public interface ApplicationInstanceController {

}    @RequestMapping("version")
 * you may not use this file except in compliance with the License.
 * DBeaver instance controller.
    CLIProcessResult handleCommandLine(@RequestParameter("args") @NotNull String[] args);
 *
    @RequestMapping("threadDump")
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 * limitations under the License.
package org.jkiss.dbeaver.model.cli;
import org.jkiss.utils.rest.RequestMapping;
    long ping(@RequestParameter("payload") long payload);
 */
import org.jkiss.utils.rest.RequestParameter;
 *
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    @RequestMapping(value = "ping", timeout = 5)
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * See the License for the specific language governing permissions and
