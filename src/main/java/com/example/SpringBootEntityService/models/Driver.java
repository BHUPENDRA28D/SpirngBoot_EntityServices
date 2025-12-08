package com.example.SpringBootEntityService.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@JsonIgnoreProperties("hibernateLazyInitializer" ,"handler", "bookings")
public class Driver extends  BaseModel {

    private  String name;

    @Column(nullable = false,unique = true)
    private String licenseNumber;

    private String phoneNumber;


    private String aadharCard;



    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Car car;


    @Enumerated(value = EnumType.STRING)
    private DriverApprovalStatus driverApprovalStatus;

    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation home;

    private String activeCity;


    @DecimalMin(value = "0.00", message = "Rating must be greater than or equal to 0.00")
    @DecimalMax(value = "5.00", message = "Rating must be less than or equal to 5")
    private  double rating;


//    private String address;


    // 1:m ,Driver :Booking..\

    @OneToMany(mappedBy = "driver",fetch = FetchType.LAZY)

    @Fetch(value=FetchMode.SUBSELECT)
    private List<Booking> bookings;

}
