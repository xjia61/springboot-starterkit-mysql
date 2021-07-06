package com.starterkit.springboot.brs.controller.v1.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Data
@Accessors(chain = true)
public class TripFormCommand {
    @NotBlank
    private String sourceStop;

    @NotBlank
    private String destinationStop;

    private String middleStop1;

    private String middleStop2;

    @NotBlank
    private String busCode;

    @Positive
    private int tripDuration;

    @Positive
    private int tripFare;
}
