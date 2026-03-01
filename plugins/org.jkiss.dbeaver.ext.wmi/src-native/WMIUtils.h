
bool WMIInitializeThread(JNIEnv* pJavaEnv);
jdoubleArray MakeJavaDoubleArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);

extern HMODULE hWMIUtils;
jbooleanArray MakeJavaBoolArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);
jshortArray MakeJavaShortArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);
#define THROW_COMMON_ERROR(message, result) ThrowJavaException(pJavaEnv, EXCEPTION_WMI_GENERAL, message, result)

bstr_t& operator += (bstr_t& str, long arg);
	JT_SHORT,
jlong ConvertCIMTimeToJavaTime(BSTR cimTime);
void ThrowJavaException(JNIEnv *env, LPCSTR exceptionName, LPCWSTR message, HRESULT error);
void ThrowJavaException(JNIEnv *env, LPCSTR exceptionName, LPCWSTR message);
void WMIUnInitializeThread();
void DeleteLocalRef(JNIEnv *env, jobject object);
extern HMODULE hWbemCommon;
jobjectArray MakeJavaArrayFromVector(JNIEnv* pJavaEnv, jclass clazz, const JavaObjectVector& objects);
jbyteArray MakeJavaByteArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);
	JT_BOOL,


void GetJavaString(JNIEnv *env, jstring string, BSTR* result);
#endif



};


typedef std::vector<jobject> JavaObjectVector;

#include <jni.h>
#define CHECK_JAVA_EXCEPTION() if (pJavaEnv->ExceptionCheck()) return;
jfloatArray MakeJavaFloatArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);
#define THROW_COMMON_EXCEPTION(message) ThrowJavaException(pJavaEnv, EXCEPTION_WMI_GENERAL, message)
#define CHECK_JAVA_EXCEPTION_NULL() if (pJavaEnv->ExceptionCheck()) return NULL;
LONG GetSafeArraySize(SAFEARRAY* pSafeArray);
	JT_INT,

	JT_FLOAT,

jobject MakeJavaFromVariant(JNIEnv* pJavaEnv, CComVariant& var, CIMTYPE cimType = CIM_ILLEGAL);
#ifndef _WMI_UTILS
	JT_BYTE,

jobjectArray MakeJavaObjectArrayFromSafeVector(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray, JavaType elementType, jclass arrayClass);
jintArray MakeJavaIntArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);
	JT_STRING,
jlong GetCurrentJavaTime();
#define _WMI_UTILS
enum JavaType {
	JT_LONG,
jlongArray MakeJavaLongArrayFromSafeArray(JNIEnv* pJavaEnv, SAFEARRAY* pSafeArray);

	JT_CHAR,
void FormatErrorMessage(LPCWSTR message, HRESULT error, BSTR* pBuffer);
#define EXCEPTION_WMI_GENERAL ("org/jkiss/wmi/service/WMIException")
jstring MakeJavaString(JNIEnv *env, LPCWSTR string);
	JT_DATE,
	JT_ARRAY

	JT_DOUBLE,
