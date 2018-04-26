package com.mayweather.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author implements Model {
    private Long id;
    private String name;
    private String surname;
    private Date birthday;

    @Override
    public void setId(long id) {
        this.id = id;
    }
}