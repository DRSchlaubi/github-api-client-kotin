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
 * @param key The public SSH key to add to your GitHub account.
 * @param title A descriptive name for the new key.
 */
@Serializable

data class UsersCreatePublicSshKeyForAuthenticatedUserRequest (

    /* The public SSH key to add to your GitHub account. */
    @SerialName(value = "key")
    val key: kotlin.String,

    /* A descriptive name for the new key. */
    @SerialName(value = "title")
    val title: kotlin.String? = null

)

