import org.jkiss.code.NotNull;
    public static void fireTerminate(Object source) {
}
        }
                configuration.removeAttribute(entry.getKey());
        if (finder == null) {
            Object value = entry.getValue();
    public static DBPDataSourceContainer getDataSourceContainer(ILaunchConfiguration configuration) throws CoreException {
    public static DBSObject resolveDatabaseObject(DBPDataSourceContainer container, Map<String, Object> context,
            DBSObject dbsObject;
        } catch (CoreException e) {
    public static CoreException abort(String message, Throwable th) {
            } else {
import org.eclipse.debug.core.DebugPlugin;
 * You may obtain a copy of the License at
        if (dataSource == null) {
 *
        }
package org.jkiss.dbeaver.debug.core;
            return null;
    public static void fireEvent(DebugEvent event) {

        try {
    public static boolean canLaunch(ILaunchConfiguration configuration, String mode) {
import org.jkiss.dbeaver.debug.internal.core.DebugCoreMessages;
        DBGResolver finder = GeneralUtils.adapt(container, DBGResolver.class);
        return newErrorStatus(message, null);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static Map<String, Object> resolveDatabaseContext(DBSObject databaseObject) {

        }
            return (String) object;
     * Fires a terminate event.
     * @param event
            } else if (value instanceof Integer) {

        DBPDataSource dataSource = databaseObject.getDataSource();
     * Fires the given debug event.
     *            debug event to fire
        }
                Status error = DebugUtils.newErrorStatus(e.getMessage(), e);
import org.eclipse.debug.core.DebugEvent;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
        DebugPlugin manager = DebugPlugin.getDefault();
import org.jkiss.dbeaver.debug.DBGResolver;
 *
        return result;
import org.eclipse.osgi.util.NLS;
    public static Map<String, Object> toBreakpointDescriptor(Map<String, Object> attributes) {
     */
    }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            }
    /**
        DBPDataSourceContainer container = controller.getDataSourceContainer();
    public static String getSourceName(Object object) throws CoreException {
            Object identifier, DBRProgressMonitor monitor) throws DBException {
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            // well, let's be positive and assume it's a node path already
            }
            if (node != null) {
        return datasourceDescriptor;
            }
     *
                configuration.setAttribute(entry.getKey(), (List<String>)value);
    /**
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return finder.resolveObject(context, identifier, monitor);
        }
import java.util.List;
import java.util.Map;

                configuration.setAttribute(entry.getKey(), value.toString());
            String message = NLS.bind(DebugCoreMessages.DebugCore_e_unable_to_retrieve_modes, configuration);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.runtime.CoreException;
import java.util.ArrayList;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return abort(message, null);
            if (dbsObject == null) {
        return new CoreException(newErrorStatus(message, th));
        }
            return false;
        }
        if (object instanceof String) {
        result.put(IMarker.LINE_NUMBER, attributes.get(IMarker.LINE_NUMBER));

                configuration.setAttribute(entry.getKey(), (Integer) value);
            return result;
/*
        if (manager != null) {
        }
    }
        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
    public static DBSObject findDatabaseObject(DBGController controller, Object identifier, DBRProgressMonitor monitor) throws DBException {
        List<DBSObject> extracted = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.navigator.DBNModel;
    public static List<DBSObject> extractLaunchable(Object[] scope) {
        if (datasourceDescriptor == null) {
        fireEvent(new DebugEvent(source, DebugEvent.TERMINATE));
    }
import java.util.HashMap;
            throw new CoreException(newErrorStatus(message));
    }
import org.eclipse.debug.core.ILaunchConfiguration;

            Object sourceIdentifier = frame.getSourceIdentifier();
 * limitations under the License.
    private static Log log = Log.getLog(DebugUtils.class);
                dbsObject = findDatabaseObject(frame.getController(), sourceIdentifier, new VoidProgressMonitor());
            return result;
    public static void putContextInConfiguration(ILaunchConfigurationWorkingCopy configuration, Map<String, Object> attrs) {
            return result;
                extracted.add(adapted);
        Map<String, Object> result = new HashMap<>();

import org.jkiss.dbeaver.model.DBUtils;
    }

    public static Status newErrorStatus(String message) {
        if (object instanceof DatabaseStackFrame) {
            }
        if (databaseObject == null) {
        Map<String, Object> context = controller.getDebugConfiguration();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        String datasourceId = configuration.getAttribute(DBGConstants.ATTR_DATASOURCE_ID, (String)null);
    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            DBNDatabaseNode node = navigatorModel.getNodeByObject(new VoidProgressMonitor(), dbsObject, false);
        Map<String, Object> context = finder.resolveContext(databaseObject);


            if (adapted != null) {
    public static CoreException abort(String message) {

 *
        String projectName = configuration.getAttribute(DBGConstants.ATTR_PROJECT_NAME, (String)null);
                configuration.setAttribute(entry.getKey(), (Boolean) value);
            String message = NLS.bind("Unable to find data source with id {0}", datasourceId);
        }

    }
    }
    }
        return result;
import org.jkiss.dbeaver.utils.GeneralUtils;
    
        }
 * DBeaver - Universal Database Manager
                return null;
        for (Object object : scope) {
            log.error(message, e);
        result.putAll(context);

        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        return new Status(IStatus.ERROR, DBGConstants.BUNDLE_SYMBOLIC_NAME, message, th);
            } else if (value instanceof List) {
        if (scope == null) {
    }
            DatabaseStackFrame frame = (DatabaseStackFrame) object;
    public static Status newErrorStatus(String message, Throwable th) {

public class DebugUtils {
import org.eclipse.core.runtime.IStatus;
            if (value == null) {

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
            DBSObject adapted = GeneralUtils.adapt(object, DBSObject.class, true);
import org.jkiss.dbeaver.debug.DBGConstants;
     */
            manager.fireDebugEventSet(new DebugEvent[] { event });
            } catch (DBException e) {
        return resolveDatabaseObject(container, context, identifier, monitor);
            return extracted;
            try {
        return extracted;
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (finder == null) {
            final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
 * See the License for the specific language governing permissions and
            return configuration.supportsMode(mode);
                throw new CoreException(error);
        }
    }
        DBPDataSourceContainer datasourceDescriptor = DBUtils.findDataSource(projectName, datasourceId);
import org.eclipse.core.resources.IMarker;
        }
            } else if (value instanceof Boolean) {
    }
import org.jkiss.dbeaver.debug.DBGController;
        DBGResolver finder = GeneralUtils.adapt(dataSource.getContainer(), DBGResolver.class);
 */

                return node.getNodeUri();
        HashMap<String, Object> result = new HashMap<>();
import org.jkiss.dbeaver.debug.core.model.DatabaseStackFrame;
        if (configuration == null || !configuration.exists()) {
            return false;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.Status;
    @NotNull
import org.jkiss.dbeaver.runtime.DBWorkbench;
