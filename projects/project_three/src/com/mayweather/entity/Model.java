package com.mayweather.entity;

import java.io.Serializable;

/**
 * Interface with setting general method for all models
 */

public interface Model extends Serializable {

    /**
     * a setter method , the method sets id of a model
     * @param id long value of id on the model
     */

    void setId(long id);
}
