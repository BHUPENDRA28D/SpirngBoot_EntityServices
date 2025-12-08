package com.example.SpringBootEntityService.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Car extends  BaseModel {

    private  String plateNumber;
    private  String brand;
    private String model;


    @ManyToOne
    private Color color;
    @Enumerated(value = EnumType.STRING)
    private  CarType carType;



    @OneToOne
    private Driver driver;

}
