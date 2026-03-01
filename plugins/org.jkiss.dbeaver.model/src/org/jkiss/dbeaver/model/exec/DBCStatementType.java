package org.jkiss.dbeaver.model.exec;
 * You may obtain a copy of the License at
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
/*
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.


 */
    EXEC,   // Stored procedure or other dynamic execution
 * Statement type.
 *
    QUERY,  // Single query. Supports parameters binding

 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
public enum DBCStatementType {
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
}
    SCRIPT  // Any other SQL. including multiple queries.
 * Unless required by applicable law or agreed to in writing, software
