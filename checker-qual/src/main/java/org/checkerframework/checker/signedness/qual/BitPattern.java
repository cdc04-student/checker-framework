package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * Values that are not interpreted as numeric signedness but rather as patterns of bits. Examples
 * include the result of {@link Double#doubleToLongBits(double)} and bitsets.
 *
 * <p>This qualifier is a subtype of {@code @UnknownSignedness} and is intended to be unrelated to
 * {@code @Signed} and {@code @Unsigned}. It permits bitwise operators and shifts and forbids
 * arithmetic operators.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
