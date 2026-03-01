 * limitations under the License.
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
 * Active wizard page
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    
 *
     * Page is applicable to active wizard state.
package org.jkiss.dbeaver.ui.dialogs;

 *
 * See the License for the specific language governing permissions and
    /**

     * Non-applicable pages are not visible in navigation tree.

 * you may not use this file except in compliance with the License.
public interface IWizardPageNavigable {
 */
    boolean isPageNavigable();
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Page can be navigated directly thru navigation tree.
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    boolean isPageApplicable();
 * Unless required by applicable law or agreed to in writing, software
/*
}
 */
/**
