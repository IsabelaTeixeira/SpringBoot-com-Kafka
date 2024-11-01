package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude

public final class CarPostDTO {


        private String model;

        private String brand;

        private Double price;

        private String description;

        private String engineVersion;

        private String city;

        private String createdDate;

        private Long ownerId;

        private String ownerName;

        private String ownerType;

        private String contact;

    }
