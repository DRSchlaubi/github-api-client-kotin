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
 * @param admin 
 * @param pull 
 * @param push 
 * @param triage 
 * @param maintain 
 */
@Serializable

data class RepositoryPermissions (

    @SerialName(value = "admin")
    val admin: kotlin.Boolean,

    @SerialName(value = "pull")
    val pull: kotlin.Boolean,

    @SerialName(value = "push")
    val push: kotlin.Boolean,

    @SerialName(value = "triage")
    val triage: kotlin.Boolean? = null,

    @SerialName(value = "maintain")
    val maintain: kotlin.Boolean? = null

)

