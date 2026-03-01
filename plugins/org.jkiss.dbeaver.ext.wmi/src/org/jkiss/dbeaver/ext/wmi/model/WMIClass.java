        }
                        log.warn("Referenced class '" + refClassName + "' not found in '" + getNamespace().getName() + "'");
    }
        if (superClass != null) {
    public List<WMIClassAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException
        return classObject;
                    }
        IMG_CLASS_ABSTRACT = new DBIconComposite(IMG_CLASS, false, null, IMG_ABSTRACT_OVR, null, null);
                getNamespace().getService(),
                    if (refClassPath == null) {
    }
                        continue;
        if (methods != null) {
        return DBUtils.findObject(getAttributes(monitor), attributeName);
                        continue;
            try {
    {
                    constraints = new ArrayList<>();
                    if (referenceAttributes == null) {
        if (name == null && classObject != null) {
    {
 * Unless required by applicable law or agreed to in writing, software
    public WMIClassMethod getMethod(DBRProgressMonitor monitor, String methodName) throws DBException
    {
    @Association
    public boolean isSystem()
    {
    private String name;

                session.getProgressMonitor(),
        }
            WMIResultSet resultSet = new WMIResultSet(session, this, sink.getObjectList());
        long flags,
            return getName();
                WMIConstants.WBEM_FLAG_SHALLOW);
        }
    {
        if (subClasses != null) {
    {
                    String refClassName = refClassPath.toString();
        if (!this.isAssociation()) {

        if (superClass == null) {
            return super.toString();
            }
    private static final DBPImage IMG_CLASS;
 *
    protected WMIQualifiedObject getQualifiedObject()
    {
        if (methods == null) {
    }
                    for (WMIClassAttribute a : allAttrs) {
        IMG_ASSOCIATION = DBIcon.TREE_ASSOCIATION;
    }
package org.jkiss.dbeaver.ext.wmi.model;
import org.jkiss.dbeaver.model.struct.*;
    public List<WMIClassMethod> getMethods(DBRProgressMonitor monitor) throws DBException
        return getName();
                    }
        super(parent);
                        if (ref.getAssociatedEntity() == this) {
    }
                    Object refClassPath = prop.getQualifier(WMIConstants.Q_CIMTYPE);
            readMethods(monitor);
        return getFlagQualifier(WMIConstants.Q_Aggregation);
    private List<WMIClassMethod> methods = null;
        }
                Collection<WMIClassReference> refAttrs = assoc.getReferenceAttributes(monitor);

    @Override
            return;
                }
    @NotNull
        } catch (DBException e) {
            subClasses = new ArrayList<>();
        } catch (WMIException e) {
        }
    }

                    }
                    classObject.getValue(WMIConstants.CLASS_PROP_CLASS_NAME));
    private List<WMIClassAttribute> attributes = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.wmi.Activator;
        IMG_CLASS_FINAL = new DBIconComposite(IMG_CLASS, false, null, null, null, IMG_FINAL_OVR);
public class WMIClass extends WMIContainer
            return getAttributes(monitor);
                }
    {
        @NotNull DBDDataReceiver dataReceiver,
    implements DBSEntity, DBPCloseableObject, DBPQualifiedObject, DBPSystemObject, DBSDataContainer, DBPImageProvider
    private static final Log log = Log.getLog(WMIClass.class);
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
import org.jkiss.dbeaver.DBDatabaseException;
        if (classObject != null) {
        try {
        }


            log.warn(e);
        this.classObject = classObject;
    static {
        return new String[] {FEATURE_DATA_SELECT};
            associations.add(new WMIClassInheritance(superClass, this));
    }

        return subClasses;
        return getFlagQualifier(WMIConstants.Q_Terminal);
    @NotNull
import java.util.Collection;
    {
import org.jkiss.dbeaver.DBException;
    public WMIClassAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException

                constraints.add(new WMIClassConstraint(this, attr));
                } else if (!prop.isSystem()) {
            classObject = null;
    public WMINamespace getNamespace()
    }
    {
                references.add(new WMIClassInheritance(this, ss));
                }
        }
        if (methods == null) {
                log.error(e);
        return getFlagQualifier(WMIConstants.Q_Association);
    }
                getName(),
        int fetchSize
 * you may not use this file except in compliance with the License.
    void addSubClass(WMIClass wmiClass)
                    WMIClassReference reference = new WMIClassReference(this, prop, refClass);
                    attributes.add(new WMIClassAttribute(this, prop));
    public String getName()
    @Association
    private synchronized void readAttributes(DBRProgressMonitor monitor) throws DBException
            readAttributes(monitor);
    }
        }
    }
                return isFinal() ? IMG_CLASS_ABSTRACT_FINAL : IMG_CLASS_ABSTRACT;
    }
    }
            }

 *

        return associations;
        try {
            }
    @Override
    {
    {
    {
        } catch (WMIException e) {

                return isAbstract() ? IMG_ASSOCIATION_ABSTRACT : IMG_ASSOCIATION;
    public DBPImage getObjectImage()

    private static final DBPImage IMG_CLASS_FINAL;
        IMG_CLASS_ABSTRACT_FINAL = new DBIconComposite(IMG_CLASS, false, null, IMG_ABSTRACT_OVR, null, IMG_FINAL_OVR);
        }
    {
        IMG_CLASS = DBIcon.TREE_CLASS;
                    if (refClass == null) {

            methods = new ArrayList<>();
    ) throws DBException {
    }
        return methods;
        for (WMIClassAttribute attr : getAllAttributes(monitor)) {
                    if (!overridden) {
            }
    {

        // Read attributes and references
                classObject.getValue(WMIConstants.CLASS_PROP_PATH));
    @Nullable
            List<WMIClassAttribute> allAttrs = new ArrayList<>();
            return;
        List<DBSEntityAssociation> references = new ArrayList<>();
    {
/**
            for (WMIClass assoc : getNamespace().getAssociations(monitor)) {
 *
    {
            }

        }
            if (isAssociation()) {
    public boolean isAggregation() throws DBException
                    boolean overridden = false;
import org.jkiss.dbeaver.model.meta.Property;
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
    {
                    for (WMIClassReference ref : refAttrs) {
    @Property(viewable = true, order = 10)
        }
        if (subClasses == null) {

        }
        if (classObject == null) {
            }
    static final String ICON_LOCATION_PREFIX = "platform:/plugin/" + Activator.PLUGIN_ID + "/icons/";


    public boolean isAbstract() throws DBException
    @Property(viewable = true, order = 1)
    @Override
            log.error(e);

    {
            return CommonUtils.toString(
        if (superClass == null && CommonUtils.isEmpty(referenceAttributes)) {
            for (WMIObjectAttribute prop : classObject.getAttributes(WMIConstants.WBEM_FLAG_CLASS_LOCAL_AND_OVERRIDES)) {
    }
                firstRow, maxRows);
    public String getPath()
            readMethods(monitor);
                }
                for (WMIClassAttribute attr : c.getAttributes(monitor)) {
                    refClassName = refClassName.substring(4);
    }
        }
        return IMG_CLASS;
    @Override
            return allAttrs;
    private WMIObject classObject;
import java.util.List;
                if (refAttrs != null) {
    }
    private static final DBPImage IMG_CLASS_ABSTRACT_FINAL;
        }
                    }

        @NotNull DBCSession session,
 * WMI class
    }
        }
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException
import java.util.ArrayList;
            readAttributes(monitor);
import org.jkiss.code.Nullable;

        if (attributes == null) {
import org.jkiss.dbeaver.model.exec.DBCSession;

            statistics.setExecuteTime(System.currentTimeMillis() - startTime);
    public Collection<WMIClassAttribute> getAllAttributes(DBRProgressMonitor monitor) throws DBException
            classObject.release();
        }
import org.jkiss.wmi.service.*;
    @Override
    public WMIClass(WMINamespace parent, WMIClass superClass, WMIObject classObject)
    public String[] getSupportedFeatures()
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (attr.getName().equals(a.getName())) {
        try {
                    }
    ///////////////////////////////////////////////////////////////////////
        if (attributes == null) {
    public void close()
            throw new DBCException(e, session.getExecutionContext());
    public List<WMIClass> getSubClasses()
    public Collection<WMIClassReference> getReferenceAttributes(DBRProgressMonitor monitor) throws DBException
    public boolean isFinal() throws DBException
        } else {
        DBDDataFilter dataFilter,
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Try to find references on self in association classes
    }

    }
    @Override
            try (resultSet) {
    private static final DBPImage IMG_CLASS_ABSTRACT;
        DBCStatistics statistics = new DBCStatistics();
        return classObject;
    {
        if (referenceAttributes != null) {
                    }

        //if (classObject == null) {
                    WMIClass refClass = getNamespace().getClass(monitor, refClassName);
    @Override
 * See the License for the specific language governing permissions and
            return null;

        }
    @NotNull
    @Override
        return name;
 * limitations under the License.
            return e.getMessage();
            }


                            // Add all association ref attributes

    }
    private static final DBPImage IMG_ASSOCIATION;
    public boolean isAssociation() throws DBException
        }
    {
/*
        List<DBSEntityAssociation> associations = new ArrayList<>();
        if (attributes != null) {
            sink.waitForFinish();
    public String toString()
            }
    {
            }
                return e.getMessage();
        }
            for (WMIClass ss : subClasses) {

                            overridden = true;
        return DBUtils.findObject(methods, methodName);
            for (WMIObjectMethod prop : classObject.getMethods(WMIConstants.WBEM_FLAG_LOCAL_ONLY)) {
    }
    @Override
                if (constraints == null) {


                        allAttrs.add(attr);
                            break;
    {
    @Property(viewable = true, order = 2)
    private static final DBIcon IMG_ABSTRACT_OVR = new DBIcon(ICON_LOCATION_PREFIX + "ovr_abstract.png");
import org.jkiss.code.NotNull;
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags)
    }
    public List<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
            if (attr.isKey()) {
            } else if (isAbstract()) {
            name = "?" + hashCode();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        subClasses.add(wmiClass);
        try {
            throw new DBDatabaseException(e, getDataSource());
                        }
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    private final WMIClass superClass;
        }
    @Override
        return parent;
            } else if (isFinal()) {
                DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, firstRow, maxRows);
    private static final DBIcon IMG_FINAL_OVR = new DBIcon(ICON_LOCATION_PREFIX + "ovr_final.png");

                name = CommonUtils.toString(
import org.jkiss.dbeaver.model.*;
    {
        } catch (WMIException e) {
    {
        return -1;
            } catch (WMIException e) {
    private synchronized void readMethods(DBRProgressMonitor monitor) throws DBException
        @Nullable DBCExecutionSource source,
        IMG_ASSOCIATION_ABSTRACT = new DBIconComposite(IMG_ASSOCIATION, false, null, IMG_ABSTRACT_OVR, null, null);
                }
            getNamespace().getService().enumInstances(
    {
        return constraints;
            attributes = new ArrayList<>();
    }
        return subClasses;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    }
 */
    @Override
        }

                }
                methods.add(new WMIClassMethod(this, prop));
                if (prop.getType() == WMIConstants.CIM_REFERENCE) {

    public DBCStatistics readData(
    {

            if (isAssociation()) {
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
                            break;

                            references.add(ref);
    public List<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException
            return statistics;
    public WMIObject getClassObject()
    {
    @Override
import org.jkiss.dbeaver.model.meta.Association;

        return references;
        return getFlagQualifier(WMIConstants.Q_Abstract);
    {

    }
    @Association
                    }
 */
        try {
        return superClass;
        this.superClass = superClass;
    @Override
                        log.warn("No " + WMIConstants.Q_CIMTYPE + " qualifier for reference property");
    @Override
        }

    public DBSEntityType getEntityType()
import org.jkiss.dbeaver.model.exec.DBCException;
        return getName().startsWith("__");
    @Override
    }
        if (name == null) {
                return IMG_CLASS_FINAL;
            long startTime = System.currentTimeMillis();
    private List<WMIClassReference> referenceAttributes = null;

                        referenceAttributes = new ArrayList<>();
        }
        } catch (DBException e) {
}
        getAttributes(monitor);
        //}
    @Association
                        continue;
        try {
    {
import org.jkiss.dbeaver.model.exec.DBCStatistics;
    {
    }
    public Collection<WMIClass> getClasses(DBRProgressMonitor monitor) throws DBException
    {
                    referenceAttributes.add(reference);
                DBDDataReceiver.fetchRowsWithStatistics(dataReceiver, session, resultSet, statistics);
        return DBSEntityType.CLASS;
 * You may obtain a copy of the License at
    // Data container
    }
        List<WMIClassConstraint> constraints = null;
            log.warn(e);
    }

    }
                    if (!refClassName.startsWith("ref:")) {
                    break;
                sink,

    }
                if (monitor.isCanceled()) {
            WMIObjectCollectorSink sink = new WMIObjectCollectorSink(
    @Nullable
        }
                return DBSEntityType.ASSOCIATION;
            for (WMIClass c = this; c != null; c = c.superClass) {
                    attributes.add(reference);
    public WMIClass getSuperClass()
                        log.warn("Invalid class reference qualifier: " + refClassName);

    @NotNull

            associations.addAll(referenceAttributes);
                if (monitor.isCanceled()) {
        return referenceAttributes;
    {


        long maxRows,
    private List<WMIClass> subClasses = null;
    }
        } catch (WMIException e) {
        long firstRow,
    private static final DBPImage IMG_ASSOCIATION_ABSTRACT;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        }
    }
{
            throw new DBDatabaseException(e, getDataSource());
import org.jkiss.dbeaver.Log;
                    break;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return attributes;
