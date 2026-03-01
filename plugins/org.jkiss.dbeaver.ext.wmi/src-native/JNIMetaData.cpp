{
	DeleteClassRef(wmiObjectSinkClass);
*/
		"(Lorg/jkiss/wmi/service/WMIObject;Ljava/lang/String;IILjava/lang/Object;)V");
	javaLangDoubleClass = FindJavaClass("java/lang/Double");
	wmiObjectSinkSetStatusMethod = FindJavaMethod(
		this->pJavaEnv->DeleteGlobalRef(clazz);
/*

{
	javaLangIntegerClass = FindJavaClass("java/lang/Integer");
#include "StdAfx.h"

	javaLangObjectEqualsMethod = FindJavaMethod(javaLangObjectClass, "equals", "(Ljava/lang/Object;)Z");
		"(Lorg/jkiss/wmi/service/WMIObject;Ljava/lang/String;Lorg/jkiss/wmi/service/WMIObject;Lorg/jkiss/wmi/service/WMIObject;)V");
	jmethodID mid = pJavaEnv->GetMethodID(
	javaLangFloatConstructor = FindJavaMethod(javaLangFloatClass, "<init>", "(F)V");
	javaLangCharConstructor = FindJavaMethod(javaLangCharClass, "<init>", "(C)V");
		 

	if (clazz == NULL) {
//static CComCriticalSection csSinkThreads;
	}
		"indicate",
}{
	DeleteClassRef(javaLangStringClass);
		"<init>", 
	javaLangObjectClass = FindJavaClass("java/lang/Object");
		return NULL;
	wmiServiceConstructor = FindJavaMethod(
		wmiObjectSinkClass,
	}
{
		"<init>", 
	DeleteClassRef(wmiObjectAttributeClass);
		"<init>", 
JNIMetaData::JNIMetaData(JNIEnv* pEnv) : pJavaEnv(pEnv)
	DeleteClassRef(javaLangIntegerClass);
	wmiObjectAttributeConstructor = FindJavaMethod(
	DeleteClassRef(javaLangShortClass);
	wmiObjectHandleField = pJavaEnv->GetFieldID(wmiObjectClass, "objectHandle", "J");
	if (clazz == NULL) {
	_ASSERT(clazz != NULL);
	DeleteClassRef(javaLangDoubleClass);

	DeleteClassRef(wmiServiceClass);
		methodName,
		instance = new JNIMetaData(pEnv);
	wmiObjectConstructor = FindJavaMethod(
		methodSig);
}
	wmiQualifierClass = FindJavaClass(CLASS_WMI_QUALIFIER);
	DeleteClassRef(javaLangLongClass);
	wmiObjectSinkStatusClass = FindJavaClass(CLASS_WMI_OBJECT_SINK_STATUS);
		"()V");
	DeleteClassRef(javaLangCharClass);
	javaLangByteConstructor = FindJavaMethod(javaLangByteClass, "<init>", "(B)V");

		wmiObjectClass, 
}
		pMetaData = new JNIMetaData(pEnv);
	_ASSERT(mid != NULL);
jclass JNIMetaData::FindJavaClass(const char* className)
	javaUtilListAddMethod = FindJavaMethod(javaUtilListClass, "add", "(Ljava/lang/Object;)Z");
		s_MetaDataMap[pEnv] = pMetaData;
	DeleteLocalRef(pJavaEnv, clazz);
	wmiObjectSinkIndicateMethod = FindJavaMethod(
	DeleteClassRef(javaUtilListClass);
JNIMetaData* JNIMetaData::instance = NULL;
	DeleteClassRef(wmiObjectClass);
{
	wmiQualifierConstructor = FindJavaMethod(
		clazz = NULL;
		delete iter->second;
}
	javaLangShortClass = FindJavaClass("java/lang/Short");
void JNIMetaData::DeleteClassRef(jclass& clazz)
		wmiServiceClass, 
	if (pMetaData == NULL) {
	if (instance == NULL) {
	}
}
}
void JNIMetaData::Destroy()
JNIMetaData& JNIMetaData::GetMetaData(JNIEnv* pEnv)
		"<init>", 


		wmiQualifierClass, 
	DeleteClassRef(wmiObjectMethodClass);
	DeleteClassRef(javaLangObjectClass);
*/
/*

{
	javaLangStringClass = FindJavaClass("java/lang/String");
		return NULL;
	wmiObjectMethodClass = FindJavaClass(CLASS_WMI_OBJECT_METHOD);



	javaLangLongClass = FindJavaClass("java/lang/Long");
	wmiObjectAttributeClass = FindJavaClass(CLASS_WMI_OBJECT_ATTRIBUTE);
	return *instance;
	javaLangLongConstructor = FindJavaMethod(javaLangLongClass, "<init>", "(J)V");
#include "JNIMetaData.h"
		wmiObjectMethodClass, 
	wmiServiceHandleField = pJavaEnv->GetFieldID(wmiServiceClass, "serviceHandle", "J");
	wmiObjectClass = FindJavaClass(CLASS_WMI_OBJECT);
	wmiObjectMethodConstructor = FindJavaMethod(
	javaLangBooleanClass = FindJavaClass("java/lang/Boolean");
	jclass globalRef = (jclass)pJavaEnv->NewGlobalRef(clazz);
	DeleteClassRef(javaLangFloatClass);
	javaUtilDateConstructor = FindJavaMethod(javaUtilDateClass, "<init>", "(J)V");
	wmiServiceClass = FindJavaClass(CLASS_WMI_SERVICE);
	}
{
	for (MetaDataMap::iterator iter = s_MetaDataMap.begin(); iter != s_MetaDataMap.end(); iter++) {

	javaUtilDateClass = FindJavaClass("java/util/Date");
	jclass clazz = pJavaEnv->FindClass(className);
	DeleteClassRef(wmiObjectSinkStatusClass);
	javaLangFloatClass = FindJavaClass("java/lang/Float");
	JNIMetaData* pMetaData = s_MetaDataMap[pEnv];
	return mid;
		wmiObjectAttributeClass, 
}
	if (clazz != NULL) {
	javaLangIntegerConstructor = FindJavaMethod(javaLangIntegerClass, "<init>", "(I)V");
	DeleteClassRef(javaLangByteClass);
	DeleteClassRef(wmiQualifierClass);

		"()V");
	return globalRef;
		"<init>", 
	javaLangByteClass = FindJavaClass("java/lang/Byte");
	}
	}
#include "WMIUtils.h"
	DeleteClassRef(javaLangBooleanClass);
		wmiObjectSinkClass,
	javaLangBooleanConstructor = FindJavaMethod(javaLangBooleanClass, "<init>", "(Z)V");
		"(Lorg/jkiss/wmi/service/WMIObjectSinkStatus;ILjava/lang/String;Lorg/jkiss/wmi/service/WMIObject;)V");
	javaLangDoubleConstructor = FindJavaMethod(javaLangDoubleClass, "<init>", "(D)V");


	javaLangCharClass = FindJavaClass("java/lang/Character");
	javaLangShortConstructor = FindJavaMethod(javaLangShortClass, "<init>", "(S)V");
//static MetaDataMap s_MetaDataMap;
//typedef std::map<JNIEnv*, JNIMetaData*> MetaDataMap;
	return *pMetaData;
		"([Lorg/jkiss/wmi/service/WMIObject;)V");
	s_MetaDataMap.clear();

		clazz,
	wmiObjectSinkClass = FindJavaClass(CLASS_WMI_OBJECT_SINK);
jmethodID JNIMetaData::FindJavaMethod(jclass clazz, const char* methodName, const char* methodSig)
JNIMetaData::~JNIMetaData(void)
		"setStatus",
		"(Ljava/lang/String;ILjava/lang/Object;)V");
	javaUtilListClass = FindJavaClass("java/util/List");
	DeleteClassRef(javaUtilDateClass);
#include <map>
