package com.example.Api.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
@Getter
@Setter
@Entity
public class CustomObject {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Data data;
    @Getter
    @Setter
    public static class Data {
        private int year;
        private double price;
        private String CPUModel;
        private String hardDiskSize;
    }
}
