//
// Created by 陈保向 on 2017/3/14.
//

#include "com_example_cbx_jniapplication_JniUtils.h"
/*
 * Class:     com_android_talon_test_JniUtils.h
 * Method:    getString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_cbx_jniapplication_JniUtils_getString
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"Hello World!");
}