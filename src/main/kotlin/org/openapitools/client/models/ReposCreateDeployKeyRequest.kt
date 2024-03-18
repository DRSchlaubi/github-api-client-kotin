/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param key The contents of the key.
 * @param title A name for the key.
 * @param readOnly If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.      Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see \"[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)\" and \"[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/).\"
 */
@Serializable

data class ReposCreateDeployKeyRequest (

    /* The contents of the key. */
    @SerialName(value = "key")
    val key: kotlin.String,

    /* A name for the key. */
    @SerialName(value = "title")
    val title: kotlin.String? = null,

    /* If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.      Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see \"[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)\" and \"[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/).\" */
    @SerialName(value = "read_only")
    val readOnly: kotlin.Boolean? = null

)

