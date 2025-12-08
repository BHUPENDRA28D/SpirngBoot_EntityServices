package com.example.SpringBootEntityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Color extends BaseModel{


    @Column(unique = true,nullable = false)
    private String name;
}
