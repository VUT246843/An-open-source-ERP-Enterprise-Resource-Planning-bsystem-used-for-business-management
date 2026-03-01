		return;
#include "WMIObject.h"
static const wchar_t* ERROR_NOT_INITIALIZED = L"WMI object was not initialized or was disposed";
		if (pObject == NULL) {
 * Class:     org_jkiss_wmi_service_WMIObject
	}
	}
	if (pObject == NULL) {
 * Class:     org_jkiss_wmi_service_WMIObject
	if (pObject == NULL) {

	if (pObject == NULL) {
#include "WMIObjectJNI.h"
			return NULL;

	}
		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
 * Method:    readQualifiers
	return;
	catch (...) {
}
	}
JNIEXPORT jobject JNICALL Java_org_jkiss_wmi_service_WMIObject_readAttributeValue(JNIEnv* pJavaEnv, jobject object, jstring propName)
{
	pObject->ReadQualifiers(pJavaEnv, object, isAttribute != 0, propName, qfList);
 * Class:     org_jkiss_wmi_service_WMIObject
 */
 * Signature: (Ljava/lang/String;Ljava/lang/Object;)V
		return;

		return;
		return pObject->GetAttributeValue(pJavaEnv, propName);
{
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIObject_readQualifiers(JNIEnv* pJavaEnv, jobject object, jboolean isAttribute, jstring propName, jobject qfList)
 * Class:     org_jkiss_wmi_service_WMIObject
		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
	if (pObject == NULL) {
 */
{
	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
		WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
	delete pObject;
/*
 * Signature: (Ljava/util/List;)Ljava/util/List;
}
 * Class:     org_jkiss_wmi_service_WMIObject
	return pObject->GetObjectText(pJavaEnv);
	pObject->ReadMethods(pJavaEnv, object, (LONG)lFlags, methodList);
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIObject_readAttributes(JNIEnv* pJavaEnv, jobject object, jlong lFlags, jobject propList)
	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
// WMISensor.cpp : Defines the entry point for the DLL application.
 * Method:    readAttributeValue
	pObject->ReadAttributes(pJavaEnv, object, (LONG)lFlags, propList);
	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
}
 */
 * Method:    writeAttributeValue
{
//
	}
}

 */
	}
			THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIObject_writeAttributeValue(JNIEnv* pJavaEnv, jobject object, jstring propName, jobject propValue)
 */
		}
/*
/*
		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
	pObject->Release(pJavaEnv, object);

	}
#include "stdafx.h"

}
 */
		THROW_COMMON_EXCEPTION(L"Internal error while reading attribute");
		return NULL;

}
 * Signature: (Ljava/lang/String;)Ljava/lang/Object;
 * Method:    readObjectText
#include "WMIUtils.h"
 * Class:     org_jkiss_wmi_service_WMIObject
{
JNIEXPORT jstring JNICALL Java_org_jkiss_wmi_service_WMIObject_readObjectText(JNIEnv* pJavaEnv, jobject object)
{
	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);
		return NULL;

}
 * Signature: (ZLjava/lang/String;Ljava/util/List;)V
/*
/*
 * Method:    releaseObject
		return;

		THROW_COMMON_EXCEPTION(ERROR_NOT_INITIALIZED);

	WMIObject* pObject = WMIObject::GetFromObject(pJavaEnv, object);
	if (pObject == NULL) {
 * Signature: ()V
 * Method:    readMethod
 * Method:    readAttributes
/*
	}
	try {
 * Signature: (Ljava/util/List;)Ljava/util/List;
 * Signature: ()Ljava/lang/String;
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIObject_releaseObject(JNIEnv* pJavaEnv, jobject object)

{
 */
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIObject_readMethods(JNIEnv* pJavaEnv, jobject object, jlong lFlags, jobject methodList)
/*
 * Class:     org_jkiss_wmi_service_WMIObject
	if (pObject == NULL) {
		return;
