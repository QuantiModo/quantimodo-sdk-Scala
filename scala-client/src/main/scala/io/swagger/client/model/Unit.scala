package io.swagger.client.model

import io.swagger.client.model.ConversionStep



case class Unit (
  /* Unit name */
  name: String,
  /* Unit abbreviation */
  abbreviatedName: String,
  /* Unit category */
  category: String,
  /* Unit minimum value */
  minimum: Double,
  /* Unit maximum value */
  maximum: Double,
  /* Conversion steps list */
  conversionSteps: List[ConversionStep])
  