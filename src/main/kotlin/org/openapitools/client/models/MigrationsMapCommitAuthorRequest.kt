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
 * @param email The new Git author email.
 * @param name The new Git author name.
 */
@Serializable

data class MigrationsMapCommitAuthorRequest (

    /* The new Git author email. */
    @Contextual @SerialName(value = "email")
    val email: kotlin.Any? = null,

    /* The new Git author name. */
    @Contextual @SerialName(value = "name")
    val name: kotlin.Any? = null

)

