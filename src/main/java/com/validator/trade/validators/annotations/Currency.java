package com.validator.trade.validators.annotations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.validator.trade.validators.CurrencyValidator;

/**
 * The annotation before {@link CurrencyValidator}.
 */
@Target({ FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {CurrencyValidator.class})
public @interface Currency {

    /**
     * Returns the default message.
     * 
     * @return the default message
     */
    String message() default "Currency is not valid.";

    /**
     * Returns the group names.
     * 
     * @return the group names
     */
    Class<?>[] groups() default { };

    /**
     * Returns the payload.
     * 
     * @return the payload
     */
    Class<? extends Payload>[] payload() default { };
}
