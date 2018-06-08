package pbandk

import pbandk.protobufjs.util

actual object Sizer : pbandk.impl.Sizer.Simple() {
    actual fun stringSize(value: String) = util.utf8.length(value).let { it + uInt32Size(it) }
}