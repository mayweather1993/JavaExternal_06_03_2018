package com.mayweather.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book implements Model {

    private Long id;
    private Long authorId;
    private int pages;
    private String name;

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
