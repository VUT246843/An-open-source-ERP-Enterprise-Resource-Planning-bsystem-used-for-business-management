 *
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

/**

 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @param manager contributor manager
    /**
}

 */
import org.eclipse.ui.IEditorActionBarContributor;
 * You may obtain a copy of the License at
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
/*
 * ISection which provides action contributions
public interface IDatabaseEditorContributorUser {
 *
 * DBeaver - Universal Database Manager

 * See the License for the specific language governing permissions and
    IEditorActionBarContributor getContributor(IDatabaseEditorContributorManager manager);
     * @return null or contributor
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
     * Returns null or contributor (new or obtained from manager)
     * then it should use it and return null.

