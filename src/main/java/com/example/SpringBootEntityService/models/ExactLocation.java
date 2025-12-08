package com.example.SpringBootEntityService.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExactLocation extends BaseModel{

    private Double latitude;
    private Double longitude;



}
