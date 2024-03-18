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
 * @param action The action that was performed on the page. Can be `created` or `edited`.
 * @param htmlUrl Points to the HTML wiki page.
 * @param pageName The name of the page.
 * @param sha The latest commit SHA of the page.
 * @param summary 
 * @param title The current page title.
 */
@Serializable

data class WebhookGollumPagesInner (

    /* The action that was performed on the page. Can be `created` or `edited`. */
    @SerialName(value = "action")
    val action: WebhookGollumPagesInner.Action,

    /* Points to the HTML wiki page. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* The name of the page. */
    @SerialName(value = "page_name")
    val pageName: kotlin.String,

    /* The latest commit SHA of the page. */
    @SerialName(value = "sha")
    val sha: kotlin.String,

    @SerialName(value = "summary")
    val summary: kotlin.String?,

    /* The current page title. */
    @SerialName(value = "title")
    val title: kotlin.String

) {

    /**
     * The action that was performed on the page. Can be `created` or `edited`.
     *
     * Values: created,edited
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "created") created("created"),
        @SerialName(value = "edited") edited("edited");
    }
}

