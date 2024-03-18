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
 * Code Of Conduct
 *
 * @param key 
 * @param name 
 * @param url 
 * @param htmlUrl 
 * @param body 
 */
@Serializable

data class CodeOfConduct (

    @SerialName(value = "key")
    val key: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI?,

    @SerialName(value = "body")
    val body: kotlin.String? = null

)

