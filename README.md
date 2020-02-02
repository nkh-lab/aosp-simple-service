# SimpleService
Example of the simple Java server.

## Properties
1. System

## Include to the build system
1. Add product package, e.g. to device/linaro/hikey/hikey960/device-hikey960.mk
```sh
PRODUCT_PACKAGES += SimpleService
```
## Start service
1. Via Activity Manager:
```sh
# am startservice com.nkh.simpleservice/.SimpleService
```
logcat output:
```sh
02-02 15:06:08.057  2966  2966 D SimpleService: onCreate()
02-02 15:06:08.058  2966  2966 D SimpleService: onStartCommand()
```
