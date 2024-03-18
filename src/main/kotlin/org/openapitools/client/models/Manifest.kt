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

import org.openapitools.client.models.Dependency
import org.openapitools.client.models.ManifestFile
import org.openapitools.client.models.Metadata1

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param name The name of the manifest.
 * @param file 
 * @param metadata User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
 * @param resolved A collection of resolved package dependencies.
 */
@Serializable

data class Manifest (

    /* The name of the manifest. */
    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @SerialName(value = "file")
    val file: ManifestFile? = null,

    /* User-defined metadata to store domain-specific information limited to 8 keys with scalar values. */
    @Contextual @SerialName(value = "metadata")
    val metadata: kotlin.Any? = null,

    /* A collection of resolved package dependencies. */
    @Contextual @SerialName(value = "resolved")
    val resolved: kotlin.collections.Map<kotlin.String, Dependency>? = null

)

