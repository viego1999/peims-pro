package com.wxy.peims.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private T data;
}
