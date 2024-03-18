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
 * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run.
 *
 * @param title The title of the check run.
 * @param summary The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.
 * @param text The details of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.
 * @param annotations Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are limited to 10 warning annotations and 10 error annotations per step. For details about how you can view annotations on GitHub, see \"[About status checks](https://docs.github.com/articles/about-status-checks#checks)\".
 * @param images Adds images to the output displayed in the GitHub pull request UI.
 */
@Serializable

data class ChecksCreateRequestOutput (

    /* The title of the check run. */
    @Contextual @SerialName(value = "title")
    val title: kotlin.Any?,

    /* The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters. */
    @Contextual @SerialName(value = "summary")
    val summary: kotlin.Any?,

    /* The details of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters. */
    @Contextual @SerialName(value = "text")
    val text: kotlin.Any? = null,

    /* Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are limited to 10 warning annotations and 10 error annotations per step. For details about how you can view annotations on GitHub, see \"[About status checks](https://docs.github.com/articles/about-status-checks#checks)\". */
    @Contextual @SerialName(value = "annotations")
    val annotations: kotlin.Any? = null,

    /* Adds images to the output displayed in the GitHub pull request UI. */
    @Contextual @SerialName(value = "images")
    val images: kotlin.Any? = null

)

