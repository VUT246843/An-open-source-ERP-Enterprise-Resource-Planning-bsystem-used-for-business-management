	CComBSTR bstrQuery;
}
	return pService->ExecuteQuery(pJavaEnv, bstrQuery, bSync == JNI_TRUE);
	}
	::GetJavaString(pJavaEnv, query, &bstrQuery);
	if (query == NULL) {
	jboolean bSync)
	jstring locale,
	jstring query,
  (JNIEnv * pJavaEnv, jobject object, jstring nsName)
	}

	::GetJavaString(pJavaEnv, domain, &bstrDomain);
  (JNIEnv * pJavaEnv, jobject object)

	jobject newServiceObject = pJavaEnv->NewObject(jniMeta.wmiServiceClass, jniMeta.wmiServiceConstructor);
	return pService->OpenNamespace(pJavaEnv, bstrNS, 0);
	jstring resource)
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
	::GetJavaString(pJavaEnv, user, &bstrUser);
	pService->EnumInstances(pJavaEnv, bstrClassName, sinkObject, (LONG)lFlags);
	jobject object, 
	JNIEnv *pJavaEnv, 
	WMIService* pService = new WMIService(pJavaEnv, newServiceObject);
	if (pService != NULL) {
	if (!WMIInitializeThread(pJavaEnv)) return;
	::GetJavaString(pJavaEnv, query, &bstrQuery);
	}
	//pJavaEnv->SetObjectField(newServiceObject, jniMeta.wmiServiceLogField, logObject);

// WMISensor.cpp : Defines the entry point for the DLL application.
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIService_cancelSink(
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
	::GetJavaString(pJavaEnv, className, &bstrClassName);
	jobject sinkObject)
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");

	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
#include "stdafx.h"
		THROW_COMMON_EXCEPTION(L"NULL sink object specified");
 * Class:     org_jkiss_wmi_service_WMIService

	jstring password,
	}
	if (pService == NULL) {
		THROW_COMMON_EXCEPTION(L"NULL query specified");
		THROW_COMMON_EXCEPTION(L"NULL query specified");

#include "WMIServiceJNI.h"
		DeleteLocalRef(pJavaEnv, newServiceObject);
	CComBSTR bstrSuperClass;
	jclass serviceClass,
	jobject object, 

		delete pService;
	jstring superClass,
}

{
	if (sinkObject == NULL) {
		return;
	if (!WMIInitializeThread(pJavaEnv)) return NULL;
	if (pService == NULL) {
	}
		return NULL;
	CComBSTR bstrDomain, bstrHost, bstrUser, bstrPassword, bstrLocale, bstrResource;
	if (pService == NULL) {
	::GetJavaString(pJavaEnv, superClass, &bstrSuperClass);
		pService->Release(pJavaEnv);
#include "WMIService.h"
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
	pService->CancelAsyncOperation(pJavaEnv, sinkObject);
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
	}
	::GetJavaString(pJavaEnv, password, &bstrPassword);
{
	return newServiceObject;
	if (pJavaEnv->ExceptionCheck()) {
		return NULL;
	if (!WMIInitializeThread(pJavaEnv)) return;
	jstring domain, 
JNIEXPORT jobjectArray JNICALL Java_org_jkiss_wmi_service_WMIService_executeQuery(
		return;
	// Init COM for current thread
	CComBSTR bstrClassName;
	jlong lFlags)
	}
 * Class:     org_jkiss_wmi_service_WMIService
		return NULL;
	jobject object, 
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIService_enumClasses(
}
	jstring user, 
//
	}

/*
	}

 * Method:    executeQuery
{
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
}
	pService->Connect(pJavaEnv, bstrDomain, bstrHost, bstrUser, bstrPassword, bstrLocale, bstrResource);

	::GetJavaString(pJavaEnv, nsName, &bstrNS);
	::GetJavaString(pJavaEnv, resource, &bstrResource);
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIService_close
}

JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIService_enumInstances(
	if (pService == NULL) {
 */

/*
	JNIEnv *pJavaEnv, 
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
	if (pService == NULL) {

	jlong lFlags)
	}
}
	if (query == NULL) {
 * Method:    connect
	jobject sinkObject,
	if (sinkObject == NULL) {
{
		return;
	}
	pService->EnumClasses(pJavaEnv, bstrSuperClass, sinkObject, (LONG)lFlags);
{
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
#include "WMIUtils.h"
	}
		return;
	pService->ExecuteQueryAsync(pJavaEnv, bstrQuery, sinkObject, (LONG)lFlags);
{
	jlong lFlags)
	if (pService == NULL) {
	jobject object,
		THROW_COMMON_EXCEPTION(L"NULL sink object specified");
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
	jobject object, 
	if (pJavaEnv->ExceptionCheck()) {
	jstring query,
{
 */
	JNIEnv *pJavaEnv, 
	jstring host, 
 * Method:    disconnect
	}
		return;
 * Class:     org_jkiss_wmi_service_WMIService
{

	// Init COM for current thread
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
		return;
	JNIEnv *pJavaEnv, 
		return NULL;
 * Signature: ()V
		return NULL;
		THROW_COMMON_EXCEPTION(L"NULL sink object specified");


	jobject sinkObject,
	if (sinkObject == NULL) {
		return;
JNIEXPORT jobject JNICALL Java_org_jkiss_wmi_service_WMIService_connect(
	// Init COM for current thread
JNIEXPORT jobject JNICALL Java_org_jkiss_wmi_service_WMIService_openNamespace
		THROW_COMMON_EXCEPTION(L"NULL sink object specified");
	if (!WMIInitializeThread(pJavaEnv)) return;

	CComBSTR bstrQuery;
	if (!WMIInitializeThread(pJavaEnv)) return;
	
 *
	::GetJavaString(pJavaEnv, host, &bstrHost);
		return;
	jobject sinkObject,
	if (sinkObject == NULL) {
	}
	if (!WMIInitializeThread(pJavaEnv)) return NULL;
JNIEXPORT void JNICALL Java_org_jkiss_wmi_service_WMIService_executeQuery(
	if (!WMIInitializeThread(pJavaEnv)) return;
}
	}
}*/
	jstring className,
	::GetJavaString(pJavaEnv, locale, &bstrLocale);
	// Init COM for current thread
/*
	// Init COM for current thread
	JNIEnv* pJavaEnv, 
	JNIEnv *pJavaEnv, 
	// Init COM for current thread


		return;
	WMIService* pService = WMIService::GetFromObject(pJavaEnv, object);
	CComBSTR bstrNS;
