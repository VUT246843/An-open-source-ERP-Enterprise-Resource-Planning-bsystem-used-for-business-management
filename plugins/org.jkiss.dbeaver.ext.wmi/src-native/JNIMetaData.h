	jmethodID FindJavaMethod(jclass clazz, const char* methodName, const char* methodSig);
public:
	jmethodID javaUtilDateConstructor;
	static JNIMetaData& GetMetaData(JNIEnv* pEnv);
static const char* CLASS_WMI_OBJECT = "org/jkiss/wmi/service/WMIObject";
	jclass javaLangShortClass;
	jmethodID javaLangObjectEqualsMethod;
	jclass wmiObjectMethodClass;
	jclass javaLangObjectClass;

	jclass wmiServiceClass;
static const char* CLASS_WMI_OBJECT_SINK = "org/jkiss/wmi/service/WMIObjectSink";
	jfieldID wmiServiceHandleField;
	jmethodID javaLangIntegerConstructor;
	jfieldID wmiObjectHandleField;
	jclass javaLangDoubleClass;

	jclass javaLangCharClass;
	jclass wmiQualifierClass;
static const char* CLASS_WMI_OBJECT_ATTRIBUTE = "org/jkiss/wmi/service/WMIObjectAttribute";
	jclass javaLangBooleanClass;
#pragma once
static const char* CLASS_WMI_SERVICE = "org/jkiss/wmi/service/WMIService";
	jclass FindJavaClass(const char* className);
	//static void Destroy();
	jmethodID wmiObjectSinkIndicateMethod;
static const char* CLASS_WMI_OBJECT_SINK_STATUS = "org/jkiss/wmi/service/WMIObjectSinkStatus";
	jmethodID javaLangLongConstructor;
	jmethodID wmiObjectConstructor;

	jclass wmiObjectSinkStatusClass;
{
#endif	jclass javaLangLongClass;
	jclass javaLangFloatClass;

	void DeleteClassRef(jclass& clazz);
	jclass wmiObjectSinkClass;
	jclass javaLangStringClass;

	jclass javaUtilListClass;



#include <jni.h>
	jmethodID javaLangDoubleConstructor;

	jmethodID javaUtilListAddMethod;
	~JNIMetaData();
static const char* CLASS_WMI_QUALIFIER = "org/jkiss/wmi/service/WMIQualifier";
	jmethodID wmiQualifierConstructor;
	jmethodID wmiServiceConstructor;

static const char* CLASS_WMI_OBJECT_METHOD = "org/jkiss/wmi/service/WMIObjectMethod";
	static JNIMetaData* instance;
	jmethodID javaLangFloatConstructor;
private:
	jmethodID wmiObjectMethodConstructor;
class JNIMetaData
};
#ifndef _JNI_META_DATA_H_


	jmethodID javaLangCharConstructor;
	jclass javaLangIntegerClass;

	jclass wmiObjectAttributeClass;
	jmethodID javaLangShortConstructor;
	jclass javaUtilDateClass;
	jclass wmiObjectClass;
	jmethodID wmiObjectSinkSetStatusMethod;
	jmethodID wmiObjectAttributeConstructor;
	JNIEnv* pJavaEnv;
#define _JNI_META_DATA_H_
	jmethodID javaLangBooleanConstructor;

	jmethodID javaLangByteConstructor;
	jclass javaLangByteClass;

	JNIMetaData(JNIEnv* pEnv);
