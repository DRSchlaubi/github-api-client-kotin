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
 * @param bullets 
 * @param description 
 * @param hasFreeTrial 
 * @param id 
 * @param monthlyPriceInCents 
 * @param name 
 * @param priceModel 
 * @param unitName 
 * @param yearlyPriceInCents 
 */
@Serializable

data class WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan (

    @SerialName(value = "bullets")
    val bullets: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "description")
    val description: kotlin.String? = null,

    @SerialName(value = "has_free_trial")
    val hasFreeTrial: kotlin.Boolean? = null,

    @SerialName(value = "id")
    val id: kotlin.Int? = null,

    @SerialName(value = "monthly_price_in_cents")
    val monthlyPriceInCents: kotlin.Int? = null,

    @SerialName(value = "name")
    val name: kotlin.String? = null,

    @SerialName(value = "price_model")
    val priceModel: WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan.PriceModel? = null,

    @SerialName(value = "unit_name")
    val unitName: kotlin.String? = null,

    @SerialName(value = "yearly_price_in_cents")
    val yearlyPriceInCents: kotlin.Int? = null

) {

    /**
     * 
     *
     * Values: FREE,FLAT_RATE,PER_UNIT
     */
    @Serializable
    enum class PriceModel(val value: kotlin.String) {
        @SerialName(value = "FREE") FREE("FREE"),
        @SerialName(value = "FLAT_RATE") FLAT_RATE("FLAT_RATE"),
        @SerialName(value = "PER_UNIT") PER_UNIT("PER_UNIT");
    }
}

