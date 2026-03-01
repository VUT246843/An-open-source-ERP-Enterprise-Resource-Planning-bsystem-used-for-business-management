

		hThread = ::GetCurrentThreadId();

*/

}
		statusName,
	if (hThread == NULL) {

    long lObjectCount,
	}
	pJavaEnv->CallVoidMethod(
	} else if (lFlags == WBEM_STATUS_PROGRESS) {
		javaClassObject = pService->MakeWMIObject(pJavaEnv, pClassObject);


    IWbemClassObject **ppClassObject)
		DWORD hCurThread = ::GetCurrentThreadId();
	}
}
	javaSinkObject = pJavaEnv->NewGlobalRef(javaObject);
/*
{

HRESULT WMIObjectSink::SetStatus( 
		// Put error to param string
		statusEnumID);
	javaSinkObject(NULL)
{
		_ASSERT(pJavaEnv != NULL);
	}

	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
		objectsCache.push_back(ppClassObject[i]);
	// Detach thread

void WMIObjectSink::AttachThread()
{
	}
	return WBEM_S_NO_ERROR;

		(jint)hResult,
		}
	} else if (lFlags == WBEM_STATUS_REQUIREMENTS) {
	pJavaEnv->CallVoidMethod(
    HRESULT hResult,
		FlushObjectsCache(pJavaEnv);
		} else {
		pJavaEnv->ExceptionClear();
	}
    IWbemClassObject *pClassObject)

	if (!objectsCache.empty()) {
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);

{
		statusName = "requirements";
		pJavaVM->AttachCurrentThread((void**)&pJavaEnv, NULL);
	return WBEM_S_NO_ERROR;
		javaSinkObject, 
}
void WMIObjectSink::TermSink(JNIEnv* pJavaEnv)
	if (lFlags == WBEM_STATUS_COMPLETE) {
	if (statusEnum == NULL) {
}
		jniMeta.wmiObjectSinkIndicateMethod,
	JavaObjectVector objects;
{
#include "WMIObjectSink.h"
		javaArray);
		javaParam = MakeJavaString(pJavaEnv, strParam);
		_ASSERT(hThread == hCurThread);
{
	jstring javaParam = NULL;
		pService->RemoveObjectSink(pJavaEnv, this);
	DeleteLocalRef(pJavaEnv, javaParam);
		}
		statusName = "progress";
	_ASSERT(pSvc != NULL);

	_ASSERT(statusEnumID != NULL);
	_ASSERT(javaObject != NULL);

{
	if (pJavaEnv->ExceptionCheck()) {
	_ASSERT(statusEnum != NULL);
		javaSinkObject = NULL;
			FlushObjectsCache(pJavaEnv);
	if (lObjectCount <= 0) {
WMIObjectSink::WMIObjectSink() :
		pJavaEnv->ExceptionClear();
static const long MAX_CACHE_SIZE = 1000;
}
	}
		::FormatErrorMessage(L"Async error", hResult, &errorMessage);
	jobjectArray javaArray = ::MakeJavaArrayFromVector(pJavaEnv, jniMeta.wmiObjectClass, objects);
}
}
		JNIEnv* pJavaEnv = NULL;
	jobject statusEnum = pJavaEnv->GetStaticObjectField(
	if (pClassObject != NULL) {
	const char* statusName = "unknown";
	DeleteLocalRef(pJavaEnv, javaArray);
		statusEnum,

	if (pJavaEnv->ExceptionCheck()) {
	jint result = WMIService::GetJavaVM()->DetachCurrentThread();
		javaClassObject);

void WMIObjectSink::InitSink(WMIService* pSvc, JNIEnv* pJavaEnv, jobject javaObject)
		javaParam,
	}
			statusName = "complete";
#include "WMIUtils.h"

	}
	if (javaSinkObject != NULL) {
		pJavaEnv->DeleteGlobalRef(javaSinkObject);
	if (pJavaVM != NULL && pJavaEnv == NULL) {
		WMIService::GetJavaVM()->AttachCurrentThread((void**)&pJavaEnv, NULL);
	for (long i = 0; i < lObjectCount; i++) {
		if (pJavaEnv != NULL) {
{
		//pService->WriteLog(pJavaEnv, LT_ERROR, L"Can't call indicate for object sink");
	pService = pSvc;
		javaSinkObject, 


		//pService->WriteLog(pJavaEnv, LT_ERROR, L"Can't detect object sink status java object");
		//pService->WriteLog(pJavaEnv, LT_ERROR, L"Can't set status for object sink");
	}
WMIObjectSink::~WMIObjectSink(void)
		//pJavaEnv->ExceptionDescribe();

	DeleteLocalRef(pJavaEnv, statusEnum);
	WMIService::GetJavaVM()->AttachCurrentThread((void**)&pJavaEnv, NULL);
		CComBSTR errorMessage;
			statusName = "error";

	DeleteLocalRef(pJavaEnv, javaClassObject);
	if (objectsCache.size() >= MAX_CACHE_SIZE) {
		objects.push_back(pService->MakeWMIObject(pJavaEnv, objectsCache[i]));
		return WBEM_E_FAILED;
		"Lorg/jkiss/wmi/service/WMIObjectSinkStatus;");

}
	if (lFlags == WBEM_STATUS_COMPLETE || FAILED(hResult)) {
	// Check for end of sink
	pService(NULL),
	}
	}
	}
		jniMeta.wmiObjectSinkStatusClass,

	}

	if (strParam != NULL) {
	jfieldID statusEnumID = pJavaEnv->GetStaticFieldID(
	}

		jniMeta.wmiObjectSinkSetStatusMethod,
	} else {
		javaParam = MakeJavaString(pJavaEnv, errorMessage);
	jobject javaClassObject = NULL;
	if (pJavaEnv == NULL) {
	JNIEnv* pJavaEnv = NULL;
		jniMeta.wmiObjectSinkStatusClass,
	for (size_t i = 0; i < objectsCache.size(); i++) {
		_ASSERT(pJavaEnv != NULL);
		return WBEM_S_NO_ERROR;

    BSTR strParam,
	} else if (FAILED(hResult)) {
void WMIObjectSink::FlushObjectsCache(JNIEnv* pJavaEnv)
			WMIService::GetJavaVM()->DetachCurrentThread();
	objectsCache.clear();
	}
	}
#include "StdAfx.h"
    long lFlags,
	_ASSERT(pJavaVM != NULL);
HRESULT WMIObjectSink::Indicate( 
		if (FAILED(hResult)) {
	this->TermSink(pJavaEnv);
