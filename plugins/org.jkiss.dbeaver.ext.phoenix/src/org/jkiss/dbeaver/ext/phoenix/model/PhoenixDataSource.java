 *

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
			throws DBException {
	}
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 *

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 *
 * See the License for the specific language governing permissions and
public class PhoenixDataSource extends GenericDataSource {
		super(monitor, container, metaModel, new PhoenixSQLDialect());
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package org.jkiss.dbeaver.ext.phoenix.model;
	public PhoenixDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
 * DBeaver - Universal Database Manager
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
}
