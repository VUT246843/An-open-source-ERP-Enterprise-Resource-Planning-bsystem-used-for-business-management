	case VT_I1:
	for (size_t index = 0; index < objects.size(); index++) {
			jstring arrString = MakeJavaString(pJavaEnv, pStrings[i]);
	if (FAILED(hr)) {
					FORMAT_MESSAGE_FROM_HMODULE, 
		case JT_BOOL:

					NULL 
	const jchar *stringBytes = env->GetStringChars(string, NULL);
bool WMIInitializeThread(JNIEnv* pJavaEnv)
	jobjectArray result = pJavaEnv->NewObjectArray((jsize)objects.size(), clazz, NULL);
void DeleteLocalRef(JNIEnv *env, jobject object)
jintArray MakeJavaIntArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
	case VT_UI2:

		break;

		&resultTime.tm_sec, 
	if (exceptionClass != NULL) {
// WMISensor.cpp : Defines the entry point for the DLL application.


    if (FAILED(hres)) {
		javaType = JT_FLOAT;
			finalMessage += _T("Unknown Error");

	case VT_EMPTY:
			return MakeJavaLongArrayFromSafeArray(pJavaEnv, var.parray);
	FormatErrorMessage(message, error, &bstrMessage);
//
	int microSecs = 0;
		return NULL;
	}
		switch (javaType) {
		break;
	}
void ThrowJavaException(JNIEnv *env, LPCSTR exceptionName, LPCWSTR message) {
			NULL, 
		THROW_COMMON_ERROR(L"Can't access safe array int data", hr);
		case JT_CHAR:
		for (int i = 0; i < arraySize; i++) {
		THROW_COMMON_ERROR(L"Can't access safe array bool data", hr);
			finalMessage += systemMessage;
	finalMessage += L" - ";
	return NULL;
		&tz);
				jclass elementClass;
	bool isArray = (varType & VT_ARRAY) != 0;

        -1,                          // COM authentication
		break;

			}
	return result;

jdoubleArray MakeJavaDoubleArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
	int result = ::swscanf_s(cimTime, L"%04d%02d%02d%02d%02d%02d.%06d%d", 
			return pJavaEnv->NewObject(jniMeta.javaLangFloatClass, jniMeta.javaLangFloatConstructor, var.fltVal);

					sizeof(systemMessage) / sizeof(TCHAR) - 1, 
//	if (hres == RPC_E_CHANGED_MODE) {

			// TODO: correct date value
jlong GetCurrentJavaTime()
		// Unsupported type
		default:
		DeleteLocalRef(env, exceptionClass);
jlongArray MakeJavaLongArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
	}
	pJavaEnv->SetBooleanArrayRegion(result, 0, arraySize, boolArray);

		break;
	} else {
					default: elementClass = jniMeta.javaLangObjectClass; break;
		finalMessage += buffer;
		} else {
{
	if (object != NULL) {
HMODULE hWbemCommon;
		);
			return pJavaEnv->NewObject(jniMeta.javaLangLongClass, jniMeta.javaLangLongConstructor, var.llVal);
		if (count <= 0) {
	THROW_COMMON_EXCEPTION(L"Short arrays not implemented");
		break;
	if(error == NO_ERROR) {
		&resultTime.tm_min, 
		&resultTime.tm_mday, 
		javaType = JT_BOOL;
			if (cimType == CIM_DATETIME) {
			if (hWMIUtils != NULL || hWbemCommon != NULL) {
	case VT_I4: 
	}
	case VT_R4: 
			}
{
}
	return env->NewString((const jchar*)string, (jsize)::wcslen(string));
        RPC_C_AUTHN_LEVEL_DEFAULT,   // Default authentication 
        );
        NULL                         // Reserved
	long lBound, uBound;
#include "stdafx.h"
	HRESULT hr = ::SafeArrayAccessData(pSafeArray, (void HUGEP* FAR*)&intArray);
		return;


	if (result != 8) {
	if (FAILED(hr)) {
	
			DeleteLocalRef(pJavaEnv, arrString);

	_ASSERT(exceptionClass != NULL);
}
				javaType = JT_DATE;
					MAKELANGID(LANG_NEUTRAL, SUBLANG_DEFAULT), 
	JavaType javaType;
		case JT_DATE:

	} else {
jstring MakeJavaString(JNIEnv *env, LPCWSTR string)
	ThrowJavaException(env, exceptionName, bstrMessage);
	*result = CComBSTR(env->GetStringLength(string), (LPCWSTR)stringBytes).Detach();
	jobjectArray result = pJavaEnv->NewObjectArray(arraySize, arrayClass, NULL);
	HRESULT hr = ::SafeArrayAccessData(pSafeArray, (void HUGEP* FAR*)&boolArray);
		pJavaEnv->SetObjectArrayElement(result, (jsize)index, objects[index]);
	}
			}
	wchar_t buf[20];
	case VT_NULL:
	VARTYPE varType = var.vt;
		}
		// Null value
	if (isArray) {
	::SafeArrayUnaccessData(pSafeArray);
//		hres =  ::CoInitialize(0); 
		return NULL;

		case JT_FLOAT:
jlong ConvertCIMTimeToJavaTime(BSTR cimTime)
	case VT_UI8:
jfloatArray MakeJavaFloatArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
	return result;

}
			*pos = ' ';
		THROW_COMMON_ERROR(L"Can't access safe array byte data", hr);

	switch (varType) {
	return NULL;
	HRESULT hr = ::SafeArrayAccessData(pSafeArray, (void HUGEP* FAR*)&byteArray);
		}
jobject MakeJavaFromVariant(JNIEnv* pJavaEnv, CComVariant& var, CIMTYPE cimType)

			return pJavaEnv->NewObject(jniMeta.javaLangCharClass, jniMeta.javaLangCharConstructor, var.cVal);
	return NULL;
	case VT_ARRAY:
	}
	*pBuffer = finalMessage.Detach();
		// Single value
}
		javaType = JT_DATE;
			pJavaEnv->SetObjectArrayElement(result, i, arrString);

}
	for (wchar_t* pos = finalMessage; *pos != NULL; pos++) {
			return MakeJavaBoolArrayFromSafeArray(pJavaEnv, var.parray);
		switch (javaType) {
	return uBound >= lBound ? uBound - lBound + 1: 0;
		error = GetLastError();

	jclass exceptionClass = env->FindClass(exceptionName);
		finalMessage += _T(" [0x");
	}
		if (*pos == '\r' || *pos == '\n') {
			return NULL;
		DWORD count = ::FormatMessage(  
	jint HUGEP * intArray;
	pJavaEnv->SetByteArrayRegion(result, 0, arraySize, byteArray);
	}
// Get last API error
		if (FAILED(hr)) {
	CComBSTR bstrMessage;
{
			// Unsupported type
		case JT_LONG:
	env->ReleaseStringChars(string, stringBytes);
}
	jbyteArray result = pJavaEnv->NewByteArray(arraySize);
		case JT_INT:
		break;
{
		THROW_COMMON_EXCEPTION(L"Unsupported object type of safe array");
		case JT_DOUBLE:
	}
		}
			FORMAT_MESSAGE_FROM_SYSTEM, 
		// Array
//		return true;
				return MakeJavaString(pJavaEnv, var.bstrVal);
		THROW_COMMON_EXCEPTION(L"Unsupported VARIANT type");
#include "WMIUtils.h"
//	}
		varType &= ~VT_ARRAY;
		if (cid != NULL) {
		javaType = JT_LONG;
			{
	::SafeArrayGetUBound(pSafeArray, 1, &uBound);
		THROW_COMMON_ERROR(L"Failed to initialize COM library", hres);
void FormatErrorMessage(LPCWSTR message, HRESULT error, BSTR* pBuffer)
jshortArray MakeJavaShortArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
		default:

				count = ::FormatMessage(  
			error, 
}
	case VT_UI4:
	jbyte HUGEP * byteArray;
			return MakeJavaShortArrayFromSafeArray(pJavaEnv, var.parray);
	case VT_I8:
				return pJavaEnv->NewObject(jniMeta.javaUtilDateClass, jniMeta.javaUtilDateConstructor, ConvertCIMTimeToJavaTime(var.bstrVal));
		case JT_FLOAT:
			return NULL;
		jmethodID cid = env->GetMethodID(exceptionClass, "<init>", "(Ljava/lang/String;)V");
			return MakeJavaDoubleArrayFromSafeArray(pJavaEnv, var.parray);
	pJavaEnv->SetIntArrayRegion(result, 0, arraySize, intArray);
	resultTime.tm_mon--;
jobjectArray MakeJavaArrayFromVector(JNIEnv* pJavaEnv, jclass clazz, const JavaObjectVector& objects)
			THROW_COMMON_ERROR(L"Can't access safe array strings data", hr);
		}
	FILETIME fileTime;
{
		// There two kinds of arrays - primitive and object
			env->Throw(exceptionObject);
	if (elementType == JT_STRING) {
	case VT_R8: 
			return MakeJavaByteArrayFromSafeArray(pJavaEnv, var.parray);
					error, 
	default:
	jsize arraySize = ::GetSafeArraySize(pSafeArray);
	jintArray result = pJavaEnv->NewIntArray(arraySize);
}
}
		// Unsupported type
}

}
{
}
        return false;
	{
		break;
	return true;
		}
//	}
	::SafeArrayGetLBound(pSafeArray, 1, &lBound);
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
	time_t timeInSeconds = mktime(&resultTime);
	::SafeArrayUnaccessData(pSafeArray);
{
		&microSecs, 
		&resultTime.tm_mon, 
		break;


		THROW_COMMON_ERROR(L"Failed to initialize security", hres);
		TCHAR systemMessage[1024];
				switch (javaType) {

			return MakeJavaFloatArrayFromSafeArray(pJavaEnv, var.parray);
#include "JNIMetaData.h"
	jsize arraySize = ::GetSafeArraySize(pSafeArray);
	::GetSystemTimeAsFileTime(&fileTime);
		&resultTime.tm_hour, 
{
	}
		BSTR HUGEP * pStrings;
        NULL,                        // Authentication info
		return 0;
}
//		// Already initialized
	if (isArray) {

	HRESULT hres =  ::CoInitializeEx(0, COINIT_MULTITHREADED);
	_bstr_t finalMessage = message;
		DeleteLocalRef(pJavaEnv, objects[index]);
		return NULL;

	case VT_DECIMAL:
	case VT_I2:
	::CoUninitialize();
	}
	return result;
		case JT_SHORT:
}
			return MakeJavaIntArrayFromSafeArray(pJavaEnv, var.parray);
{
		if (count > 0) {

			MAKELANGID(LANG_NEUTRAL, SUBLANG_DEFAULT), 
		}
		HRESULT hr = ::SafeArrayAccessData(pSafeArray, (void HUGEP* FAR*)&pStrings);

	jsize arraySize = ::GetSafeArraySize(pSafeArray);
		case JT_INT:
	}
	struct tm resultTime;
	return javaTime / 10000;
	return NULL;
        NULL, 
		case JT_DOUBLE:
		return NULL;
			} else {
{
			return pJavaEnv->NewObject(jniMeta.javaLangBooleanClass, jniMeta.javaLangBooleanConstructor, var.boolVal == VARIANT_TRUE ? JNI_TRUE : JNI_FALSE);
		javaType = JT_INT;
        NULL,                        // Authentication services
	return result;
jbooleanArray MakeJavaBoolArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)

	{
		&resultTime.tm_year, 
	int tz = 0;
		break;
			// Try to get WMI error
	case VT_VARIANT:
	}

	jboolean HUGEP * boolArray;
		return NULL;
		javaType = JT_BYTE;

        NULL,                        // Reserved
		// Invalid CIM time

	THROW_COMMON_EXCEPTION(L"Float arrays not implemented");
	case VT_BOOL: 
}
}
		case JT_BYTE:
	THROW_COMMON_EXCEPTION(L"Long arrays not implemented");
{
		}
					hWMIUtils != NULL ? hWMIUtils : hWbemCommon,
	}
	case VT_UINT:
	case VT_BSTR: 
	return result;
