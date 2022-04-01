/*
 * Copyright 2022 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.expediagroup.graphql.generator.federation.exception

import com.expediagroup.graphql.generator.exceptions.GraphQLKotlinException
import kotlin.reflect.KClass

/**
 * GraphQLError thrown when unable to parse _FieldSet value to a literal Value.
 */
class CoercingValueToLiteralException(target: KClass<*>, input: Any) : GraphQLKotlinException("Unable to coerce ${target.simpleName} $input to a literal Value")
