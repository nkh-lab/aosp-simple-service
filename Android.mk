LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-subdir-java-files, src)

LOCAL_PACKAGE_NAME := SimpleService

LOCAL_CERTIFICATE := platform

include $(BUILD_PACKAGE)
