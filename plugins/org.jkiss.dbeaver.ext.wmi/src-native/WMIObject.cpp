			jobject javaPropObject = pJavaEnv->NewObject(
		return;
		}

		}
			continue;
		if (!pJavaEnv->ExceptionCheck()) {
{
{


				break;
		THROW_COMMON_ERROR(L"Can't finish qualifiers enumeration", hres);
	// Fill class object properties
}
		if (hres == WBEM_S_NO_MORE_DATA) {
			continue;
		}
WMIObject::WMIObject(JNIEnv * pJavaEnv, jobject javaObject, IWbemClassObject* pClassObject) :
				jniMeta.wmiQualifierConstructor,
		}
{
}
	hres = ptrClassObject->EndMethodEnumeration();
		CComBSTR qfName;
	return (WMIObject*)pJavaEnv->GetLongField(javaObject, fid);
		_ASSERT(javaMethodName != NULL);
	CIMTYPE cimType; // CIMTYPE_ENUMERATION

				javaInSignature,
		DeleteLocalRef(pJavaEnv, javaQFName);
		CComBSTR propName;
		jstring javaPropName = ::MakeJavaString(pJavaEnv, propName);
		DeleteLocalRef(pJavaEnv, javaQFValue);
			DeleteLocalRef(pJavaEnv, javaInSignature);
		if (javaMethodName == NULL) {
{
		THROW_COMMON_ERROR(L"Can't start class object attributes enumeration", hres);
				jniMeta.wmiObjectAttributeClass, 
				javaQFValue);
{
		return NULL;
WMIObject* WMIObject::GetFromObject(JNIEnv* pJavaEnv, jobject javaObject)

	if (propName != NULL) {
void WMIObject::Release(JNIEnv* pJavaEnv, jobject javaObject)
				jniMeta.wmiObjectAttributeConstructor,
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
	}
{
		jobject javaPropValue = ::MakeJavaFromVariant(pJavaEnv, propValue, cimType);
	for (;;) {
	ptrClassObject = NULL;
	if (FAILED(hres)) {
		jobject javaOutSignature = ptrOutSignature == NULL ? NULL : WMIService::MakeWMIObject(pJavaEnv, ptrOutSignature);
	hres = ptrQFSet->EndEnumeration();

		if (pJavaEnv->ExceptionCheck()) {
	hres = ptrQFSet->BeginEnumeration(0);

		if (hres == WBEM_S_NO_MORE_DATA) {
	ptrClassObject->GetObjectText(0, &bstrObjectText);
				break;
	}
				(jint)flavor,
#include "WMIUtils.h"

{
		hres = ptrClassObject->NextMethod(0, &methodName, &ptrInSignature, &ptrOutSignature);
		CComPtr<IWbemClassObject> ptrInSignature;
	}
		::GetJavaString(pJavaEnv, propName, &bstrPropName);
}
	if (javaObject != NULL) {
#include "stdafx.h"
	if (FAILED(hres)) {
		if (FAILED(hres)) {
	}
				(jint)flavor,
	}
	CComVariant propValue;
{
	}
		if (javaOutSignature != NULL) {
	
	if (FAILED(hres)) {
		_ASSERT(javaQFName != NULL);
		}
				jniMeta.wmiObjectMethodConstructor,
	for (;;) {
		CComVariant propValue;
		return;

	}
	// Fill class object properties
	::GetJavaString(pJavaEnv, propName, &bstrPropName);
		jstring javaMethodName = ::MakeJavaString(pJavaEnv, methodName);
}
	if (bstrPropName == NULL) {
	// Fill class object properties
				jniMeta.wmiQualifierClass, 
		THROW_COMMON_ERROR(L"Can't start class object methods enumeration", hres);
		if (javaPropName == NULL) {
				javaPropName,
				break;
		pJavaEnv->SetLongField(javaObject, JNIMetaData::GetMetaData(pJavaEnv).wmiObjectHandleField, 0l);
		hres = ptrClassObject->GetPropertyQualifierSet(bstrPropName, &ptrQFSet);
	return ::MakeJavaFromVariant(pJavaEnv, propValue, cimType);
#include "WMIObject.h"
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
	HRESULT hres = S_OK;
		}
		hres = ptrClassObject->Next(0, &propName, &propValue, &cimType, &flavor);
	for (;;) {
				javaObject,
		//wchar_t* propNameBSTR = propName;
jstring WMIObject::GetObjectText(JNIEnv* pJavaEnv)
	if (FAILED(hres)) {
	if (FAILED(hres)) {
		CComPtr<IWbemClassObject> ptrOutSignature;
	ptrClassObject(pClassObject)

			jobject javaMethodObject = pJavaEnv->NewObject(
		THROW_COMMON_ERROR(L"Can't finish class object enumeration", hres);
		hres = ptrQFSet->Next(0, &qfName, &qfValue, &flavor);
	}
			}
		jstring javaQFName = ::MakeJavaString(pJavaEnv, qfName);
				javaMethodName,
			break;
		}
	CComBSTR bstrPropName;
		}
	jclass objectClass = pJavaEnv->GetObjectClass(javaObject);
		return;
				jniMeta.wmiObjectMethodClass, 
		jobject javaInSignature = ptrInSignature == NULL ? NULL : WMIService::MakeWMIObject(pJavaEnv, ptrInSignature);
	}
			pJavaEnv->CallVoidMethod(methodList, jniMeta.javaUtilListAddMethod, javaMethodObject);

		if (pJavaEnv->ExceptionCheck()) {
		}
}
		if (pJavaEnv->ExceptionCheck()) {
		_ASSERT(javaPropName != NULL);
		}

		CIMTYPE cimType; // CIMTYPE_ENUMERATION
			THROW_COMMON_ERROR(L"Can't obtain next attribute from enumeration", hres);
	return MakeJavaString(pJavaEnv, bstrObjectText);
		DeleteLocalRef(pJavaEnv, javaPropName);
jobject WMIObject::GetAttributeValue(JNIEnv* pJavaEnv, jstring propName)
		}
	if (fid == NULL) {
	}
			}
}
		if (!pJavaEnv->ExceptionCheck()) {
				javaQFName,
		}
			break;
			break;
				javaOutSignature);
			break;
	}
		//wchar_t* propNameBSTR = propName;
	DeleteLocalRef(pJavaEnv, objectClass);
		LONG flavor;
			break;
			break;
			continue;
	if (FAILED(hres)) {
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
		THROW_COMMON_ERROR(L"Can't finish class object enumeration", hres);
			DeleteLocalRef(pJavaEnv, javaPropObject);

WMIObject::~WMIObject()
		THROW_COMMON_ERROR(L"Can't create qualifiers enumeration", hres);
		THROW_COMMON_ERROR((_bstr_t(L"Can't read attribute '") + (BSTR)bstrPropName) + L"' value", hres);
		hres = ptrClassObject->GetMethodQualifierSet(bstrPropName, &ptrQFSet);
//
			DeleteLocalRef(pJavaEnv, javaMethodObject);
	HRESULT hres = ptrClassObject->BeginMethodEnumeration(lFlags);
			if (pJavaEnv->ExceptionCheck()) {
			pJavaEnv->CallVoidMethod(qfList, jniMeta.javaUtilListAddMethod, javaPropObject);
			jobject javaPropObject = pJavaEnv->NewObject(
void WMIObject::ReadAttributes(JNIEnv* pJavaEnv, jobject javaObject, LONG lFlags, jobject propList)
	CComBSTR bstrObjectText;
		CComVariant qfValue;
}
			if (pJavaEnv->ExceptionCheck()) {

	jfieldID fid = pJavaEnv->GetFieldID(objectClass, "objectHandle", "J");
}
		}
		//wchar_t* propNameBSTR = propName;
		THROW_COMMON_ERROR(L"Can't begin qualifiers enumeration", hres);
				javaObject,

		return NULL;
		}
		}
		DeleteLocalRef(pJavaEnv, javaPropValue);
	}
		if (!pJavaEnv->ExceptionCheck()) {
	pJavaEnv->SetLongField(javaObject, JNIMetaData::GetMetaData(pJavaEnv).wmiObjectHandleField, (jlong)this);
// WMISensor.cpp : Defines the entry point for the DLL application.
	if (pJavaEnv->ExceptionCheck()) {
	if (FAILED(hres)) {
				(jint)cimType,
{
	} else {
	CComBSTR bstrPropName;
			THROW_COMMON_ERROR(L"Can't obtain next qualifier from enumeration", hres);


		if (hres == WBEM_S_NO_MORE_DATA) {
		}
}
		if (javaQFName == NULL) {
	} else if (isAttribute) {
			break;
		return NULL;
			}
			DeleteLocalRef(pJavaEnv, javaPropObject);
	}
			if (pJavaEnv->ExceptionCheck()) {
			DeleteLocalRef(pJavaEnv, javaOutSignature);
			break;
	HRESULT hres = ptrClassObject->Get(bstrPropName, 0, &propValue, &cimType, &flavor);
		if (FAILED(hres)) {
	LONG flavor;
void WMIObject::ReadQualifiers(JNIEnv* pJavaEnv, jobject javaObject, bool isAttribute, jstring propName, jobject qfList)
		}
			pJavaEnv->CallVoidMethod(propList, jniMeta.javaUtilListAddMethod, javaPropObject);
void WMIObject::ReadMethods(JNIEnv* pJavaEnv, jobject javaObject, LONG lFlags, jobject methodList)
		LONG flavor;
		CComBSTR methodName;

	if (FAILED(hres)) {
		hres = ptrClassObject->GetQualifierSet(&ptrQFSet);
		jobject javaQFValue = ::MakeJavaFromVariant(pJavaEnv, qfValue, CIM_EMPTY);
			break;
	hres = ptrClassObject->EndEnumeration();
			THROW_COMMON_ERROR(L"Can't obtain next method from enumeration", hres);
	CComPtr<IWbemQualifierSet> ptrQFSet;
	_ASSERT(fid != NULL);
		if (javaInSignature != NULL) {
	HRESULT hres = ptrClassObject->BeginEnumeration(lFlags);

		DeleteLocalRef(pJavaEnv, javaMethodName);
				javaPropValue);
		return;
	}
		if (FAILED(hres)) {
	}
	}


