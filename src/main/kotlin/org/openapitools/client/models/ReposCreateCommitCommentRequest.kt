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
 * @param body The contents of the comment.
 * @param path Relative path of the file to comment on.
 * @param position Line index in the diff to comment on.
 * @param line **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
 */
@Serializable

data class ReposCreateCommitCommentRequest (

    /* The contents of the comment. */
    @SerialName(value = "body")
    val body: kotlin.String,

    /* Relative path of the file to comment on. */
    @SerialName(value = "path")
    val path: kotlin.String? = null,

    /* Line index in the diff to comment on. */
    @SerialName(value = "position")
    val position: kotlin.Int? = null,

    /* **Deprecated**. Use **position** parameter instead. Line number in the file to comment on. */
    @SerialName(value = "line")
    val line: kotlin.Int? = null

)

