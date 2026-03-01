
            removeModelObject(command.getObject());
        protected void removeModelObject(OBJECT_TYPE object)

    protected static final Log log = Log.getLog(AbstractObjectManager.class);

                options = ((DBECommandWithOptions) command).getOptions();
        {
            DBUtils.fireObjectRemove(command.getObject());

        public CreateObjectReflector(DBEObjectMaker<OBJECT_TYPE, ? extends DBSObject> objectMaker)
 * You may obtain a copy of the License at
        }
    }
        @Override

        {

    public static class DeleteObjectReflector<OBJECT_TYPE extends DBSObject> extends AbstractObjectReflector<OBJECT_TYPE> {
    {
 * limitations under the License.
 * Abstract object manager
        public void undoCommand(@NotNull DBECommand<OBJECT_TYPE> command)
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (cache != null) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
import org.jkiss.dbeaver.DBException;

            }
        public void redoCommand(@NotNull DBECommand<OBJECT_TYPE> command)

/*
import java.util.Map;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
            DBUtils.fireObjectRemove(command.getObject());
                cache.cacheObject(object);
        {
                cache.removeObject(object, false);
 *
}

    }
            if (command instanceof DBECommandWithOptions) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.edit.*;
            DBSObjectCache<? extends DBSObject, OBJECT_TYPE> cache = objectMaker.getObjectsCache(object);
        protected void cacheModelObject(OBJECT_TYPE object)
        {

        {
    }
            }
            removeModelObject(command.getObject());
            cacheModelObject(command.getObject());
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            this.objectMaker = objectMaker;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static class CreateObjectReflector<OBJECT_TYPE extends DBSObject> extends AbstractObjectReflector<OBJECT_TYPE> {
        {
            cacheModelObject(command.getObject());

        public void undoCommand(@NotNull DBECommand<OBJECT_TYPE> command)

            if (cache != null) {
public abstract class AbstractObjectManager<OBJECT_TYPE extends DBSObject> implements DBEObjectManager<OBJECT_TYPE> {
        @Override
    public static abstract class AbstractObjectReflector<OBJECT_TYPE extends DBSObject> implements DBECommandReflector<OBJECT_TYPE, DBECommand<OBJECT_TYPE>> {
 * See the License for the specific language governing permissions and
        {
            DBUtils.fireObjectAdd(command.getObject(), options);
 * DBeaver - Universal Database Manager
        }
    @Override
    public void executePersistAction(DBCSession session, DBECommand<OBJECT_TYPE> command, DBEPersistAction action) throws DBException
        private final DBEObjectMaker<OBJECT_TYPE, ? extends DBSObject> objectMaker;
 * Unless required by applicable law or agreed to in writing, software
            Map<String, Object> options = null;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            super(objectMaker);
        public void redoCommand(@NotNull DBECommand<OBJECT_TYPE> command)
        }
 */
            DBSObjectCache<? extends DBSObject, OBJECT_TYPE> cache = objectMaker.getObjectsCache(object);
                options = ((DBECommandWithOptions) command).getOptions();
            }
import org.jkiss.dbeaver.model.DBUtils;
            if (command instanceof DBECommandWithOptions) {
            Map<String, Object> options = null;
        protected AbstractObjectReflector(DBEObjectMaker<OBJECT_TYPE, ? extends DBSObject> objectMaker)

 *
        }
 */
        public DeleteObjectReflector(DBEObjectMaker<OBJECT_TYPE, ? extends DBSObject> objectMaker)
 * you may not use this file except in compliance with the License.
 *
            DBUtils.fireObjectAdd(command.getObject(), options);
        DBExecUtils.executePersistAction(session, action);
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.model.impl.edit;
        }
            super(objectMaker);
        {
import org.jkiss.dbeaver.model.exec.DBCSession;
        {
        @Override
        }
        }

        @Override
import org.jkiss.code.NotNull;
