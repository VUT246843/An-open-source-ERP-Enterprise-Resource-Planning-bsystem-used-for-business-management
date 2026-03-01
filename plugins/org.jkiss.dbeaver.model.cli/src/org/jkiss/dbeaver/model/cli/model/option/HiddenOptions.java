
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String arch;
    private String os;
import picocli.CommandLine;

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
/**
    @CommandLine.Option(names = {"-arch"}, arity = "1", hidden = true)
    private boolean debug;
    public static final String PRODUCT_OPTION = "-product";
 */
    @CommandLine.Option(names = {"-cli-mode"}, hidden = true)
    @CommandLine.Option(names = {"-ws"}, arity = "1", hidden = true)
    private String dev;
 *

    @CommandLine.Option(names = {"-showsplash"}, hidden = true)
    @CommandLine.Option(names = {"-os"}, arity = "1", hidden = true)

    @CommandLine.Option(names = {"-dev"}, arity = "1", hidden = true)
    private String eclipseKeyring;

    @CommandLine.Option(names = {"-eclipse.keyring"}, arity = "1", hidden = true)

    @CommandLine.Option(names = {"-registryMultiLanguage"}, hidden = true)
    private String product;
    @CommandLine.Option(names = {PRODUCT_OPTION}, arity = "1", hidden = true)
 * Eclipse options, we do not process them,
    private boolean cliMode;
 * DBeaver - Universal Database Manager
 * properties hidden and exists to avoid unmatched options error
 *
    @CommandLine.Option(names = {"-debug"}, hidden = true)
 *
public class HiddenOptions {
    private boolean registryMultiLanguage;
    @CommandLine.Option(names = {"-launcher"}, arity = "1", hidden = true)
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

    private String launcher;
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others


package org.jkiss.dbeaver.model.cli.model.option;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 */
    @CommandLine.Option(names = {"-consoleLog"}, hidden = true)

    private boolean showSplash;
 * you may not use this file except in compliance with the License.
    private String ws;

    private boolean consoleLog;
}

