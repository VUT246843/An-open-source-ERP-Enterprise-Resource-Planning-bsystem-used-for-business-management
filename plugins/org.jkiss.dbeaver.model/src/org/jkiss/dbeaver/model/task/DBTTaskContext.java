 * Copyright (C) 2010-2024 DBeaver Corp and others
    }


 */
 * limitations under the License.
    public int getTransactionIsolation() {
    public void setDefaultSchema(String defaultSchema) {
    public void setTransactionIsolation(int transactionIsolation) {
public class DBTTaskContext {
    public void setAutoCommit(boolean autoCommit) {
 * You may obtain a copy of the License at
 *
 * Task context

        return defaultCatalog;


    }
    public void setDefaultCatalog(String defaultCatalog) {
 *


        this.defaultCatalog = defaultCatalog;
    private boolean autoCommit;
    }
        this.defaultSchema = defaultSchema;

    }
        this.transactionIsolation = transactionIsolation;
    }
    private String defaultSchema;
 * you may not use this file except in compliance with the License.
 *
        return defaultSchema;
 * Unless required by applicable law or agreed to in writing, software
/*
/**
    private int transactionIsolation;
 * See the License for the specific language governing permissions and
    public boolean isAutoCommit() {
 * distributed under the License is distributed on an "AS IS" BASIS,

        return autoCommit;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

    public String getDefaultSchema() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    }
    private String defaultCatalog;
    }
    public String getDefaultCatalog() {
package org.jkiss.dbeaver.model.task;
    }
        this.autoCommit = autoCommit;
        return transactionIsolation;
 */
