package com.example.SpringBootEntityService.models;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OTP  extends BaseModel{

    private String code;
    private String sentToNumber;

    public static OTP genrateOTP(String phoneNumber){

        Random random = new Random();
        Integer fourDigitCode = random.nextInt(9000) + 1000;
        return OTP.builder().code(fourDigitCode.toString()).sentToNumber(phoneNumber).build();
    }

}
