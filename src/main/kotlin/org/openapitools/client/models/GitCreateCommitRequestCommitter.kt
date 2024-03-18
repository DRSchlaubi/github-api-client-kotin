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
 * Information about the person who is making the commit. By default, `committer` will use the information set in `author`. See the `author` and `committer` object below for details.
 *
 * @param name The name of the author (or committer) of the commit
 * @param email The email of the author (or committer) of the commit
 * @param date Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
 */
@Serializable

data class GitCreateCommitRequestCommitter (

    /* The name of the author (or committer) of the commit */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* The email of the author (or committer) of the commit */
    @SerialName(value = "email")
    val email: kotlin.String? = null,

    /* Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "date")
    val date: kotlinx.datetime.Instant? = null

)

