package com.javaspringboot.Bankingapp.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
//import java.time.LocalTime;
@Entity
@Data
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bankuser")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String county;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String address;
    private String email;
    private String status;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;
}
