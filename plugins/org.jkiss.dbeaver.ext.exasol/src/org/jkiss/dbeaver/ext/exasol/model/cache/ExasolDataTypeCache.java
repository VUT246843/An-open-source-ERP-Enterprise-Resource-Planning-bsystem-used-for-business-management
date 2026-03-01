	
	}
	
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
		dbstat.setQueryString(SQL_TYPE_CACHE);
 * DBeaver - Universal Database Manager
import java.util.List;
    extends JDBCObjectCache<ExasolDataSource, ExasolDataType> {
		dataTypeMap.clear();
	public void setCache(@NotNull List<ExasolDataType> objects) {
	public void removeObject(@NotNull ExasolDataType object, boolean resetFullCache) {

package org.jkiss.dbeaver.ext.exasol.model.cache;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
	
	{
	@NotNull
		return new ExasolDataType(owner, resultSet);
 * Copyright (C) 2019-2019 Karl Griesser (fullref@gmail.com)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * you may not use this file except in compliance with the License.
 */

	}
public final class ExasolDataTypeCache
		
        "/*snapshot execution*/ select * from SYS.EXA_SQL_TYPES";

		// TODO Auto-generated method stub
 *
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
	@Override

		super.clearCache();
		}
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataType;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
	private static final String SQL_TYPE_CACHE =
	protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull ExasolDataSource owner) throws SQLException {

import java.sql.SQLException;
    private LongKeyMap<ExasolDataType> dataTypeMap = new LongKeyMap<>();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

	
 *
	
	
import org.jkiss.utils.LongKeyMap;
	
		super.setCache(objects);
	public void clearCache() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
		return dbstat;
		return dataTypeMap.get(id);
		dataTypeMap.remove(object.getExasolTypeId());
	
	}
	protected ExasolDataType fetchObject(@NotNull JDBCSession session, @NotNull ExasolDataSource owner, @NotNull JDBCResultSet resultSet)
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
	
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

	
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
			dataTypeMap.put(dt.getExasolTypeId(), dt);
 * You may obtain a copy of the License at
}

			throws SQLException, DBException {
 *

	}
	
	public ExasolDataType getDataTypeId(long id)
		
		for (ExasolDataType dt: objects)
	@Override
/*
		super.removeObject(object, resetFullCache);
	@Override
	}
		
		JDBCStatement dbstat = session.createStatement();
 * Licensed under the Apache License, Version 2.0 (the "License");
	@Override
		{
