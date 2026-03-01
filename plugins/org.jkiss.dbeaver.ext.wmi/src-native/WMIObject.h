	static WMIObject* GetFromObject(JNIEnv* pJavaEnv, jobject javaObject);
#define _WMI_Object

#ifndef _WMI_Object


#include <jni.h>
class WMIObject {
public:
	jstring GetObjectText(JNIEnv* pJavaEnv);
public:
	CComPtr<IWbemClassObject> ptrClassObject;
#include <jni.h>
	// Private vars
	~WMIObject();

	WMIObject(JNIEnv* pJavaEnv, jobject javaObject, IWbemClassObject* pClassObject);

	void ReadAttributes(JNIEnv* pJavaEnv, jobject javaObject, LONG lFlags, jobject propList);
	jobject GetAttributeValue(JNIEnv* pJavaEnv, jstring propName);
#include "WMIService.h"
	void ReadMethods(JNIEnv* pJavaEnv, jobject javaObject, LONG lFlags, jobject methodList);

	void Release(JNIEnv* pJavaEnv, jobject javaObject);
#endif
};
private:

	void ReadQualifiers(JNIEnv* pJavaEnv, jobject javaObject, bool isAttribute, jstring propName, jobject qfList);
