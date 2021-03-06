package com.acme.otorongo.resource.save_expenses_resource;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class SaveRateResource {
    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    private  Long time;
}
