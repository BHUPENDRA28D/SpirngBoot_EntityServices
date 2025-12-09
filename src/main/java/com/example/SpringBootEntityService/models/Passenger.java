package com.example.SpringBootEntityService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","bookings"})
public class Passenger extends  BaseModel {

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private  String email;

    @Column(nullable = false)
    private  String  password;  //encrypted password!

    @Column(nullable = false)
    private  String phoneNumber;

    @OneToOne
    private  Booking activeBooking;


    @DecimalMin(value = "0.00", message = "Rating must be greater than or equal to 0.00")
    @DecimalMax(value = "5.00", message = "Rating must be less than or equal to 5")
    private  Double rating;

    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation home;




    @OneToMany(mappedBy = "passenger")
    @Fetch(FetchMode.SUBSELECT)
   private List<Booking> bookings = new ArrayList<>();
}