//	if (hres == S_FALSE) {
		// Get system message for last error code
	}
			return pJavaEnv->NewObject(jniMeta.javaLangIntegerClass, jniMeta.javaLangIntegerConstructor, var.lVal);
			systemMessage, 
bstr_t& operator += (bstr_t& str, long arg)
		case JT_STRING:
	if (FAILED(hr)) {
{
	resultTime.tm_year -= 1900;
		javaType = JT_SHORT;
        EOAC_NONE,                   // Additional capabilities 
				}
				return MakeJavaObjectArrayFromSafeVector(pJavaEnv, var.parray, javaType, elementClass);
	}
	jlong javaTime = ((jlong)fileTime.dwHighDateTime << 32) + fileTime.dwLowDateTime;
		env->DeleteLocalRef(object);
		case JT_BOOL:
}
					case JT_STRING: elementClass = jniMeta.javaLangStringClass; break;
					systemMessage, 
{
			THROW_COMMON_EXCEPTION(L"Unsupported Java type");
	case VT_DATE: 
		javaType = JT_STRING;
			return pJavaEnv->NewObject(jniMeta.javaLangByteClass, jniMeta.javaLangByteConstructor, var.cVal);
	}
		case JT_BYTE:
void GetJavaString(JNIEnv *env, jstring string, BSTR* result)
	hres =  ::CoInitializeSecurity(
			jthrowable exceptionObject = (jthrowable)env->NewObject(exceptionClass, cid, MakeJavaString(env, message));
	jbooleanArray result = pJavaEnv->NewBooleanArray(arraySize);
jobjectArray MakeJavaObjectArrayFromSafeVector(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray, JavaType elementType, jclass arrayClass)
	::SafeArrayUnaccessData(pSafeArray);
	return timeInSeconds * 1000 + (microSecs / 1000);
	str += buf;
	case VT_SAFEARRAY:
	case VT_INT:

		case JT_LONG:
}
{
			return pJavaEnv->NewObject(jniMeta.javaLangShortClass, jniMeta.javaLangShortConstructor, var.iVal);
		javaType = JT_DOUBLE;
{
				);
LONG GetSafeArraySize(SAFEARRAY* pSafeArray)
	jsize arraySize = ::GetSafeArraySize(pSafeArray);
		return false;
		}
{
			return pJavaEnv->NewObject(jniMeta.javaUtilDateClass, jniMeta.javaUtilDateConstructor, (jlong)var.date);
}
		finalMessage += _T("]");
			return pJavaEnv->NewObject(jniMeta.javaLangDoubleClass, jniMeta.javaLangDoubleConstructor, var.dblVal);
{
{
void WMIUnInitializeThread()
}
}
	_ltow_s(arg, buf, 20, 10);
    if (FAILED(hres) && hres != RPC_E_TOO_LATE) {
		char buffer[32];
{
HMODULE hWMIUtils;
void ThrowJavaException(JNIEnv *env, LPCSTR exceptionName, LPCWSTR message, HRESULT error) { 
	if (string == NULL) {
		::_ltoa_s(error, buffer, 16);
	case VT_UI1:
	return str;
			sizeof(systemMessage) / sizeof(TCHAR) - 1, 
			NULL 
	THROW_COMMON_EXCEPTION(L"Double arrays not implemented");

		case JT_SHORT:
jbyteArray MakeJavaByteArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray)
}
        RPC_C_IMP_LEVEL_IMPERSONATE, // Default Impersonation  
    }
{
		::SafeArrayUnaccessData(pSafeArray);
		*result = NULL;
	case VT_VOID:
