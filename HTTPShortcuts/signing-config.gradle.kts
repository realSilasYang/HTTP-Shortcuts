import com.android.build.gradle.internal.dsl.SigningConfig

// 定义一个扩展属性，返回一个签名配置
fun SigningConfig.applyReleaseSigning() {
    storeFile = file(System.getenv("SIGNING_STORE_FILE") ?: "release.keystore")
    storePassword = System.getenv("SIGNING_STORE_PASSWORD") ?: ""
    keyAlias = System.getenv("SIGNING_KEY_ALIAS") ?: ""
    keyPassword = System.getenv("SIGNING_KEY_PASSWORD") ?: ""
}
