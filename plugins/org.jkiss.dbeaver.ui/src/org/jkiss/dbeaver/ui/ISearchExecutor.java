 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
package org.jkiss.dbeaver.ui;




} *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 */
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    int SEARCH_PREVIOUS = 4;
/**
public interface ISearchExecutor

 *
    boolean performSearch(String searchString, int options);
 * See the License for the specific language governing permissions and
    int SEARCH_NEXT = 2;
 */
{
 * Licensed under the Apache License, Version 2.0 (the "License");
    void cancelSearch();
/*
    int SEARCH_CASE_SENSITIVE   = 1;
 * ISearchExecutor
